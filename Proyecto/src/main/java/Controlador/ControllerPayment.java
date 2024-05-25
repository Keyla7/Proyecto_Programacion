/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Vista.Payment;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author kylea
 */
public class ControllerPayment implements ActionListener{
    
    private Payment payment;

    public ControllerPayment() {
        this.payment = new Payment();
        this.payment.escuchar(this);
        this.payment.setVisible(true);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        switch (e.getActionCommand().toString()) {
            case "Search":

                break;
            case "X":
                this.payment.dispose();
                break;

        }
    }
    
}
