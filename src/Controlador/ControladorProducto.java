package Controlador;

import Modelo.Producto;
import VistaUsuario.Internal_GestionarProducto;
import VistaUsuario.Internal_NuevoProducto;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class ControladorProducto implements ActionListener {

    private Internal_NuevoProducto view;
    private Producto producto;
    private Internal_GestionarProducto view2;

    public ControladorProducto(Internal_NuevoProducto view, Producto producto) {
        this.view = view;
        this.producto = producto;
        this.view.guardarProducto.addActionListener(this);
    }

    public void iniciar() {
        view.setTitle("Guardar Producto");
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == view.guardarProducto) {
            try {
                producto.setIdProducto(Integer.parseInt(view.idProducto.getText()));
                producto.setNombre(view.nomProducto.getText());
                producto.setPrecio(Double.parseDouble(view.valorPrecio.getText()));
                producto.setCantidad(Integer.parseInt(view.cantProducto.getText()));
                producto.setCategoria(view.txtCategoria.getText());
                producto.guardarEnCSV("ListaProductos.csv");
                
                
                // Esperar unos segundos antes de cerrar la ventana para que el usuario pueda ver el mensaje
                try {
                    Thread.sleep(2000); // Pausar por 2 segundos (2000 milisegundos)
                } catch (InterruptedException ex) {
                    Thread.currentThread().interrupt(); // Restaurar el estado de interrupción
                }

                // Cerrar la ventana
                view.dispose();

            } catch (NumberFormatException ex) {
                view.mostrarMensaje("Error: ID Producto, Precio y Cantidad deben ser números.");
            } catch (Exception ex) {
                view.mostrarMensaje("Error al guardar el producto: " + ex.getMessage());
            }
        }
    }
}