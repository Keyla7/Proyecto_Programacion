/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import java.util.ArrayList;

/**
 *
 * @author kylea
 */
public class RegistroCliente {
    ArrayList<Cliente> listaClientes;
    String mensaje;

    public RegistroCliente() {
        this.listaClientes = new ArrayList<>();
        this.mensaje = "";
    }
    
    public String agregarCliente(Cliente cliente) {
        if (cliente != null) {
            if (buscarCliente(cliente.getId()) == null) {
                this.listaClientes.add(cliente);
                mensaje = "Cliente agregado correctamente";
            } else {
                mensaje = "Ya existe un cliente con el id '"+cliente.getId()+"'";
            }
        } else {
            mensaje = "Error al agregar el cliente";
        }
        return mensaje;
    }

    private Cliente buscarCliente(int id) {
        for (Cliente miCliente : listaClientes) {
            if (miCliente.getId()==id) {
                return miCliente;
            }
        }
        return null;
    }
    
    public String eliminarCliente(Cliente cliente) {
        if (buscarCliente(cliente.getId()) != null) {
            this.listaClientes.remove(cliente);
            mensaje = "Cliente eliminad con exito";
        } else {
            mensaje = "El cliente ingresado no existe";
        }
        return mensaje;
    }
    
    public String editarCliente(Cliente cliente){
        for (int i = 0; i < this.listaClientes.size(); i++) {
            if (this.listaClientes.get(i).getId() ==cliente.getId()) {
                this.listaClientes.set(i, cliente);
                return "El cliente ha sido modificado correctamente";
            }
        }
        return "No se encontro al cliente";
    }
    
    public String[][] getMatrizCliente(){
        String[][] matrizClientes = new String[this.listaClientes.size()][Cliente.TITULOS_CLIENTE.length];
        for (int i = 0; i < matrizClientes.length; i++) {
            for (int j = 0; j < matrizClientes[0].length; j++) {
                matrizClientes[i][j]= this.listaClientes.get(i).getDatosClientes(j);
            }
        }
        return matrizClientes;
    }

}
