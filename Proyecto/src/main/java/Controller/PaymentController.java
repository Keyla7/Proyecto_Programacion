/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Modelo.RegistroFacturas;
import Vista.FRM_Payment;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author Aaron
 */
public class PaymentController implements ActionListener {
    private FRM_Payment frmPayment;
    private RegistroFacturas registroFacturas;
    
    public PaymentController(RegistroFacturas registro) {
        frmPayment= new FRM_Payment();
      // frmPayment.getJpanel().addActionListener(this);
        frmPayment.setVisible(true);
        frmPayment.setLocationRelativeTo(null);
        registroFacturas = registro;
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
//        switch (var) {
//            case val:
//                
//                break;
//            default:
//                throw new AssertionError();
//        }
    }
    
}
