package Data_acces_BD;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.ServletContext;
import MODELO.Usuario;

public class Usuario_DAO {

    private Connection conexion;
    private PreparedStatement insertStatement, updateStatement,
            selectAllStatement, selectByIdStatement,
            selectLoginStatement, deleteByIdStatement;

    private final String insertQuery
            = "INSERT INTO usuario(usu_RFC,usu_nombre,usu_apapt,usu_apmat,dom_id,usu_tel,usu_admin,usu_img,usu_cor,usu_pass)"
            + "VALUES(?,?,?,?,?,?,?,null,?,?)";

    private final String updateQuery
            = "UPDATE usuario SET usu_RFC=?,usu_nombre=?,usu_apapt=?,usu_apmat=?,dom_id=?,usu_tel=?,usu_admin=?,usu_img=?,usu_cor=?,usu_pass=?"
            + "WHERE usu_id = ? ";

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
    /**
     * Eson se creo
     *
     * @param conexion
     */
    

    public Usuario save(Usuario usuario) throws Exception {

        if (usuario.getId() == -1) {
            System.out.println("Esto paso1");
            /**
             * 
             */
            this.insertStatement.setString(1, usuario.getRFC());
            this.insertStatement.setString(2, usuario.getNombre());
            this.insertStatement.setString(3, usuario.getApapt());
            this.insertStatement.setString(4, usuario.getApmat());
            this.insertStatement.setInt(5, usuario.getDom_id());
            this.insertStatement.setString(6, usuario.getTel());
            this.insertStatement.setInt(7, usuario.getAdmin());
            this.insertStatement.setString(8, usuario.getCor());
            this.insertStatement.setString(9, usuario.getPass());

            int idUsuario = this.insertStatement.executeUpdate();
            System.out.println("id del Usuario es " + idUsuario);

            usuario.setId(idUsuario);

            return usuario;

        } else {
            System.out.println("Esto paso2");
            //actualizar
            this.insertStatement.setString(1, usuario.getRFC());
            this.insertStatement.setString(2, usuario.getNombre());
            this.insertStatement.setString(3, usuario.getApapt());
            this.insertStatement.setString(4, usuario.getApmat());
            this.insertStatement.setInt(5, usuario.getDom_id());
            this.insertStatement.setString(6, usuario.getTel());
            this.insertStatement.setInt(7, usuario.getAdmin());
            this.insertStatement.setString(8, usuario.getCor());
            this.insertStatement.setString(9, usuario.getPass());

            this.updateStatement.executeUpdate();

            return usuario;
        }
    }
    public List<Usuario> getAll() throws Exception {
        List<Usuario> usuarioLista = new ArrayList<>();

        ResultSet rs = this.selectAllStatement.executeQuery();

        while (rs.next()) {
            Usuario usuario = new Usuario(
                    rs.getInt("usu_id"),
                    rs.getString("usu_RFC"),
                    rs.getString("usu_nombre"),
                    rs.getString("usu_apapt"),
                    rs.getString("usu_apmat"),
                    rs.getInt("dom_id"),
                    rs.getString("usu_tel"),
                    rs.getInt("usu_admin"),
                    rs.getLong("usu_img"),
                    rs.getString("usu_cor"),
                    rs.getString("usu_pass")
            );
            usuarioLista.add(usuario);
        }
        return usuarioLista;
    }

    public Usuario getbyId(int Id) throws Exception {

        this.selectByIdStatement.setInt(1, Id);

        ResultSet rs = this.selectByIdStatement.executeQuery();

        if (rs.next()) {
            Usuario usuario = new Usuario(
                    rs.getInt("usu_id"),
                    rs.getString("usu_RFC"),
                    rs.getString("usu_nombre"),
                    rs.getString("usu_apapt"),
                    rs.getString("usu_apmat"),
                    rs.getInt("dom_id"),
                    rs.getString("usu_tel"),
                    rs.getInt("usu_admin"),
                    rs.getLong("usu_img"),
                    rs.getString("usu_cor"),
                    rs.getString("usu_pass")
            );
            return usuario;
        }
        return null;
    }
    //metodo para borrar

    public boolean delete(int Id) throws Exception {
        this.deleteByIdStatement.setInt(1, Id);
        //aqui ejecuto la actualizacion para el borrado y debe devolver true o false
        this.deleteByIdStatement.executeUpdate();
        return true;

    }

    //para verificar el usuario 
    public Usuario login(Usuario usuario) throws SQLException {
        this.selectLoginStatement.setString(1, usuario.getCor());
        ResultSet rs = this.selectLoginStatement.executeQuery();

        if (rs.next() && rs.getString("password") != null) {
            usuario.getPass();
            rs.getString("usu_pass");

            System.out.println("Funciona wiiii");

            Usuario usuarioLogin = new Usuario(
                    rs.getInt("usu_id"),
                    rs.getString("usu_RFC"),
                    rs.getString("usu_nombre"),
                    rs.getString("usu_apapt"),
                    rs.getString("usu_apmat"),
                    rs.getInt("dom_id"),
                    rs.getString("usu_tel"),
                    rs.getInt("usu_admin"),
                    rs.getLong("usu_img"),
                    rs.getString("usu_cor"),
                    rs.getString("usu_pass")
            );
            return usuarioLogin;
        }
        return null;
    }
}
