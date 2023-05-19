
package MODELO;

public class Tipo_de_perro extends Object{
    
 private int tdp_id;
 private char tdp_descipcion;

    public Tipo_de_perro(int tdp_id, char tdp_descipcion) {
        this.tdp_id = tdp_id;
        this.tdp_descipcion = tdp_descipcion;
    }

    public Tipo_de_perro(int tdp_id, char tdp_descipcion, int id) {
        super(id);
        this.tdp_id = tdp_id;
        this.tdp_descipcion = tdp_descipcion;
    }
 

    
    
    
    
}
