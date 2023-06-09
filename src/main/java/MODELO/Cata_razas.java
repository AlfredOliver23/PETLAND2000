package MODELO;

public class Cata_razas  extends Object {
    
    private int cra_id;
    private char cra_raza;
    private char cra_des;

    public Cata_razas(int cra_id, char cra_raza, char cra_des) {
        this.cra_id = cra_id;
        this.cra_raza = cra_raza;
        this.cra_des = cra_des;
    }

    public Cata_razas(int cra_id, char cra_raza, char cra_des, int id) {
        super(id);
        this.cra_id = cra_id;
        this.cra_raza = cra_raza;
        this.cra_des = cra_des;
    }

    public int getCra_id() {
        return cra_id;
    }

    public void setCra_id(int cra_id) {
        this.cra_id = cra_id;
    }

    public char getCra_raza() {
        return cra_raza;
    }

    public void setCra_raza(char cra_raza) {
        this.cra_raza = cra_raza;
    }

    public char getCra_des() {
        return cra_des;
    }

    public void setCra_des(char cra_des) {
        this.cra_des = cra_des;
    }
    
    
    
}
