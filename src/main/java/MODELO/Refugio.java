
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

    public int getRef_id() {
        return ref_id;
    }

    public void setRef_id(int ref_id) {
        this.ref_id = ref_id;
    }

    public char getRef_nombre() {
        return ref_nombre;
    }

    public void setRef_nombre(char ref_nombre) {
        this.ref_nombre = ref_nombre;
    }

    public char getRef_tel() {
        return ref_tel;
    }

    public void setRef_tel(char ref_tel) {
        this.ref_tel = ref_tel;
    }

    public int getDom_id() {
        return dom_id;
    }

    public void setDom_id(int dom_id) {
        this.dom_id = dom_id;
    }
     
}
