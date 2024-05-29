/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.RegistroUser;
import Modelo.User;
import Vista.Menu;
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
    private ControllerNewMember member;
    Principal login;
    private RegistroUser registroUser;

    public ControllerLogin() {
        this.login = new Principal();
        this.login.setVisible(true);
        this.login.escuchar(this);
        this.registroUser= new RegistroUser();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        switch (e.getActionCommand().toString()) {
            case "INGRESAR":
                User u = login.getUserData();
                if (validarCampos(u)) {
                    try {
                        //logica autenticacion
                        if (registroUser.verificacionU(u)) {
                            //si es valido mostrar menu
                            new ControllerMenu();
                            login.setVisible(false);
                        } else {
                            login.setVisible(false);
                            JOptionPane.showMessageDialog(login, "Credenciales incorrectas, por favor registrese");
                            registrarNuevoMiembro();
                            login.setVisible(true);
                        }
                    } catch (IOException ex) {
                        ex.printStackTrace();
                        JOptionPane.showMessageDialog(login, "Error al leer el archivo de usuario");
                    }

                }
                break;
            case "x":
                System.exit(0);
                break;
        }
    }

    public boolean validarCampos(User user) {
        if (user.getIdUser() == 0) {
            Menu.getMensaje("Por favor, digite su ID");
            return false;
        } else if (user.getPassword().isEmpty()) {
            Menu.getMensaje("Por favor, digite su contraseña");
        }
        return true;
    }

    private void registrarNuevoMiembro() {
        String id= JOptionPane.showInputDialog(null, "Ingrese su ID:");
        String password= JOptionPane.showInputDialog(null, "Ingrese la contraseña deseada:");
        
        int idUser = Integer.parseInt(id);
        User newUser= new User(idUser, password);
        
        try{
            registroUser.addUser(newUser);
            JOptionPane.showMessageDialog(null, "Nuevo usuario registrado con exito");
        
        }catch(IOException e){
        e.printStackTrace();
        JOptionPane.showMessageDialog(null, "Error al guardar el nuevo usuario");
        
        }
        
       
    }
}
