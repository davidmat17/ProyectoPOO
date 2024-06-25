package Modelo;


public class Administrador extends Usuario {
    private String password;
    private String user;
    
    public Administrador(String dni, String nombre, String apellido, String telefono, String password, String user){
        super(dni,nombre,apellido,telefono);
        this.password=password;
        this.user=user;
    }
    
    public String getPassword(){
        return password;
    }
    
    public String getUser(){
        return user;
    }
    
    public void setPassword(String password){
        this.password=password;
    }
    
     public void setUser(String user){
        this.user=user;
    }
}
