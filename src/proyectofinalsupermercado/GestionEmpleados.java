//CAMBIO
package proyectofinalsupermercado;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author kevin
 */
public class GestionEmpleados extends javax.swing.JFrame {

    Empleados[] empleados = new Empleados[20];
    
    public GestionEmpleados(Empleados[] emple) {
        initComponents();
        
        empleados = emple;
       
        
        
        String[] cabecera ={"ID_Empleado","Nombre","Area de Trabajo","Turno"};
        
        
       DefaultTableModel modelo = new DefaultTableModel();
        
        modelo.setColumnIdentifiers(cabecera);
        
        Object []  datos = new Object[4];
   
         
            for( int i=0; i<empleados.length;i++){
                if(empleados[i]==null){
            i=empleados.length;
        }else{    
                //datos[0]=empleados[i].getID_EMPLEADO();
                datos[1]=empleados[i].getNombre_Empleado();
                datos[2]=empleados[i].getArea_Trabajador();
                datos[3]=empleados[i].getTurno();
            
                modelo.addRow(datos);
                }
        }
        
        
           jtableEmpleadosRegistrados.setModel(modelo);
                    
        }  
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jtableEmpleadosRegistrados = new javax.swing.JTable();
        jbutton_Editar = new javax.swing.JButton();
        jbutton_ConfirmarAsistencia = new javax.swing.JButton();
        jbutton_EliminarEmpleado = new javax.swing.JButton();
        jbutton_VolverAlMenu1 = new javax.swing.JButton();
        jlabelEmpleadosRegistrados = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jtableEmpleadosRegistrados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jtableEmpleadosRegistrados);

        jbutton_Editar.setText("Editar");
        jbutton_Editar.setToolTipText("EditarEmpleado");
        jbutton_Editar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbutton_EditarActionPerformed(evt);
            }
        });

        jbutton_ConfirmarAsistencia.setText("Confirmar Asistencia");
        jbutton_ConfirmarAsistencia.setToolTipText("Asistencia ");
        jbutton_ConfirmarAsistencia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbutton_ConfirmarAsistenciaActionPerformed(evt);
            }
        });

        jbutton_EliminarEmpleado.setText("Eliminar");
        jbutton_EliminarEmpleado.setToolTipText("EliminarEmpleado");
        jbutton_EliminarEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbutton_EliminarEmpleadoActionPerformed(evt);
            }
        });

        jbutton_VolverAlMenu1.setText("Volver");
        jbutton_VolverAlMenu1.setToolTipText("RegresarMenu1");
        jbutton_VolverAlMenu1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbutton_VolverAlMenu1ActionPerformed(evt);
            }
        });

        jlabelEmpleadosRegistrados.setToolTipText("EmpleadosRegistrados");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jlabelEmpleadosRegistrados, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addComponent(jbutton_Editar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jbutton_ConfirmarAsistencia)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jbutton_EliminarEmpleado)))
                        .addGap(37, 37, 37)
                        .addComponent(jbutton_VolverAlMenu1)
                        .addGap(22, 22, 22))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jlabelEmpleadosRegistrados, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 58, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbutton_Editar)
                    .addComponent(jbutton_ConfirmarAsistencia)
                    .addComponent(jbutton_EliminarEmpleado)
                    .addComponent(jbutton_VolverAlMenu1))
                .addGap(36, 36, 36))
        );

        setSize(new java.awt.Dimension(532, 410));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jbutton_VolverAlMenu1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbutton_VolverAlMenu1ActionPerformed
        //*MenuPrincipal menu  =  new MenuPrincipal(empleados); 
       //* menu.setVisible(true);
        this.setVisible(false);  
    }//GEN-LAST:event_jbutton_VolverAlMenu1ActionPerformed

    private void jbutton_EliminarEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbutton_EliminarEmpleadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbutton_EliminarEmpleadoActionPerformed

    private void jbutton_ConfirmarAsistenciaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbutton_ConfirmarAsistenciaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbutton_ConfirmarAsistenciaActionPerformed

    private void jbutton_EditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbutton_EditarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbutton_EditarActionPerformed

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
            java.util.logging.Logger.getLogger(GestionEmpleados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GestionEmpleados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GestionEmpleados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GestionEmpleados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GestionEmpleados(null).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbutton_ConfirmarAsistencia;
    private javax.swing.JButton jbutton_Editar;
    private javax.swing.JButton jbutton_EliminarEmpleado;
    private javax.swing.JButton jbutton_VolverAlMenu1;
    private javax.swing.JLabel jlabelEmpleadosRegistrados;
    private javax.swing.JTable jtableEmpleadosRegistrados;
    // End of variables declaration//GEN-END:variables
}
