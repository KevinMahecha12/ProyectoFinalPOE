/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package proyectofinalsupermercado;

import java.awt.Cursor;
import java.awt.Image;
import java.awt.Point;
import java.awt.Toolkit;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author angel
 */
public class HorarioNuevo extends javax.swing.JFrame {

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

    public HorarioNuevo(int ContadorInv,int ContadorEmp,Empleados[] emp,Cola COLA_INVENTARIO,String Nombre_Administrador, String Hora, Horario[] h, HorariosAsignados[] a, Producto[] arrayp) {
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
        ImagenFondo imgf = new ImagenFondo("src/imagenes/blob.jpg");
        this.setContentPane(imgf);
        initComponents();
       c = tk.createCustomCursor(img.getImage(),new Point(1,1),null);
        c2 = tk.createCustomCursor(cursorseleccion.getImage(),new Point(1,1),null);
        setCursor(c);
        cbbLun.setCursor(c2);
        cbbMar.setCursor(c2);
        cbbMie.setCursor(c2);
        cbbJue.setCursor(c2);
        cbbVie.setCursor(c2);
        cbbSab.setCursor(c2);
        txtCrear.setCursor(c2);  
        txtVolver.setCursor(c2);
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
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jCheckBox4 = new javax.swing.JCheckBox();
        jCheckBox6 = new javax.swing.JCheckBox();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtHoraSalida = new javax.swing.JTextField();
        txtHoraEntrada = new javax.swing.JTextField();
        txtCrear = new javax.swing.JButton();
        txtVolver = new javax.swing.JButton();
        cbbLun = new javax.swing.JCheckBox();
        cbbMie = new javax.swing.JCheckBox();
        cbbMar = new javax.swing.JCheckBox();
        cbbJue = new javax.swing.JCheckBox();
        cbbVie = new javax.swing.JCheckBox();
        cbbSab = new javax.swing.JCheckBox();
        jLabel5 = new javax.swing.JLabel();
        txtNOM = new javax.swing.JTextField();

        jCheckBox4.setText("Lun");

        jCheckBox6.setText("Lun");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Horario Nuevo");
        setIconImage(getIconImage());

        jLabel1.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 102));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Horario Nuevo");

        jLabel2.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 102));
        jLabel2.setText("Nombre ");

        jLabel3.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 102));
        jLabel3.setText("Hora entrada:");

        jLabel4.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 102));
        jLabel4.setText("Hora salida:");

        txtHoraSalida.setFont(new java.awt.Font("Microsoft JhengHei UI", 0, 18)); // NOI18N
        txtHoraSalida.setForeground(new java.awt.Color(0, 0, 102));
        txtHoraSalida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtHoraSalidaActionPerformed(evt);
            }
        });

        txtHoraEntrada.setFont(new java.awt.Font("Microsoft JhengHei UI", 0, 18)); // NOI18N
        txtHoraEntrada.setForeground(new java.awt.Color(0, 0, 102));
        txtHoraEntrada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtHoraEntradaActionPerformed(evt);
            }
        });

        txtCrear.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 24)); // NOI18N
        txtCrear.setForeground(new java.awt.Color(0, 0, 102));
        txtCrear.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/horariopred.png"))); // NOI18N
        txtCrear.setText("Crear");
        txtCrear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCrearActionPerformed(evt);
            }
        });

        txtVolver.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 24)); // NOI18N
        txtVolver.setForeground(new java.awt.Color(0, 0, 102));
        txtVolver.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/volver.png"))); // NOI18N
        txtVolver.setText("Volver");
        txtVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtVolverActionPerformed(evt);
            }
        });

        cbbLun.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 18)); // NOI18N
        cbbLun.setForeground(new java.awt.Color(0, 0, 102));
        cbbLun.setText("Lun");

        cbbMie.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 18)); // NOI18N
        cbbMie.setForeground(new java.awt.Color(0, 0, 102));
        cbbMie.setText("Mie");

        cbbMar.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 18)); // NOI18N
        cbbMar.setForeground(new java.awt.Color(0, 0, 102));
        cbbMar.setText("Mar");

        cbbJue.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 18)); // NOI18N
        cbbJue.setForeground(new java.awt.Color(0, 0, 102));
        cbbJue.setText("Jue");

        cbbVie.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 18)); // NOI18N
        cbbVie.setForeground(new java.awt.Color(0, 0, 102));
        cbbVie.setText("Vie");

        cbbSab.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 18)); // NOI18N
        cbbSab.setForeground(new java.awt.Color(0, 0, 102));
        cbbSab.setText("Sab");

        jLabel5.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 102));
        jLabel5.setText("Dias:");

        txtNOM.setFont(new java.awt.Font("Microsoft JhengHei UI", 0, 18)); // NOI18N
        txtNOM.setForeground(new java.awt.Color(0, 0, 102));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtNOM, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel5)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(cbbLun)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(cbbMar)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(cbbMie)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(cbbJue)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(cbbVie)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(cbbSab))
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtHoraEntrada)
                            .addComponent(txtHoraSalida, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(48, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(txtCrear)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtVolver)
                .addGap(78, 78, 78))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel1)
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNOM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbbLun)
                    .addComponent(cbbMie)
                    .addComponent(cbbMar)
                    .addComponent(cbbJue)
                    .addComponent(cbbVie)
                    .addComponent(cbbSab)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3)
                    .addComponent(txtHoraEntrada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtHoraSalida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCrear)
                    .addComponent(txtVolver))
                .addContainerGap(17, Short.MAX_VALUE))
        );

        setSize(new java.awt.Dimension(496, 358));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
@Override
    public Image getIconImage(){
        Image ValorRetorno = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("imagenes/IconoGlobal1.png"));
        return ValorRetorno;
    }
    private void txtHoraSalidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtHoraSalidaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtHoraSalidaActionPerformed

    private void txtHoraEntradaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtHoraEntradaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtHoraEntradaActionPerformed

    private void txtVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtVolverActionPerformed
        GestionHorarios nvo  =  new GestionHorarios(contInv,contEmp,empleados,cola_inventario,NombreRecibido,HoraCaptada,horarios,asignados,productoarray); 
        nvo.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_txtVolverActionPerformed

    private void txtCrearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCrearActionPerformed
        int check=0;
        String dias="";
        
        if(cbbLun.isSelected()){
            check++;
            dias+="Lu, ";
        }
        if(cbbMar.isSelected()){
            check++;
            dias+="Ma, ";
        }
        if(cbbMie.isSelected()){
            check++;
            dias+="Mi, ";
        }
        if(cbbJue.isSelected()){
            check++;
            dias+="Ju, ";
        }
        if(cbbVie.isSelected()){
            check++;
            dias+="Vi, ";
        }
        if(cbbSab.isSelected()){
            check++;
            dias+="Sa, ";
        }
        if(txtNOM.getText().equals("") || dias.equals("") || txtHoraEntrada.getText().equals("") || txtHoraSalida.getText().equals("") ){
            JOptionPane.showMessageDialog(this,"Por favor, llene todos los campos para continuar","Campos vacios", JOptionPane.ERROR_MESSAGE);
        }else{
            JOptionPane.showMessageDialog(this,"Se ha predefinido un horario correctamente!","Horario creado", JOptionPane.INFORMATION_MESSAGE);
            dias = dias.substring(0, dias.length()-2);
            String entrada = txtHoraEntrada.getText();
            String salida = txtHoraSalida.getText();
            String NombreHorario = txtNOM.getText();
            Horario obj = new Horario(NombreHorario,dias, entrada, salida);
            
            if(horarios.length==0){
            horarios[0] = obj;
            }else{
                for(int i=0;i<horarios.length;i++){
                    if(horarios[i] == null){
                        horarios[i] = obj;
                        i=horarios.length;
                    }
                }
            }//else
        }
    }//GEN-LAST:event_txtCrearActionPerformed

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
            java.util.logging.Logger.getLogger(HorarioNuevo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HorarioNuevo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HorarioNuevo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HorarioNuevo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HorarioNuevo(0,0,null,null,null,null,null,null,null).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox cbbJue;
    private javax.swing.JCheckBox cbbLun;
    private javax.swing.JCheckBox cbbMar;
    private javax.swing.JCheckBox cbbMie;
    private javax.swing.JCheckBox cbbSab;
    private javax.swing.JCheckBox cbbVie;
    private javax.swing.JCheckBox jCheckBox4;
    private javax.swing.JCheckBox jCheckBox6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JButton txtCrear;
    private javax.swing.JTextField txtHoraEntrada;
    private javax.swing.JTextField txtHoraSalida;
    private javax.swing.JTextField txtNOM;
    private javax.swing.JButton txtVolver;
    // End of variables declaration//GEN-END:variables
}
