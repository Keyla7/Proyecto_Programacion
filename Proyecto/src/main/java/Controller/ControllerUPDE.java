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

    public ControllerUPDE(RegistroCliente registroCliente) {
        this.updateDelete = new UpdateDelete();
        this.updateDelete.escuchar(this);
        this.updateDelete.setVisible(true);
        registroCliente = registroCliente;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Cliente cliente;
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
                cliente= registroCliente.buscarCliente(Integer.parseInt(updateDelete.getTxtID()));
                if (cliente!=null) {
                    updateDelete.chargeClient(cliente);
                }
                break;
            case "X":
                this.updateDelete.dispose();
                break;
        }
    }

}
