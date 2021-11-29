package proyectofinalsupermercado;

import java.awt.Cursor;
import java.awt.Image;
import java.awt.Point;
import java.awt.Toolkit;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class RegistrarHorario extends javax.swing.JFrame {

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
     ImageIcon img = new ImageIcon("src/imagenes/cursor.png");
      ImageIcon cursorseleccion = new ImageIcon("src/imagenes/cursor2.png");
    Cursor c,c2;
        Toolkit tk = Toolkit.getDefaultToolkit();
    public RegistrarHorario(int ContadorInv,int ContadorEmp,Empleados[] emp,Cola COLA_INVENTARIO,String Nombre_Administrador, String Hora, Horario[] h, HorariosAsignados[] a, Producto[] arrayp) {
         empleados = emp;
         contEmp = ContadorEmp;
         System.out.println("TRABAJADORES CONTADOS: "+contEmp);
        if(ContadorEmp!=0){
            contEmp=ContadorEmp;
        }
          if(Nombre_Administrador!=null){
            NombreRecibido=Nombre_Administrador;
        }
         if(Hora!=null){
            HoraCaptada = Hora;
        }
        if(ContadorInv!=0){
            contInv=ContadorInv;
        }
        ImagenFondo imgf = new ImagenFondo("src/imagenes/RHO.jpg");
        this.setContentPane(imgf);
        initComponents();
        c = tk.createCustomCursor(img.getImage(),new Point(1,1),null);
        c2 = tk.createCustomCursor(cursorseleccion.getImage(),new Point(1,1),null);
        setCursor(c);
        cbxLun.setCursor(c2);
        cbxMar.setCursor(c2);
        cbxMie.setCursor(c2);
        cbxJue.setCursor(c2);
        cbxVie.setCursor(c2);
        cbxSab.setCursor(c2);
        btnRegistrar.setCursor(c2);  
        btnVolver.setCursor(c2);
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
        
         for (Empleados empleado : empleados) {
            if(empleado!=null){
                cbbEmpleados.addItem(empleado.Nombre_Empleado);
            }else{
                break;
            }
         }
    }
        
         
        
    @Override
    public Image getIconImage(){
        Image ValorRetorno = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("imagenes/IconoGlobal1.png"));
        return ValorRetorno;
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
        jLabel1 = new javax.swing.JLabel();
        Nom_H = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Registrar Horarios");
        setIconImage(getIconImage());
        addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                formMouseMoved(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 18)); // NOI18N
        jLabel2.setText("Nombre:");

        cbbEmpleados.setFont(new java.awt.Font("Microsoft JhengHei UI", 0, 18)); // NOI18N
        cbbEmpleados.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                cbbEmpleadosMouseMoved(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 18)); // NOI18N
        jLabel4.setText("Dias:");

        cbxLun.setFont(new java.awt.Font("Microsoft JhengHei UI", 0, 18)); // NOI18N
        cbxLun.setText("Lun");

        cbxMar.setFont(new java.awt.Font("Microsoft JhengHei UI", 0, 18)); // NOI18N
        cbxMar.setText("Mar");

        cbxMie.setFont(new java.awt.Font("Microsoft JhengHei UI", 0, 18)); // NOI18N
        cbxMie.setText("Mie");

        cbxSab.setFont(new java.awt.Font("Microsoft JhengHei UI", 0, 18)); // NOI18N
        cbxSab.setText("Sab");

        cbxVie.setFont(new java.awt.Font("Microsoft JhengHei UI", 0, 18)); // NOI18N
        cbxVie.setText("Vie");

        cbxJue.setFont(new java.awt.Font("Microsoft JhengHei UI", 0, 18)); // NOI18N
        cbxJue.setText("Jue");

        jLabel5.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 18)); // NOI18N
        jLabel5.setText("H. Entrada:");

        jLabel6.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 18)); // NOI18N
        jLabel6.setText("H. Salida:");

        TF_HE.setFont(new java.awt.Font("Microsoft JhengHei UI", 0, 18)); // NOI18N

        TF_HS.setFont(new java.awt.Font("Microsoft JhengHei UI", 0, 18)); // NOI18N

        btnVolver.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 18)); // NOI18N
        btnVolver.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/volver.png"))); // NOI18N
        btnVolver.setText("Volver");
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });

        btnRegistrar.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 18)); // NOI18N
        btnRegistrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/RegHorario.png"))); // NOI18N
        btnRegistrar.setText("Registrar");
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 18)); // NOI18N
        jLabel1.setText("Nombre Horario:");

        Nom_H.setFont(new java.awt.Font("Microsoft JhengHei UI", 0, 18)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 24)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Registrar horario");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addComponent(btnRegistrar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnVolver, javax.swing.GroupLayout.DEFAULT_SIZE, 158, Short.MAX_VALUE)
                        .addGap(111, 111, 111))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(18, 18, 18)
                                .addComponent(cbxLun)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cbxMar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cbxMie)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cbxJue)
                                .addGap(12, 12, 12)
                                .addComponent(cbxVie)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cbxSab))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel2))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(cbbEmpleados, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(Nom_H, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(58, 64, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(TF_HE, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(39, 39, 39)
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(TF_HS, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 493, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(16, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbbEmpleados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(Nom_H, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(cbxLun)
                    .addComponent(cbxMar)
                    .addComponent(cbxMie)
                    .addComponent(cbxJue)
                    .addComponent(cbxVie)
                    .addComponent(cbxSab))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(TF_HS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TF_HE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRegistrar)
                    .addComponent(btnVolver))
                .addGap(54, 54, 54))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        MenuPrincipal menu  =  new MenuPrincipal(contInv,contEmp,empleados,cola_inventario,NombreRecibido,HoraCaptada,horario,asignados,productoarray); 
        menu.setVisible(true);
        this.setVisible(false);  
    }//GEN-LAST:event_btnVolverActionPerformed

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed
          int check=0;
        String dias="";
       String Nombre_Horarios;
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
    if (cbbEmpleados.getItemCount() <1) {
            JOptionPane.showMessageDialog(this,"Por favor, llene todos los campos para continuar","Campos vacios", JOptionPane.ERROR_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(this,"Se ha asignado el horario correctamente!", "Horario asignado",JOptionPane.INFORMATION_MESSAGE);
        int id=0;
        int turno=0;
        String seleccionadoEmpleado = cbbEmpleados.getSelectedItem().toString();
        String entrada="";
        String salida="";
        String nom_horario = "";
               for(Empleados empleado: empleados){
            if(empleado!=null){
                if(empleado.Nombre_Empleado.equals(seleccionadoEmpleado)){
                id = empleado.ID_EMPLEADO;
                turno = empleado.Turno;
            }
            }else{
                break;
            }
           
        }//for empleados
                     Nombre_Horarios = Nom_H.getText();
                    entrada = TF_HE.getText();
                    salida = TF_HS.getText();
       
        
        HorariosAsignados obj = new HorariosAsignados(id,seleccionadoEmpleado,Nombre_Horarios,dias,entrada,salida);
        
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

    private void cbbEmpleadosMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cbbEmpleadosMouseMoved
      setCursor(c2);
    }//GEN-LAST:event_cbbEmpleadosMouseMoved

    private void formMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseMoved
           setCursor(c);
    }//GEN-LAST:event_formMouseMoved

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
                new RegistrarHorario(0,0,null,null,null,null,null,null,null).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Nom_H;
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
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    // End of variables declaration//GEN-END:variables
}
