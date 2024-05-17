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
 * @author PC
 */
public class RegistroUser {

    ArrayList<User> users;
    String filePath = "Users.csv";

    public static void writeCSV(ArrayList<User> users, String rutaArchivo) throws IOException {
        try ( CSVWriter writer = new CSVWriter(new FileWriter(rutaArchivo))) {
            StatefulBeanToCsv<User> beanToCsv = new StatefulBeanToCsvBuilder<User>(writer).build();

            try {
                beanToCsv.write(users);

            } catch (CsvDataTypeMismatchException ex) {
            } catch (CsvRequiredFieldEmptyException ex) {
            }
        }
    }

    public static ArrayList<User> readCSV(String rutaArchivo) throws IOException {
        try ( CSVReader reader = new CSVReader(new FileReader(rutaArchivo))) {
            // Configurar el lector CSV
            CsvToBean<User> csvToBean = new CsvToBeanBuilder<User>(reader)
                    .withType(User.class)
                    .build();

            // Leer las personas del archivo CSV
            return (ArrayList<User>) csvToBean.parse();
        }
    }

    public String addUser(User user) throws IOException {
        users = readCSV(filePath);
        if (user != null) {
            if (searchUser(user.getIdUser()) == null) {
                users.add(user);
                writeCSV(users, filePath);
                return "Usuario agregado correctamente";
            } else {
                return "Ya existe ese usuario ";
            }
        } else {
            return "Error al agregar este usuario";
        }
    }

    private User searchUser(int idUser) throws IOException {
        users = readCSV(filePath);
        for (User user : users) {
            if (user.getIdUser() == idUser) {
                return user;
            }
        }
        return null;
    }

}
