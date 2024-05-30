/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Modelo.RegistroCliente;
import Modelo.RegistroFacturas;
import Modelo.RegistroUser;
import Modelo.User;
import Vista.Menu;
import Vista.Principal;
import Vista.Principal;
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
public class ControllerLogin implements ActionListener {

    private ControllerMenu menu;
    private Principal login;
    private RegistroUser registroUsuarios;
    private User user;

    public ControllerLogin() {
        this.login = new Principal();
        this.login.setVisible(true);
        this.login.escuchar(this);
        
        registroUsuarios = new RegistroUser();
        
       
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        switch (e.getActionCommand().toString()) {
            case "INGRESAR":
                 user = login.getUserData();
                if (user != null) {
                    try {
                        if (registroUsuarios.verificacionU(user)) {
                            new ControllerMenu();
                        }
                    } catch (IOException ex) {
                        Logger.getLogger(ControllerLogin.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                login.setVisible(false);
                break;
            case "add":
                 user= login.getUserData();
                 if (user!=null) {
                     JOptionPane.showMessageDialog(null, registroUsuarios.addUser(user));
                }
                break;
            case "x":
                System.exit(0);
                break;
        }
    }

}
