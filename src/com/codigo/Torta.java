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
        
        String consulta ="SET @codigo_to_select = ?;\n" +
"SELECT torta.*\n" +
"    FROM torta\n" +
"    WHERE torta.codigo = @codigo_to_select;";
        
        
        
        LinkedList<Torta> res = BaseDeDatosTortas.obtenerConsultaTorta(consulta,codigo);
        
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
"WHERE <{where_expression}>;" ;
        
        return BaseDeDatosTortas.validarCosultaTorta(consulta,codigo);
        
        
    }

    public static boolean insertarTorta(Torta torta) {
        
        String consulta ="INSERT INTO `tortas`.`torta`\n" +
"(`codigo`,\n" +
"`sabor`,\n" +
"`peso`,\n" +
"`precio`)\n" +
"VALUES\n" +
"(?,?,?,?);";
        
        return BaseDeDatosTortas.validarCosultaTorta(consulta, torta.getCodigo(),torta.getSabor(),torta.getPeso(),torta.getPrecio());
        
    }

    public static LinkedList<Torta> getTodasLasTortas() {
        String consulta="SELECT torta.*\n" +
        "    FROM torta\n";
        
        LinkedList<Torta> res = BaseDeDatosTortas.obtenerConsultaTorta(consulta);
        
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
         
         return BaseDeDatosTortas.validarCosultaTorta(consulta, torta.getCodigo(),torta.getSabor(),torta.getPeso(),torta.getPrecio(),torta.getCodigo());
    }

    public static void/*HashMap<Torta, Integer>*/ getTortasPedido(String numero, LinkedList<Torta> SusTortas, LinkedList<Integer> SusCantidades) {
        
        String consulta = "SELECT * FROM tortas.pedido\n" +
"inner join torta\n" +
"on\n" +
"pedido.codigo_torta=torta.codigo where numero=?;";
        
        LinkedList<Torta> Tortas = BaseDeDatosTortas.obtenerConsultaTorta(consulta);
        
        reordenartortas(SusTortas, SusTortas, SusCantidades);
        
        return ;
    }

    private static void reordenartortas(LinkedList<Torta> SusTortas, LinkedList<Torta> SusTortas0, LinkedList<Integer> SusCantidades) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
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
    
    public static Torta MapToTorta(HashMap<String, Object> vals){
        Torta res = null;
        
        try {
            String codigo = (String) vals.get("codigo");
            String sabor = (String) vals.get("sabor");
            double peso = (double) vals.get("peso");
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
