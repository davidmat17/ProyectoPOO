package Modelo;


import java.util.HashMap;
import java.util.Map;


public class Venta {
    private int IDventa;
    private double TotalVenta;// Precio de la venta que se genere o actual
    private double Numeroventas;// el numero de ventas hechas en el sistema
    private Map<Integer, Producto> productosvendidos;
    private Cliente cliente;
    private  Map<Integer, Cliente> listaClientes;
    private Map<Integer, Producto> VentaActual;
    private ArchivoServicio archivoProductosVendidos;
    private ArchivoServicio archivoNumeroVentas;
    private ArchivoServicio archivoListaClientes;
    

    public Venta(Cliente cliente) {
        this.VentaActual = new HashMap<>();
        this.IDventa = 10000;
        this.TotalVenta = 0;
        this.Numeroventas = 0;
        this.productosvendidos = new HashMap<>();
        this.listaClientes = new HashMap<>();
        this.cliente = cliente;
        this.archivoProductosVendidos = new ArchivoServicio(); // Inicializa el ArchivoServicio para productos vendidos
        this.archivoNumeroVentas = new ArchivoServicio(); // Inicializa el ArchivoServicio para el número de ventas
        this.archivoListaClientes = new ArchivoServicio(); // Inicializa el ArchivoServicio para la lista de clientes

    }
    
    private void guardarProductosVendidos() {
    StringBuilder productosCSV = new StringBuilder();
    for (Producto producto : productosvendidos.values()) {
        productosCSV.append(producto.toString()).append("\n");
    }
    archivoProductosVendidos.escribirEnArchivo("nombre_del_archivo", productosCSV.toString());
}
    
    
    public double getTotalventa(){
        return TotalVenta;
    }
     
    public void generarFactura(){
        System.out.println("Datos del cliente: "+ cliente.getNombre()+cliente.getDocumento()+cliente.getAfiliado());
        System.out.println("IDventa: "+ this.IDventa+" Total venta: "+this.TotalVenta+" Numero ventas: "+this.Numeroventas);
    }
    
    public Map<Integer, Cliente> getListaClientes() {
        return listaClientes;
    }
    
    

    
    public void registrarCliente(Cliente cliente){
        listaClientes.put(this.IDventa, cliente);
        IDventa++;
    }
    
    private void guardarNumeroVentas() {
    archivoNumeroVentas.escribirEnArchivo("nombre_del_archivo", String.valueOf(Numeroventas));
}
    

    public void cancelarVenta() {
        VentaActual.clear();
        TotalVenta = 0;
    }
    
    private void guardarListaClientes() {
        StringBuilder clientesCSV = new StringBuilder();
        for (Cliente cliente : listaClientes.values()) {
        clientesCSV.append(cliente.toString()).append("\n");
    }
    archivoListaClientes.escribirEnArchivo("nombre_del_archivo", clientesCSV.toString());
}

      
}
