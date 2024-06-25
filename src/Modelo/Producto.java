package Modelo;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Producto {
    private int IdProducto;
    private String Nombre;
    private double Precio;
    private int Cantidad;
    private String Categoria;

    public Producto(int IdProducto, String Nombre, double Precio, int Cantidad, String Categoria) {
        this.IdProducto = IdProducto;
        this.Nombre = Nombre;
        this.Precio = Precio;
        this.Cantidad = Cantidad;
        this.Categoria = Categoria;
    }

    public int getIdProducto() { 
    return IdProducto; 
}

public void setIdProducto(int IdProducto) { 
    this.IdProducto = IdProducto; 
}

public String getNombre() { 
    return Nombre; 
}

public void setNombre(String Nombre) { 
    this.Nombre = Nombre; 
}

public double getPrecio() { 
    return Precio; 
}

public void setPrecio(double Precio) { 
    this.Precio = Precio; 
}

public int getCantidad() { 
    return Cantidad; 
}

public void setCantidad(int Cantidad) { 
    this.Cantidad = Cantidad; 
}

public String getCategoria() { 
    return Categoria; 
}

public void setCategoria(String Categoria) { 
    this.Categoria = Categoria; 
}// Getters y setters aquí...

    @Override
    public String toString() {
        return IdProducto + "," + Nombre + "," + Precio + "," + Cantidad + "," + Categoria;
    }

    public void guardarEnCSV(String nombreArchivo) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(nombreArchivo, true))) {
            bw.write(this.toString());
            bw.newLine();
        } catch (IOException e) {
            System.err.println("Error al guardar en CSV: " + e.getMessage());
        }
    }

    public static List<Producto> leerDesdeCSV(String nombreArchivo) throws IOException {
        List<Producto> productos = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(nombreArchivo))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                String[] datos = linea.split(",");
                int idProducto = Integer.parseInt(datos[0]);
                String nombre = datos[1];
                double precio = Double.parseDouble(datos[2]);
                int cantidad = Integer.parseInt(datos[3]);
                String categoria = datos[4];
                Producto producto = new Producto(idProducto, nombre, precio, cantidad, categoria);
                productos.add(producto);
            }
        } 
        return productos;
    }
}