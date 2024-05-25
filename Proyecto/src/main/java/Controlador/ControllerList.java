/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Vista.ListMember;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author kylea
 */
public class ControllerList implements ActionListener{
    private ListMember list;

    public ControllerList() {
        this.list = new ListMember();
        this.list.escuchar(this);
        this.list.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        switch (e.getActionCommand().toString()) {
            case "X":
                this.list.dispose();
                break;

        }
    }
    
    
}
