package proyectofinalsupermercado;

public class RegistrarHorario extends javax.swing.JFrame {

    Empleados[] empleados = new Empleados[20];
    Cola cola = new Cola();
    Horario[] horario = new Horario[20];
    HorariosAsignados[] asignados = new HorariosAsignados[20];
    
    public RegistrarHorario(Cola c,Empleados[] emple, Horario[] h, HorariosAsignados[] a) {
        initComponents();
        horario=h;
        empleados = emple;
        cola=c;
        asignados=a;
        
         for (Empleados empleado : empleados) {
            if(empleado!=null){
                cbbEmpleados.addItem(empleado.Nombre_Empleado);
            }else{
                break;
            }
         }
    }
        
         
        
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        grupoRegistrarHorario = new javax.swing.ButtonGroup();
        jLabel2 = new javax.swing.JLabel();
        cbbEmpleados = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        cbxLun = new javax.swing.JCheckBox();
        cbxMar = new javax.swing.JCheckBox();
        cbxMie = new javax.swing.JCheckBox();
        cbxSab = new javax.swing.JCheckBox();
        cbxVie = new javax.swing.JCheckBox();
        cbxJue = new javax.swing.JCheckBox();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        TF_HE = new javax.swing.JTextField();
        TF_HS = new javax.swing.JTextField();
        btnVolver = new javax.swing.JButton();
        btnRegistrar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel2.setText("Nombre:");

        jLabel4.setText("Dias:");

        cbxLun.setText("Lun");

        cbxMar.setText("Mar");

        cbxMie.setText("Mie");

        cbxSab.setText("Sab");

        cbxVie.setText("Vie");

        cbxJue.setText("Jue");

        jLabel5.setText("H. Entrada:");

        jLabel6.setText("H. Salida:");

        btnVolver.setText("Volver");
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });

        btnRegistrar.setText("Registrar");
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbbEmpleados, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGap(99, 99, 99)
                                .addComponent(btnRegistrar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnVolver, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addGap(18, 18, 18)
                                        .addComponent(cbxLun)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(cbxMar))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel5)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(TF_HE, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(cbxMie)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(cbxJue))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGap(39, 39, 39)
                                        .addComponent(jLabel6)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(cbxVie, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(TF_HS))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbxSab)))
                .addContainerGap(21, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(49, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(cbbEmpleados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(cbxLun)
                    .addComponent(cbxMar)
                    .addComponent(cbxMie)
                    .addComponent(cbxJue)
                    .addComponent(cbxVie)
                    .addComponent(cbxSab))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(TF_HS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TF_HE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnVolver, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        MenuPrincipal menu  =  new MenuPrincipal(0,0,empleados,cola,null,null, horario,asignados,null); 
        menu.setVisible(true);
        this.setVisible(false);  
    }//GEN-LAST:event_btnVolverActionPerformed

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed
        String seleccionadoEmpleado = cbbEmpleados.getSelectedItem().toString();
        
         int check=0;
        String dias="";
        
        if(cbxLun.isSelected()){
            check++;
            dias+="Lu, ";
        }
        if(cbxMar.isSelected()){
            check++;
            dias+="Ma, ";
        }
        if(cbxMie.isSelected()){
            check++;
            dias+="Mi, ";
        }
        if(cbxJue.isSelected()){
            check++;
            dias+="Ju, ";
        }
        if(cbxVie.isSelected()){
            check++;
            dias+="Vi, ";
        }
        if(cbxSab.isSelected()){
            check++;
            dias+="Sa, ";
        }
         dias = dias.substring(0, dias.length()-2);
        String HoraEntrada = TF_HE.getText();
        String HoraSalida = TF_HS.getText();
         Object item = cbbEmpleados.getSelectedItem();
         int ID_EMPLEADO = 0;
         String NOMBRE_EMPLEADO;
         
        for(Empleados empleado: empleados){
            if(empleado!=null){
                if(empleado.Nombre_Empleado.equals(seleccionadoEmpleado)){
                   ID_EMPLEADO =  empleado.ID_EMPLEADO;
                   NOMBRE_EMPLEADO = empleado.Nombre_Empleado;
                      
            }
            }else{
                break;
            }
            
               
        HorariosAsignados obj = new HorariosAsignados(ID_EMPLEADO,seleccionadoEmpleado,dias,HoraEntrada,HoraSalida);
        if(asignados.length==0){
                asignados[0] = obj;
            }else{
                for(int i=0;i<asignados.length;i++){
                    if(asignados[i] == null){
                        asignados[i] = obj;
                        i=asignados.length;
                    }
                }
            }//else
        }
    }//GEN-LAST:event_btnRegistrarActionPerformed

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
            java.util.logging.Logger.getLogger(RegistrarHorario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegistrarHorario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegistrarHorario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegistrarHorario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegistrarHorario(null,null,null,null).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField TF_HE;
    private javax.swing.JTextField TF_HS;
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JButton btnVolver;
    private javax.swing.JComboBox<String> cbbEmpleados;
    private javax.swing.JCheckBox cbxJue;
    private javax.swing.JCheckBox cbxLun;
    private javax.swing.JCheckBox cbxMar;
    private javax.swing.JCheckBox cbxMie;
    private javax.swing.JCheckBox cbxSab;
    private javax.swing.JCheckBox cbxVie;
    private javax.swing.ButtonGroup grupoRegistrarHorario;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    // End of variables declaration//GEN-END:variables
}
