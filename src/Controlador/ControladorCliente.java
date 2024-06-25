package Controlador;

import Modelo.Cliente;
import VistaUsuario.Internal_GestionarCliente;
import VistaUsuario.Internal_NuevoCliente;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

public class ControladorCliente implements ActionListener {

    private Internal_NuevoCliente view;
    private Cliente client;
    private Internal_GestionarCliente view2;
    
    public ControladorCliente(Internal_NuevoCliente view, Cliente client) {
        this.view = view;
        this.client = client;
        this.view2 = view2; // Inicializar la vista de gestión de clientes
        this.view.guardarCliente.addActionListener(this);
        this.view2.botonActualizar.addActionListener(this); // Asignar el controlador al botón en la vista de gestión de clientes
    }

    public ControladorCliente() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public void iniciar() {
        view.setTitle("Guardar Usuario");
    }
    
    public void cargarClientesEnTabla() {
    List<Cliente> clientes = Cliente.leerDesdeCSV("ListaClientes.csv");
    view2.cargarDatosClientesEnTabla(clientes);
}

    
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == view.guardarCliente) {
        try {
            client.setNombre(view.txtNom.getText());
            client.setApellido(view.txtApellido.getText());
            client.setDocumento(Integer.parseInt(view.numDocumento.getText()));
            client.setDireccion(view.txtDireccion.getText());
            client.setTelefono(view.numTelefono.getText());
            client.guardarEnCSV("ListaClientes.csv");
            view.mostrarMensaje("Cliente guardado exitosamente.");
            
            // Esperar unos segundos antes de cerrar la ventana para que el usuario pueda ver el mensaje
            try {
                Thread.sleep(2000); // Pausar por 2 segundos (2000 milisegundos)
            } catch (InterruptedException ex) {
                Thread.currentThread().interrupt(); // Restaurar el estado de interrupción
            }

            // Cerrar la ventana
            view.dispose();
            
        } catch (NumberFormatException ex) {
            view.mostrarMensaje("Error: Documento y Teléfono deben ser números.");
        } catch (Exception ex) {
            view.mostrarMensaje("Error al guardar el cliente: " + ex.getMessage());
        }
        }
    }
    }