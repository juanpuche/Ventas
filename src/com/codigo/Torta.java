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
public class Torta {

    public static Torta getTorta(String codigo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }


    public static boolean eliminarTorta(String codigo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public static boolean insertarTorta(String codigo) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public static LinkedList<Torta> getTodasLasTortas() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public static boolean actualizarTorta(String codigo, Torta torta) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public static LinkedList<Torta> getTortasPedido() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public static LinkedList<Integer> getCantidadesPedido() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    private String codigo, sabor;
    private double peso, precio;

    public Torta(String codigo, String sabor, double peso, double precio) {
        this.codigo = codigo;
        this.sabor = sabor;
        this.peso = peso;
        this.precio = precio;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getSabor() {
        return sabor;
    }

    public void setSabor(String sabor) {
        this.sabor = sabor;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Torta{");
        sb.append("codigo=").append(codigo);
        sb.append(", sabor=").append(sabor);
        sb.append(", peso=").append(peso);
        sb.append(", precio=").append(precio);
        sb.append('}');
        return sb.toString();
    }
    
}
