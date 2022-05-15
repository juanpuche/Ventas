/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.bd;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

/**
 *
 * @author Admin
 */
public class BaseDeDatosTortas {
    private static final int puerto = 3308;
    private static final String 
            baseDeDatos = "tortas",
            usuariobd = "root",
            passbd = "2711",
            Driver = "com.mysql.cj.jdbc.Driver",
            URL = "localhost";
    
    private static 
            Conexion con = new Conexion(puerto, baseDeDatos, usuariobd, passbd, Driver, URL);

    public static Conexion getCon() {
        return con;
    } 
    
    public static void main(String[] args) {
        BaseDeDatosTortas.con.conectarBd();
//        System.out.println(BaseDeDatosTortas.executeUpdate("SELECT * FROM market_place.persona;INSERT INTO `tortas`.`usuario`\n" +
//                "(`cedula`,\n" +
//                "`nombres`,\n" +
//                "`apellidos`,\n" +
//                "`telefono`,\n" +
//                "`tipousuario`,\n" +
//                "`contrasena`)\n" +
//                "VALUES\n" +
//                "(1,\n" +
//                "'juan',\n" +
//                "'Garzón',\n" +
//                "31756773,\n" +
//                "'Admin',\n" +
//                "'2711');"));

           LinkedList<Map<String,Object>> rs = BaseDeDatosTortas.executeQuery("SELECT * FROM tortas.usuario;");
           System.out.println(rs.size());
           for (Map<String, Object> r : rs) {
               for (String obj1 : r.keySet()) {
                   
                   StringBuilder str = new StringBuilder();
                   str.append(obj1);
                   str.append(": ");
                   str.append(r.get(obj1));
                   str.append("\t");
                   System.out.print(str.toString());
               }
               System.out.println("");
        }
    }
    
    public static LinkedList<Map<String,Object>> executeQuery(String query) {
        Statement statement = null;
        ResultSet set = null;
        try {
            statement = con.getConnection().createStatement();
            set = statement.executeQuery(query);
            LinkedList<Map<String,Object>> res = new LinkedList<>();
            ResultSetMetaData rsmdt = set.getMetaData();
            int nColumnas = rsmdt.getColumnCount();
            
            while(set.next()) {
                Map<String, Object> map = new HashMap<>();
                
                for (int i = 1; i <= nColumnas; i++) {
                    map.put(rsmdt.getColumnName(i), set.getObject(i));
                }
                
                
                res.add(map);
            }
            
            return res;
        } catch (SQLException e) {
        } finally { // Close in order: ResultSet, Statement, Connection.
            try {
                set.close();
            } catch (SQLException e) {
            }
            try {
                statement.close();
            } catch (SQLException e) {
            }
            try {
                con.getConnection().close();
            } catch (SQLException e) {
            }
        }
        return null;
    }

    public static int executeUpdate(String update) {
        if (con == null)
            return -1;
        
        if(!con.conectarBd())
            return -1;        
        
        Connection Conexion = con.getConnection();
        int res = Integer.MIN_VALUE;
        Statement statement = null;
        try {
            statement = Conexion.createStatement();
            res = statement.executeUpdate(update);
        } catch (SQLException e) {
        } finally {
            try {
                statement.close();
            } catch (SQLException e) {
            }
            try {
                Conexion.close();
            } catch (SQLException e) {
            }
        }
        return res;
    }
}
