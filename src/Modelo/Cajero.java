
package Modelo;


public class Cajero extends Usuario {
    private String ID;
     public Cajero(String ID, String nombre, String apellido, String user, String password){
        super(nombre,apellido,user,password);
        this.ID=ID;
    }
  
     public String getID(){
         return ID;
     }
     
     public void setId(String ID){
         this.ID=ID;
     }
}

