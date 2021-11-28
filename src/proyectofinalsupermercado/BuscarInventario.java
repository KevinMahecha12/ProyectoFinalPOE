package proyectofinalsupermercado;

import javax.swing.JOptionPane;

public class BuscarInventario extends javax.swing.JFrame {

        int contEmp;
    int contInv;
Empleados[] empleados = new Empleados[20];
Empleados empleado = new Empleados();
Cola cola_inventario = new Cola();
Horario[] horario = new Horario[20];
HorariosAsignados[] asignados = new HorariosAsignados[20];
Producto[] productoarray = new Producto[20];
String NombreRecibido;
String HoraCaptada;
    public BuscarInventario(int ContadorInv,int ContadorEmp,Empleados[] emp,Cola COLA_INVENTARIO,String Nombre_Administrador, String Hora, Horario[] h, HorariosAsignados[] a, Producto[] arrayp) {
        ImagenFondo imgf = new ImagenFondo("src/imagenes/bi.jpg");
        this.setContentPane(imgf);
        initComponents();
        labelID1.setVisible(false);
        labelID2.setVisible(false);
        labelPre1.setVisible(false);
        labelPrecio2.setVisible(false);
        labelDesc1.setVisible(false);
        labelDesc2.setVisible(false);
        labelStock1.setVisible(false);
        labelStock2.setVisible(false);
        
          if(Nombre_Administrador!=null){
            NombreRecibido=Nombre_Administrador;
        }
         if(Hora!=null){
            HoraCaptada = Hora;
        }
        if(ContadorEmp!=0){
            contEmp=ContadorEmp;
        }
        if(ContadorInv!=0){
            contInv=ContadorInv;
        }
        initComponents();
        if(COLA_INVENTARIO!=null){
            cola_inventario  = COLA_INVENTARIO;
        }
        if(h!=null){
            horario=h;
        }
        
        if(a!=null){
            asignados=a;
        }
        if(arrayp!=null){
            productoarray=arrayp;
        }
        if(Nombre_Administrador!=null){
            NombreRecibido=Nombre_Administrador;
        }
    if(emp!=null){
            empleados = emp;
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        labelID1 = new javax.swing.JLabel();
        labelID2 = new javax.swing.JLabel();
        labelPre1 = new javax.swing.JLabel();
        labelPrecio2 = new javax.swing.JLabel();
        labelStock1 = new javax.swing.JLabel();
        labelStock2 = new javax.swing.JLabel();
        labelDesc1 = new javax.swing.JLabel();
        labelDesc2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        btnBuscar = new javax.swing.JButton();
        btnVolver = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Buscar Inventario");

        jLabel1.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 102));
        jLabel1.setText("Nombre:");

        txtName.setFont(new java.awt.Font("Microsoft JhengHei UI", 0, 18)); // NOI18N
        txtName.setForeground(new java.awt.Color(0, 0, 102));
        txtName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNameActionPerformed(evt);
            }
        });

        labelID1.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 18)); // NOI18N
        labelID1.setForeground(new java.awt.Color(0, 0, 102));
        labelID1.setText("ID:");

        labelID2.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 18)); // NOI18N
        labelID2.setForeground(new java.awt.Color(0, 0, 102));
        labelID2.setText("0");

        labelPre1.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 18)); // NOI18N
        labelPre1.setForeground(new java.awt.Color(0, 0, 102));
        labelPre1.setText("Precio:");

        labelPrecio2.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 18)); // NOI18N
        labelPrecio2.setForeground(new java.awt.Color(0, 0, 102));
        labelPrecio2.setText("0");

        labelStock1.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 18)); // NOI18N
        labelStock1.setForeground(new java.awt.Color(0, 0, 102));
        labelStock1.setText("Cantidad (Stock): ");

        labelStock2.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 18)); // NOI18N
        labelStock2.setForeground(new java.awt.Color(0, 0, 102));
        labelStock2.setText("0");

        labelDesc1.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 18)); // NOI18N
        labelDesc1.setForeground(new java.awt.Color(0, 0, 102));
        labelDesc1.setText("Descripcion:");

        labelDesc2.setFont(new java.awt.Font("Microsoft JhengHei UI", 0, 18)); // NOI18N
        labelDesc2.setForeground(new java.awt.Color(0, 0, 102));
        labelDesc2.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        jPanel1.setLayout(new java.awt.GridLayout(1, 0, 5, 5));

        btnBuscar.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 18)); // NOI18N
        btnBuscar.setForeground(new java.awt.Color(0, 0, 102));
        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });
        jPanel1.add(btnBuscar);

        btnVolver.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 18)); // NOI18N
        btnVolver.setForeground(new java.awt.Color(0, 0, 102));
        btnVolver.setText("Volver");
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });
        jPanel1.add(btnVolver);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(labelID1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(labelID2))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(labelPre1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(labelPrecio2, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(labelStock1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(labelStock2))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(labelDesc1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(labelDesc2, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(134, 134, 134)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(94, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelID1)
                    .addComponent(labelID2))
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelStock1)
                    .addComponent(labelStock2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelPre1)
                    .addComponent(labelPrecio2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelDesc1)
                    .addComponent(labelDesc2, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(12, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNameActionPerformed

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        MenuPrincipal menu  =  new MenuPrincipal(contInv,contEmp,empleados,cola_inventario,NombreRecibido,HoraCaptada,horario,asignados,productoarray); 
         menu.setVisible(true);
          this.setVisible(false);
    }//GEN-LAST:event_btnVolverActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        String name = txtName.getText();
        Producto obj = cola_inventario.buscar(name);
        if(name.equals("")){
            JOptionPane.showMessageDialog(this,"Por favor, llene todos los campos para continuar","Campos vacios", JOptionPane.ERROR_MESSAGE);
        }else{
            if(obj!=null){
                labelID1.setVisible(true);
                labelID2.setVisible(true);
                labelPre1.setVisible(true);
                labelPrecio2.setVisible(true);
                labelDesc1.setVisible(true);
                labelDesc2.setVisible(true);
                labelStock1.setVisible(true);
                labelStock2.setVisible(true);
                
                labelID2.setText(String.valueOf(obj.ID_Producto));
                labelPrecio2.setText(Double.toString(obj.Precio_Producto));
                labelDesc2.setText(String.valueOf(obj.Desc_prod));
                labelStock2.setText(String.valueOf(obj.Cant_prod));
            }else{
                labelID1.setVisible(false);
                labelID2.setVisible(false);
                labelPre1.setVisible(false);
                labelPrecio2.setVisible(false);
                labelDesc1.setVisible(false);
                labelDesc2.setVisible(false);
                labelStock1.setVisible(false);
                labelStock2.setVisible(false);
                JOptionPane.showMessageDialog(this,"No existe ningun producto con ese nombre","404", JOptionPane.ERROR_MESSAGE);
            }
        }
        
        
    }//GEN-LAST:event_btnBuscarActionPerformed

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(BuscarInventario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BuscarInventario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BuscarInventario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BuscarInventario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BuscarInventario(0,0,null,null,null,null,null,null,null).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnVolver;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel labelDesc1;
    private javax.swing.JLabel labelDesc2;
    private javax.swing.JLabel labelID1;
    private javax.swing.JLabel labelID2;
    private javax.swing.JLabel labelPre1;
    private javax.swing.JLabel labelPrecio2;
    private javax.swing.JLabel labelStock1;
    private javax.swing.JLabel labelStock2;
    private javax.swing.JTextField txtName;
    // End of variables declaration//GEN-END:variables
}
