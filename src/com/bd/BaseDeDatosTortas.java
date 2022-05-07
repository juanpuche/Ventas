/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.bd;

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
}
