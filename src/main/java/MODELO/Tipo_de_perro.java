
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

    public int getTdp_id() {
        return tdp_id;
    }

    public void setTdp_id(int tdp_id) {
        this.tdp_id = tdp_id;
    }

    public char getTdp_descipcion() {
        return tdp_descipcion;
    }

    public void setTdp_descipcion(char tdp_descipcion) {
        this.tdp_descipcion = tdp_descipcion;
    }
     
}
