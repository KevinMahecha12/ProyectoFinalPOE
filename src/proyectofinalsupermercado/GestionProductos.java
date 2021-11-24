package proyectofinalsupermercado;

import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

public class GestionProductos extends javax.swing.JFrame {
    
 Producto[] array;
 private int cont;
Cola cola_inventario = new Cola();

    public GestionProductos(int Contador,Cola COLA_INVENTARIO) {
         cola_inventario  = COLA_INVENTARIO;
         cont = Contador;
         array = new Producto[cola_inventario.tamaño];
         array = cola_inventario.recorrer();
        initComponents();
         DefaultTableModel modelo = (DefaultTableModel) jTable_MostrarProductos.getModel();
        System.out.println("Elementos en tabla:  "+modelo.getColumnCount());
         funcionamiento();
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

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTable_MostrarProductos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID_PRODUCTO", "Nombre_Producto", "Cantidad_Producto (Stock)", "Descripcion_Producto", "Precio_Producto"
            }
        ));
        jScrollPane1.setViewportView(jTable_MostrarProductos);
        if (jTable_MostrarProductos.getColumnModel().getColumnCount() > 0) {
            jTable_MostrarProductos.getColumnModel().getColumn(3).setPreferredWidth(200);
        }

        jbutton_EditarProducto.setText("Editar");
        jbutton_EditarProducto.setToolTipText("EditarProducto");

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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 730, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jbutton_EditarProducto)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jbutton_EliminarProducto)
                .addGap(152, 152, 152)
                .addComponent(jbutton_VolverAlMenu2)
                .addGap(47, 47, 47))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel_TotalProductos, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(152, 152, 152))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addComponent(jLabel_TotalProductos, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbutton_EditarProducto)
                    .addComponent(jbutton_EliminarProducto)
                    .addComponent(jbutton_VolverAlMenu2))
                .addGap(30, 30, 30))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
public void funcionamiento() {
       DefaultTableModel modelo = (DefaultTableModel) jTable_MostrarProductos.getModel();
       DefaultTableCellRenderer tcr = new DefaultTableCellRenderer();
       tcr.setHorizontalAlignment(SwingConstants.CENTER);
        Object[] datosx = new Object[5];
       
    for (int i=0; i<cont; i++){
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
        MenuPrincipal menu  =  new MenuPrincipal(cont,cola_inventario); 
         menu.setVisible(true);
          this.setVisible(false);        
    }//GEN-LAST:event_jbutton_VolverAlMenu2ActionPerformed

    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GestionProductos(0,null).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel_TotalProductos;
    private javax.swing.JScrollPane jScrollPane1;
    private static javax.swing.JTable jTable_MostrarProductos;
    private javax.swing.JButton jbutton_EditarProducto;
    private javax.swing.JButton jbutton_EliminarProducto;
    private javax.swing.JButton jbutton_VolverAlMenu2;
    // End of variables declaration//GEN-END:variables
}
