package proyectofinalsupermercado;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class RegistrarEmpleados extends javax.swing.JFrame {

    Empleados[] empleados = new Empleados[20];
    int ContadorEmpleados;
    int contInv;
    Cola cola = new Cola();
    Horario[] horario = new Horario[20];
    HorariosAsignados[] asignados = new HorariosAsignados[20];
    String NombreRecibido;
    
    public RegistrarEmpleados(int ContadorInv,int ContadorEmp,Empleados[] emp,Cola COLA_INVENTARIO,String Nombre_Administrador, String Hora, Horario[] h, HorariosAsignados[] a, Producto[] arrayp) {
        ImagenFondo imgf = new ImagenFondo("src/imagenes/Rempleados.jpg");
        this.setContentPane(imgf);
        initComponents();
        BGROUP.add(RB_MATU);
        BGROUP.add(RB_VESP);
        horario=h;
        if(emp!=null){
            empleados = emp;
        }
        if(ContadorEmp!=0){
           ContadorEmpleados = ContadorEmp;
        }
         if(ContadorInv!=0){
            contInv=ContadorInv;
        }
        cola=COLA_INVENTARIO;
        asignados=a;
          if(Nombre_Administrador!=null){
            NombreRecibido=Nombre_Administrador;
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BGROUP = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        TF_ID = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        TF_NOMEMPLEADO = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        JCB_AREATRABAJO = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        RB_MATU = new javax.swing.JRadioButton();
        RB_VESP = new javax.swing.JRadioButton();
        BT_REG = new javax.swing.JButton();
        BT_Volver = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Registrar empleado");

        jLabel1.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Registrar un empleado");

        jLabel2.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 18)); // NOI18N
        jLabel2.setText("Introduzca ID del empleado:");

        TF_ID.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 18)); // NOI18N
        jLabel3.setText("Nombre del empleado:");

        TF_NOMEMPLEADO.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 18)); // NOI18N
        jLabel4.setText("Seleccione la área de trabajo:");

        JCB_AREATRABAJO.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 18)); // NOI18N
        JCB_AREATRABAJO.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Limpieza ( Intendencia )", "Cajero", "Mascotas", "Ropa para bébes", "Comida", "Electrónicos", "Vigilancia ( seguridad ) ", "Bodegas ( manejo mercancía )", "Gerencia ", "Control de inventarios" }));

        jLabel5.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 18)); // NOI18N
        jLabel5.setText("Seleccione el turno del empleado: ");

        RB_MATU.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 18)); // NOI18N
        RB_MATU.setSelected(true);
        RB_MATU.setText("Matutino");

        RB_VESP.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 18)); // NOI18N
        RB_VESP.setText("Vespertino");

        BT_REG.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 18)); // NOI18N
        BT_REG.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/reg_emp.png"))); // NOI18N
        BT_REG.setText("Registrar");
        BT_REG.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BT_REGActionPerformed(evt);
            }
        });

        BT_Volver.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 18)); // NOI18N
        BT_Volver.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/volver.png"))); // NOI18N
        BT_Volver.setText("Volver");
        BT_Volver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BT_VolverActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(BT_REG)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BT_Volver)
                .addGap(226, 226, 226))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addComponent(TF_ID, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(JCB_AREATRABAJO, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(30, 30, 30)
                                .addComponent(TF_NOMEMPLEADO, javax.swing.GroupLayout.PREFERRED_SIZE, 415, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(RB_MATU)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(RB_VESP)))
                        .addGap(0, 65, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(TF_ID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TF_NOMEMPLEADO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(JCB_AREATRABAJO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(RB_MATU)
                    .addComponent(RB_VESP))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BT_REG)
                    .addComponent(BT_Volver, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(11, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void BT_VolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BT_VolverActionPerformed
         MenuPrincipal menu  =  new MenuPrincipal(contInv,ContadorEmpleados,empleados,cola,NombreRecibido,null, horario, asignados,null); 
         System.out.println("TRABAJADORES CONTADOSSS: "+getContadorEmpleados());
         menu.setVisible(true);
          this.setVisible(false);        
    }//GEN-LAST:event_BT_VolverActionPerformed

    private void BT_REGActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BT_REGActionPerformed
        if(TF_NOMEMPLEADO.getText().equals("") || TF_ID.getText().equals("")){
            JOptionPane.showMessageDialog(this,"Por favor, llene todos los campos para continuar","Campos vacios", JOptionPane.ERROR_MESSAGE);
        }else{
             if(!TF_NOMEMPLEADO.getText().matches("^[a-zA-Z]+$")) {
                  JOptionPane.showMessageDialog(this, "Porfavor, ingresa solo letras!","Ingresar solo carácteres", JOptionPane.ERROR_MESSAGE);
           }  else {
                 JOptionPane.showMessageDialog(this,"Se registro el empleado correctamente!","Registro exitoso", JOptionPane.INFORMATION_MESSAGE);
             ContadorEmpleados = ContadorEmpleados + 1;
           setContadorEmpleados(ContadorEmpleados);
            int id = Integer.parseInt(TF_ID.getText());
            String name = TF_NOMEMPLEADO.getText();
            String area = JCB_AREATRABAJO.getSelectedItem().toString();
            int turno;
            if(RB_MATU.isSelected()){
                turno=2;
            }else{
                turno=1;
            }
            
            Empleados obj = new Empleados(id, name, area, turno);
            if(empleados.length==0){
                empleados[0] = obj;
            }else{
                
                for(int i=0;i<empleados.length;i++){
                    if(empleados[i] == null){
                        empleados[i] = obj;
                        i=empleados.length;
                    }
                }
            }
             }
           //else
            
            //for(int i=0;i<empleados.length;i++){ Esto nomas pá checarf que si jala
                //if(empleados[i] == null){
                    //i=empleados.length;
                //}else{
                    //System.out.println(empleados[i].getID_EMPLEADO() + " " + empleados[i].Nombre_Empleado + " " + empleados[i].Area_Trabajador + empleados[i].Turno);
                //}
            //}
            
        }// else     
    }//GEN-LAST:event_BT_REGActionPerformed


    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegistrarEmpleados(0,0,null,null,null,null,null,null,null).setVisible(true);
            }
        });
    }

    public int getContadorEmpleados() {
        return ContadorEmpleados;
    }

    public void setContadorEmpleados(int ContadorEmpleados) {
        this.ContadorEmpleados = ContadorEmpleados;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup BGROUP;
    private javax.swing.JButton BT_REG;
    private javax.swing.JButton BT_Volver;
    private javax.swing.JComboBox<String> JCB_AREATRABAJO;
    private javax.swing.JRadioButton RB_MATU;
    private javax.swing.JRadioButton RB_VESP;
    private javax.swing.JTextField TF_ID;
    private javax.swing.JTextField TF_NOMEMPLEADO;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    // End of variables declaration//GEN-END:variables
}
