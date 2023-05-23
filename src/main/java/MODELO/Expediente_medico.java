package MODELO;

public class Expediente_medico extends Object {
    
    private int exm_id;
    private int per_id;

    public Expediente_medico(int exm_id, int per_id) {
        this.exm_id = exm_id;
        this.per_id = per_id;
    }

    public Expediente_medico(int exm_id, int per_id, int id) {
        super(id);
        this.exm_id = exm_id;
        this.per_id = per_id;
    }

    public int getExm_id() {
        return exm_id;
    }

    public void setExm_id(int exm_id) {
        this.exm_id = exm_id;
    }

    public int getPer_id() {
        return per_id;
    }

    public void setPer_id(int per_id) {
        this.per_id = per_id;
    }

}
