package calgordi.villagebattle;

/**
 * Created by sergi_000 on 03/04/2017.
 */

public class Usuario {
    //Propiedades

    private String userName;
    private String password;
    private String email;
    private int moneyGold;
    private int moneyDiamond;
    private int experiencia;

    //Constructor
    public Usuario(String nombreUsuario, String contrasena, String correo, int dineroOro, int dineroDiamante, int exp){
        userName = nombreUsuario;
        password = contrasena;
        email = correo;
        moneyGold = dineroOro;
        moneyDiamond = dineroDiamante;
        experiencia = exp;
    }

//metodos get - set

    public void setUserName (String nombreUsuario){
        userName = nombreUsuario;
    }
    public String getUserName () {
        return userName;
    }
    public void setPassword (String contrasena){
        password = contrasena;
    }
    public String getPassword (){
        return password;
    }
    public void setEmail (String correo) {
        email = correo;
    }
    public String getEmail () {
        return email;
    }
    public void setMoneyGold (int dineroOro){
        moneyGold = dineroOro;
    }
    public int getMoneyGold () {
        return moneyGold;
    }
    public void setMoneyDiamond (int dineroDiamante) {
        moneyDiamond = dineroDiamante;
    }
    public int getMoneyDiamond (){
        return moneyDiamond;
    }

// Metodos add - remove
    public void addExperiencia (int experienciaAAnadir){
        experiencia + = experienciaAAnadir;
    }
    public void addMoneyGold (int dineroOroAAnadir) {
        moneyGold += dineroOroAAnadir;
    }
    public void removeMoneyGold (int dineroOroAQuitar){
        moneyGold -= dineroOroAQuitar;
    }
    public void addMoneyDiamond (int dineroDiamanteAAnadir){
        moneyDiamond += dineroDiamanteAAnadir;
    }
    public void removeMoneyDiamond (int dineroDiamanteAQuitar){
        moneyDiamond -= dineroDiamanteAQuitar;
    }
}
