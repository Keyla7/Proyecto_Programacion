/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Modelo.Cliente;
import Modelo.RegistroCliente;
import Vista.UpdateDelete;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

/**
 *
 * @author kylea
 */
public class ControllerUPDE implements ActionListener {

    private UpdateDelete updateDelete;
    private RegistroCliente registroCliente;
    private Cliente cliente;

    public ControllerUPDE(RegistroCliente registroClientes) {
        this.updateDelete = new UpdateDelete();
        this.updateDelete.escuchar(this);
        this.updateDelete.setVisible(true);
        this.registroCliente = registroClientes;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        switch (e.getActionCommand().toString()) {
            case "Update":
                cliente=updateDelete.getCliente();
                if (cliente!=null) {
                    JOptionPane.showMessageDialog(null, registroCliente.agregarCliente(cliente));           
                }
                break;
            case "Delete":
                   cliente=updateDelete.getCliente();
                if (cliente!=null) {
                    JOptionPane.showMessageDialog(null, registroCliente.eliminarCliente(cliente));
                }
                break;
            case "Search":
                 this.cliente = this.registroCliente.buscarClienteB(Integer.parseInt(this.updateDelete.getTxtID()));
                if (cliente!=null) {
                    this.updateDelete.chargeClient(cliente);
                }
                break;
            case "X":
                this.updateDelete.dispose();
                break;
        }
    }

}
