package proyectofinalsupermercado;

import java.awt.Cursor;
import java.awt.Image;
import java.awt.Point;
import java.awt.Toolkit;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class AsignarHorarioTrabajador extends javax.swing.JFrame {

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
        ImageIcon img = new ImageIcon("src/imagenes/cursor.png");
      ImageIcon cursorseleccion = new ImageIcon("src/imagenes/cursor2.png");
    Cursor c,c2;
        Toolkit tk = Toolkit.getDefaultToolkit();
    public AsignarHorarioTrabajador(int ContadorInv,int ContadorEmp,Empleados[] emp,Cola COLA_INVENTARIO,String Nombre_Administrador, String Hora, Horario[] h, HorariosAsignados[] a, Producto[] arrayp) {
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
        ImagenFondo imgf = new ImagenFondo("src/imagenes/blob.jpg");
        this.setContentPane(imgf);
        initComponents();
        c = tk.createCustomCursor(img.getImage(),new Point(1,1),null);
        c2 = tk.createCustomCursor(cursorseleccion.getImage(),new Point(1,1),null);
        setCursor(c);
        jButton1.setCursor(c2);
        txtRegresar.setCursor(c2);
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
        for (Empleados empleado : empleados) {
            if(empleado!=null){
                cbbTrabajador.addItem(empleado.Nombre_Empleado);
            }else{
                break;
            }
        }
        
        for(Horario hora : horarios){
            if(hora!=null){
                cb_hora.addItem(hora.Nombre_Horario);
                
            }else{
                break;
            }
        }
        
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        cbbTrabajador = new javax.swing.JComboBox<>();
        cb_hora = new javax.swing.JComboBox<>();
        jPanel1 = new javax.swing.JPanel();
        txtRegresar = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Asignar Horario Predefinido");
        setIconImage(getIconImage());
        addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                formMouseMoved(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 102));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Asignar Horario a trabajador");

        cbbTrabajador.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 18)); // NOI18N
        cbbTrabajador.setForeground(new java.awt.Color(0, 0, 102));
        cbbTrabajador.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                cbbTrabajadorMouseMoved(evt);
            }
        });
        cbbTrabajador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbbTrabajadorActionPerformed(evt);
            }
        });

        cb_hora.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 18)); // NOI18N
        cb_hora.setForeground(new java.awt.Color(0, 0, 102));
        cb_hora.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                cb_horaMouseMoved(evt);
            }
        });

        jPanel1.setLayout(new java.awt.GridLayout(1, 0));

        txtRegresar.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 24)); // NOI18N
        txtRegresar.setForeground(new java.awt.Color(0, 0, 102));
        txtRegresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/volver.png"))); // NOI18N
        txtRegresar.setText("Regresar");
        txtRegresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRegresarActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 24)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 0, 102));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Asign_Horarios.png"))); // NOI18N
        jButton1.setText("Añadir Horario");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(147, 147, 147)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(64, 64, 64)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtRegresar))
                            .addComponent(cb_hora, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(cbbTrabajador, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(37, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(cbbTrabajador, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(cb_hora, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(txtRegresar))
                .addGap(52, 52, 52))
        );

        setSize(new java.awt.Dimension(555, 339));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtRegresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRegresarActionPerformed
        GestionHorarios nvo  =  new GestionHorarios(contInv,contEmp,empleados,cola_inventario,NombreRecibido,HoraCaptada,horarios,asignados,productoarray); 
        nvo.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_txtRegresarActionPerformed
@Override
    public Image getIconImage(){
        Image ValorRetorno = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("imagenes/IconoGlobal1.png"));
        return ValorRetorno;
    }
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if (cbbTrabajador.getItemCount() <1 || cb_hora.getItemCount() <1) {
            JOptionPane.showMessageDialog(this,"Por favor, llene todos los campos para continuar","Campos vacios", JOptionPane.ERROR_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(this,"Se ha asignado el horario correctamente!", "Horario asignado",JOptionPane.INFORMATION_MESSAGE);
        int id=0;
        int turno=0;
        String seleccionadoEmpleado = cbbTrabajador.getSelectedItem().toString();
        String seleccionadoHorarios = cb_hora.getSelectedItem().toString();
        String dias="";
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
        
        for(Horario hora: horarios){
            if(hora!=null){
                if(hora.Nombre_Horario.equals(seleccionadoHorarios)){
                    dias = hora.Dia;
                    entrada = hora.Hora_Entrada;
                    salida = hora.Hora_Salida;
                }
            }else{
                break;
            }

        }//for empleados
        
        HorariosAsignados obj = new HorariosAsignados(id,seleccionadoEmpleado,seleccionadoHorarios,dias,entrada,salida);
        
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
    }//GEN-LAST:event_jButton1ActionPerformed

    private void cbbTrabajadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbbTrabajadorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbbTrabajadorActionPerformed

    private void cbbTrabajadorMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cbbTrabajadorMouseMoved
      setCursor(c2);
    }//GEN-LAST:event_cbbTrabajadorMouseMoved

    private void cb_horaMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cb_horaMouseMoved
       setCursor(c2);
    }//GEN-LAST:event_cb_horaMouseMoved

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
            java.util.logging.Logger.getLogger(AsignarHorarioTrabajador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AsignarHorarioTrabajador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AsignarHorarioTrabajador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AsignarHorarioTrabajador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AsignarHorarioTrabajador(0,0,null,null,null,null,null,null,null).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cb_hora;
    private javax.swing.JComboBox<String> cbbTrabajador;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton txtRegresar;
    // End of variables declaration//GEN-END:variables
}
