package Controlador;

import MODELO.Usuario;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import Controlador.CONEXION_BD;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author user
 */
public class SLoginControl extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException, Exception {

        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            String Rfc = request.getParameter("rfc");
            String Nombres = request.getParameter("nombre");
            String Apapt = request.getParameter("apellidopaterno");
            String Apmat = request.getParameter("apellidomaterno");
            String Telefono = request.getParameter("telefono");
            String Correo = request.getParameter("correo");
            String Contrasena = request.getParameter("contrasena");

            Usuario usuarioN = new Usuario();

            usuarioN.setId(0);
            usuarioN.setRFC(Rfc);
            usuarioN.setNombre(Nombres);
            usuarioN.setApapt(Apapt);
            usuarioN.setApmat(Apmat);
            usuarioN.setTel(Telefono);
            usuarioN.setCor(Correo);
            usuarioN.setPass(Contrasena);

            Connection conexion = CONEXION_BD.getConnection(getServletContext());

            try {

                Usuario_DAO usuarios = new Usuario_DAO(conexion);

                Usuario usuarioGuardado = null;
                try {
                    usuarioGuardado = usuarios.save(usuarioN);
                } catch (Exception e) {
                    throw new Exception("Error al guardar el usuario: " + e.getMessage());
                }

                out.println("Registro exitoso"); // o redireccionar a otra página

            } catch (SQLException e) {
                out.println("Error al guardar el usuario: " + e.getMessage());
            } finally {
                // Cerrar la conexión con la base de datos
                if (conexion != null) {
                    try {
                        conexion.close();
                    } catch (SQLException e) {
                        // Manejar la excepción de cierre de la conexión
                    }
                }
            }
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            processRequest(request, response);
        } catch (Exception ex) {
            Logger.getLogger(SLoginControl.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            processRequest(request, response);
        } catch (Exception ex) {
            Logger.getLogger(SLoginControl.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
