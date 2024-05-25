/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

/**
 *
 * @author kylea
 */
public class RegistroCliente {
    ArrayList<Cliente> listaClientes;
    String mensaje;
    private String filePath = "clientes.json";

    public RegistroCliente() {
        this.listaClientes = readFromJson();
        this.mensaje = "";
    }
    
    public String agregarCliente(Cliente cliente) {
        if (cliente != null) {
            if (buscarCliente(cliente.getId()) == null) {
                this.listaClientes.add(cliente);
                mensaje = "Cliente agregado correctamente";
            } else {
                mensaje = "Ya existe un cliente con el id '"+cliente.getId()+"'";
            }
        } else {
            mensaje = "Error al agregar el cliente";
        }
        return mensaje;
    }

    private Cliente buscarCliente(int id) {
        for (Cliente miCliente : listaClientes) {
            if (miCliente.getId()==id) {
                return miCliente;
            }
        }
        return null;
    }
    
    public String eliminarCliente(Cliente cliente) {
        if (buscarCliente(cliente.getId()) != null) {
            this.listaClientes.remove(cliente);
            mensaje = "Cliente eliminado con exito";
        } else {
            mensaje = "El cliente ingresado no existe";
        }
        return mensaje;
    }
    
    public String editarCliente(Cliente cliente){
        for (int i = 0; i < this.listaClientes.size(); i++) {
            if (this.listaClientes.get(i).getId() ==cliente.getId()) {
                this.listaClientes.set(i, cliente);
                return "El cliente ha sido modificado correctamente";
            }
        }
        return "No se encontro al cliente";
    }
    
    public String[][] getMatrizCliente(){
        String[][] matrizClientes = new String[this.listaClientes.size()][Cliente.TITULOS_CLIENTE.length];
        for (int i = 0; i < matrizClientes.length; i++) {
            for (int j = 0; j < matrizClientes[0].length; j++) {
                matrizClientes[i][j]= this.listaClientes.get(i).getDatosClientes(j);
            }
        }
        return matrizClientes;
    }
    
    public void appendToJson(Cliente cliente) {
        JSONObject nuevoCliente = new JSONObject();
        
        nuevoCliente.put("id", cliente.getId());
        nuevoCliente.put("nombre", cliente.getNombre());
        nuevoCliente.put("apellido", cliente.getApellido());
        nuevoCliente.put("edad", cliente.getEdad());
        nuevoCliente.put("telefono", cliente.getTelefono());
        nuevoCliente.put("categoria", cliente.getCategoria());
        nuevoCliente.put("paymentPlan", cliente.getPaymentPlan());
        nuevoCliente.put("altura", cliente.getAltura());
        nuevoCliente.put("peso", cliente.getPeso());

        JSONArray arrayCliente = new JSONArray();
 
        JSONParser parser = new JSONParser();
        try ( FileReader reader = new FileReader(filePath)) {
            Object nuevo = parser.parse(reader);
            arrayCliente = (JSONArray) nuevo;
        } catch (IOException | org.json.simple.parser.ParseException e) {
            System.out.println("File no found");
        }
        arrayCliente.add(nuevoCliente);
        try ( FileWriter archivo = new FileWriter(filePath)) {
            archivo.write(arrayCliente.toJSONString());
            archivo.flush();
        } catch (IOException io) {
            io.printStackTrace();
        }
    }
    
    public ArrayList<Cliente> readFromJson() {
        ArrayList<Cliente> arrayClientes = new ArrayList<>();
        JSONParser parser = new JSONParser();
        try ( FileReader reader = new FileReader(filePath)) {
            Object obj = parser.parse(reader);
            JSONArray jsonArray = (JSONArray) obj;
            for (Object object : jsonArray) {
                JSONObject miCliente = (JSONObject) object;
                 int id = ((Long) miCliente.get("id")).intValue();
                String nombre = (String) miCliente.get("nombre");
                String apellido = (String) miCliente.get("apellido");
                 int edad = ((Long) miCliente.get("edad")).intValue();
                 int telefono = ((Long) miCliente.get("telefono")).intValue();
                 String categoria = (String) miCliente.get("categoria");
                 String paymentPlan = (String) miCliente.get("paymentPlan");
                double altura = (Double) miCliente.get("altura");
                double peso = (Double) miCliente.get("peso");
                Cliente clientes = new Cliente(id, nombre, apellido, edad, telefono, categoria, paymentPlan, altura, peso);
                arrayClientes.add(clientes);

            }

        } catch (IOException | ParseException e) {
            e.printStackTrace();
        }
        return arrayClientes;
    }

}
