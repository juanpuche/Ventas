/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.codigo;

import com.bd.BaseDeDatosTortas;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
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

    public Pedido(int cedula_cliente, int cedula_usuario, LocalDateTime fecha, String estado) {
        this.cedula_cliente = cedula_cliente;
        this.cedula_usuario = cedula_usuario;
        this.fecha = fecha;
        this.estado = estado;
    }

    public static boolean insertarPedido(Pedido pedido, LinkedList<Torta> SusTortas, LinkedList<Integer> SusCantidades) {
      
        String consulta = "INSERT INTO `tortas`.`pedido`\n" +
"(`fecha`,\n" +
"`estado`,\n" +
"`cantidad`,\n" +
"`cedula_cliente`,\n" +
"`codigo_torta`,\n" +
"`cedula_usuario`)\n" +
"VALUES\n" +
"(?,?,?,?,?,?);";
        
        
        
        for (int i = 0; i < SusTortas.size(); i++) {
            if (!BaseDeDatosTortas.validarCosulta(consulta,
                pedido.getFechaTexto(),
                pedido.getEstado(),
                SusCantidades.get(i),
                pedido.getCedula_cliente(),
                SusTortas.get(i).getCodigo(),
                pedido.getCedula_usuario())){
                
                //En caso de que ocurra un errorr se deben eliminar automaticamente las tortas que ya se hayan pedido
                return false;
            }
        }
        
        return true;
                
                     
                
        
    }
    
    public String getFechaTexto(){
        DateTimeFormatter format = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");  
        return fecha.format(format);  
        
    }

    public static Pedido getPedido(String numero) {
        
        String consulta=
"SELECT pedido.*\n" +
"    FROM pedido\n" +
"    WHERE pedido.numero = ? ;";
        
        
        
        
         LinkedList<Pedido> res = MapToPedidos(BaseDeDatosTortas.obtenerConsulta(consulta,numero));
        
        if (res==null){
            
            return null;
            
        }
        
        if(res.size()==0){
            
            return null;
            
            
        }
        return res.get(0);
        
        
    }

    public static boolean actualizarPedido(Pedido pedido) {
        System.out.println("***************************");
        System.out.println(pedido.toString());
        
        String consulta="UPDATE `tortas`.`pedido`\n" +
"SET\n" +
"`fecha` = ?,\n" +
"`estado` = ?,\n" +
"`cantidad` = ?,\n" +
"`cedula_cliente` = ?,\n" +
"`codigo_torta` = ?,\n" +
"`cedula_usuario` = ?\n" +
"WHERE `numero` = ? ;";
        
        
        return BaseDeDatosTortas.validarCosulta(consulta,
                pedido.getFechaTexto(), 
                pedido.getEstado(),
                pedido.getCantidad_tortas(),
                pedido.getCedula_cliente(),
                pedido.getId_torta(),
                pedido.getCedula_usuario(),
                pedido.getId_numero());
        
        
        
        
        
        
        
        
        
        
        
    }
    
    private int cantidad_tortas;
    private int cedula_cliente, cedula_usuario, id_numero;
    private LocalDateTime fecha;
    private String estado, id_torta;

    public Pedido(int id_numero, String id_torta, int cantidad_tortas, int cedula_cliente, int cedula_usuario, LocalDateTime fecha, String estado) {
        this.id_numero = id_numero;
        this.id_torta = id_torta;
        this.cantidad_tortas = cantidad_tortas;
        this.cedula_cliente = cedula_cliente;
        this.cedula_usuario = cedula_usuario;
        this.fecha = fecha;
        this.estado = estado;
    }

    public Pedido(String id_torta, int cantidad_tortas, int cedula_cliente, int cedula_usuario, LocalDateTime fecha, String estado) {
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
    

    public int getId_numero() {
        return id_numero;
    }

    public LocalDateTime getFecha() {
        return fecha;
    }

    public void setFecha(LocalDateTime fecha) {
        this.fecha = fecha;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public int getCedula_cliente() {
        return cedula_cliente;
    }

    public void setCedula_cliente(int cedula_cliente) {
        this.cedula_cliente = cedula_cliente;
    }

    public int getCedula_usuario() {
        return cedula_usuario;
    }

    public void setCedula_usuario(int cedula_usuario) {
        this.cedula_usuario = cedula_usuario;
    }
    

    public static LinkedList<Pedido> getPedidos(Pedido pedido) {
       
        String consulta = "SELECT pedido.* \n" +
"    FROM pedido\n" +
"    WHERE pedido.cedula_usuario = ?  AND pedido.cedula_cliente = ? AND pedido.fecha = ?;";
        
        LinkedList<Pedido> pedidos = MapToPedidos(BaseDeDatosTortas.obtenerConsulta(
                consulta, 
                pedido.getCedula_usuario(),
                pedido.getCedula_cliente(),
                pedido.getFechaTexto()
            )
        );
        
        if(pedido==null){
            
            return null;
            
        }if(pedidos.size()== 0){
            
            
            return null;
            
        }        
        
        return pedidos;
    }
    
     public static Pedido MapToPedido(HashMap<String, Object> vals){
        Pedido res = null;
         System.out.println(vals);
        try {
            System.out.println("numero");
            int numero = (int) vals.get("numero");
            System.out.println("cantidad");
            int cantidadTorta = (int) vals.get("cantidad");
            System.out.println("fecha");
            LocalDateTime fecha =(LocalDateTime) vals.get("fecha");
//            LocalDateTime fecha = (new Timestamp(Dfecha.getTime())).toLocalDateTime();
            System.out.println("estado");
            String estado = (String) vals.get("estado");
            System.out.println("cedula_cliente");
            int cedula_cliente = (int) vals.get("cedula_cliente");
            System.out.println("codigo_torta");
            String codigo_torta = (String) vals.get("codigo_torta");
            System.out.println("cedula_usuario");
            int cedula_usuario =  (int) vals.get("cedula_usuario");
            
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
    
    public static LinkedList<Pedido> MapToPedidos(LinkedList<HashMap<String, Object>> val){
        System.out.println(val);
        
        if (val == null)
            return null;
        
        LinkedList<Pedido> res = new LinkedList<>();
        for (int i = 0; i < val.size(); i++) {
            res.add(MapToPedido(val.get(i)));
        }
        
        return res;
    }

    @Override
    public String toString() {
        return "Pedido{" + "cantidad_tortas=" + cantidad_tortas + ", cedula_cliente=" + cedula_cliente + ", cedula_usuario=" + cedula_usuario + ", id_numero=" + id_numero + ", fecha=" + fecha + ", estado=" + estado + ", id_torta=" + id_torta + '}';
    }

}
