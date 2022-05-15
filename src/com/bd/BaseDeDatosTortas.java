/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.bd;

import com.codigo.Cliente;
import com.codigo.Torta;
import com.codigo.Usuario;
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
            passbd = "1234",
            Driver = "com.mysql.cj.jdbc.Driver",
            URL = "localhost";
    
    private static 
            Conexion con = new Conexion(puerto, baseDeDatos, usuariobd, passbd, Driver, URL);

    public static Conexion getCon() {
        return con;
    } 
    
    public static Object getselect(String sentencia){
        return  null;
    }

    public static boolean validarCosulta(String consulta, Object... parametros) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public static LinkedList<Usuario> obtenerConsulta(String consulta, Object... parametros) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public static LinkedList<Cliente> obtenerConsultaCliente(String consulta, Object... parametros) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public static boolean validarCosultaCliente(String consulta,Object... parametros) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public static boolean validarCosultaTorta(String consulta, Object... parametros) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public static LinkedList<Torta> obtenerConsultaTorta(String consulta, Object... parametros) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

   
}
