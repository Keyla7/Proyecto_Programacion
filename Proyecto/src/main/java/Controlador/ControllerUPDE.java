/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Vista.UpdateDelete;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author kylea
 */
public class ControllerUPDE implements ActionListener{
    private UpdateDelete updateDelete;

    public ControllerUPDE() {
        this.updateDelete = new UpdateDelete();
        this.updateDelete.escuchar(this);
        this.updateDelete.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        switch (e.getActionCommand().toString()) {
            case "Update":

                break;
            case "Delete":

                break;
            case "Reset":

                break;
            case "Search":

                break;
            case "X":
                this.updateDelete.dispose();
                break;
        }
        }
    
}
