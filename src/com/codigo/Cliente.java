/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.codigo;

import java.util.LinkedList;

/**
 *
 * @author Admin
 */
public class Cliente {

    public static Cliente getCliente(int cedula) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public static boolean eliminarCliente(int cedula) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public static boolean insertarCliente(Cliente cliente) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public static boolean actualizarCliente(Cliente cliente) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public static LinkedList<Cliente> getTodosLosClientes() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

   
    
    private int cedula, celular;
    private String nombres, apellidos, direccion;

    public Cliente(int cedula, int celular, String nombres, String apellidos, String direccion) {
        this.cedula = cedula;
        this.celular = celular;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.direccion = direccion;
    }

    public int getCedula() {
        return cedula;
    }

    public int getCelular() {
        return celular;
    }

    public void setCelular(int celular) {
        this.celular = celular;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Cliente{");
        sb.append("cedula=").append(cedula);
        sb.append(", celular=").append(celular);
        sb.append(", nombres=").append(nombres);
        sb.append(", apellidos=").append(apellidos);
        sb.append(", direccion=").append(direccion);
        sb.append('}');
        return sb.toString();
    }
    
    
}
