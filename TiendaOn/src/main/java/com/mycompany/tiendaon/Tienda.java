

package com.mycompany.tiendaon;

import javax.swing.JOptionPane;


public class Tienda extends javax.swing.JFrame {

   
    public Tienda() {
        initComponents();
    }
    private boolean validarLogin(String usuario, String contraseña) {
        // Por simplicidad, suponemos que el usuario es "admin" y la contraseña es "1234"
        return "admin".equals(usuario) && "1234".equals(contraseña);
    }

   
    
        
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        Rigth = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        Lefth = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtUsuario = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        Password = new javax.swing.JPasswordField();
        jButton1 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Login");
        setMinimumSize(new java.awt.Dimension(800, 530));
        setResizable(false);
        getContentPane().setLayout(null);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setPreferredSize(new java.awt.Dimension(800, 500));
        jPanel2.setLayout(null);

        Rigth.setBackground(new java.awt.Color(153, 153, 153));
        Rigth.setForeground(new java.awt.Color(255, 255, 255));
        Rigth.setPreferredSize(new java.awt.Dimension(400, 500));

        jLabel5.setForeground(new java.awt.Color(204, 204, 0));
        jLabel5.setIcon(new javax.swing.ImageIcon("C:\\Users\\Sui\\Documents\\NetBeansProjects\\TiendaOn\\src\\Icono\\LogoUpeunegro.png")); // NOI18N
        jLabel5.setMaximumSize(new java.awt.Dimension(100, 110));

        jLabel6.setFont(new java.awt.Font("Segoe UI Semibold", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("UPeU");

        javax.swing.GroupLayout RigthLayout = new javax.swing.GroupLayout(Rigth);
        Rigth.setLayout(RigthLayout);
        RigthLayout.setHorizontalGroup(
            RigthLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(RigthLayout.createSequentialGroup()
                .addGroup(RigthLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(RigthLayout.createSequentialGroup()
                        .addGap(123, 123, 123)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(RigthLayout.createSequentialGroup()
                        .addGap(141, 141, 141)
                        .addComponent(jLabel6)))
                .addContainerGap(130, Short.MAX_VALUE))
        );
        RigthLayout.setVerticalGroup(
            RigthLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(RigthLayout.createSequentialGroup()
                .addGap(97, 97, 97)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(241, Short.MAX_VALUE))
        );

        jPanel2.add(Rigth);
        Rigth.setBounds(0, 0, 360, 500);

        Lefth.setBackground(new java.awt.Color(255, 255, 255));
        Lefth.setMinimumSize(new java.awt.Dimension(400, 500));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Login");

        jLabel2.setBackground(new java.awt.Color(102, 102, 102));
        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Email");

        txtUsuario.setBackground(new java.awt.Color(204, 204, 204));
        txtUsuario.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtUsuario.setForeground(new java.awt.Color(0, 0, 0));
        txtUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUsuarioActionPerformed(evt);
            }
        });

        jLabel3.setBackground(new java.awt.Color(102, 102, 102));
        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Password");

        Password.setBackground(new java.awt.Color(204, 204, 204));
        Password.setForeground(new java.awt.Color(0, 0, 0));
        Password.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PasswordActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(0, 102, 102));
        jButton1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Login");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("No tienes una cuenta");

        jButton2.setBackground(new java.awt.Color(255, 255, 255));
        jButton2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(204, 0, 0));
        jButton2.setText("Registrate");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout LefthLayout = new javax.swing.GroupLayout(Lefth);
        Lefth.setLayout(LefthLayout);
        LefthLayout.setHorizontalGroup(
            LefthLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LefthLayout.createSequentialGroup()
                .addGroup(LefthLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(LefthLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(LefthLayout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(Password, javax.swing.GroupLayout.DEFAULT_SIZE, 323, Short.MAX_VALUE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, LefthLayout.createSequentialGroup()
                            .addGap(128, 128, 128)
                            .addComponent(jLabel1))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, LefthLayout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(jLabel2))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, LefthLayout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(jLabel3))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, LefthLayout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(jLabel4)
                            .addGap(18, 18, 18)
                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, LefthLayout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(txtUsuario)))
                    .addGroup(LefthLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(71, Short.MAX_VALUE))
        );
        LefthLayout.setVerticalGroup(
            LefthLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(LefthLayout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addComponent(jLabel1)
                .addGap(45, 45, 45)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Password, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(LefthLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addContainerGap(33, Short.MAX_VALUE))
        );

        jPanel2.add(Lefth);
        Lefth.setBounds(410, 0, 400, 500);

        getContentPane().add(jPanel2);
        jPanel2.setBounds(0, 0, 800, 500);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUsuarioActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        
        SignUp SignUpFrame = new SignUp();
        SignUpFrame.setVisible(true);
        SignUpFrame.pack();
        SignUpFrame.setLocationRelativeTo(null);
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        String usuario = "admin";
        String contraseña = "123456";
        
        String pass = new String(Password.getPassword());
        
        if(txtUsuario.getText().equals(usuario)&& pass.equals(contraseña)){ 
            
             JOptionPane.showMessageDialog(this, "Login exitoso. Bienvenido!");
            // Ocultar la ventana de login
            this.dispose();
            // Abrir la ventana de la tienda (GUI)
            GUI tiendaGui = new GUI();
            tiendaGui.setVisible(true);
        }
        
        else{
            JOptionPane.showMessageDialog(this, "Usuario / Contraseña Incorrecta");
        } 
            
    }//GEN-LAST:event_jButton1ActionPerformed

    private void PasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PasswordActionPerformed
        // TODO add your handling code here:
        
        
  
    }//GEN-LAST:event_PasswordActionPerformed

    /**
     * @param args the command line arguments
     */
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Lefth;
    private javax.swing.JPasswordField Password;
    private javax.swing.JPanel Rigth;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}
