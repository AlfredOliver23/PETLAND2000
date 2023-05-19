package MODELO;

import java.sql.Timestamp;

public class Usuario extends Object {
    
   private long per_img;
   private int usu_id;
   private int  log_id;
   private char usu_RFC;
   private char usu_nombre;
   private char usu_apapt;
   private boolean usu_admin; 

    public Usuario(long per_img, int usu_id, int log_id, char usu_RFC, char usu_nombre, char usu_apapt, boolean usu_admin) {
        this.per_img = per_img;
        this.usu_id = usu_id;
        this.log_id = log_id;
        this.usu_RFC = usu_RFC;
        this.usu_nombre = usu_nombre;
        this.usu_apapt = usu_apapt;
        this.usu_admin = usu_admin;
    }

    public Usuario(long per_img, int usu_id, int log_id, char usu_RFC, char usu_nombre, char usu_apapt, boolean usu_admin, int id) {
        super(id);
        this.per_img = per_img;
        this.usu_id = usu_id;
        this.log_id = log_id;
        this.usu_RFC = usu_RFC;
        this.usu_nombre = usu_nombre;
        this.usu_apapt = usu_apapt;
        this.usu_admin = usu_admin;
    }

    public Usuario(int usu_id, int log_id, char usu_RFC, char usu_nombre, char usu_apapt, boolean usu_admin) {
        this.usu_id = usu_id;
        this.log_id = log_id;
        this.usu_RFC = usu_RFC;
        this.usu_nombre = usu_nombre;
        this.usu_apapt = usu_apapt;
        this.usu_admin = usu_admin;
    }

    public Usuario(int usu_id, int log_id, char usu_RFC, char usu_nombre, char usu_apapt, boolean usu_admin, int id) {
        super(id);
        this.usu_id = usu_id;
        this.log_id = log_id;
        this.usu_RFC = usu_RFC;
        this.usu_nombre = usu_nombre;
        this.usu_apapt = usu_apapt;
        this.usu_admin = usu_admin;
    }

    public int getUsuId() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public String getUsuRFC() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public String getUsuNombre() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public String getUsuAppat() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public String getUsuApmat() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public String getUsuTel() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public void setUsuId(int idUsuario) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

   
    
    
    
    
    
    
    
    
    

}