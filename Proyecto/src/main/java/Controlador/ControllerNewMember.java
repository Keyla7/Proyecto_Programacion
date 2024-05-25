/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Vista.NewMember;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author kylea
 */
public class ControllerNewMember implements ActionListener{
    private NewMember member;

    public ControllerNewMember() {
        this.member = new NewMember();
        this.member.setVisible(true);
        this.member.escuchar(this);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        switch (e.getActionCommand().toString()) {
            case "Check In":

                break;
            case "X":
                this.member.dispose();
                break;
        }
    }
    
}
