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

    public int getCon_id() {
        return con_id;
    }

    public void setCon_id(int con_id) {
        this.con_id = con_id;
    }

    public Timestamp getCon_fec() {
        return con_fec;
    }

    public void setCon_fec(Timestamp con_fec) {
        this.con_fec = con_fec;
    }

    public char getCon_des() {
        return con_des;
    }

    public void setCon_des(char con_des) {
        this.con_des = con_des;
    }

    public int getUsu_id() {
        return usu_id;
    }

    public void setUsu_id(int usu_id) {
        this.usu_id = usu_id;
    }

    public int getPer_id() {
        return per_id;
    }

    public void setPer_id(int per_id) {
        this.per_id = per_id;
    }
    
    
        
}
