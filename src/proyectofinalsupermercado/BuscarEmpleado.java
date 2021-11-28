/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package proyectofinalsupermercado;

import javax.swing.JOptionPane;

/**
 *
 * @author angel
 */
public class BuscarEmpleado extends javax.swing.JFrame {

    Empleados[] empleados = new Empleados[20];
    int contEmp;
    Cola cola = new Cola();
    Horario[] horario = new Horario[20];
    HorariosAsignados[] asignados = new HorariosAsignados[20];
    
    public BuscarEmpleado(Cola c, int ContEmp,Empleados[] emple, Horario[] h,HorariosAsignados[] a) {
        initComponents();
        contEmp = ContEmp;
        empleados = emple;
        cola=c;
        horario=h;
        asignados=a;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jbutton_VolverAlMenu1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        buscador = new javax.swing.JTextField();
        nombre = new javax.swing.JLabel();
        buscarEmpleado = new javax.swing.JButton();
        area = new javax.swing.JLabel();
        turno = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jbutton_VolverAlMenu1.setText("Volver");
        jbutton_VolverAlMenu1.setToolTipText("RegresarMenu1");
        jbutton_VolverAlMenu1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbutton_VolverAlMenu1ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Rockwell", 0, 24)); // NOI18N
        jLabel1.setText("Buscar Empleado");

        jLabel2.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jLabel2.setText("ID:");

        nombre.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N

        buscarEmpleado.setText("Buscar");
        buscarEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarEmpleadoActionPerformed(evt);
            }
        });

        area.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N

        turno.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jbutton_VolverAlMenu1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 75, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(area)
                            .addComponent(nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(turno))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(buscarEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(buscador, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buscador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(buscarEmpleado)
                    .addComponent(nombre))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 52, Short.MAX_VALUE)
                .addComponent(area)
                .addGap(18, 18, 18)
                .addComponent(turno)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jbutton_VolverAlMenu1))
        );

        setSize(new java.awt.Dimension(393, 268));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jbutton_VolverAlMenu1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbutton_VolverAlMenu1ActionPerformed
        MenuPrincipal menu  =  new MenuPrincipal(0,contEmp,empleados,cola,null,null, horario, asignados);
        menu.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jbutton_VolverAlMenu1ActionPerformed

    private void buscarEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarEmpleadoActionPerformed
        // TODO add your handling code here:
        if (empleados[0] == null) {
            JOptionPane.showMessageDialog(null, "No hay empleados registrados");
                            
        }else{
            
        String r;
        
        r = buscador.getText();
        Integer.parseInt(r);
        
        int buscador = Integer.parseInt(r);

                          
                          for (int i = 0; i < empleados.length; i++) {
                            if(empleados[i]!=null){
                                    if (buscador == empleados[i].getID_EMPLEADO()) {
                              
                                nombre.setText("Nombre: "+empleados[i].getNombre_Empleado());
                                area.setText("Area de Trabajo: "+empleados[i].getArea_Trabajador());
                                if(empleados[i].getTurno()==1){
                                    
                                turno.setText("Turno: Verpertino");
                                }else{
                                    turno.setText("Turno: Matutino");
                                }break;
                            }
                            }else {
                                JOptionPane.showMessageDialog(null, "No se encontro el empleado");
                                break;
                            }
                            } 
                        }
    }//GEN-LAST:event_buscarEmpleadoActionPerformed

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
            java.util.logging.Logger.getLogger(BuscarEmpleado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BuscarEmpleado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BuscarEmpleado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BuscarEmpleado.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BuscarEmpleado(null,0,null, null,null).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel area;
    private javax.swing.JTextField buscador;
    private javax.swing.JButton buscarEmpleado;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JButton jbutton_VolverAlMenu1;
    private javax.swing.JLabel nombre;
    private javax.swing.JLabel turno;
    // End of variables declaration//GEN-END:variables
}
