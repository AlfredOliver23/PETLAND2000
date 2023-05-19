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
    
    
 
}
