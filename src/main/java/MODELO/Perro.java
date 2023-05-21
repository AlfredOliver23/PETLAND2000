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
        super();
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

    public Perro(int per_id) {
        this.per_id = per_id;
    }

    public Perro(int per_id, int id) {
        super(id);
        this.per_id = per_id;
    }

    public int getPer_id() {
        return per_id;
    }

    public void setPer_id(int per_id) {
        this.per_id = per_id;
    }

    public char getPer_nom() {
        return per_nom;
    }

    public void setPer_nom(char per_nom) {
        this.per_nom = per_nom;
    }

    public int getCra_id() {
        return cra_id;
    }

    public void setCra_id(int cra_id) {
        this.cra_id = cra_id;
    }

    public int getTpd_id() {
        return tpd_id;
    }

    public void setTpd_id(int tpd_id) {
        this.tpd_id = tpd_id;
    }

    public Timestamp getPer_cum() {
        return per_cum;
    }

    public void setPer_cum(Timestamp per_cum) {
        this.per_cum = per_cum;
    }

    public int getRef_id() {
        return ref_id;
    }

    public void setRef_id(int ref_id) {
        this.ref_id = ref_id;
    }

    public long getPer_img() {
        return per_img;
    }

    public void setPer_img(long per_img) {
        this.per_img = per_img;
    }

    public int getOrp_id() {
        return orp_id;
    }

    public void setOrp_id(int orp_id) {
        this.orp_id = orp_id;
    }

    public char getPer_des() {
        return per_des;
    }

    public void setPer_des(char per_des) {
        this.per_des = per_des;
    }

    public boolean isPer_cumpliste() {
        return per_cumpliste;
    }

    public void setPer_cumpliste(boolean per_cumpliste) {
        this.per_cumpliste = per_cumpliste;
    }
    
}
