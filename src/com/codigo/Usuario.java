/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.codigo;

import com.bd.BaseDeDatosTortas;
import java.util.LinkedList;

/**
 *
 * @author Admin
 */
public class Usuario {

    public static String TIPOADMINISTRADOR = "Administrador", TIPOCAJERO = "Cajero";

    public static Usuario getUsuario(int cedula) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public static boolean eliminarUsuario(int cedula) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public static boolean insertarUsuario(int cedula) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public static LinkedList<Usuario> getTodosLosUsuarios() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public static boolean actualizarUsuario(int cedula, Usuario usuario) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    private int cedula;
    private String nombre, apellido, tipoUsuario, contrasena;
    private int celular;

    public Usuario(int cedula,String contrasena, String nombre, String apellido, String tipoUsuario, int celular) {
        this.cedula = cedula;
        this.contrasena = contrasena;
        this.nombre = nombre;
        this.apellido = apellido;
        this.tipoUsuario = tipoUsuario;
        this.celular = celular;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

 
    public int getCedula() {
        return cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getTipoUsuario() {
        return tipoUsuario;
    }

    public void setTipoUsuario(String tipoUsuario) {
        this.tipoUsuario = tipoUsuario;
    }

    public int getCelular() {
        return celular;
    }

    public void setCelular(int celular) {
        this.celular = celular;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Usuario{");
        sb.append("cedula=").append(cedula);
        sb.append(", contrasena=").append(contrasena);
        sb.append(", nombre=").append(nombre);
        sb.append(", apellido=").append(apellido);
        sb.append(", tipoUsuario=").append(tipoUsuario);
        sb.append(", telefono=").append(celular);
        sb.append('}');
        return sb.toString();
    }
        
    private static Usuario convertirObjectToUsuario(Object obj) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    

    public static Usuario getUsuario(int usuario, String contrasena){
        Usuario res = null;
        
        
        String sentencia ="";
        
        Object obj = BaseDeDatosTortas.getselect(sentencia);
        
        res = convertirObjectToUsuario(obj);
        
        return res;
    }    
    
    
}
