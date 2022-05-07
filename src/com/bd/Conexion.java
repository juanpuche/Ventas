/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.bd;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Admin
 */
class Conexion {
    
    private final int puerto;
    private final  String 
            baseDeDatos,
            usuariobd,
            passbd,
            Driver,
            URL;
    private Connection connection;
    

    public Conexion(int puerto, String baseDeDatos, String usuariobd, String passbd, String Driver, String URL) {
        this.puerto = puerto;
        this.baseDeDatos = baseDeDatos;
        this.usuariobd = usuariobd;
        this.passbd = passbd;
        this.Driver = Driver;
        this.URL = URL;
    }
    
    public boolean conectarBd(){
        System.out.println("-------- MySQL JDBC Connection Demo ------------");
        try
        {
            Class.forName(Driver);
        } 
        catch (ClassNotFoundException e) {
            System.out.println("MySQL JDBC Driver not found !!");
            return false;
        }
        System.out.println("MySQL JDBC Driver Registered!");
        connection = null;
        try {
            connection = DriverManager
                    .getConnection("jdbc:mysql://" + URL + ":" + puerto + "/" + baseDeDatos, usuariobd, passbd);
            System.out.println("SQL Connection to database established!");

        } catch (SQLException e) {
            System.out.println("Connection Failed! Check output console");
            return false;
        } 
        return true;
    } 
    
    public boolean desconectarBd(){
        try
        {
            if(connection != null)
                connection.close();
            System.out.println("Connection closed !!");
            return true;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

    public Connection getConnection() {
        return connection;
    }    
}
