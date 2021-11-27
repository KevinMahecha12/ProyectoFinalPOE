package proyectofinalsupermercado;

import static proyectofinalsupermercado.GestionProductos.cola_inventario;


public class EditarInventario extends javax.swing.JFrame {

    static Cola cola_inventario = new Cola(); 
    int contEmp;
    Producto[] arrayproducto;
    public EditarInventario(int ContEmp, Cola COLA_INVENTARIO) {
        cola_inventario = COLA_INVENTARIO;
        contEmp = ContEmp;
        initComponents();
        
         arrayproducto = new Producto[cola_inventario.tamaño];
          System.out.println(arrayproducto.length);
          arrayproducto = cola_inventario.recorrer();
          
             System.out.println("empleados contados: "+contEmp);
        for (Producto producto : arrayproducto) {
            if(producto!=null){
                CB_Inventario.addItem(producto.Nombre_producto);
            }else{
                break;
            }
        }
      
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        CB_Inventario = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        ID_INV = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        CANT_INV = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        NOM_INV = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        DESC_INV = new javax.swing.JTextArea();
        jLabel6 = new javax.swing.JLabel();
        PREC_INV = new javax.swing.JTextField();
        BT_VOLVER = new javax.swing.JButton();
        BT_EDITAR = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Seleccione el nombre del producto que quiere editar");

        CB_Inventario.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                CB_InventarioItemStateChanged(evt);
            }
        });

        jLabel2.setText("ID del inventario:");

        jLabel3.setText("Cantidad del producto: ");

        jLabel4.setText("Nombre del producto:");

        NOM_INV.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NOM_INVActionPerformed(evt);
            }
        });

        jLabel5.setText("Descripción del producto:");

        DESC_INV.setColumns(20);
        DESC_INV.setRows(5);
        jScrollPane1.setViewportView(DESC_INV);

        jLabel6.setText("Precio del producto:");

        BT_VOLVER.setText("Volver");
        BT_VOLVER.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BT_VOLVERActionPerformed(evt);
            }
        });

        BT_EDITAR.setText("Editar");
        BT_EDITAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BT_EDITARActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(NOM_INV))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ID_INV, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(CANT_INV, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(CB_Inventario, javax.swing.GroupLayout.PREFERRED_SIZE, 379, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(PREC_INV, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(BT_EDITAR)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(BT_VOLVER)))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(CB_Inventario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(ID_INV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(CANT_INV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(NOM_INV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(PREC_INV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BT_EDITAR)
                    .addComponent(BT_VOLVER))
                .addGap(8, 8, 8))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void NOM_INVActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NOM_INVActionPerformed
       
    }//GEN-LAST:event_NOM_INVActionPerformed

    private void BT_EDITARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BT_EDITARActionPerformed
        Producto obj = new Producto(Integer.parseInt(ID_INV.getText()), Integer.parseInt(CANT_INV.getText()),NOM_INV.getText(),DESC_INV.getText(),Double.parseDouble(PREC_INV.getText()));
        int index = CB_Inventario.getSelectedIndex() ;
        arrayproducto[index] = obj;
        arrayproducto = cola_inventario.recorrer();

    }//GEN-LAST:event_BT_EDITARActionPerformed

    private void CB_InventarioItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_CB_InventarioItemStateChanged
       String seleccionInventario = CB_Inventario.getSelectedItem().toString();
        for(Producto producto : arrayproducto){
            if(producto!=null){
                if(producto.Nombre_producto == seleccionInventario){
                   ID_INV.setText(String.valueOf(producto.ID_Producto));
                   CANT_INV.setText(String.valueOf(producto.Cant_prod));
                   NOM_INV.setText(producto.Nombre_producto);
                   DESC_INV.setText(producto.getDesc_prod());
                   PREC_INV.setText(String.valueOf(producto.Precio_Producto));
                }
            }else{
                break;
            }
        }
    }//GEN-LAST:event_CB_InventarioItemStateChanged

    private void BT_VOLVERActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BT_VOLVERActionPerformed
     MenuPrincipal menu  =  new MenuPrincipal(0,contEmp,null,cola_inventario,null,null, null,null,arrayproducto);
        menu.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_BT_VOLVERActionPerformed

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
            java.util.logging.Logger.getLogger(EditarInventario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EditarInventario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EditarInventario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EditarInventario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EditarInventario(0,null).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BT_EDITAR;
    private javax.swing.JButton BT_VOLVER;
    private javax.swing.JTextField CANT_INV;
    private javax.swing.JComboBox<String> CB_Inventario;
    private javax.swing.JTextArea DESC_INV;
    private javax.swing.JTextField ID_INV;
    private javax.swing.JTextField NOM_INV;
    private javax.swing.JTextField PREC_INV;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
