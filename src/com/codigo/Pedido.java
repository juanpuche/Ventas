/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.codigo;

import java.time.LocalDate;

/**
 *
 * @author Admin
 */
public class Pedido {
    
    private int id_numero, id_torta, cantidad_tortas;
    private long cedula_cliente, cedula_usuario;
    private LocalDate fecha;
    private String estado;
    private double valorTotal;

    public Pedido(int id_numero, long cedula_cliente, LocalDate fecha, String estado, double valorTotal) {
        this.id_numero = id_numero;
        this.cedula_cliente = cedula_cliente;
        this.fecha = fecha;
        this.estado = estado;
        this.valorTotal = valorTotal;
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

    public double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }

    public long getCedula_cliente() {
        return cedula_cliente;
    }

    public void setCedula_cliente(long cedula_cliente) {
        this.cedula_cliente = cedula_cliente;
    }
    
    public static boolean crearNuevoPedido(Pedido p){
        String sentenciSQL = "INSERT INTO `tortas`.`pedido`\n" +
            "(\n" +//`numero`,
            "`fecha`,\n" +
            "`estado`,\n" +
            "`valortotal`,\n" +
            "`cedula_cliente`,\n" +
            "`codigo_torta`,\n" +
            "`cedula_usuario`)\n" +
            "VALUES\n" +
            p.fecha.toString() + ",\n" +
            p.estado + ",\n" +
            p.valorTotal + ",\n" +
            p.cedula_cliente + ",\n" +
            p.id_torta + ",\n" +
            //p.cantidad_tortas + ",\n" +
            p.cedula_usuario + ");";
        
        
        
        return true;
    }
    
    
}
