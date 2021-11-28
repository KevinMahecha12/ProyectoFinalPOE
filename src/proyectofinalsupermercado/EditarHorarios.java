package proyectofinalsupermercado;

import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.JOptionPane;


public class EditarHorarios extends javax.swing.JFrame {
    
    Horario[] horarios = new Horario[20];
    Horario h = new Horario();
     int contEmp;
     int contInv;
     Empleados[] empleados = new Empleados[20];
Empleados empleado = new Empleados();
Cola cola_inventario = new Cola();
HorariosAsignados[] asignados = new HorariosAsignados[20];
Producto[] productoarray = new Producto[20];
String NombreRecibido;
String HoraCaptada;
    public EditarHorarios(int ContadorInv,int ContadorEmp,Empleados[] emp,Cola COLA_INVENTARIO,String Nombre_Administrador, String Hora, Horario[] h, HorariosAsignados[] a, Producto[] arrayp) {

        if(ContadorEmp!=0){
            contEmp=ContadorEmp;
        }
        if(ContadorInv!=0){
            contInv=ContadorInv;
        }
          if(Nombre_Administrador!=null){
            NombreRecibido=Nombre_Administrador;
        }
         if(Hora!=null){
            HoraCaptada = Hora;
        }
        ImagenFondo imgf = new ImagenFondo("src/imagenes/fondoprueba.jpg");
        this.setContentPane(imgf);
        initComponents();
        
           if(COLA_INVENTARIO!=null){
            cola_inventario  = COLA_INVENTARIO;
        }
        if(h!=null){
            horarios=h;
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
            
        for (Horario horario: horarios) {
            if(horario!=null){
                cbbHorarios.addItem(horario.Nombre_Horario);
            }else{
                break;
            }
        }
    
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        DIAS_T = new javax.swing.JTextField();
        cbbHorarios = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        BTEDITAR = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        HORAE_T = new javax.swing.JTextField();
        HORAS_T = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        NOM_H = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Editar horario");
        setIconImage(getIconImage());

        jLabel3.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 102));
        jLabel3.setText("Dias de trabajo");

        DIAS_T.setFont(new java.awt.Font("Microsoft JhengHei UI", 0, 18)); // NOI18N
        DIAS_T.setForeground(new java.awt.Color(0, 0, 153));

        cbbHorarios.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 18)); // NOI18N
        cbbHorarios.setForeground(new java.awt.Color(0, 0, 153));
        cbbHorarios.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbbHorariosItemStateChanged(evt);
            }
        });
        cbbHorarios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cbbHorariosMouseClicked(evt);
            }
        });
        cbbHorarios.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                cbbHorariosKeyPressed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 24)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 0, 153));
        jButton1.setText("Volver");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        BTEDITAR.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 24)); // NOI18N
        BTEDITAR.setForeground(new java.awt.Color(0, 0, 153));
        BTEDITAR.setText("Editar datos");
        BTEDITAR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTEDITARActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 153));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Seleccione el ID del horario que quiere editar:");

        jLabel6.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 102));
        jLabel6.setText("Hora de entrada");

        jLabel7.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 102));
        jLabel7.setText("Hora de salida");

        HORAE_T.setFont(new java.awt.Font("Microsoft JhengHei UI", 0, 18)); // NOI18N
        HORAE_T.setForeground(new java.awt.Color(0, 0, 153));

        HORAS_T.setFont(new java.awt.Font("Microsoft JhengHei UI", 0, 18)); // NOI18N
        HORAS_T.setForeground(new java.awt.Color(0, 0, 153));
        HORAS_T.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HORAS_TActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 102));
        jLabel8.setText("Nombre");

        NOM_H.setFont(new java.awt.Font("Microsoft JhengHei UI", 0, 18)); // NOI18N
        NOM_H.setForeground(new java.awt.Color(0, 0, 153));
        NOM_H.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NOM_HActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(DIAS_T, javax.swing.GroupLayout.DEFAULT_SIZE, 431, Short.MAX_VALUE)
                            .addComponent(HORAE_T)
                            .addComponent(HORAS_T)
                            .addComponent(NOM_H)))
                    .addComponent(cbbHorarios, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(BTEDITAR)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1)
                .addGap(131, 131, 131))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cbbHorarios, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(NOM_H, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(DIAS_T, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(HORAE_T, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(HORAS_T, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BTEDITAR)
                    .addComponent(jButton1))
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
@Override
    public Image getIconImage(){
        Image ValorRetorno = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("imagenes/IconoGlobal1.png"));
        return ValorRetorno;
    }
    private void cbbHorariosItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbbHorariosItemStateChanged
        String seleccionHorario = cbbHorarios.getSelectedItem().toString();
        for(Horario horario: horarios){
            if(horario!=null){
                if(horario.Nombre_Horario.equals(seleccionHorario)){
                    NOM_H.setText(horario.Nombre_Horario);
                    DIAS_T.setText(horario.Dia);
                    HORAE_T.setText(horario.Hora_Entrada);
                    HORAS_T.setText(horario.Hora_Salida);
                }
            }else{
                break;
            }

        }
    }//GEN-LAST:event_cbbHorariosItemStateChanged

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       MenuPrincipal menu  =  new MenuPrincipal(contInv,contEmp,empleados,cola_inventario,NombreRecibido,HoraCaptada,horarios,asignados,productoarray); 
       menu.setVisible(true);
       this.setVisible(false);  
    }//GEN-LAST:event_jButton1ActionPerformed

    private void BTEDITARActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTEDITARActionPerformed

 if(NOM_H.getText().equals("") || DIAS_T.getText().equals("") || HORAE_T.getText().equals("")|| HORAS_T.getText().equals("")){
             JOptionPane.showMessageDialog(this,"Por favor, llene todos los campos para continuar","Campos vacios", JOptionPane.ERROR_MESSAGE);
        }else{
             JOptionPane.showMessageDialog(this,"Se editó correctamente el horario","Edición completada", JOptionPane.INFORMATION_MESSAGE);
             Horario obj = new Horario(NOM_H.getText(),DIAS_T.getText(),HORAE_T.getText(),HORAS_T.getText());
        int index = cbbHorarios.getSelectedIndex() ;
        horarios[index] = obj;
 }
    }//GEN-LAST:event_BTEDITARActionPerformed

    private void HORAS_TActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HORAS_TActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_HORAS_TActionPerformed

    private void NOM_HActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NOM_HActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NOM_HActionPerformed

    private void cbbHorariosKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cbbHorariosKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbbHorariosKeyPressed

    private void cbbHorariosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cbbHorariosMouseClicked
       
    }//GEN-LAST:event_cbbHorariosMouseClicked

    public static void main(String args[]) {
  
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EditarHorarios(0,0,null,null,null,null,null,null,null).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BTEDITAR;
    private javax.swing.JTextField DIAS_T;
    private javax.swing.JTextField HORAE_T;
    private javax.swing.JTextField HORAS_T;
    private javax.swing.JTextField NOM_H;
    private javax.swing.JComboBox<String> cbbHorarios;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    // End of variables declaration//GEN-END:variables
}
