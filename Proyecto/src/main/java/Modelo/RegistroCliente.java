/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.NoSuchElementException;
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
            if (buscarClienteB(cliente.getId()) == null) {
                this.listaClientes.add(cliente);
                appendToJson();
                mensaje = "Cliente agregado correctamente";
            } else {
                mensaje = "Ya existe un cliente con el id '" + cliente.getId() + "'";
            }
        } else {
            mensaje = "Error al agregar el cliente";
        }
        return mensaje;
    }

    public Cliente buscarClienteB(int id) {
        for (Cliente miCliente : listaClientes) {
            if (miCliente.getId()==id) {
                return miCliente;
            }
        }
        return null;
    }
    public Cliente buscarCliente(int id) {
        for (Cliente miCliente : listaClientes) {
            if (miCliente.getId() == id) {
                return miCliente;
            }else
            {
                return null;
            }
        }
        throw new NoSuchElementException("No se encontró un cliente con el ID " + id);
    }

    public String eliminarCliente(Cliente cliente) {
        if (buscarClienteB(cliente.getId()) != null) {
            this.listaClientes.remove(cliente);
            appendToJson();
            mensaje = "Cliente eliminado con exito";
        } else {
            mensaje = "El cliente ingresado no existe";
        }
        return mensaje;
    }

    public String editarCliente(Cliente cliente) {
        for (int i = 0; i < this.listaClientes.size(); i++) {
            if (this.listaClientes.get(i).getId() == cliente.getId()) {
                this.listaClientes.set(i, cliente);
                appendToJson();
                return "El cliente ha sido modificado correctamente";
            }
        }
        return "No se encontro al cliente";
    }

    public String[][] getMatrizCliente() {
        String[][] matrizClientes = new String[this.listaClientes.size()][Cliente.TITULOS_CLIENTE.length];
        for (int i = 0; i < matrizClientes.length; i++) {
            for (int j = 0; j < matrizClientes[0].length; j++) {
                matrizClientes[i][j] = this.listaClientes.get(i).getDatosClientes(j);
            }
        }
        return matrizClientes;
    }

    public void appendToJson() {
        
        JSONArray arrayCliente = new JSONArray();

        for (int i = 0; i < listaClientes.size(); i++) {
            JSONObject nuevoCliente = new JSONObject();

            nuevoCliente.put("id", listaClientes.get(i).getId());
            nuevoCliente.put("nombre", listaClientes.get(i).getNombre());
            nuevoCliente.put("apellido", listaClientes.get(i).getApellido());
            nuevoCliente.put("edad", listaClientes.get(i).getEdad());
            nuevoCliente.put("telefono", listaClientes.get(i).getTelefono());
            nuevoCliente.put("categoria", listaClientes.get(i).getCategoria());
            nuevoCliente.put("paymentPlan", listaClientes.get(i).getPaymentPlan());
            nuevoCliente.put("altura", listaClientes.get(i).getAltura());
            nuevoCliente.put("peso", listaClientes.get(i).getPeso());
            
            arrayCliente.add(nuevoCliente);
            try (FileWriter archivo = new FileWriter(filePath)) {
                archivo.write(arrayCliente.toJSONString());
                archivo.flush();
            } catch (IOException io) {
                io.printStackTrace();
            }
        }//end of for
    }

    public ArrayList<Cliente> readFromJson() {
        ArrayList<Cliente> arrayClientes = new ArrayList<>();
        JSONParser parser = new JSONParser();
        try (FileReader reader = new FileReader(filePath)) {
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
