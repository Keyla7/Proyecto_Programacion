/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.User;
import Vista.Menu;
import Vista.Principal;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author kylea
 */
public class ControllerLogin implements ActionListener{
    private ControllerMenu menu;
    Principal login;

    public ControllerLogin() {
        this.login = new Principal();
        this.login.setVisible(true);
        this.login.escuchar(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        switch (e.getActionCommand().toString()) {
            case "INGRESAR":
                new ControllerMenu();
                login.setVisible(false);
                break;
            case "x":
                System.exit(0);
                break;
        }
    }
    
    public boolean validarCampos(User user) {
        if (user.getIdUser()==0) {
            Menu.getMensaje("Por favor, digite su ID");
            return false;
        } else if (user.getPassword().isEmpty()) {
            Menu.getMensaje("Por favor, digite su contraseña");
        }
        return true;
    }
}
