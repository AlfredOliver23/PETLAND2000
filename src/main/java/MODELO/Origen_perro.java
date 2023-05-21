
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

    public int getOrp_id() {
        return orp_id;
    }

    public void setOrp_id(int orp_id) {
        this.orp_id = orp_id;
    }

    public char getOrp_res() {
        return orp_res;
    }

    public void setOrp_res(char orp_res) {
        this.orp_res = orp_res;
    }

    public char getOrp_zon() {
        return orp_zon;
    }

    public void setOrp_zon(char orp_zon) {
        this.orp_zon = orp_zon;
    }
    
    
}
