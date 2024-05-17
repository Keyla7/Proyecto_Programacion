/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author kylea
 */
public class Cliente {
    private int id;
    private String nombre;
    private String apellido;
    private int edad;
    private int telefono;
    private String categoria;
    private String paymentPlan;
    private double altura;
    private double peso;
    
    public static final String[] TITULOS_CLIENTE={"ID","Nombre","Apellido","Edad","Telefono", "Categoria", "PaymentPlan", "Altura","Peso"};

    public Cliente() {
    }

    public Cliente(int id, String nombre, String apellido, int edad, int telefono, String categoria, String paymentPlan, double altura, double peso) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.telefono = telefono;
        this.categoria = categoria;
        this.paymentPlan = paymentPlan;
        this.altura = altura;
        this.peso = peso;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getPaymentPlan() {
        return paymentPlan;
    }

    public void setPaymentPlan(String paymentPlan) {
        this.paymentPlan = paymentPlan;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }
    
    public String getDatosClientes(int columna){
        switch (columna) {
            case 0: return String.valueOf(this.id);
            
            case 1: return this.nombre;
            
            case 2: return this.apellido;
   
            case 3: return String.valueOf(this.edad);
                
            case 4:return String.valueOf(this.telefono);
                
            case 5: return this.categoria;
               
            case 6: return this.paymentPlan;
            
            case 7: return String.valueOf(this.altura);
               
            case 8: return String.valueOf(this.peso);
        }
        return "";
    }

}
