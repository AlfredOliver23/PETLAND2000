package MODELO;

import java.sql.Timestamp;

public class Consultas extends Object{
    
 private int con_id;
 private Timestamp con_fec;
 private char con_des;
 private int usu_id;
 private int per_id;

    public Consultas(int con_id, Timestamp con_fec, char con_des, int usu_id, int per_id) {
        this.con_id = con_id;
        this.con_fec = con_fec;
        this.con_des = con_des;
        this.usu_id = usu_id;
        this.per_id = per_id;
    }

    public Consultas(int con_id, Timestamp con_fec, char con_des, int usu_id, int per_id, int id) {
        super(id);
        this.con_id = con_id;
        this.con_fec = con_fec;
        this.con_des = con_des;
        this.usu_id = usu_id;
        this.per_id = per_id;
    }
    
        
}
