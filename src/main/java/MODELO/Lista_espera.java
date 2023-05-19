
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
    
}
