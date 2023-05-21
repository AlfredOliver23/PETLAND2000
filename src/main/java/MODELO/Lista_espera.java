
package MODELO;

public class Lista_espera extends Object {
    
    private int les_id;
    private int per_id;
    private int usu_id;
    private boolean les_asignado; 

    public Lista_espera(int les_id, int per_id, int usu_id, boolean les_asignado) {
        this.les_id = les_id;
        this.per_id = per_id;
        this.usu_id = usu_id;
        this.les_asignado = les_asignado;
    }

    public Lista_espera(int les_id, int per_id, int usu_id, boolean les_asignado, int id) {
        super(id);
        this.les_id = les_id;
        this.per_id = per_id;
        this.usu_id = usu_id;
        this.les_asignado = les_asignado;
    }

    public int getLes_id() {
        return les_id;
    }

    public void setLes_id(int les_id) {
        this.les_id = les_id;
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

    public boolean isLes_asignado() {
        return les_asignado;
    }

    public void setLes_asignado(boolean les_asignado) {
        this.les_asignado = les_asignado;
    }
    
    
    
}
