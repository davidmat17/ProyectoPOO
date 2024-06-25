    package Modelo;

import java.util.List;
import java.util.ArrayList;

public class Inventario {
    private List<Producto> ListaProductos;
    private ArchivoServicio archivoInventario;
    
    public Inventario(){
       ListaProductos = new ArrayList<Producto>();
    }
    
    public void AñadirProducto(Producto p){
       ListaProductos.add(p);
    }
    
    public void EliminarProducto(Producto p) {
        ListaProductos.remove(p);
        actualizarArchivoInventario("inventario.csv");
    }
    
        private void actualizarArchivoInventario(String nombreArchivo) {
        StringBuilder inventarioCSV = new StringBuilder();
        for (Producto producto : ListaProductos) {
            inventarioCSV.append(producto.toString()).append("\n");
        }
        archivoInventario.escribirEnArchivo(nombreArchivo, inventarioCSV.toString());
    }
    
    public void ConsultarProducto(Producto p){
        if(ListaProductos.contains(p)){
            System.out.println(p);
        }
        else{
            System.out.println("El producto no está registrado");
        }
    }
    
    public void ActualizarCantidad(Producto P, int aumento){
        P.setCantidad(aumento);
        System.out.println("Cantidad actualizada a: " +P.getCantidad() + " unidades.");
    }
    public void guardarInventario(String nombreArchivo) {
        StringBuilder inventarioCSV = new StringBuilder();
        for (Producto producto : ListaProductos) {
            inventarioCSV.append(producto.toString()).append("\n");
        }
        archivoInventario.escribirEnArchivo(nombreArchivo, inventarioCSV.toString());
    }
    
    
    
}
