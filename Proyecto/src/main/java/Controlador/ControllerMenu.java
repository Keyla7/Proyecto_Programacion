/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Vista.Menu;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author kylea
 */
public class ControllerMenu implements ActionListener{
    Menu menu;
    private ControllerNewMember newMember;
    private ControllerUPDE updateDelete;
    private ControllerPayment payment;
    private ControllerList list;
    

    public ControllerMenu() {
        this.menu = new Menu();
        this.menu.setVisible(true);
        this.menu.escucharItems(this);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        switch (e.getActionCommand().toString()) {
            case "New Member":
                new ControllerNewMember();
                break;
            case "Payment":
                new ControllerPayment();
                break;
            case "List of Member":
                new ControllerList();
                break;
            case "Edit & Delete Member":
                new ControllerUPDE();
                break;
            case "Exit":
                new ControllerLogin();
                menu.setVisible(false);
                break;

        }
    }
    
}
