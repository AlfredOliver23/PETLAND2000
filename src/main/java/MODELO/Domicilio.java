
package MODELO;

public class Domicilio extends Object {
    
    private int dom_id;  
    private short  dom_cp;
    private char dom_calle;
    private short dom_int;
    private short dom_pisos;
    private int dom_m2;
    private short dom_temp;
    private char dom_piso;

    public Domicilio(int dom_id, short dom_cp, char dom_calle, short dom_int, short dom_pisos, int dom_m2, short dom_temp, char dom_piso) {
        this.dom_id = dom_id;
        this.dom_cp = dom_cp;
        this.dom_calle = dom_calle;
        this.dom_int = dom_int;
        this.dom_pisos = dom_pisos;
        this.dom_m2 = dom_m2;
        this.dom_temp = dom_temp;
        this.dom_piso = dom_piso;
    }

    public Domicilio(int dom_id, short dom_cp, char dom_calle, short dom_int, short dom_pisos, int dom_m2, short dom_temp, char dom_piso, int id) {
        super(id);
        this.dom_id = dom_id;
        this.dom_cp = dom_cp;
        this.dom_calle = dom_calle;
        this.dom_int = dom_int;
        this.dom_pisos = dom_pisos;
        this.dom_m2 = dom_m2;
        this.dom_temp = dom_temp;
        this.dom_piso = dom_piso;
    }

    public int getDom_id() {
        return dom_id;
    }

    public void setDom_id(int dom_id) {
        this.dom_id = dom_id;
    }

    public short getDom_cp() {
        return dom_cp;
    }

    public void setDom_cp(short dom_cp) {
        this.dom_cp = dom_cp;
    }

    public char getDom_calle() {
        return dom_calle;
    }

    public void setDom_calle(char dom_calle) {
        this.dom_calle = dom_calle;
    }

    public short getDom_int() {
        return dom_int;
    }

    public void setDom_int(short dom_int) {
        this.dom_int = dom_int;
    }

    public short getDom_pisos() {
        return dom_pisos;
    }

    public void setDom_pisos(short dom_pisos) {
        this.dom_pisos = dom_pisos;
    }

    public int getDom_m2() {
        return dom_m2;
    }

    public void setDom_m2(int dom_m2) {
        this.dom_m2 = dom_m2;
    }

    public short getDom_temp() {
        return dom_temp;
    }

    public void setDom_temp(short dom_temp) {
        this.dom_temp = dom_temp;
    }

    public char getDom_piso() {
        return dom_piso;
    }

    public void setDom_piso(char dom_piso) {
        this.dom_piso = dom_piso;
    }
    
    
}
