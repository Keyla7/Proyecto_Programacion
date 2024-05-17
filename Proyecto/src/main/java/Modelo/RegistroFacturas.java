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
    private String filePath = "Facturas.csv";

    public RegistroFacturas() {
        this.facturas = new ArrayList<>();
    }

    public static void escribirCSV(ArrayList<Factura> facturas, String rutaArchivo) throws IOException {
        try (CSVWriter writer = new CSVWriter(new FileWriter(rutaArchivo))) {
            // Configurar el escritor CSV
            StatefulBeanToCsv<Factura> beanToCsv = new StatefulBeanToCsvBuilder<Factura>(writer).build();
            try {
                // Escribir la lista de personas en el archivo CSV
                beanToCsv.write(facturas);
            } catch (CsvDataTypeMismatchException ex) {
            } catch (CsvRequiredFieldEmptyException ex) {
            }
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
}
