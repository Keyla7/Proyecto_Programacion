/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import com.opencsv.CSVReader;
import com.opencsv.CSVWriter;
import com.opencsv.bean.CsvToBean;
import com.opencsv.bean.CsvToBeanBuilder;
import com.opencsv.bean.StatefulBeanToCsv;
import com.opencsv.bean.StatefulBeanToCsvBuilder;
import com.opencsv.exceptions.CsvDataTypeMismatchException;
import com.opencsv.exceptions.CsvRequiredFieldEmptyException;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author Aaron
 */
public class RegistroFacturas {

    private ArrayList<Factura> facturas;
    private String filePath = "facturas.csv";
    public static final String [] TITULOS_FACTURA = {"idCliente","idFactura","Fecha","Nombre","Metodo de Pago", "Pago Total"};
    
    public RegistroFacturas() {
       // this.facturas = new ArrayList<>();
       File file = new File(filePath);
        if (!file.exists()) {
            try {
                file.createNewFile();
                System.out.println("Archivo creado: " + file.getAbsolutePath());
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    
    private static void escribirCSVInternamente(ArrayList<Factura> facturas, String rutaArchivo) throws IOException {
    try (CSVWriter writer = new CSVWriter(new FileWriter(rutaArchivo))) {
        // Configurar el escritor CSV
        StatefulBeanToCsv<Factura> beanToCsv = new StatefulBeanToCsvBuilder<Factura>(writer).build();
        try {
            // Escribir la lista de personas en el archivo CSV
            beanToCsv.write(facturas);
        } catch (CsvDataTypeMismatchException ex) {
            throw new IOException("Error: Se ha producido un error de tipo de datos en la escritura del CSV.", ex);
        } catch (CsvRequiredFieldEmptyException ex) {
            throw new IOException("Error: Se ha producido un error de campo requerido vacío en la escritura del CSV.", ex);
        }
    }
}
    public static void escribirCSV(ArrayList<Factura> facturas, String rutaArchivo) {
    try {
        escribirCSVInternamente(facturas, rutaArchivo);
    } catch (IOException e) {
        // Trakti la escepton de I/O
        System.err.println("Error para escribir CSV: " + e.getMessage());
    }
}

    public static ArrayList<Factura> leerCSV(String rutaArchivo) throws IOException {
        try (CSVReader reader = new CSVReader(new FileReader(rutaArchivo))) {
            // Configurar el lector CSV
            CsvToBean<Factura> csvToBean = new CsvToBeanBuilder<Factura>(reader)
                    .withType(Factura.class)
                    .build();
            // Leer las personas del archivo CSV
            return (ArrayList<Factura>) csvToBean.parse();
        }
    }

    public String addFactura(Factura factura) throws IOException {
        facturas = leerCSV(filePath);
        if (factura != null) {
            if (buscarFactura(factura.getIdFactura()) == null) {
                facturas.add(factura);
                escribirCSV(facturas, filePath);
                return "Factura agregada correctamente";
            } else {
                return "Ya existe una factura con este id";
            }
        } else {
            return "Error al agregar factura";
        }
    }

    public Factura buscarFactura(int idFactura) throws IOException {
        facturas = leerCSV(filePath);
        for (Factura factura : facturas) {
            if (factura.getIdFactura() == idFactura) {
                return factura;
            }
        }
        return null;
    }

    public String eliminarFactura(Factura factura) throws IOException {
        facturas = leerCSV(filePath);
        if (buscarFactura(factura.getIdFactura()) != null) {
            facturas.remove(factura);
            escribirCSV(facturas, filePath);
            return "Factura eliminada correctamente";
        }
        return "No existe una factura con este id";
    }

    public String editarFactura(Factura fct) throws IOException {
        facturas = leerCSV(filePath);
        Factura factura = buscarFactura(fct.getIdFactura());
        if (factura != null) {
            facturas.remove(factura);
            facturas.add(fct);
            escribirCSV(facturas, filePath);
            return "Factura editada correctamente";
        }
        return "No existe una factura con este id";
    }
    
    public String [][] getMatrizFacturas() throws IOException{
        facturas = leerCSV(filePath);
        String [][] matrizFacturas = new String [facturas.size()][TITULOS_FACTURA.length];
        for (int i = 0; i < matrizFacturas.length; i++) {
            for (int j = 0; j < matrizFacturas[i].length; j++) {
                matrizFacturas[i][j]=facturas.get(i).getDatosfactura(j);
            }
        }
        return matrizFacturas;
    }
}
