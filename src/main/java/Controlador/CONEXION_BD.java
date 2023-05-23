
package Controlador;
import java.sql.*;
import javax.servlet.ServletContext;

public class CONEXION_BD {
    
    private static Connection conexion;
 
    private CONEXION_BD(){}
 
    public static Connection getConnection(ServletContext context){
  
    
        if(conexion == null){
            try{
                String url = context.getInitParameter("http//localhost/3306/petland"); 
                String user = context.getInitParameter("root");
                String password = context.getInitParameter("batiziano2023");
                Class.forName("con.mysql.cj.jdbc.Driver");

                conexion = DriverManager.getConnection(url, user, password);

                
            }catch(SQLException | ClassNotFoundException ex  ){
             
                System.out.println("No se encontro la Base de Datos");
                System.out.println("Error: " + ex.getMessage());
                
                
            }
     }
        return conexion; 
   }  
 }
