
package MODELO;


public class Refugio extends Object {
    
  private int ref_id;
  private char ref_nombre;
  private char ref_tel;
  private int dom_id;

    public Refugio(int ref_id, char ref_nombre, char ref_tel, int dom_id) {
        this.ref_id = ref_id;
        this.ref_nombre = ref_nombre;
        this.ref_tel = ref_tel;
        this.dom_id = dom_id;
    }

    public Refugio(int ref_id, char ref_nombre, char ref_tel, int dom_id, int id) {
        super(id);
        this.ref_id = ref_id;
        this.ref_nombre = ref_nombre;
        this.ref_tel = ref_tel;
        this.dom_id = dom_id;
    }
  
   
}
