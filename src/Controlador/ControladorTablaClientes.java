package Controlador;

import Modelo.Cliente;
import VistaUsuario.Internal_GestionarCliente;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

public class ControladorTablaClientes implements ActionListener {

    private Internal_GestionarCliente view;

    public ControladorTablaClientes(Internal_GestionarCliente view) {
        this.view = view;
    }

    public void cargarClientesEnTabla() {
        List<Cliente> clientes = Cliente.leerDesdeCSV("ListaClientes.csv");
        view.cargarDatosClientesEnTabla(clientes);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == view.botonActualizar) {
            cargarClientesEnTabla();
        }
    }
}