/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.Cliente;
import Modelo.RegistroCliente;
import Modelo.RegistroUser;
import Vista.Menu;
import Vista.NewMember;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author kylea
 */
public class ControllerNewMember implements ActionListener{
    private NewMember member;
    private Cliente cliente;
    private Menu menu;
    private RegistroCliente Rcliente;
    private ControllerList controllerList;

    public ControllerNewMember() {
        this.member = new NewMember();
        this.Rcliente= new RegistroCliente();
        this.member.setVisible(true);
        this.member.escuchar(this);
        this.controllerList= new ControllerList();
        
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        switch (e.getActionCommand().toString()) {
            case "Check In":
                this.cliente= this.member.getNewMember();
                if (this.validarCampos(cliente)) {
                    Menu.getMensaje(this.Rcliente.agregarCliente(cliente));
                    this.member.limpiar();
                    this.controllerList.actualizarTabla();
                }
                break;
            case "X":
                this.member.dispose();
                break;
        }
    }
    
    public boolean validarCampos(Cliente cliente){
        if(cliente.getId()==0||cliente.getNombre().isEmpty()||cliente.getApellido().isEmpty()||cliente.getEdad()== 0||cliente.getTelefono()== 0|| cliente.getCategoria().isEmpty()||cliente.getPaymentPlan().isEmpty()||cliente.getAltura()== 0||cliente.getPeso()== 0)
        {
            Menu.getMensaje("Por favor ingrese todos los valores");
            return false;
        }
        return true;
    }
    
}
