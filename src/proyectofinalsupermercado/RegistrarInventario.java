package proyectofinalsupermercado;

import javax.swing.JOptionPane;


public class RegistrarInventario extends javax.swing.JFrame {
    static Cola c = new Cola();
    public RegistrarInventario(Cola cola_inventario) {
        initComponents();
        c=cola_inventario;
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        TF_IDPROD = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        TF_NOMPROD = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        TF_CANTPROD = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TXA_DESPROD = new javax.swing.JTextArea();
        jLabel6 = new javax.swing.JLabel();
        TF_PRECIOPROD = new javax.swing.JTextField();
        BT_AGREGARPROD = new javax.swing.JButton();
        BT_VOLVER = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Registrar productos");

        jLabel1.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Registrar un producto");

        jLabel2.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        jLabel2.setText("Ingrese un ID para el producto: ");

        jLabel3.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        jLabel3.setText("Nombre del producto:");

        jLabel4.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        jLabel4.setText("Introduzca la cantidad del producto: ");

        jLabel5.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        jLabel5.setText("Descripcion del producto:");

        TXA_DESPROD.setColumns(20);
        TXA_DESPROD.setRows(5);
        jScrollPane1.setViewportView(TXA_DESPROD);

        jLabel6.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        jLabel6.setText("Ingrese el precio del producto:");

        BT_AGREGARPROD.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        BT_AGREGARPROD.setText("Agregar producto");
        BT_AGREGARPROD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BT_AGREGARPRODActionPerformed(evt);
            }
        });

        BT_VOLVER.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        BT_VOLVER.setText("Volver");
        BT_VOLVER.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BT_VOLVERActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(99, 99, 99)
                                .addComponent(BT_AGREGARPROD)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(BT_VOLVER))
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel5)))
                        .addGap(0, 97, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(TF_PRECIOPROD))
                            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jScrollPane1)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(TF_CANTPROD, javax.swing.GroupLayout.DEFAULT_SIZE, 64, Short.MAX_VALUE)
                                    .addComponent(TF_IDPROD))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(TF_NOMPROD)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(TF_IDPROD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(TF_CANTPROD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(TF_NOMPROD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(TF_PRECIOPROD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BT_AGREGARPROD)
                    .addComponent(BT_VOLVER))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
     Inventario inv =  new Inventario();
       Object x;
       int contador;
       int id;
        int y = 1;
    private void BT_VOLVERActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BT_VOLVERActionPerformed
      
        MenuPrincipal menu  =  new MenuPrincipal(contador,0,null,c,null,null); 
        menu.setVisible(true);
        this.setVisible(false);         

    }//GEN-LAST:event_BT_VOLVERActionPerformed

    private void BT_AGREGARPRODActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BT_AGREGARPRODActionPerformed
       if(TF_IDPROD.getText().equals("") || TF_CANTPROD.getText().equals("") || TF_NOMPROD.getText().equals("") || TXA_DESPROD.getText().equals("") || TF_PRECIOPROD.getText().equals("")){
           JOptionPane.showMessageDialog(this, "Porfavor, ingrese los campos vacios!","Campos vacíos", JOptionPane.WARNING_MESSAGE);
       } else {
            inv.setID_Producto(Integer.parseInt(TF_IDPROD.getText()));
            inv.setCant_prod(Integer.parseInt(TF_CANTPROD.getText()));
            inv.setNombre_producto(TF_NOMPROD.getText());
            inv.setDesc_prod(TXA_DESPROD.getText());
            inv.setPrecio_Producto(Double.parseDouble(TF_PRECIOPROD.getText()));
            contador++;
            Producto obj = new Producto(inv.getID_Producto(),inv.getCant_prod(),inv.getNombre_producto(),inv.getDesc_prod(),inv.getPrecio_Producto());
            c.push(obj);
       }
    }//GEN-LAST:event_BT_AGREGARPRODActionPerformed

   
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
             new RegistrarInventario(c).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BT_AGREGARPROD;
    private javax.swing.JButton BT_VOLVER;
    private javax.swing.JTextField TF_CANTPROD;
    private javax.swing.JTextField TF_IDPROD;
    private javax.swing.JTextField TF_NOMPROD;
    private javax.swing.JTextField TF_PRECIOPROD;
    private javax.swing.JTextArea TXA_DESPROD;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
