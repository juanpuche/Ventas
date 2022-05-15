/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.codigo;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.LinkedList;

/**
 *
 * @author Admin
 */
public class Pedido {

    public static String 
            ESTADO_ENTREGADO="Entregado",
            ESTADO_CANCELADO="Cancelado",
            ESTADO_NO_ENTREGADO="No entregado";

    public static boolean insertarPedido(Pedido pedido, LinkedList<Torta> SusTortas, LinkedList<Integer> SusCantidades) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public static Pedido getPedido(String numero) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public static boolean actualizarPedido(Pedido pedido) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    private int cantidad_tortas;
    private long cedula_cliente, cedula_usuario, id_numero;
    private LocalDate fecha;
    private String estado, id_torta;

    public Pedido(long id_numero, String id_torta, int cantidad_tortas, long cedula_cliente, long cedula_usuario, LocalDate fecha, String estado) {
        this.id_numero = id_numero;
        this.id_torta = id_torta;
        this.cantidad_tortas = cantidad_tortas;
        this.cedula_cliente = cedula_cliente;
        this.cedula_usuario = cedula_usuario;
        this.fecha = fecha;
        this.estado = estado;
    }

    public Pedido(String id_torta, int cantidad_tortas, long cedula_cliente, long cedula_usuario, LocalDate fecha, String estado) {
        this.id_torta = id_torta;
        this.cantidad_tortas = cantidad_tortas;
        this.cedula_cliente = cedula_cliente;
        this.cedula_usuario = cedula_usuario;
        this.fecha = fecha;
        this.estado = estado;
    }

    public String getId_torta() {
        return id_torta;
    }

    public void setId_torta(String id_torta) {
        this.id_torta = id_torta;
    }

    public int getCantidad_tortas() {
        return cantidad_tortas;
    }

    public void setCantidad_tortas(int cantidad_tortas) {
        this.cantidad_tortas = cantidad_tortas;
    }
    

    public long getId_numero() {
        return id_numero;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public long getCedula_cliente() {
        return cedula_cliente;
    }

    public void setCedula_cliente(long cedula_cliente) {
        this.cedula_cliente = cedula_cliente;
    }

    public long getCedula_usuario() {
        return cedula_usuario;
    }

    public void setCedula_usuario(long cedula_usuario) {
        this.cedula_usuario = cedula_usuario;
    }
    
    public static Pedido getPedido(Pedido pedido) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
     public static Pedido MapToTorta(HashMap<String, Object> vals){
         Pedido res = null;
        
        try {
            long numero = (long) vals.get("numero");
            int cantidadTorta = (int) vals.get("cantidad");
            LocalDate fecha = LocalDate.parse((String) vals.get("fecha"));
            String estado = (String) vals.get("estado");
            long cedula_cliente = (long) vals.get("cedula_cliente");
            String codigo_torta = (String) vals.get("codigo_torta");
            long cedula_usuario =  (long) vals.get("cedula_usuario");
            
            res = new Pedido(
                    numero, 
                    codigo_torta, 
                    cantidadTorta, 
                    cedula_cliente, 
                    cedula_usuario, 
                    fecha, 
                    estado);        
            return res;
        } catch (Exception e) {
            System.out.println("Ha ocurrido un erro: " + e.getMessage());
        }
        return null;
     }
    
}
