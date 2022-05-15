/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.codigo;

import java.util.HashMap;
import com.bd.BaseDeDatosTortas;
import java.util.LinkedList;

/**
 *
 * @author Admin
 */
public class Cliente {

    public static Cliente getCliente(long cedula) {
         
        String consulta=
"SELECT cliente.*\n" +
"    FROM cliente\n" +
"    WHERE cliente.cedula = ?;";
        
        LinkedList<Cliente> res = MapToClientes(BaseDeDatosTortas.obtenerConsulta(consulta,cedula));
        
        if (res==null){
            
            return null;
            
        }
        
        if(res.size()==0){
            
            return null;
            
            
        }
        return res.get(0);
    }

    public static boolean eliminarCliente(int cedula) {
        
        String consulta="DELETE FROM `tortas`.`cliente`\n" +
"WHERE ?;";
        
                return BaseDeDatosTortas.validarCosulta(consulta,cedula);
                
    }

    public static boolean insertarCliente(Cliente cliente) {
        
        String consulta = "INSERT INTO `tortas`.`cliente`\n" +
"(`cedula`,\n" +
"`nombres`,\n" +
"`apellidos`,\n" +
"`celular`,\n" +
"`direccion`)\n" +
"VALUES\n" +
"(?,?,?,?,?,?);";
        
        return BaseDeDatosTortas.validarCosulta(consulta, 
                cliente.getCedula(),
                cliente.getNombres(),
                cliente.getApellidos(),
                cliente.getCelular(),
                cliente.getDireccion());
        
        
    }

    public static boolean actualizarCliente(Cliente cliente) {
       
        String consulta = "UPDATE `tortas`.`cliente`\n" +
"SET\n" +
"`cedula` = ?\n" +
"`nombres` = ?\n" +
"`apellidos` = ?\n" +
"`celular` = ?\n" +
"`direccion` = ?\n" +
"WHERE `cedula` = ?;";
        
        return BaseDeDatosTortas.validarCosulta(consulta, 
                
                cliente.getCedula(),
                cliente.getNombres(),
                cliente.getApellidos(),
                cliente.getCelular(),
                cliente.getDireccion(),cliente.getCedula());
        
    }

    public static LinkedList<Cliente> getTodosLosClientes() {
        String consulta="SELECT cliente.*\n" +
        "    FROM cliente\n";
        
        LinkedList<Cliente> res = MapToClientes(BaseDeDatosTortas.obtenerConsulta(consulta));
        
        if (res==null){
            
            return null;
            
        }
        
        if(res.size()==0){
            
            return null;
            
            
        }
        return res;
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
    
    public static Cliente MapToCliente(HashMap<String, Object> vals){
        Cliente res = null;
        
        try {
            int cedula = (int) vals.get("cedula");
            String nombres = (String) vals.get("nombres");
            String apellidos = (String) vals.get("apellidos");
            int celular = (int) vals.get("celular");
            String direccion = (String) vals.get("direccion");
            
            res = new Cliente(cedula,celular,nombres,apellidos,direccion);        
            return res;
        } catch (Exception e) {
            System.out.println("Ha ocurrido un erro: " + e.getMessage());
        }
        return null;
    }
    
    public static LinkedList<Cliente> MapToClientes(LinkedList<HashMap<String, Object>> val){
        if (val == null)
            return null;
        
        LinkedList<Cliente> res = new LinkedList<>();
        for (int i = 0; i < val.size(); i++) {
            res.add(MapToCliente(val.get(i)));
        }
        
        return res;
    }
    
}
