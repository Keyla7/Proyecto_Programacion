/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.Cliente;
import Modelo.RegistroCliente;
import Vista.ListMember;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

/**
 *
 * @author kylea
 */
public class ControllerList implements ActionListener{
    private ListMember list;
    private RegistroCliente registroC;

    public ControllerList() {
        this.list = new ListMember();
        this.list.escuchar(this);
        this.list.setVisible(true);
        this.registroC= new RegistroCliente();
      
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        switch (e.getActionCommand().toString()) {
            case "X":
                this.list.dispose();
                break;

        }
    }
    
    public void actualizarTabla(){
        //recargue datos desde el JSON
    list.clearTable();
    List<Cliente> listaClientes= registroC.readFromJson();
    }
    
    
}
