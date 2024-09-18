
package com.mycompany.proyectoestudiantes;
import java.util.ArrayList; 
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class NewPanel extends javax.swing.JFrame {
    
    DefaultTableModel modelo = new DefaultTableModel();
    ArrayList<Estudiante> listaAlumnos= new ArrayList<Estudiante>();
    
    
    
    public NewPanel() {
        initComponents();
        this.setTitle("Registro de Alumnos");
      
        
        modelo.addColumn("Nombre");
        modelo.addColumn("Carrera");
        modelo.addColumn("Grupo");
        modelo.addColumn("Semestre");
        modelo.addColumn("Promedio");
        
        refreshtabla();
        
          
        
    }

  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtNombreAlumno = new javax.swing.JTextField();
        cboCarreraAlumno = new javax.swing.JComboBox<>();
        cboGrupoAlumno = new javax.swing.JComboBox<>();
        cboSemestreAlumno = new javax.swing.JComboBox<>();
        spnPromedioAlumno = new javax.swing.JSpinner();
        btnAgregarAlumno = new javax.swing.JButton();
        btnBorrarAlumno = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblRegistroAlumnos = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(51, 51, 51));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("MS UI Gothic", 2, 24)); // NOI18N
        jLabel2.setText("Nombre");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(38, 133, 108, 50));

        jLabel3.setFont(new java.awt.Font("MS UI Gothic", 2, 24)); // NOI18N
        jLabel3.setText("Carrera");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(38, 210, 95, -1));

        jLabel4.setFont(new java.awt.Font("MS UI Gothic", 2, 24)); // NOI18N
        jLabel4.setText("Grupo");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(38, 267, 95, 43));

        jLabel5.setFont(new java.awt.Font("MS UI Gothic", 2, 24)); // NOI18N
        jLabel5.setText("Semestre");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(38, 363, 108, 44));

        jLabel6.setFont(new java.awt.Font("MS UI Gothic", 2, 24)); // NOI18N
        jLabel6.setText("Promedio");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(51, 446, 108, -1));

        txtNombreAlumno.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtNombreAlumno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreAlumnoActionPerformed(evt);
            }
        });
        jPanel2.add(txtNombreAlumno, new org.netbeans.lib.awtextra.AbsoluteConstraints(142, 136, 220, 46));

        cboCarreraAlumno.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cboCarreraAlumno.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ing. Sistemas           ", "Ing. Civil", "Arquitectura" }));
        cboCarreraAlumno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboCarreraAlumnoActionPerformed(evt);
            }
        });
        jPanel2.add(cboCarreraAlumno, new org.netbeans.lib.awtextra.AbsoluteConstraints(207, 200, 142, 50));

        cboGrupoAlumno.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cboGrupoAlumno.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Grupo 1", "Grupo 2", "Grupo 3" }));
        cboGrupoAlumno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboGrupoAlumnoActionPerformed(evt);
            }
        });
        jPanel2.add(cboGrupoAlumno, new org.netbeans.lib.awtextra.AbsoluteConstraints(207, 270, 122, 43));

        cboSemestreAlumno.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cboSemestreAlumno.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Semestre 1 ", "Semestre 2", "Semestre 3 ", "Semestre 4 ", "Semestre 5 ", "Semestre 6 ", "Semestre 7 ", "Semestre 8 ", "Semestre 9", "Semestre 10 " }));
        cboSemestreAlumno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboSemestreAlumnoActionPerformed(evt);
            }
        });
        jPanel2.add(cboSemestreAlumno, new org.netbeans.lib.awtextra.AbsoluteConstraints(207, 354, -1, 44));

        spnPromedioAlumno.setModel(new javax.swing.SpinnerNumberModel(0.0d, 0.0d, 20.0d, 1.0d));
        jPanel2.add(spnPromedioAlumno, new org.netbeans.lib.awtextra.AbsoluteConstraints(207, 449, 96, -1));

        btnAgregarAlumno.setFont(new java.awt.Font("Arial Narrow", 1, 14)); // NOI18N
        btnAgregarAlumno.setText("Registrar");
        btnAgregarAlumno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarAlumnoActionPerformed(evt);
            }
        });
        jPanel2.add(btnAgregarAlumno, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 500, 160, 40));

        btnBorrarAlumno.setFont(new java.awt.Font("Arial Narrow", 1, 14)); // NOI18N
        btnBorrarAlumno.setText("Borrar");
        jPanel2.add(btnBorrarAlumno, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 500, 160, 40));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 40, 410, 580));

        tblRegistroAlumnos.setBackground(new java.awt.Color(255, 255, 255));
        tblRegistroAlumnos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tblRegistroAlumnos);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 180, 540, 270));
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1150, 710));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void refreshtabla(){
        
        
        while(modelo.getRowCount()>0){
            modelo.removeRow(0);
     
        }
        
        for (Estudiante estudiante : listaAlumnos){
            
            Object a[] = new Object[5];
            a[0]= estudiante.getNombre();
            a[1]= estudiante.getCarrera();
            a[2]= estudiante.getGrupo();
            a[3]= estudiante.getSemestre();
            a[4]= estudiante.getPromedio();
            modelo.addRow(a);
  
        }
        tblRegistroAlumnos.setModel(modelo);
      
    }
    
    
    private void txtNombreAlumnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreAlumnoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreAlumnoActionPerformed

    private void cboCarreraAlumnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboCarreraAlumnoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cboCarreraAlumnoActionPerformed

    private void cboGrupoAlumnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboGrupoAlumnoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cboGrupoAlumnoActionPerformed

    private void cboSemestreAlumnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboSemestreAlumnoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cboSemestreAlumnoActionPerformed

    private void btnAgregarAlumnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarAlumnoActionPerformed
       
       // try {
        
        Estudiante estudiante = new Estudiante();
        
        estudiante.setNombre(txtNombreAlumno.getText());
        estudiante.setCarrera(cboCarreraAlumno.getSelectedItem().toString());
        estudiante.setGrupo(Integer.parseInt(cboGrupoAlumno.getSelectedItem().toString()));
        estudiante.setSemestre(cboSemestreAlumno.getSelectedItem().toString());
        estudiante.setPromedio(Double.parseDouble(spnPromedioAlumno.getValue().toString()));
        listaAlumnos.add(estudiante);
        refreshtabla();
        
        
        //catch (Exception e){
            //JOptionPane.showMessageDialog(this, "ERROR AL AGREGAR ALUMNO");
        
    }//GEN-LAST:event_btnAgregarAlumnoActionPerformed

  
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
            java.util.logging.Logger.getLogger(NewPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewPanel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewPanel().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregarAlumno;
    private javax.swing.JButton btnBorrarAlumno;
    private javax.swing.JComboBox<String> cboCarreraAlumno;
    private javax.swing.JComboBox<String> cboGrupoAlumno;
    private javax.swing.JComboBox<String> cboSemestreAlumno;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSpinner spnPromedioAlumno;
    private javax.swing.JTable tblRegistroAlumnos;
    private javax.swing.JTextField txtNombreAlumno;
    // End of variables declaration//GEN-END:variables
}
