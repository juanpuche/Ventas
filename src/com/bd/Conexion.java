/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.bd;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

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
        }
        return false;
    }

    public Connection getConnection() {
        return connection;
    }    
    
    public static boolean update(){
        Connection conn = null;
        Statement stmt = null;
        try {
           try {
              Class.forName("com.mysql.jdbc.Driver");
           } catch (Exception e) {
              System.out.println(e);
        }
        conn = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/business", "Manish", "123456");
        System.out.println("Connection is created successfully:");
        stmt = (Statement) conn.createStatement();
        String query1 = "INSERT INTO InsertDemo " + "VALUES (1, 'John', 34)";
        stmt.executeUpdate(query1);
        query1 = "INSERT INTO InsertDemo " + "VALUES (2, 'Carol', 42)";
        stmt.executeUpdate(query1);
        System.out.println("Record is inserted in the table successfully..................");
        } catch (SQLException excep) {
           excep.printStackTrace();
        } catch (Exception excep) {
           excep.printStackTrace();
        } finally {
           try {
              if (stmt != null)
                 conn.close();
           } catch (SQLException se) {}
           try {
              if (conn != null)
                 conn.close();
           } catch (SQLException se) {
              se.printStackTrace();
           }  
        }
        System.out.println("Please check it in the MySQL Table......... ……..");
        return true;
    }
    
    public static void select(){
        
    }
}
