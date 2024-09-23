
package com.mycompany.tiendaon;

import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;



public class GUI extends javax.swing.JFrame {

  
    
    String productos []= {"Cola Cola" , " Papitas Lays" , " Chetos", " Inka cola" , " Galleta Wafer " , " Galleta chips"};
    double precios [] = {3.0 , 2.0 , 2.0 , 3.0 , 2.5 , 1.0};
    double precio = 0;
    int cantidad = 0;
    DefaultTableModel modelo = new DefaultTableModel();
    
    ArrayList<Producto> listaventas = new ArrayList<Producto>();
    
    
    
    
    public GUI() {
        
        initComponents();
        calcularPrecio();
        
        modelo.addColumn("Producto");
        modelo.addColumn("Precio U.");
        modelo.addColumn("Cantidad");
        modelo.addColumn("Total");
    
    tblProductos.setModel(modelo);
        
        
    }

  
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel10 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        cboProducto = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        spnCantidad = new javax.swing.JSpinner();
        jLabel3 = new javax.swing.JLabel();
        lblPrecio = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        lblImporte = new javax.swing.JLabel();
        btnAgregar = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        btnActualizar = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        lblTotal = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        lbliva = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        lblSubTotal = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblProductos = new javax.swing.JTable();
        jLabel13 = new javax.swing.JLabel();
        btnImprimir = new javax.swing.JButton();

        jLabel10.setText("jLabel10");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Base de datos");
        setMinimumSize(new java.awt.Dimension(600, 700));
        setResizable(false);

        jPanel4.setBackground(new java.awt.Color(204, 204, 204));

        jLabel1.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Producto");

        cboProducto.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Cola cola", "Inka Kola", "Papitas Lays", "Chetos", "Galleta Wafer", "Galleta chips" }));
        cboProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cboProductoActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Cantidad");

        spnCantidad.setModel(new javax.swing.SpinnerNumberModel(1, 1, 10, 1));
        spnCantidad.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                spnCantidadStateChanged(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Precio");

        lblPrecio.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        lblPrecio.setForeground(new java.awt.Color(0, 0, 0));
        lblPrecio.setText("S/.0.00");

        jLabel4.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Importe");

        lblImporte.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        lblImporte.setForeground(new java.awt.Color(0, 0, 0));
        lblImporte.setText("S/.0.00");

        btnAgregar.setText("Agregar");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        btnActualizar.setText("Actualizar");
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("SubTotal");

        lblTotal.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        lblTotal.setForeground(new java.awt.Color(0, 0, 0));
        lblTotal.setText("S/.0.00");

        jLabel5.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("IVA");

        lbliva.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        lbliva.setForeground(new java.awt.Color(0, 0, 0));
        lbliva.setText("S/.0.00");

        jLabel8.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("Total");

        lblSubTotal.setFont(new java.awt.Font("Arial Black", 1, 18)); // NOI18N
        lblSubTotal.setForeground(new java.awt.Color(0, 0, 0));
        lblSubTotal.setText("S/.0.00");

        jLabel6.setFont(new java.awt.Font("Arial Black", 1, 30)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("TIENDA");

        tblProductos.setBackground(new java.awt.Color(0, 0, 0));
        tblProductos.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Segoe UI", 0, 12), new java.awt.Color(102, 102, 102))); // NOI18N
        tblProductos.setForeground(new java.awt.Color(255, 255, 255));
        tblProductos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Producto", "Precio U.", "Cantidad", "Total"
            }
        ));
        jScrollPane1.setViewportView(tblProductos);

        jLabel13.setBackground(new java.awt.Color(204, 0, 204));
        jLabel13.setForeground(new java.awt.Color(204, 204, 204));
        jLabel13.setIcon(new javax.swing.ImageIcon("C:\\Users\\Sui\\Documents\\NetBeansProjects\\TiendaOn\\src\\Icono\\LogoUpeunegro.png")); // NOI18N
        jLabel13.setText("jLabel12");

        btnImprimir.setText("Imprimir");
        btnImprimir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnImprimirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(81, 81, 81)
                .addComponent(btnImprimir, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lbliva))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblSubTotal))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(58, 58, 58)
                        .addComponent(lblTotal)))
                .addGap(16, 16, 16))
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(28, 28, 28)
                                .addComponent(cboProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(spnCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(61, 61, 61))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(97, 97, 97)
                                .addComponent(btnAgregar)
                                .addGap(38, 38, 38)
                                .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(36, 36, 36)
                                .addComponent(btnActualizar))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(188, 188, 188)
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(15, 15, 15)))
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblPrecio, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblImporte, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap(53, Short.MAX_VALUE))
        );

        jPanel4Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnActualizar, btnAgregar, btnEliminar});

        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cboProducto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)
                            .addComponent(lblPrecio))
                        .addGap(7, 7, 7)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(spnCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4)
                            .addComponent(lblImporte))
                        .addGap(27, 27, 27)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(34, 34, 34)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblTotal)
                            .addComponent(jLabel7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbliva, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblSubTotal)
                            .addComponent(jLabel8))
                        .addGap(78, 78, 78))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnImprimir, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(102, 102, 102))))
        );

        jPanel4Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnActualizar, btnAgregar, btnEliminar});

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        int selectedRow = tblProductos.getSelectedRow(); // Fila seleccionada
        if (selectedRow != -1) {
        listaventas.remove(selectedRow); // Remover de la lista
        actualizarTabla(); // Actualizar la tabla
        }
        else {
        javax.swing.JOptionPane.showMessageDialog(this, "Seleccione una fila para eliminar.");
        }
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        
        Producto venta = new Producto();
        venta.setId(cboProducto.getSelectedIndex());
        venta.setProducto(cboProducto.getSelectedItem().toString());
        venta.setPrecio(precio);
        venta.setCantidad(cantidad);
        venta.setTotal(precio*cantidad); 
        
        if(buscarVenta(venta)){
            

        }
                
        listaventas.add(venta);
        actualizarTabla();
        borrarVenta();
    
    }//GEN-LAST:event_btnAgregarActionPerformed

    public boolean buscarVenta(Producto nueva){
        
        for(Producto v: listaventas){
            if(v.getId()== nueva.getId()){
                
                int nuevaCantidad = v.getCantidad()+nueva.getCantidad();
                v.setCantidad(nuevaCantidad);
                v.setTotal(v.getPrecio()*nuevaCantidad);
                return true;
    
            }      
        }
        return false;
    }
    
    
    public void borrarVenta(){
        
        precio = 0;
        cantidad = 1;
        cboProducto.setSelectedIndex(0);
        spnCantidad.setValue(1);
        calcularPrecio();

    }
    
    private void cboProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cboProductoActionPerformed
        
        calcularPrecio();
        
    }//GEN-LAST:event_cboProductoActionPerformed

    private void spnCantidadStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_spnCantidadStateChanged
       
        calcularPrecio();
    }//GEN-LAST:event_spnCantidadStateChanged

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
        
        int selectedRow = tblProductos.getSelectedRow();
        if (selectedRow != -1) {
        Producto venta = listaventas.get(selectedRow);
        venta.setCantidad(Integer.parseInt(spnCantidad.getValue().toString()));
        venta.setTotal(venta.getPrecio() * venta.getCantidad()); // Recalcular total
        actualizarTabla();
        }
    
        else {
        javax.swing.JOptionPane.showMessageDialog(this, "Seleccione una fila para actualizar.");
        }
    
    }//GEN-LAST:event_btnActualizarActionPerformed

    private void btnImprimirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnImprimirActionPerformed
        
        if (listaventas.isEmpty()) {
        javax.swing.JOptionPane.showMessageDialog(this, "No hay ventas para imprimir.");
        return;
    }
    
    String boletaTexto = generarBoleta();
    
    javax.swing.JOptionPane.showMessageDialog(this, "Boleta impresa con éxito.");
    javax.swing.JOptionPane.showMessageDialog(this, boletaTexto, "Boleta de Venta", javax.swing.JOptionPane.INFORMATION_MESSAGE);
    
    }//GEN-LAST:event_btnImprimirActionPerformed
    
    public String generarBoleta() {
    double subtotal = 0;
    double iva = 0;
    double total = 0;

    
    StringBuilder boletaTexto = new StringBuilder();
    boletaTexto.append("=== Boleta de Venta ===\n");
    boletaTexto.append("   Producto  \t     Precio  \t   Cantidad  \t  Total \n");

    for (Producto v : listaventas) {
        subtotal += v.getTotal();
        boletaTexto.append(String.format("  %s    \t    %.2f       \t       %d      \t      %.2f   \n",
                v.getProducto(),
                v.getPrecio(),
                v.getCantidad(),
                v.getTotal()));
    }

    iva = subtotal * 0.18;
    total = subtotal + iva;

    boletaTexto.append("---------------------------\n");
    boletaTexto.append(String.format("Subtotal: %s\n", aMoneda(subtotal)));
    boletaTexto.append(String.format("IVA: %s\n", aMoneda(iva)));
    boletaTexto.append(String.format("Total: %s\n", aMoneda(total)));
    boletaTexto.append("===========================\n");

    return boletaTexto.toString(); 
}



  
    
    public void calcularPrecio(){
        
        precio = precios[cboProducto.getSelectedIndex()];
        cantidad = Integer.parseInt(spnCantidad.getValue().toString());
        lblPrecio.setText( aMoneda(precio));
        lblImporte.setText(aMoneda(precio*cantidad));
        
    }
    
    

    
    
    public String aMoneda(double precio){
        
        return "S/. " + Math.round(precio*100.0)/ 100.0 + " PEN ";
    }
    
    public void actualizarTabla(){
        
        while(modelo.getRowCount()>0){
            modelo.removeRow(0);
             
        }
        
        double subtotal = 0;
        
        
        for(Producto v: listaventas){
            
            Object x []= new Object[4];
            x [0] = v.getProducto();
            x [1] = aMoneda(v.getPrecio());
            x [2] = v.getCantidad();
            x [3] = aMoneda(v.getTotal());
            subtotal+=v.getTotal();
            
            modelo.addRow(x);
              
        }
        double iva= subtotal*0.18;
        double total= subtotal+iva;
        lblSubTotal.setText(aMoneda(subtotal));
        lbliva.setText(aMoneda(iva));
        lblTotal.setText(aMoneda(total));
        tblProductos.setModel(modelo);
      
    
    }
    
  
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
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnImprimir;
    private javax.swing.JComboBox<String> cboProducto;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblImporte;
    private javax.swing.JLabel lblPrecio;
    private javax.swing.JLabel lblSubTotal;
    private javax.swing.JLabel lblTotal;
    private javax.swing.JLabel lbliva;
    private javax.swing.JSpinner spnCantidad;
    private javax.swing.JTable tblProductos;
    // End of variables declaration//GEN-END:variables
}
