package proyectofinalsupermercado;

import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

public class GestionProductos extends javax.swing.JFrame {
    
 Producto[] array;
 private static int cont;
static Cola cola_inventario = new Cola();
  Object[] datosx = new Object[5];
  int ContadorProductos;
    public GestionProductos(int Contador,Cola COLA_INVENTARIO) {
         cola_inventario  = COLA_INVENTARIO;
         cont = Contador;
         
        initComponents();
         DefaultTableModel modelo = (DefaultTableModel) jTable_MostrarProductos.getModel();
        System.out.println("Elementos en tabla:  "+modelo.getColumnCount());
         funcionamiento();
    }

    public GestionProductos() {
    }

    public int getContadorProductos() {
        return ContadorProductos;
    }

    public void setContadorProductos(int ContadorProductos) {
        this.ContadorProductos = ContadorProductos;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable_MostrarProductos = new javax.swing.JTable();
        jbutton_EditarProducto = new javax.swing.JButton();
        jLabel_TotalProductos = new javax.swing.JLabel();
        jbutton_EliminarProducto = new javax.swing.JButton();
        jbutton_VolverAlMenu2 = new javax.swing.JButton();
        JL_ERROR = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTable_MostrarProductos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nombre", "Cantidad", "Descripcion", "Precio"
            }
        ));
        jScrollPane1.setViewportView(jTable_MostrarProductos);
        if (jTable_MostrarProductos.getColumnModel().getColumnCount() > 0) {
            jTable_MostrarProductos.getColumnModel().getColumn(0).setPreferredWidth(10);
            jTable_MostrarProductos.getColumnModel().getColumn(3).setPreferredWidth(200);
        }

        jbutton_EditarProducto.setText("Editar");
        jbutton_EditarProducto.setToolTipText("EditarProducto");

        jLabel_TotalProductos.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        jLabel_TotalProductos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_TotalProductos.setToolTipText("ProductosRegistrados");

        jbutton_EliminarProducto.setText("Eliminar");
        jbutton_EliminarProducto.setToolTipText("EliminarProducto");

        jbutton_VolverAlMenu2.setText("Volver");
        jbutton_VolverAlMenu2.setToolTipText("RegresarMenu2");
        jbutton_VolverAlMenu2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbutton_VolverAlMenu2ActionPerformed(evt);
            }
        });

        JL_ERROR.setFont(new java.awt.Font("sansserif", 0, 18)); // NOI18N
        JL_ERROR.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 730, Short.MAX_VALUE)
                    .addComponent(JL_ERROR, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jbutton_VolverAlMenu2, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jbutton_EliminarProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jbutton_EditarProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(125, 125, 125))
                    .addComponent(jLabel_TotalProductos, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JL_ERROR, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel_TotalProductos, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jbutton_EliminarProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jbutton_VolverAlMenu2, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jbutton_EditarProducto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
public void funcionamiento() {
           DefaultTableModel modelo = (DefaultTableModel) jTable_MostrarProductos.getModel();
       DefaultTableCellRenderer tcr = new DefaultTableCellRenderer();
       tcr.setHorizontalAlignment(SwingConstants.CENTER);
     
         if (cont<1) {
            JL_ERROR.setText("No hay datos registrados!");
         } 
         for (int i=0; i<cont; i++){
             array = new Producto[cola_inventario.tamaño];
             array = cola_inventario.recorrer();
              ContadorProductos = ContadorProductos+1;
              setContadorProductos(ContadorProductos);
              System.out.println("Existen: "+getContadorProductos());
               jLabel_TotalProductos.setText(String.valueOf("Productos registrados: "+getContadorProductos()));
         jTable_MostrarProductos.getColumnModel().getColumn(i).setCellRenderer(tcr);
            datosx[0] = array[i].ID_Producto;
            datosx[1] = array[i].Nombre_producto;
            datosx[2] = array[i].Cant_prod;
            datosx[3] = array[i].Desc_prod;
            datosx[4] = array[i].Precio_Producto;
        modelo.addRow(datosx);
    }
}
    private void jbutton_VolverAlMenu2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbutton_VolverAlMenu2ActionPerformed
        MenuPrincipal menu  =  new MenuPrincipal(cont,0,null,cola_inventario,null,null); 
         menu.setVisible(true);
          this.setVisible(false);        
    }//GEN-LAST:event_jbutton_VolverAlMenu2ActionPerformed

    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GestionProductos(cont,cola_inventario).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel JL_ERROR;
    private javax.swing.JLabel jLabel_TotalProductos;
    private javax.swing.JScrollPane jScrollPane1;
    private static javax.swing.JTable jTable_MostrarProductos;
    private javax.swing.JButton jbutton_EditarProducto;
    private javax.swing.JButton jbutton_EliminarProducto;
    private javax.swing.JButton jbutton_VolverAlMenu2;
    // End of variables declaration//GEN-END:variables
}
