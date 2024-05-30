/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import com.opencsv.bean.CsvBindByName;

/**
 *
 * @author Aaron
 */
public class Factura {

    @CsvBindByName
    private int idCliente;
    @CsvBindByName
    private String fecha;
    @CsvBindByName
    private String nombre;
    @CsvBindByName
    private String metodoPago;
    @CsvBindByName
    private double pagoTotal;
    @CsvBindByName
    private int idFactura;

    public Factura() {
    }

    public Factura(int idCliente, String fecha, String nombre, String metodoPago, double pagoTotal, int idFactura) {
        this.idCliente = idCliente;
        this.fecha = fecha;
        this.nombre = nombre;
        this.metodoPago = metodoPago;
        this.pagoTotal = pagoTotal;
        this.idFactura = idFactura;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public int getIdFactura() {
        return idFactura;
    }

    public void setIdFactura(int idFactura) {
        this.idFactura = idFactura;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getMetodoPago() {
        return metodoPago;
    }

    public void setMetodoPago(String metodoPago) {
        this.metodoPago = metodoPago;
    }

    public double getPagoTotal() {
        return pagoTotal;
    }

    public void setPagoTotal(double pagoTotal) {
        this.pagoTotal = pagoTotal;
    }

    @Override
    public String toString() {
        return "Factura{" + "idCliente=" + idCliente + ", idFactura=" + idFactura + ", fecha=" + fecha + ", nombre=" + nombre + ", metodoPago=" + metodoPago + ", pagoTotal=" + pagoTotal + '}';
    }

    public String getDatosfactura(int c) {
        switch (c) {
            case 0:
                return idCliente + " ";
            case 1:

                return idFactura + " ";
            case 2:

                return fecha;
            case 3:

                return nombre;
            case 4:

                return metodoPago;
            case 5:

                return pagoTotal + " ";
        }
        return "";
    }

}
