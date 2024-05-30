/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Modelo.Cliente;
import Modelo.RegistroCliente;
import Vista.Menu;
import Vista.NewMember;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

/**
 *
 * @author kylea
 */
public class ControllerNewMember implements ActionListener {

    private NewMember member;
    private RegistroCliente registroClientes;
    private ControllerList controllerList;
    public ControllerNewMember(RegistroCliente registroClientes) {
        this.member = new NewMember();
        this.member.setVisible(true);
        this.member.escuchar(this);
        registroClientes = registroClientes;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        switch (e.getActionCommand().toString()) {
            case "Check In":
                Cliente cliente = this.member.getNewMember();
                if (this.validarCampos(cliente)) {
                    Menu.getMensaje(this.registroClientes.agregarCliente(cliente));
                    this.member.limpiar();

                }
                break;
            case "X":
                this.member.dispose();
                break;
        }
    }

    public boolean validarCampos(Cliente cliente) {
        if (cliente.getId() == 0 || cliente.getNombre().isEmpty() || cliente.getApellido().isEmpty() || cliente.getEdad() == 0 || cliente.getTelefono() == 0 || cliente.getCategoria().isEmpty() || cliente.getPaymentPlan().isEmpty() || cliente.getAltura() == 0 || cliente.getPeso() == 0) {
            Menu.getMensaje("Por favor ingrese todos los valores");
            return false;
        }
        return true;
    }
}
