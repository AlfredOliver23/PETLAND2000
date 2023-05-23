/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import MODELO.Perro;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.ServletContext;

/**
 *
 * @author user
 */
public class Perro_DAO {
    
    Connection con;
    private Connection conexion;
    
    PreparedStatement ps;
    ResultSet rs;
    
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

    
    
    public Perro_DAO(Connection connection, ServletContext context) {
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

    
    public List<Perro> getAll() throws Exception {
        List<Perro> perrosLista = new ArrayList<>();

        ResultSet rs = this.selectAllStatement.executeQuery();

        while (rs.next()) {
            Perro p = new Perro(
                    rs.getInt("per_id"),
                    rs.getString("per_nom"),
                    rs.getInt("cra_id"),
                    rs.getInt("tdp_id"),
                    rs.getTimestamp("per_cum"),
                    rs.getInt("ref_id"),
                    rs.getLong("per_img"),
                    rs.getInt("orp_id"),
                    rs.getString("per_des"),
                    rs.getBoolean("per_cumpliste")
            );


            perrosLista.add(p);
        }
        return perrosLista;
    }
    
    
}
