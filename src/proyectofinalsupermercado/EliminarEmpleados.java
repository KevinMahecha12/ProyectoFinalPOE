/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectofinalsupermercado;

import java.util.Arrays;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author kevin
 */
public class EliminarEmpleados extends javax.swing.JFrame {

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
    DefaultTableModel modelo = new DefaultTableModel();
    Object []  datos = new Object[5];
    
    public EliminarEmpleados(int ContadorInv,int ContadorEmp,Empleados[] emp,Cola COLA_INVENTARIO,String Nombre_Administrador, String Hora, Horario[] h, HorariosAsignados[] a, Producto[] arrayp) {
        if(ContadorEmp!=0){
            contEmp=ContadorEmp;
        }
      
        if(ContadorInv!=0){
            contInv=ContadorInv;
        }
        ImagenFondo imgf = new ImagenFondo("src/imagenes/gestione_1.jpg");
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
        
        String name="";
        
        DefaultListModel modelo = new DefaultListModel();
        
        for(int i=0; i<empleados.length; i++){
            if(empleados[i]==null){
                    i=empleados.length;
                }else{ 
            name=empleados[i].getNombre_Empleado();
           modelo.addElement(name);
            }
        }
        listaE.setModel(modelo);
        
        initComponents();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jbutton_VolverAlMenu1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        listaE = new javax.swing.JList<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton1.setText("Eliminar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jbutton_VolverAlMenu1.setText("Volver");
        jbutton_VolverAlMenu1.setToolTipText("RegresarMenu1");
        jbutton_VolverAlMenu1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbutton_VolverAlMenu1ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Rockwell", 0, 24)); // NOI18N
        jLabel1.setText("Eliminar Empleado");

        jLabel2.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jLabel2.setText("Seleccione el empleado:");

        jScrollPane1.setViewportView(listaE);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jbutton_VolverAlMenu1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 70, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(109, 109, 109))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(79, 79, 79))))))
            .addGroup(layout.createSequentialGroup()
                .addGap(121, 121, 121)
                .addComponent(jLabel2)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jbutton_VolverAlMenu1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addGap(27, 27, 27))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:

        Empleados[] empleCopy = new Empleados[20];

        if (empleados[0] == null) {
            JOptionPane.showMessageDialog(null, "No hay empleados registrados");

        }else{

            String buscador = listaE.getSelectedValue();

            for (int i = 0; i < empleados.length-1; i++) {
                if(buscador.equals(empleados[i].getNombre_Empleado())){
                    empleCopy = new Empleados[empleados.length - 1];
                    for(int index = 0; index < i; index++){
                        empleCopy[index] = empleados[index];
                    }
                    for(int j = i; j < empleados.length - 1; j++){
                        empleCopy[j] = empleados[j+1];
                    }
                    JOptionPane.showMessageDialog(null, "Empleado eliminado");
                    break;
                }
            }
            empleados = Arrays.copyOf(empleCopy, empleCopy.length);

            /*for (int i = 0; i < empleados.length; i++) {

                if(empleados[i]!=null){
                    if (buscador.equals(empleados[i].getNombre_Empleado())) {

                        for(int j=i; j==empleados.length; j++){
                            if(empleados[j]==null){
                                break;
                            }else{
                                empleados[j]=empleados[j+1];
                                System.out.println(j);
                            }
                        }

                    }
                }else{
                    break;
                }
            } */

        }

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jbutton_VolverAlMenu1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbutton_VolverAlMenu1ActionPerformed
        MenuPrincipal menu  =  new MenuPrincipal(contInv,contEmp,empleados,cola_inventario,NombreRecibido,null, horarios, asignados,null); 
        System.out.println("PRODUCTOS RECIBIO: "+contEmp+" TRABAJADORES!");
       menu.setVisible(true);
       this.setVisible(false);  
    }//GEN-LAST:event_jbutton_VolverAlMenu1ActionPerformed

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
            java.util.logging.Logger.getLogger(EliminarEmpleados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EliminarEmpleados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EliminarEmpleados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EliminarEmpleados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EliminarEmpleados(0,0,null,null,null,null,null,null,null).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbutton_VolverAlMenu1;
    private javax.swing.JList<String> listaE;
    // End of variables declaration//GEN-END:variables
}
