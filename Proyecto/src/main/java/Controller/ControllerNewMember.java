/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Modelo.Cliente;
import Modelo.RegistroCliente;
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
   public ControllerNewMember(RegistroCliente registroClientes) {
        this.member = new NewMember();
        this.member.setVisible(true);
        this.member.escuchar(this);
        registroClientes=registroClientes;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        switch (e.getActionCommand().toString()) {
            case "Check In":
                Cliente cliente = member.getNewMember();
                if (cliente!=null) {
                    JOptionPane.showMessageDialog(null, registroClientes.agregarCliente(cliente));
                }
                break;
            case "X":
                this.member.dispose();
                break;
        }
    }

}
