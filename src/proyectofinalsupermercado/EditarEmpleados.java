package proyectofinalsupermercado;

import javax.swing.table.DefaultTableModel;

public class EditarEmpleados extends javax.swing.JFrame {
    int contEmp;
Empleados[] empleados = new Empleados[20];
Empleados empleado = new Empleados();
    public EditarEmpleados(int ContEmp,Empleados[] emple) {
         empleados = emple;
        initComponents();
         contEmp = ContEmp;
            String[] cabecera ={"ID_Empleado","Nombre","Area de Trabajo","Turno"};

        
       DefaultTableModel modelo = new DefaultTableModel();
        
        modelo.setColumnIdentifiers(cabecera);
        
        Object []  datos = new Object[4];
        System.out.println("empleados contados: "+contEmp);
        for (Empleados empleado : empleados) {
            if(empleado!=null){
                cbbTrabajador.addItem(empleado.Nombre_Empleado);
            }else{
                break;
            }
        }
      
                    
         
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cbbTrabajador = new javax.swing.JComboBox<>();
        BTEDITAR = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        ID_EMP = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        NOM_EMP = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        AREA_EMP = new javax.swing.JTextField();
        TURNO_EMP = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Editar un empleado");

        cbbTrabajador.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbbTrabajadorItemStateChanged(evt);
            }
        });

        BTEDITAR.setText("Editar datos");
        BTEDITAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTEDITARActionPerformed(evt);
            }
        });

        jLabel1.setText("ID");

        jLabel2.setText("Nombre empleado");

        jLabel3.setText("Area:");

        jLabel4.setText("Turno");

        jButton1.setText("Volver");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel5.setText("Seleccione el trabajador que quiere editar:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel5)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ID_EMP, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jButton1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(BTEDITAR))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(NOM_EMP)
                                        .addComponent(AREA_EMP)
                                        .addComponent(TURNO_EMP, javax.swing.GroupLayout.DEFAULT_SIZE, 235, Short.MAX_VALUE))))))
                    .addComponent(cbbTrabajador, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(68, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cbbTrabajador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(ID_EMP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(NOM_EMP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(AREA_EMP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(TURNO_EMP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BTEDITAR)
                    .addComponent(jButton1))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void BTEDITARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTEDITARActionPerformed
        Empleados obj = new Empleados(Integer.parseInt(ID_EMP.getText()),NOM_EMP.getText(), AREA_EMP.getText(), Integer.parseInt(TURNO_EMP.getText()));
         ID_EMP.setText(String.valueOf(empleado.ID_EMPLEADO));
                    NOM_EMP.setText(empleado.Nombre_Empleado);
                    AREA_EMP.setText(empleado.Area_Trabajador);
                    TURNO_EMP.setText(String.valueOf(empleado.Turno));
                    int index = cbbTrabajador.getSelectedIndex() ;           
        empleados[index] = obj;
         
    }//GEN-LAST:event_BTEDITARActionPerformed

    private void cbbTrabajadorItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbbTrabajadorItemStateChanged
       int id=0;
        int turno=0;
        String seleccionadoEmpleado = cbbTrabajador.getSelectedItem().toString();
        
          for(Empleados empleado: empleados){
            if(empleado!=null){
                if(empleado.Nombre_Empleado.equals(seleccionadoEmpleado)){
                    ID_EMP.setText(String.valueOf(empleado.ID_EMPLEADO));
                    NOM_EMP.setText(empleado.Nombre_Empleado);
                    AREA_EMP.setText(empleado.Area_Trabajador);
                    TURNO_EMP.setText(String.valueOf(empleado.Turno));
            }
            }else{
                break;
            }
           
        }
    }//GEN-LAST:event_cbbTrabajadorItemStateChanged

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       MenuPrincipal menu  =  new MenuPrincipal(0,contEmp,empleados,null,null,null, null,null); 
       menu.setVisible(true);
       this.setVisible(false);  
    }//GEN-LAST:event_jButton1ActionPerformed

    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EditarEmpleados(0,null).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField AREA_EMP;
    private javax.swing.JButton BTEDITAR;
    private javax.swing.JTextField ID_EMP;
    private javax.swing.JTextField NOM_EMP;
    private javax.swing.JTextField TURNO_EMP;
    private javax.swing.JComboBox<String> cbbTrabajador;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    // End of variables declaration//GEN-END:variables
}
