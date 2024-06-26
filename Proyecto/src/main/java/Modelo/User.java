/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import com.opencsv.bean.CsvBindByName;

/**
 *
 * @author PC
 */
public class User {
    @CsvBindByName
    int idUser;
    @CsvBindByName
    String password;

    public User() {
    }

    public User(int idUser, String password) {
        this.idUser = idUser;
        this.password = password;
    }

    public String toCSV() {
        return this.password + "," + this.idUser;
    }

    public int getIdUser() {
        return idUser;
    }

    public void setIdUser(int idUser) {
        this.idUser = idUser;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
