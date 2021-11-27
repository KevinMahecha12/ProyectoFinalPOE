//CAMBIO
package proyectofinalsupermercado;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author kevin
 */
public class GestionEmpleados extends javax.swing.JFrame {
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
    
    public GestionEmpleados(int ContadorInv,int ContadorEmp,Empleados[] emp,Cola COLA_INVENTARIO,String Nombre_Administrador, String Hora, Horario[] h, HorariosAsignados[] a, Producto[] arrayp) {
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
         String[] cabecera ={"ID_Empleado","Nombre","Area de Trabajo","Turno"};
        Object []  datos = new Object[4];
         modelo.setColumnIdentifiers(cabecera);
        System.out.println("empleados contados: "+contEmp);
       
        if (contEmp<1) {
            JL_ERROR.setText("No hay ningun empleado registrado!");
        }
            for( int i=0; i<empleados.length;i++){
                if(empleados[i]==null){
                    i=empleados.length;
                }else{    
                    datos[0]=empleados[i].getID_EMPLEADO();
                    datos[1]=empleados[i].getNombre_Empleado();
                    datos[2]=empleados[i].getArea_Trabajador();
                    if (empleados[i].getTurno() == 1) {
                        datos[3]="Vespertino";

                    }
                    if (empleados[i].getTurno() == 2) {
                        datos[3]="Matutino";

                    }
                    modelo.addRow(datos);
                }
        }
             jtableEmpleadosRegistrados.setModel(modelo);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jtableEmpleadosRegistrados = new javax.swing.JTable();
        jbutton_VolverAlMenu1 = new javax.swing.JButton();
        jlabelEmpleadosRegistrados = new javax.swing.JLabel();
        JL_ERROR = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jtableEmpleadosRegistrados.setBackground(new java.awt.Color(102, 153, 255));
        jtableEmpleadosRegistrados.setFont(new java.awt.Font("Microsoft JhengHei UI", 0, 18)); // NOI18N
        jtableEmpleadosRegistrados.setForeground(new java.awt.Color(255, 255, 255));
        jtableEmpleadosRegistrados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nombre", "Área de trabajo", "Turno"
            }
        ));
        jScrollPane1.setViewportView(jtableEmpleadosRegistrados);

        jbutton_VolverAlMenu1.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 18)); // NOI18N
        jbutton_VolverAlMenu1.setForeground(new java.awt.Color(0, 0, 204));
        jbutton_VolverAlMenu1.setText("Volver");
        jbutton_VolverAlMenu1.setToolTipText("RegresarMenu1");
        jbutton_VolverAlMenu1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbutton_VolverAlMenu1ActionPerformed(evt);
            }
        });

        jlabelEmpleadosRegistrados.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlabelEmpleadosRegistrados.setToolTipText("EmpleadosRegistrados");

        JL_ERROR.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 18)); // NOI18N
        JL_ERROR.setForeground(new java.awt.Color(51, 51, 255));
        JL_ERROR.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jlabelEmpleadosRegistrados, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 962, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(432, 432, 432)
                                .addComponent(jbutton_VolverAlMenu1, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(JL_ERROR, javax.swing.GroupLayout.PREFERRED_SIZE, 426, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(JL_ERROR, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbutton_VolverAlMenu1, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jlabelEmpleadosRegistrados, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        setSize(new java.awt.Dimension(993, 394));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(GestionEmpleados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GestionEmpleados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GestionEmpleados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GestionEmpleados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GestionEmpleados(0,0,null,null,null,null,null,null,null).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel JL_ERROR;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbutton_VolverAlMenu1;
    private javax.swing.JLabel jlabelEmpleadosRegistrados;
    private javax.swing.JTable jtableEmpleadosRegistrados;
    // End of variables declaration//GEN-END:variables
}
