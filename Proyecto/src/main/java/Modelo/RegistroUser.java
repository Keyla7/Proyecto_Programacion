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
 * @author PC
 */
public class RegistroUser {

    ArrayList<User> usuariosRegistrados;
    String filePath = "usuariosRegistrados.csv";

    public RegistroUser() {
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

  
    public static void writeCSV(ArrayList<User> usuariosRegistrados, String rutaArchivo) {
    try (CSVWriter writer = new CSVWriter(new FileWriter(rutaArchivo))) {
        StatefulBeanToCsv<User> beanToCsv = new StatefulBeanToCsvBuilder<User>(writer).build();

        try {
            beanToCsv.write(usuariosRegistrados);

        } catch (CsvDataTypeMismatchException ex) {
            System.err.println("Error: Se ha producido un error de tipo de datos en la escritura del CSV.");
            ex.printStackTrace();
        } catch (CsvRequiredFieldEmptyException ex) {
            System.err.println("Error: Se ha producido un error de campo requerido vacío en la escritura del CSV.");
            ex.printStackTrace();
        }
    } catch (IOException ex) {
        System.err.println("Error: No se pudo escribir el archivo CSV. Verifique que la ruta sea correcta y que tenga permisos de escritura.");
        ex.printStackTrace();
    }
}


    public static ArrayList<User> readCSV(String rutaArchivo) {
    ArrayList<User> usuarios = new ArrayList<>();
    try (CSVReader reader = new CSVReader(new FileReader(rutaArchivo))) {
        // Configurar el lector CSV
        CsvToBean<User> csvToBean = new CsvToBeanBuilder<User>(reader)
               .withType(User.class)
               .build();

        // Leer las personas del archivo CSV
        usuarios = (ArrayList<User>) csvToBean.parse();
    } catch (IOException ex) {
        System.err.println("Error: No se pudo leer el archivo CSV. Verifique que la ruta sea correcta y que tenga permisos de lectura.");
        ex.printStackTrace();
    }
    return usuarios;
}

    public String addUser(User user) {
    try {
        usuariosRegistrados = readCSV(filePath);
        if (user!= null) {
            if (searchUser(user.getIdUser()) == null) {
                usuariosRegistrados.add(user);
                writeCSV(usuariosRegistrados, filePath);
                return "Usuario agregado correctamente";
            } else {
                return "Ya existe ese usuario ";
            }
        } else {
            return "Error al agregar este usuario";
        }
    } catch (IOException ex) {
        System.err.println("Error: No se pudo agregar el usuario. Verifique que la ruta sea correcta y que tenga permisos de escritura.");
        ex.printStackTrace();
        return "Error al agregar el usuario";
    }
}


    public User searchUser(int idUser) throws IOException {
        usuariosRegistrados = readCSV(filePath);
        for (User user : usuariosRegistrados) {
            if (user.getIdUser() == idUser) {
                return user;
            }
        }
        return null;
    }

    public boolean verificacionU(User user) throws IOException {
        ArrayList<User> usuariosRegistrados = readCSV(filePath);
        for (User u : usuariosRegistrados) {
            if (u.getIdUser() == user.getIdUser() && u.getPassword().equals(user.getPassword())) {
                return true;
            }
        }
        return false;
    }

}
