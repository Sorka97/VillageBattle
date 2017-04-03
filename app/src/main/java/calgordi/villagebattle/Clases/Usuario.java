package calgordi.villagebattle.Clases;

public class Usuario {
    //Propiedades

    private String userName;
    private String password;
    private String email;

    //Constructor
    public Usuario(String nombreUsuario, String contrasena, String correo){
        userName = nombreUsuario;
        password = contrasena;
        email = correo;
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

}
