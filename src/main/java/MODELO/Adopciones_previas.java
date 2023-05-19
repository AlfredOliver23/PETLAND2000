
package MODELO;
import java.sql.Timestamp;

public class Adopciones_previas extends Object{
    
   private int adp_id;
   private int per_id; 
   private int usu_id;
   private Timestamp adp_fecha;

    public Adopciones_previas(int adp_id, int per_id, int usu_id, Timestamp adp_fecha) {
        this.adp_id = adp_id;
        this.per_id = per_id;
        this.usu_id = usu_id;
        this.adp_fecha = adp_fecha;
    }

    public Adopciones_previas(int adp_id, int per_id, int usu_id, Timestamp adp_fecha, int id) {
        super(id);
        this.adp_id = adp_id;
        this.per_id = per_id;
        this.usu_id = usu_id;
        this.adp_fecha = adp_fecha;
    }

    public int getAdp_id() {
        return adp_id;
    }

    public void setAdp_id(int adp_id) {
        this.adp_id = adp_id;
    }

    public int getPer_id() {
        return per_id;
    }

    public void setPer_id(int per_id) {
        this.per_id = per_id;
    }

    public int getUsu_id() {
        return usu_id;
    }

    public void setUsu_id(int usu_id) {
        this.usu_id = usu_id;
    }

    public Timestamp getAdp_fecha() {
        return adp_fecha;
    }

    public void setAdp_fecha(Timestamp adp_fecha) {
        this.adp_fecha = adp_fecha;
    }
    
    
    
    
   
}
