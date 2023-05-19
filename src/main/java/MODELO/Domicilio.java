
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
    
    
    
      
             
}
