
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
   
}
