package MODELO;
import java.sql.Timestamp;
public class Perro  extends Object {
    
  private int per_id;
  private char per_nom;
  private  int cra_id;
  private int tpd_id;
  private Timestamp per_cum;
  private int  ref_id;
  private long per_img;
  private int orp_id;
  private char per_des; 
  private boolean per_cumpliste;

    public Perro(int per_id, char per_nom, int cra_id, int tpd_id, Timestamp per_cum, int ref_id, long per_img, int orp_id, char per_des, boolean per_cumpliste) {
        this.per_id = per_id;
        this.per_nom = per_nom;
        this.cra_id = cra_id;
        this.tpd_id = tpd_id;
        this.per_cum = per_cum;
        this.ref_id = ref_id;
        this.per_img = per_img;
        this.orp_id = orp_id;
        this.per_des = per_des;
        this.per_cumpliste = per_cumpliste;
    }

    public Perro(int per_id, char per_nom, int cra_id, int tpd_id, Timestamp per_cum, int ref_id, long per_img, int orp_id, char per_des, boolean per_cumpliste, int id) {
        super(id);
        this.per_id = per_id;
        this.per_nom = per_nom;
        this.cra_id = cra_id;
        this.tpd_id = tpd_id;
        this.per_cum = per_cum;
        this.ref_id = ref_id;
        this.per_img = per_img;
        this.orp_id = orp_id;
        this.per_des = per_des;
        this.per_cumpliste = per_cumpliste;
    }   
}
