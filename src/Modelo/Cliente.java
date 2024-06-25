package Modelo;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Cliente {
    private String Nombre;
    private String Apellido;
    private int Documento;
    private String esAfiliado;
    private String Direccion;
    private String telefono;
    
    public Cliente(String Nombre, String Apellido, int Documento, String esAfiliado, String Direccion) {
        this.Nombre = Nombre;
        this.Apellido = Apellido;
        this.Documento = Documento;
        this.esAfiliado = esAfiliado;
        this.Direccion = Direccion;
        this.telefono = telefono;
    }

    public String getNombre() {
        return Nombre;
    }
    
    public static List<Cliente> leerDesdeCSV(String nombreArchivo) {
        List<Cliente> clientes = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(nombreArchivo))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                String[] datos = linea.split(",");
                String nombre = datos[0];
                String apellido = datos[1];
                int documento = Integer.parseInt(datos[2]);
                String esAfiliado = datos[3]; // Asumiendo que el cuarto campo indica si es afiliado
                String direccion = datos[4];
                String telefono = datos[5];
                
                Cliente cliente = new Cliente(nombre, apellido, documento, esAfiliado, direccion);
                clientes.add(cliente);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return clientes;
    }
    
    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public int getDocumento() {
        return Documento;
    }

    public void setDocumento(int Documento) {
        this.Documento = Documento;
    }

    public String getAfiliado() {
        return esAfiliado;
    }

    public void setAfiliado(String esAfiliado) {
        this.esAfiliado = esAfiliado;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String Direccion) {
        this.Direccion = Direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public void mostrarCliente() {
        System.out.println("Nombre: " + this.Nombre + ", Apellido: " + this.Apellido + 
                           ", Documento: " + this.Documento + ", Afiliado: " + this.esAfiliado + 
                           ", Dirección: " + this.Direccion + ", Teléfono: " + this.telefono);
    }

    @Override
    public String toString() {
        return Nombre + ", " + Documento + ", " + esAfiliado + ", " + Direccion + ", " + telefono;
    }
    
    public void guardarEnCSV(String nombreArchivo) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(nombreArchivo, true))) {
            String linea = Nombre + "," + Apellido + "," + Documento + "," + esAfiliado + "," + Direccion + "," + telefono;
            bw.write(linea);
            bw.newLine();
        } catch (IOException e) {
            System.err.println("Error al guardar en CSV: " + e.getMessage());
        }
    }
}