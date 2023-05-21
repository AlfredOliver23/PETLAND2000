
package MODELO;
import java.sql.Timestamp;

public class Seguimiento_perro  extends Object{
    
    private int sp_id;
    private int per_id;
    private Timestamp sp_fecha;
    private char sp_comentarios;

    public Seguimiento_perro(int sp_id, int per_id, Timestamp sp_fecha, char sp_comentarios) {
        this.sp_id = sp_id;
        this.per_id = per_id;
        this.sp_fecha = sp_fecha;
        this.sp_comentarios = sp_comentarios;
    }

    public Seguimiento_perro(int sp_id, int per_id, Timestamp sp_fecha, char sp_comentarios, int id) {
        super(id);
        this.sp_id = sp_id;
        this.per_id = per_id;
        this.sp_fecha = sp_fecha;
        this.sp_comentarios = sp_comentarios;
    }

    public int getSp_id() {
        return sp_id;
    }

    public void setSp_id(int sp_id) {
        this.sp_id = sp_id;
    }

    public int getPer_id() {
        return per_id;
    }

    public void setPer_id(int per_id) {
        this.per_id = per_id;
    }

    public Timestamp getSp_fecha() {
        return sp_fecha;
    }

    public void setSp_fecha(Timestamp sp_fecha) {
        this.sp_fecha = sp_fecha;
    }

    public char getSp_comentarios() {
        return sp_comentarios;
    }

    public void setSp_comentarios(char sp_comentarios) {
        this.sp_comentarios = sp_comentarios;
    }
   
}
