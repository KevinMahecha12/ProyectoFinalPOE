package proyectofinalsupermercado;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class EditarEmpleados extends javax.swing.JFrame {
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
    public EditarEmpleados(int ContadorInv,int ContadorEmp,Empleados[] emp,Cola COLA_INVENTARIO,String Nombre_Administrador, String Hora, Horario[] h, HorariosAsignados[] a, Producto[] arrayp) {
         ImagenFondo imgf = new ImagenFondo("src/imagenes/imagen90.jpg");
        this.setContentPane(imgf); 
        empleados = emp;
         contEmp = ContadorEmp;
         System.out.println("TRABAJADORES CONTADOS: "+contEmp);
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
        jLabel5 = new javax.swing.JLabel();
        GESTORDIST = new javax.swing.JPanel();
        BTEDITAR = new javax.swing.JButton();
        B_VOLVER = new javax.swing.JButton();
        GESTOR2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        ID_EMP = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        NOM_EMP = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        TURNO_EMP = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        AREA_EMP = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Editar un empleado");

        cbbTrabajador.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 18)); // NOI18N
        cbbTrabajador.setForeground(new java.awt.Color(0, 99, 177));
        cbbTrabajador.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbbTrabajadorItemStateChanged(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 99, 177));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Seleccione el trabajador que quiere editar:");

        GESTORDIST.setLayout(new java.awt.GridLayout(1, 0, 5, 0));

        BTEDITAR.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 18)); // NOI18N
        BTEDITAR.setForeground(new java.awt.Color(0, 99, 177));
        BTEDITAR.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/modificar_emp.png"))); // NOI18N
        BTEDITAR.setText("Editar datos");
        BTEDITAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTEDITARActionPerformed(evt);
            }
        });
        GESTORDIST.add(BTEDITAR);

        B_VOLVER.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 18)); // NOI18N
        B_VOLVER.setForeground(new java.awt.Color(0, 99, 177));
        B_VOLVER.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/volver.png"))); // NOI18N
        B_VOLVER.setText("Volver");
        B_VOLVER.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B_VOLVERActionPerformed(evt);
            }
        });
        GESTORDIST.add(B_VOLVER);

        GESTOR2.setBackground(new java.awt.Color(236, 252, 255));
        GESTOR2.setLayout(new java.awt.GridLayout(4, 1, 15, 30));

        jLabel1.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 99, 177));
        jLabel1.setText("ID:");
        GESTOR2.add(jLabel1);

        ID_EMP.setFont(new java.awt.Font("Microsoft JhengHei UI", 0, 18)); // NOI18N
        ID_EMP.setForeground(new java.awt.Color(0, 99, 177));
        GESTOR2.add(ID_EMP);

        jLabel2.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 99, 177));
        jLabel2.setText("Nombre empleado: ");
        GESTOR2.add(jLabel2);

        NOM_EMP.setFont(new java.awt.Font("Microsoft JhengHei UI", 0, 18)); // NOI18N
        NOM_EMP.setForeground(new java.awt.Color(0, 99, 177));
        GESTOR2.add(NOM_EMP);

        jLabel4.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 99, 177));
        jLabel4.setText("Turno:");
        GESTOR2.add(jLabel4);

        TURNO_EMP.setFont(new java.awt.Font("Microsoft JhengHei UI", 0, 18)); // NOI18N
        TURNO_EMP.setForeground(new java.awt.Color(0, 99, 177));
        GESTOR2.add(TURNO_EMP);

        jLabel3.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 99, 177));
        jLabel3.setText("Area:");
        GESTOR2.add(jLabel3);

        AREA_EMP.setFont(new java.awt.Font("Microsoft JhengHei UI", 0, 18)); // NOI18N
        AREA_EMP.setForeground(new java.awt.Color(0, 99, 177));
        GESTOR2.add(AREA_EMP);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 512, Short.MAX_VALUE)
                    .addComponent(cbbTrabajador, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(GESTOR2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(70, 70, 70))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(GESTORDIST, javax.swing.GroupLayout.PREFERRED_SIZE, 386, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(61, 61, 61))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(cbbTrabajador, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(GESTOR2, javax.swing.GroupLayout.DEFAULT_SIZE, 310, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(GESTORDIST, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void BTEDITARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTEDITARActionPerformed
         
          if(ID_EMP.getText().equals("") || NOM_EMP.getText().equals("") || AREA_EMP.getText().equals("")|| TURNO_EMP.getText().equals("")){
             JOptionPane.showMessageDialog(this,"Por favor, llene todos los campos para continuar","Campos vacios", JOptionPane.ERROR_MESSAGE);
        }else{
              JOptionPane.showMessageDialog(this,"Se editó correctamente el empleado!","Edición completada", JOptionPane.INFORMATION_MESSAGE);
               Empleados obj = new Empleados(Integer.parseInt(ID_EMP.getText()),NOM_EMP.getText(), AREA_EMP.getText(), Integer.parseInt(TURNO_EMP.getText()));
         ID_EMP.setText(String.valueOf(empleado.ID_EMPLEADO));
                    NOM_EMP.setText(empleado.Nombre_Empleado);
                    AREA_EMP.setText(empleado.Area_Trabajador);
                    TURNO_EMP.setText(String.valueOf(empleado.Turno));
                    int index = cbbTrabajador.getSelectedIndex() ;           
        empleados[index] = obj;
          }
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

    private void B_VOLVERActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B_VOLVERActionPerformed
       MenuPrincipal menu  =  new MenuPrincipal(contInv,contEmp,empleados,cola_inventario,NombreRecibido,HoraCaptada,horario,asignados,productoarray); 
       menu.setVisible(true);
       this.setVisible(false);  
    }//GEN-LAST:event_B_VOLVERActionPerformed

    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EditarEmpleados(0,0,null,null,null,null,null,null,null).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField AREA_EMP;
    private javax.swing.JButton BTEDITAR;
    private javax.swing.JButton B_VOLVER;
    private javax.swing.JPanel GESTOR2;
    private javax.swing.JPanel GESTORDIST;
    private javax.swing.JTextField ID_EMP;
    private javax.swing.JTextField NOM_EMP;
    private javax.swing.JTextField TURNO_EMP;
    private javax.swing.JComboBox<String> cbbTrabajador;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    // End of variables declaration//GEN-END:variables
}
