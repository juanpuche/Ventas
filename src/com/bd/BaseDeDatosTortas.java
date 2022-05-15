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
import java.sql.PreparedStatement;
import java.util.LinkedList;

/**
 *
 * @author Admin
 */
public class BaseDeDatosTortas {
    private static final int puerto = 3306;//3306
    private static final String 
            baseDeDatos = "tortas",
            usuariobd = "root",
            passbd = "1234",//1234
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

        LinkedList<HashMap<String,Object>> rs = BaseDeDatosTortas.obtenerConsulta("SELECT cliente.*\n" +
"    FROM cliente\n" +
"    WHERE cliente.cedula = ?", Long.parseLong("22"));
        System.out.println(rs.size());
        for (HashMap<String, Object> r : rs) {
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
    
    public static LinkedList<HashMap<String,Object>> obtenerConsulta(String consulta,Object... parametros) {
        if (con == null)
            return null;
        
        if(!con.conectarBd())
            return null;
        
        Statement statement = null;
        ResultSet set = null;
        LinkedList<HashMap<String,Object>> res = null;
        Connection Conexion = con.getConnection();
        System.out.println(consulta);
        try {
//            statement = con.getConnection().createStatement();
            PreparedStatement smt = con.getConnection().prepareStatement(consulta);
            agregarParametros(smt,parametros);
            set = smt.executeQuery();
            ResultSetMetaData rsmdt = set.getMetaData();
            int nColumnas = rsmdt.getColumnCount();
            res = new LinkedList<>();
            
            while(set.next()) {
                HashMap<String, Object> map = new HashMap<>();
                
                for (int i = 1; i <= nColumnas; i++) {
                    map.put(rsmdt.getColumnName(i), set.getObject(i));
                }
                
                
                res.add(map);
            }
            BaseDeDatosTortas.con.desconectarBd();
        } catch (SQLException e) {
            System.out.println("error: " + e.getMessage());
        } finally { // Close in order: ResultSet, Statement, Connection.
            BaseDeDatosTortas.con.desconectarBd();
        }
         BaseDeDatosTortas.con.desconectarBd();
         System.out.println("Todo bien");
        return res;
    }

    public static boolean validarCosulta(String consulta,Object... parametros) {
        if (con == null)
            return false;
        
        if(!con.conectarBd())
            return false;        
        
        BaseDeDatosTortas.con.conectarBd();
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
             BaseDeDatosTortas.con.desconectarBd();
        }
        BaseDeDatosTortas.con.desconectarBd();
        return false;
    }

    private static void agregarParametros(PreparedStatement smt, Object[] parametros) throws SQLException {
        if (parametros == null)
            return;
        
        for (int i = 0; i < parametros.length; i++) {
            if ( parametros[i] instanceof Long){
                smt.setLong(i+1,  (long) parametros[i]);
            }else{
                smt.setObject(i+1, parametros[i] );
            }
        }
    }
   
}
