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
    
    private int id_numero;
    private LocalDate fecha;
    private String estado;
    private double valorTotal;

    public Pedido(int id_numero, LocalDate fecha, String estado, double valorTotal) {
        this.id_numero = id_numero;
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

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Pedido{");
        sb.append("id_numero=").append(id_numero);
        sb.append(", fecha=").append(fecha);
        sb.append(", estado=").append(estado);
        sb.append(", valorTotal=").append(valorTotal);
        sb.append('}');
        return sb.toString();
    }
    
    
}
