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
import java.util.Map;
import java.sql.PreparedStatement;
import java.util.LinkedList;

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
//        System.out.println(BaseDeDatosTortas.validarCosulta("INSERT INTO `tortas`.`usuario`\n" +
//            "(`cedula`,\n" +
//            "`contrasena`,\n" +
//            "`nombres`,\n" +
//            "`apellidos`,\n" +
//            "`celular`,\n" +
//            "`tipousuario`)\n" +
//            "VALUES\n" +
//            "(?,?,?,?,?,?);",
//                1,
//                "2711",
//                "juan",
//                "Garzón",
//                31756773,
//                "Admin"
//        ));

           LinkedList<Map<String,Object>> rs = BaseDeDatosTortas.obtenerConsulta("SELECT * FROM tortas.usuario;");
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
    
    public static LinkedList<Map<String,Object>> obtenerConsulta(String consulta,Object... parametros) {
        Statement statement = null;
        ResultSet set = null;
        LinkedList<Map<String,Object>> res = null;
        try {
            statement = con.getConnection().createStatement();
            PreparedStatement smt = con.getConnection().prepareStatement(consulta);
            agregarParametros(smt,parametros);
            set = smt.executeQuery();
            ResultSetMetaData rsmdt = set.getMetaData();
            int nColumnas = rsmdt.getColumnCount();
            res = new LinkedList<>();
            
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
        return res;
    }

    public static boolean validarCosulta(String consulta,Object... parametros) {
        if (con == null)
            return false;
        
        if(!con.conectarBd())
            return false;        
        
        Connection Conexion = con.getConnection();
        Statement statement = null;
        try {
            statement = Conexion.createStatement();
            PreparedStatement smt = Conexion.prepareStatement(consulta);
            agregarParametros(smt,parametros);            
            return !smt.execute();
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
        return false;
    }

    private static void agregarParametros(PreparedStatement smt, Object[] parametros) throws SQLException {
        if (parametros == null)
            return;
        
        for (int i = 0; i < parametros.length; i++) {
            smt.setObject(i+1, parametros[i] );
        }
    }
   
}
