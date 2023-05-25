package MODELO;
public class Usuario extends Object {
   private int id;
   private String RFC;
   private String nombre;
   private String apapt;
   private String apmat;
   private int  dom_id;
   private String tel;
   private int admin;
   private long img;
   private String cor;
   private String pass;

    public Usuario(int id, String RFC, String nombre, String apapt, String apmat, int dom_id, String tel, int admin, long img, String cor, String pass) {
        super(id);
        this.RFC = RFC;
        this.nombre = nombre;
        this.apapt = apapt;
        this.apmat = apmat;
        this.dom_id = dom_id;
        this.tel = tel;
        this.admin = admin;
        this.img = img;
        this.cor = cor;
        this.pass = pass;
    }

    public Usuario(String RFC, String nombre, String apapt, String apmat, int dom_id, String tel, int admin, long img, String cor, String pass, int id) {
        super();
        this.RFC = RFC;
        this.nombre = nombre;
        this.apapt = apapt;
        this.apmat = apmat;
        this.dom_id = dom_id;
        this.tel = tel;
        this.admin = admin;
        this.img = img;
        this.cor = cor;
        this.pass = pass;
    }

    public Usuario( String RFC, String nombre, String apapt, String apmat, int dom_id, String tel, int admin, String cor, String pass) {
        super();
        this.RFC = RFC;
        this.nombre = nombre;
        this.apapt = apapt;
        this.apmat = apmat;
        this.dom_id =dom_id;
        this.tel = tel;
        this.admin = admin;
        this.cor = cor;
        this.pass = pass;
    }

    public Usuario( String RFC, String nombre, String apapt, String apmat, int dom_id, String tel, long img,String cor, String pass) {
        super();
        
        this.RFC = RFC;
        this.img = img;
        this.nombre = nombre;
        this.apapt = apapt;
        this.apmat = apmat;
        this.dom_id = dom_id;
        this.tel = tel;
        this.cor = cor;
        this.pass = pass;
    } /**
     * Segun yo vamos a utilizar este
     * 
     * @param id
     * @param RFC
     * @param nombre
     * @param apapt
     * @param apmat
     * @param tel
     * @param cor
     * @param pass 
     */

    public Usuario(int id,String RFC, String nombre, String apapt, String apmat, String tel, String cor, String pass) {
        super();
        this.id = id;
        this.RFC = RFC;
        this.nombre = nombre;
        this.apapt = apapt;
        this.apmat = apmat;
        this.tel = tel;
        this.cor = cor;
        this.pass = pass;
    }
    public Usuario( String cor, String pass) {
        super();
        this.cor = cor;
        this.pass = pass;
    }

    public Usuario() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getRFC() {
        return RFC;
    }

    public void setRFC(String RFC) {
        this.RFC = RFC;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApapt() {
        return apapt;
    }

    public void setApapt(String apapt) {
        this.apapt = apapt;
    }

    public String getApmat() {
        return apmat;
    }

    public void setApmat(String apmat) {
        this.apmat = apmat;
    }

    public int getDom_id() {
        return dom_id;
    }

    public void setDom_id(int dom_id) {
        this.dom_id = dom_id;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public int getAdmin() {
        return admin;
    }

    public void setAdmin(int admin) {
        this.admin = admin;
    }

    public long getImg() {
        return img;
    }

    public void setImg(long img) {
        this.img = img;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }
}