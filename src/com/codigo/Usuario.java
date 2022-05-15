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
public class Usuario {

    public static String TIPOADMINISTRADOR = "Administrador", TIPOCAJERO = "Cajero";

    public static Usuario getUsuario(int cedula) {
       
        
        String consulta="SELECT usuario.*\n" +
"    FROM usuario\n" +
"    WHERE usuario.cedula = ?";
        
        LinkedList<Usuario> res = MapToUsuarios(BaseDeDatosTortas.obtenerConsulta(consulta,cedula));
        
        if (res==null){
            
            return null;
            
        }
        
        if(res.size()==0){
            
            return null;
            
            
        }
        return res.get(0);
    }

    public static boolean eliminarUsuario(int cedula) {
       
        String consulta = "DELETE FROM `tortas`.`usuario`\n" +
        "WHERE cedula = ?;";
        
        return BaseDeDatosTortas.validarCosulta(consulta,cedula);
        
    }

    

    public static LinkedList<Usuario> getTodosLosUsuarios() {
        String consulta="SELECT usuario.*\n" +
        "    FROM usuario\n";
        
        LinkedList<Usuario> res = MapToUsuarios(BaseDeDatosTortas.obtenerConsulta(consulta));
        
        if (res==null){
            
            return null;
            
        }
        
        if(res.size()==0){
            
            return null;
            
            
        }
        return res;
    }

    public static boolean actualizarUsuario(int cedula, Usuario usuario) {
        String consulta="UPDATE `tortas`.`usuario`\n" +
"SET\n" +
"`cedula` = ?,\n" +
"`contrasena` = ?,\n" +
"`nombres` = ?,\n" +
"`apellidos` = ?,\n" +
"`celular` = ?,\n" +
"`tipousuario` = ?\n" +
"WHERE `cedula` = ?;";
        
        return BaseDeDatosTortas.validarCosulta(consulta, 
               usuario.getCedula(),
               usuario.getContrasena(),
               usuario.getNombre(),
               usuario.getApellido(),
               usuario.getCelular(),
               usuario.getTipoUsuario(),
               cedula);
    }

    public static boolean insertarUsuario(Usuario usuario) {
        
        
       String consulta ="INSERT INTO `tortas`.`usuario`\n" +
"(`cedula`,\n" +
"`contrasena`,\n" +
"`nombres`,\n" +
"`apellidos`,\n" +
"`celular`,\n" +
"`tipousuario`)\n" +
"VALUES\n" +
"(?,?,?,?,?,?);";
       
       return BaseDeDatosTortas.validarCosulta(consulta, 
               usuario.getCedula(),
               usuario.getContrasena(),
               usuario.getNombre(),
               usuario.getApellido(),
               usuario.getCelular(),
               usuario.getTipoUsuario());
        
    }

    public static Usuario getUsuario(int user, String contrasena) {
       
        
        String consulta =
                "SELECT usuario.*\n" +
                "    FROM usuario\n" +
                "    WHERE usuario.cedula = ? AND usuario.contrasena = ?;";
        
        
         LinkedList<Usuario> res = MapToUsuarios(BaseDeDatosTortas.obtenerConsulta(consulta,user, contrasena));
        
        if (res==null){
            
            return null;
            
        }
        
        if(res.size()==0){
            
            return null;
            
            
        }
        return res.get(0);
    
    }
    
    private long cedula, celular;
    private String nombre, apellido, tipoUsuario, contrasena;

    public Usuario(long cedula,String contrasena, String nombre, String apellido, String tipoUsuario, long celular) {
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

 
    public long getCedula() {
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

    public long getCelular() {
        return celular;
    }

    public void setCelular(int celular) {
        this.celular = celular;
    }
    
    public static Usuario MapToUsuario(HashMap<String, Object> vals){
        Usuario res = null;
        
        try {
            System.out.println("cedula");
            long cedula = (int) vals.get("cedula");
            System.out.println("contrasena");
            String contrasena = (String) vals.get("contrasena");
            System.out.println("nombres");
            String nombre = (String) vals.get("nombres");
            System.out.println("apellidos");
            String apellido = (String) vals.get("apellidos");
            System.out.println("celular");
            long celular = (int) vals.get("celular");
            System.out.println("tipousuario");
            String tipo_usuario = (String) vals.get("tipousuario");
            System.out.println("tipousuario");
            
            res = new Usuario(cedula, contrasena, nombre, apellido,tipo_usuario, celular);        
            return res;
        } catch (Exception e) {
            System.out.println("Ha ocurrido un erro: " + e.getMessage());
        }
        return null;
    }
    
    public static LinkedList<Usuario> MapToUsuarios(LinkedList<HashMap<String, Object>> val){
        if (val == null)
            return null;
        
        LinkedList<Usuario> res = new LinkedList<>();
        for (int i = 0; i < val.size(); i++) {
            res.add(MapToUsuario(val.get(i)));
        }
        
        return res;
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
        
}
