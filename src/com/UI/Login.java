/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.UI;

import com.codigo.Usuario;
import javax.swing.JOptionPane;

/**
 *
 * @author Juanfer
 */
public class Login extends javax.swing.JFrame {

    /**
     * Creates new form LoginJF
     */
    public Login() {
        initComponents();
        this.setLocationRelativeTo(null);
         setTitle("Sistema y Control de Ventas V 1.01");
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDialog1 = new javax.swing.JDialog();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        i_textususario = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        boton_recuperarcontrasena = new javax.swing.JButton();
        boton_iniciarsesion = new javax.swing.JButton();
        boton_salir = new javax.swing.JButton();
        label1 = new java.awt.Label();
        label2 = new java.awt.Label();
        i_textcontrasena = new javax.swing.JPasswordField();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();

        javax.swing.GroupLayout jDialog1Layout = new javax.swing.GroupLayout(jDialog1.getContentPane());
        jDialog1.getContentPane().setLayout(jDialog1Layout);
        jDialog1Layout.setHorizontalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jDialog1Layout.setVerticalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel3.setFont(new java.awt.Font("Century Gothic", 0, 11)); // NOI18N
        jLabel3.setText("Usuario:");

        i_textususario.setBorder(null);

        jLabel4.setFont(new java.awt.Font("Century Gothic", 0, 11)); // NOI18N
        jLabel4.setText("Contraseña:");

        boton_recuperarcontrasena.setFont(new java.awt.Font("Century Gothic", 0, 11)); // NOI18N
        boton_recuperarcontrasena.setText("Recuperar Contraseña");
        boton_recuperarcontrasena.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        boton_recuperarcontrasena.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_recuperarcontrasenaActionPerformed(evt);
            }
        });

        boton_iniciarsesion.setFont(new java.awt.Font("Century Gothic", 0, 11)); // NOI18N
        boton_iniciarsesion.setText("Iniciar Sesion");
        boton_iniciarsesion.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        boton_iniciarsesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_iniciarsesionActionPerformed(evt);
            }
        });

        boton_salir.setFont(new java.awt.Font("Century Gothic", 0, 11)); // NOI18N
        boton_salir.setText("Salir");
        boton_salir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        boton_salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_salirActionPerformed(evt);
            }
        });

        label1.setForeground(new java.awt.Color(102, 102, 102));
        label1.setText("PucheUmenza Software Solutions");

        label2.setForeground(new java.awt.Color(102, 102, 102));
        label2.setText("V. Beta 1.0.1");

        i_textcontrasena.setBorder(null);

        jSeparator1.setForeground(new java.awt.Color(255, 153, 51));

        jSeparator2.setForeground(new java.awt.Color(255, 153, 102));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/UI/inicio1.png"))); // NOI18N

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/imagenes/Inicio3.png"))); // NOI18N

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/imagenes/inicio1.png"))); // NOI18N
        jLabel11.setText("jLabel5");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(73, 73, 73)
                        .addComponent(label2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(71, 71, 71))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(175, 175, 175)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jSeparator1)
                                    .addComponent(i_textcontrasena)
                                    .addComponent(jSeparator2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(i_textususario, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(178, 178, 178)
                        .addComponent(boton_salir, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(144, 144, 144)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(boton_iniciarsesion, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(boton_recuperarcontrasena, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(111, 111, 111)
                        .addComponent(jLabel11)))
                .addContainerGap(210, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel11)
                .addGap(79, 79, 79)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(i_textususario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(3, 3, 3)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(9, 9, 9)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(i_textcontrasena, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addComponent(boton_iniciarsesion)
                .addGap(18, 18, 18)
                .addComponent(boton_recuperarcontrasena)
                .addGap(43, 43, 43)
                .addComponent(boton_salir)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(105, 105, 105)
                        .addComponent(label2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addGap(257, 257, 257))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 541, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(81, 81, 81)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 550, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 867, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void boton_salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_salirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_boton_salirActionPerformed

    
    private void boton_iniciarsesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_iniciarsesionActionPerformed

        //Captura de Datos 
 
                try
        
                {
                     int user = Integer.parseInt(i_textususario.getText());
                    String contrasena = new String(i_textcontrasena.getPassword());

                    
                    if(contrasena.isEmpty() || user<=0){
                        
                         JOptionPane.showMessageDialog(null, "Usted tiene un campo vacio, por favor verifique e intente nuevamente.");
                        
                         return;
                    }
                    
                    System.out.println("Usuario: " + user);
                    System.out.println("Contraseña: " + contrasena);
                    
                    Usuario usuario = Usuario.getUsuario(user, contrasena);
                    
                    System.out.println(usuario.toString());
                    
                    if(usuario == null){
                        
                        JOptionPane.showMessageDialog(null, "Usuario o Contraseña, Incorrectos.");
                        
                         return;
                    }
                    
                    
                    if (usuario.getTipoUsuario().equals(Usuario.TIPOADMINISTRADOR)){
                        System.out.println("Admin");
                        VistaPrincipal fra=new VistaPrincipal(user, usuario.getNombre());
                        fra.setVisible(true);
            
                        dispose();
                        
                    }else if(usuario.getTipoUsuario().equals(Usuario.TIPOCAJERO)){
                        
                        
                        VistaCajero fra2=new VistaCajero(user, usuario.getNombre());
                        fra2.setVisible(true);
                         
                        
                                     dispose();
                    }
                    
  
                       
                    }
        
                catch (NumberFormatException e){
                
                    JOptionPane.showMessageDialog(null, "Ha digitado un caracter no numerico en el campo usuario.");
                }catch (Exception ex){
                    JOptionPane.showMessageDialog(null, "Ha ocurrido un error" + ex.getMessage());
                }
        
//               

        
    }//GEN-LAST:event_boton_iniciarsesionActionPerformed

    private void boton_recuperarcontrasenaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_recuperarcontrasenaActionPerformed

        
        try{
            int cedula = Integer.parseInt(JOptionPane.showInputDialog("Escriba la id_cedula al cual desea recuperar la contraseña."));
            int telefono = Integer.parseInt(JOptionPane.showInputDialog("Ingrese dato de verificacion: Por favor ingrese su telefono."));

            if(cedula<=0){
                
                JOptionPane.showMessageDialog(null, "Por favor, ingrese una cedula.");
                
                return;
            }
            
            else if (telefono <=0){
                
                JOptionPane.showMessageDialog(null, "Por favor, ingrese un telefono.");
                
                return;
            }
                
            
            

            Usuario URecuperar = Usuario.getUsuario(cedula);
            
           if(URecuperar==null){
               
               JOptionPane.showMessageDialog(null, "No se encontro el usuario: "
                       + "Por favor, ingrese una cedula valida.");
               
               return;
           }else if(URecuperar.getCelular()!=telefono){
               
               JOptionPane.showMessageDialog(null, "Fallo la recuperacion: Por favor ingrese el dato de recuperacion correcto.");
               
               return;
               
           }
           
           
          JOptionPane.showMessageDialog(null, "Su contraseña es: " + URecuperar.getContrasena());




          
        
        
        }catch (Exception e){
                        JOptionPane.showMessageDialog(null, "Ha digitado un caracter no numerico.");
        }
        
                       
    }//GEN-LAST:event_boton_recuperarcontrasenaActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton boton_iniciarsesion;
    private javax.swing.JButton boton_recuperarcontrasena;
    private javax.swing.JButton boton_salir;
    private javax.swing.JPasswordField i_textcontrasena;
    private javax.swing.JTextField i_textususario;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private java.awt.Label label1;
    private java.awt.Label label2;
    // End of variables declaration//GEN-END:variables


}
