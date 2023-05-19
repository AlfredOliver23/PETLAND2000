
package MODELO;

public class Origen_perro extends Object {
    
    
private int orp_id;
private char orp_res;
private char orp_zon;

    public Origen_perro(int orp_id, char orp_res, char orp_zon) {
        this.orp_id = orp_id;
        this.orp_res = orp_res;
        this.orp_zon = orp_zon;
    }

    public Origen_perro(int orp_id, char orp_res, char orp_zon, int id) {
        super(id);
        this.orp_id = orp_id;
        this.orp_res = orp_res;
        this.orp_zon = orp_zon;
    }

    
    
    
    
    
    

    
}
