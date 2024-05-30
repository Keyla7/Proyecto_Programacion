/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Modelo.Factura;
import Modelo.RegistroCliente;
import Modelo.RegistroFacturas;
import Vista.Payment;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author kylea
 */
public class ControllerPayment implements ActionListener {

    private Payment payment;
    private RegistroFacturas registroFacturas;
    private RegistroCliente registroClientes;

    public ControllerPayment(RegistroFacturas registroFacturas, RegistroCliente registroClientes) {
        this.payment = new Payment();
        this.payment.escuchar(this);
        this.payment.setVisible(true);
        this.registroFacturas = new RegistroFacturas();
        this.registroClientes = new RegistroCliente();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        switch (e.getActionCommand().toString()) {
            case "Add":
                Factura factura = payment.getFactura();
                if (factura != null) {
                    try {
                        JOptionPane.showMessageDialog(null, registroFacturas.addFactura(factura));
                         payment.setDataTable(registroFacturas.getMatrizFacturas());
                    } catch (IOException ex) {
                        Logger.getLogger(ControllerPayment.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                payment.Limpiar();
                break;
            case "X":
                this.payment.dispose();
                break;

        }
    }
}
