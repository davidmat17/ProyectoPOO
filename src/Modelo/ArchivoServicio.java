
package Modelo;
import java.io.File;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class ArchivoServicio {
    
    public void crearArchivo(String nombre){
        File archivo= new File (nombre);
        try{
            FileWriter escritor=  new FileWriter(archivo,true);
            BufferedWriter buffer= new BufferedWriter(escritor);
            buffer.append("Hola probando");
            System.out.println("El archivo se ha creado con exito");
            buffer.close();
        } catch(IOException e){
            e.printStackTrace();
        }
    }
    
    public void escribirEnArchivo(String nombreArchivo, String contenido) {
        try (FileWriter escritor = new FileWriter(nombreArchivo, true);
             BufferedWriter buffer = new BufferedWriter(escritor)) {
            buffer.write(contenido);
            buffer.newLine();
            System.out.println("Contenido agregado al archivo '" + nombreArchivo + "'");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
}
