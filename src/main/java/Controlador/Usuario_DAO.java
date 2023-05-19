package Controlador;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.ServletContext;

import MODELO.Usuario.*;
import MODELO.Domicilio.*;
import MODELO.Usuario;

public class Usuario_DAO {

    private Connection conexion;
    private PreparedStatement insertStatement, updateStatement,
            selectAllStatement, selectByIdStatement,
            selectLoginStatement, deleteByIdStatement;

    private final String insertQuery
            = "INSERT INTO usuario(usu_img,usu_RFC,usu_nombre,usu_apapt,usu_apmat,usu_tel)"
            + "VALUES(null,?,?,?,?,?)";

    private final String updateQuery
            = "UPDATE usuario SET usu_img=?, usu_RFC=?, usu_nombre=?, usu_appat=?, usu_apmat=?"
            + "usu_tel=?  WHERE usu_id = ? ";

    private final String deleteQuery
            = "DELETE FROM usuario WHERE usu_id = ?";

    private final String selectAllQuery
            = "SELECT  * FROM usuario";

    private final String selectByIdQuery
            = "SELECT * FROM usuario WHERE usu_id = ?";

    private final String selectLogin
            = "SELECT * FROM usuario WHERE usu_nombre = ?";

    public Usuario_DAO(Connection connection, ServletContext context) {
        this.conexion = connection;

        try {
            this.insertStatement
                    = this.conexion.prepareStatement(
                            this.insertQuery,
                            Statement.RETURN_GENERATED_KEYS);
            this.updateStatement
                    = this.conexion.prepareStatement(this.updateQuery);
            this.deleteByIdStatement
                    = this.conexion.prepareStatement(this.deleteQuery);
            this.selectAllStatement
                    = this.conexion.prepareStatement(this.selectAllQuery);

            this.selectByIdStatement
                    = this.conexion.prepareStatement(this.selectByIdQuery);

            this.selectLoginStatement
                    = this.conexion.prepareStatement(this.selectLogin);

        } catch (Exception e) {
            System.out.println("Error en el crud");

            System.out.println("Error " + e.getMessage());
        }

    }

    public Usuario save(Usuario usuario) throws Exception {
        if (usuario.getUsuId() == -1) {
            // Insertar un nuevo usuario
            this.insertStatement.setString(1, usuario.getUsuRFC());
            this.insertStatement.setString(2, usuario.getUsuNombre());
            this.insertStatement.setString(3, usuario.getUsuAppat());
            this.insertStatement.setString(4, usuario.getUsuApmat());
            this.insertStatement.setString(5, usuario.getUsuTel());

            int idUsuario = this.insertStatement.executeUpdate();
            System.out.println("Id del usuario: " + idUsuario);

            usuario.setUsuId(idUsuario);

            return usuario;
        } else {
            // Actualizar un usuario existente
            this.updateStatement.setString(1, usuario.getUsuRFC());
            this.updateStatement.setString(2, usuario.getUsuNombre());
            this.updateStatement.setString(3, usuario.getUsuAppat());
            this.updateStatement.setString(4, usuario.getUsuApmat());
            this.updateStatement.setString(5, usuario.getUsuTel());
            this.updateStatement.setInt(6, usuario.getUsuId());

            this.updateStatement.executeUpdate();

            return usuario;
        }
    }
}
