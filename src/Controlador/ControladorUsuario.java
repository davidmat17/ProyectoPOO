
package Controlador;

import Modelo.Usuario;
import Modelo.Administrador;
import Modelo.Cajero;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;



public class ControladorUsuario {
    
    private static Usuario UsuarioActual; 
    public static void setUsuarioActual(Usuario usuario) {
    UsuarioActual = usuario;
}

public static Usuario getUsuarioActual() {
    return UsuarioActual;
}
    private static String ArchivoCajeros= "C:\\Users\\Lenovo\\Desktop\\Repositorio\\ProyectoPOO\\Ruta\\cajeros.txt";
    public static boolean autenticarUsuario(String usuario, String contraseña) {
    try {

        BufferedReader br = new BufferedReader(new FileReader(ArchivoCajeros));
        String line;
        while ((line = br.readLine()) != null) {
            String[] data = line.split(",");
            if (data.length == 5) {
                String id = data[0];
                String nombre = data[1];
                String apellido = data[2];
                String user = data[3];
                String pass = data[4];
                
                if (user.trim().equals(usuario) && pass.trim().equals(contraseña)) {
                    // Creamos un objeto Cajero y lo guardamos como usuario actual
                    Cajero cajero = new Cajero(id, nombre, apellido, user, pass);
                    setUsuarioActual(cajero);
                    br.close();
                    return true;
                }
            }
        }
        br.close();
    } catch (IOException e) {
        e.printStackTrace();
    }
    
    
    // Validación para el administrador
    if (usuario.equals("admin") && contraseña.equals("1234")) {
        // Creamos un objeto Administrador y lo guardamos como usuario actual
        Administrador admin = new Administrador("91272960","Luis","Gomez","3157947","admin","1234");
        setUsuarioActual(admin);
        return true;
    }
    
    return false;
}


    public static void cerrarSesion() {
        UsuarioActual = null;
    }
    
      private static String obtenerUltimoId() throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(ArchivoCajeros));
        String lastLine = "";
        String currentLine;
        while ((currentLine = reader.readLine()) != null) {
            lastLine = currentLine;
        }
        reader.close();

        if (!lastLine.isEmpty()) {
            String[] parts = lastLine.split(",");
            return parts[0]; // ID está en la primera posición del archivo
        } else {
            return "0"; // Si no hay ninguna línea, empezamos desde el ID 1
        }
    }
    
     public static void agregarCajero(Cajero cajero) throws IOException {
     
      try {
        String ultimoId = obtenerUltimoId();
        int siguienteId = Integer.parseInt(ultimoId) + 1;
        cajero.setId(String.valueOf(siguienteId));

        BufferedWriter writer = new BufferedWriter(new FileWriter(ArchivoCajeros, true));
        writer.write(cajero.getID() + "," + cajero.getNombre() + "," + cajero.getApellidos() + "," + cajero.getNomUser() + "," + cajero.getContraseña() + "\n");
        writer.close();
    } catch (IOException e) {
        e.printStackTrace();
    }
    }


    public static List<Cajero> cargarCajeros() throws IOException {
        List<Cajero> cajeros = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new FileReader(ArchivoCajeros));
        String line;
        while ((line = reader.readLine()) != null) {
            String[] parts = line.split(",");
            if (parts.length == 5) {
                Cajero cajero = new Cajero(parts[0], parts[1], parts[2], parts[3], parts[4]);
                cajeros.add(cajero);
            }
        }
        reader.close();
        return cajeros;
    }

    public static void generarReporteCajeros() throws IOException {
        List<Cajero> cajeros = cargarCajeros();
        BufferedWriter writer = new BufferedWriter(new FileWriter("reporte_cajeros.txt"));
        for (Cajero cajero : cajeros) {
            writer.write(cajero.toString() + "\n");
        }
        writer.close();
    }

}
