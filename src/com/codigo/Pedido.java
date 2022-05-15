/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.codigo;

import com.bd.BaseDeDatosTortas;
import java.time.LocalDate;
import java.util.LinkedList;

/**
 *
 * @author Admin
 */
public class Pedido {

    public static String ESTADO_ENTREGADO="Entregado";
    public static String ESTADO_CANCELADO="Cancelado";
    public static String ESTADO_NO_ENTREGADO="No entregado";

    public static boolean insertarPedido(Pedido pedido, LinkedList<Torta> SusTortas, LinkedList<Integer> SusCantidades) {
      
        String consulta = "INSERT INTO `tortas`.`pedido`\n" +
"(`numero`,\n" +
"`fecha`,\n" +
"`estado`,\n" +
"`cantidad`,\n" +
"`cedula_cliente`,\n" +
"`codigo_torta`,\n" +
"`cedula_usuario`)\n" +
"VALUES\n" +
"(?,?,?,?,?,?,?);";
        
        return BaseDeDatosTortas.validarCosultaPedido(consulta,
                pedido.getId_numero(),
                pedido.getFecha(),
                pedido.getEstado(),
                pedido.getCantidad(),
                pedido.getCedula_cliente(),
                pedido.getId_Torta(),
                pedido.getCedula_usuario();
                
                     
                
        
    }

    public static Pedido getPedido(String numero) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public static boolean actualizarPedido(Pedido pedido) {
       
        
        
        
        
    }
    
    private int id_numero, id_torta, cantidad_tortas;
    private long cedula_cliente, cedula_usuario;
    private LocalDate fecha;
    private String estado;

    public Pedido(int id_numero, long cedula_cliente, LocalDate fecha, String estado) {
        this.id_numero = id_numero;
        this.cedula_cliente = cedula_cliente;
        this.fecha = fecha;
        this.estado = estado;
    }

    public Pedido(long cedula_cliente, LocalDate fecha, String estado) {
        this.id_numero = Integer.MIN_VALUE;
        this.cedula_cliente = cedula_cliente;
        this.fecha = fecha;
        this.estado = estado;
    }
    

    public int getId_numero() {
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
    
    public static boolean crearNuevoPedido(Pedido p){
        String sentenciaSQL = "INSERT INTO `tortas`.`pedido`\n" +
            "(\n" +//`numero`,
            "`fecha`,\n" +
            "`estado`,\n" +
            "`cedula_cliente`,\n" +
            "`codigo_torta`,\n" +
            "`cedula_usuario`)\n" +
            "VALUES\n" +
            p.fecha.toString() + ",\n" +
            p.estado + ",\n" +
            p.cedula_cliente + ",\n" +
            p.id_torta + ",\n" +
            //p.cantidad_tortas + ",\n" +
            p.cedula_usuario + ");";
        
        
        
        return true;
    }

    public static Pedido getPedido(Pedido pedido) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
