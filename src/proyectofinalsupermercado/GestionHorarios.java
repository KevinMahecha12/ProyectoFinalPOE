/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectofinalsupermercado;

import java.util.Vector;
import javax.swing.event.ListSelectionEvent;
import javax.swing.table.DefaultTableModel;


public class GestionHorarios extends javax.swing.JFrame {

    Empleados[] empleados = new Empleados[20];
    Cola cola = new Cola();
    Horario[] horario = new Horario[20];
    HorariosAsignados[] asignados = new HorariosAsignados[20];
    private int selectedRow;
    DefaultTableModel modelo = new DefaultTableModel();
       Object []  datos = new Object[6];
    public GestionHorarios(Cola c,Empleados[] emple, Horario[] h, HorariosAsignados[] a) {
        initComponents();
        horario=h;
        empleados = emple;
        cola=c;
        asignados=a;
        String[] cabecera ={"Id trabajador","Nombre","Dias","Turno", "Hora Entrada", "Hora Salida"};
        
        
        modelo.setColumnIdentifiers(cabecera);
        
     

            for( int i=0; i<asignados.length;i++){
                if(asignados[i]==null){
                    i=asignados.length;
                }else{    
                    datos[0]=asignados[i].ID_Trabajador;
                    datos[1]=asignados[i].Nombre_Trabajador;
                    datos[2]=asignados[i].Dias_Horario;
                    datos[3]=asignados[i].Turno;
                    datos[4]=asignados[i].Hora_Entrada;
                    datos[5]=asignados[i].Hora_Salida;
                    System.out.println("ROW QUE SE RECIBIO: "+TablaHorarios.getSelectedRow() +"COLUMNA QUE SE RECIBIO: "+ TablaHorarios.getSelectedColumn());
                    
                    
               
if (selectedRow >= 0) {

    //userModel.setValueAt(newValue, selectedRow, 0);
    
} 
                    modelo.addRow(datos);
                }
        }
           TablaHorarios.setModel(modelo);
                    
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
        TablaHorarios = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        BotonEditar = new javax.swing.JButton();
        CrearHorario = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        txtRegresar = new javax.swing.JButton();
        AsignarHorario = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        TablaHorarios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Id Trabajador", "Nombre", "Dias", "Turno", "Hora Entrada", "Hora Salida"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, true, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        TablaHorarios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TablaHorariosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(TablaHorarios);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyectofinalsupermercado/imagenes/fecha.png"))); // NOI18N

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyectofinalsupermercado/imagenes/hora.png"))); // NOI18N

        BotonEditar.setText("Eliminar");
        BotonEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonEditarActionPerformed(evt);
            }
        });

        CrearHorario.setText("Crear nuevo horario predefinido");
        CrearHorario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CrearHorarioActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Sinhala MN", 2, 24)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Gestion de Horarios");

        txtRegresar.setText("Regresar");
        txtRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRegresarActionPerformed(evt);
            }
        });

        AsignarHorario.setText("Asignar horarios predefinidos");
        AsignarHorario.setToolTipText("");
        AsignarHorario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AsignarHorarioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 577, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel2)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 628, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(CrearHorario)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(AsignarHorario)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtRegresar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(BotonEditar)
                        .addGap(31, 31, 31))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(CrearHorario, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                    .addComponent(AsignarHorario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(BotonEditar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtRegresar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(24, 24, 24))
        );

        setSize(new java.awt.Dimension(659, 398));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void AsignarHorarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AsignarHorarioActionPerformed
        AsignarHorarioTrabajador nvo  =  new AsignarHorarioTrabajador(cola,empleados,horario, asignados); 
        nvo.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_AsignarHorarioActionPerformed

    private void CrearHorarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CrearHorarioActionPerformed
        HorarioNuevo nvo  =  new HorarioNuevo(cola,empleados,horario, asignados); 
        nvo.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_CrearHorarioActionPerformed

    private void txtRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRegresarActionPerformed
        MenuPrincipal menu  =  new MenuPrincipal(0,0,empleados,cola,null,null, horario, asignados); 
        menu.setVisible(true);
        this.setVisible(false);  
    }//GEN-LAST:event_txtRegresarActionPerformed

    private void BotonEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonEditarActionPerformed

    }//GEN-LAST:event_BotonEditarActionPerformed
public void valueChanged(ListSelectionEvent event) {
           
         }

    private void TablaHorariosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TablaHorariosMouseClicked
           int selectedRowIndex =  TablaHorarios.getSelectedRow();
                   System.out.println("DATOS DE LO SELECCIONADO: "+modelo.getValueAt( selectedRowIndex, 0).toString());
                   System.out.println("DATOS DE LO SELECCIONADO: "+modelo.getValueAt( selectedRowIndex, 1).toString());
                   System.out.println("DATOS DE LO SELECCIONADO: "+modelo.getValueAt( selectedRowIndex, 2).toString());
                    System.out.println("DATOS DE LO SELECCIONADO: "+modelo.getValueAt( selectedRowIndex, 3).toString());
                     System.out.println("DATOS DE LO SELECCIONADO: "+modelo.getValueAt( selectedRowIndex, 4).toString());
                      System.out.println("DATOS DEL SELECCIOANDO:" + modelo.getDataVector().elementAt(TablaHorarios.getSelectedRow()));
                      
    }//GEN-LAST:event_TablaHorariosMouseClicked

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
            java.util.logging.Logger.getLogger(GestionHorarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GestionHorarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GestionHorarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GestionHorarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GestionHorarios(null,null,null,null).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AsignarHorario;
    private javax.swing.JButton BotonEditar;
    private javax.swing.JButton CrearHorario;
    private javax.swing.JTable TablaHorarios;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton txtRegresar;
    // End of variables declaration//GEN-END:variables
}
