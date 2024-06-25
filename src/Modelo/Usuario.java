    
package Modelo;

public class Usuario {
    private String Nombres;
    private String Apellidos;
    private String NomUser;
    private String Contraseña;
    
    public Usuario(String Nombres, String Apellidos, String NomUser, String Contraseña){
    this.Nombres = Nombres;
    this.Apellidos = Apellidos;
    this.NomUser = NomUser;
    this.Contraseña = Contraseña;
    }
    
    public String getNombre(){
        return Nombres;
    }
    
    public String getApellidos(){
        return Apellidos;
    }
    
    public String getNomUser(){
        return NomUser;
    }
    
    public String getContraseña(){
        return Contraseña;
    }
    
    public void setNombre(String nombre){
        this.Nombres=nombre;
    }
    
    public void setApellidos(String apellido){
        this.Apellidos=apellido;
    }
    
    public void setNomUser(String user){
        this.NomUser=user;
    }
    
    public void setContraseña(String pass){
        this.Contraseña=pass;
    }
}
