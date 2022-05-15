/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.codigo;

import com.bd.BaseDeDatosTortas;
import java.util.HashMap;
import java.util.LinkedList;

/**
 *
 * @author Admin
 */
public class Torta {

    public static Torta getTorta(String codigo) {
        
        String consulta ="SELECT TORTA.*\n" +
"    FROM torta\n" +
"    WHERE torta.codigo = ?";
        
        
        
        LinkedList<Torta> res = MapToTortas(BaseDeDatosTortas.obtenerConsulta(consulta,codigo));
        
        if (res==null){
            
            return null;
            
        }
        
        if(res.size()==0){
            
            return null;
            
            
        }
        return res.get(0);
    }


    public static boolean eliminarTorta(String codigo) {
        
        String consulta= "DELETE FROM `tortas`.`torta`\n" +
            "WHERE codigo = ?;";
        
        return BaseDeDatosTortas.validarCosulta(consulta,codigo);
        
        
    }

    public static boolean insertarTorta(Torta torta) {
        
        String consulta ="INSERT INTO `tortas`.`torta`\n" +
"(`codigo`,\n" +
"`sabor`,\n" +
"`peso`,\n" +
"`precio`)\n" +
"VALUES\n" +
"(?,?,?,?);";
        
        return BaseDeDatosTortas.validarCosulta(consulta, torta.getCodigo(),torta.getSabor(),torta.getPeso(),torta.getPrecio());
        
    }

    public static LinkedList<Torta> getTodasLasTortas() {
        String consulta="SELECT TORTA.*\n" +
"    FROM torta\n" +
"    WHERE torta.codigo = ?";
        
        LinkedList<Torta> res = MapToTortas(BaseDeDatosTortas.obtenerConsulta(consulta));
        
        if (res==null){
            
            return null;
            
        }
        
        if(res.size()==0){
            
            return null;
            
            
        }
        return res;
    }

    public static boolean actualizarTorta(String codigo, Torta torta) {
        
         String consulta =" UPDATE `tortas`.`torta`\n" +
"SET\n" +
"`codigo` = ?\n" +
"`sabor` = ?\n" +
"`peso` = ?\n" +
"`precio` = ?\n" +
"WHERE `codigo` = ?;";
         
         return BaseDeDatosTortas.validarCosulta(consulta, torta.getCodigo(),torta.getSabor(),torta.getPeso(),torta.getPrecio(),torta.getCodigo());
    }

    public static void extraerTortas(LinkedList<Pedido> pedidos, LinkedList<Torta> SusTortas, LinkedList<Integer> SusCantidades) {
      
        if (pedidos != null){
            for (Pedido pedido : pedidos) {
                System.out.println(pedido.toString());
            }
        }
        System.out.println(SusTortas);
        System.out.println(SusCantidades);
        
        for (Pedido pedido : pedidos) {
            SusTortas.add(Torta.getTorta(pedido.getId_torta()));
            SusCantidades.add(pedido.getCantidad_tortas());
            
        }
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
        System.out.println("precio: " + precio);
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
    
    public static Torta MapToTorta(HashMap<String, Object> vals){
        Torta res = null;
        
        try {
            System.out.println("codigo");
            String codigo = (String) vals.get("codigo");
            System.out.println("sabor");
            String sabor = (String) vals.get("sabor");
            System.out.println("peso");
            double peso = (double) vals.get("peso");
            System.out.println("precio");
            double precio = (double) vals.get("precio");
            
            res = new Torta(codigo, sabor, peso, precio);        
            return res;
        } catch (Exception e) {
            System.out.println("Ha ocurrido un erro: " + e.getMessage());
        }
        return null;
    }
    
    public static LinkedList<Torta> MapToTortas(LinkedList<HashMap<String, Object>> val){
        if (val == null)
            return null;
        
        LinkedList<Torta> res = new LinkedList<>();
        for (int i = 0; i < val.size(); i++) {
            res.add(MapToTorta(val.get(i)));
        }
        
        return res;
    }
}
