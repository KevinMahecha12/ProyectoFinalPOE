package proyectofinalsupermercado;

public class MenuPrincipal extends javax.swing.JFrame {
private int cont;
Cola cola_inventario = new Cola();
String NombreRecibido;
Empleados[] empleados = new Empleados[20];
public MenuPrincipal(int Contador,Empleados[] emp,Cola COLA_INVENTARIO,String Nombre_Administrador, String Hora) {
        initComponents();
        
        cola_inventario  = COLA_INVENTARIO;
        cont = Contador;
        NombreRecibido = Nombre_Administrador;
        JL_NombreAdmin.setText("Bienvenido: " + NombreRecibido);
        System.out.println("Nombre que se recibio" + NombreRecibido);
         
        if(emp!=null){
           System.out.println("INFO DE EMPLEADOS: "+emp[0]);
            empleados = emp;
        }
        

       

    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        JL_NombreAdmin = new javax.swing.JLabel();
        JL_Hora = new javax.swing.JLabel();
        JL_TRegistrados = new javax.swing.JLabel();
        JL_PInventario = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        JMI_REMPLEADOS = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Menu principal");

        JL_NombreAdmin.setFont(new java.awt.Font("sansserif", 1, 24)); // NOI18N
        JL_NombreAdmin.setText("Bienvenido: ");

        JL_Hora.setText("Hora actual: ");

        JL_TRegistrados.setText("Trabajadores registrados: ");

        JL_PInventario.setText("Productos en el inventario: ");

        jButton1.setText("Salir");

        jMenu1.setText("Empleados");

        JMI_REMPLEADOS.setText("Registrar Empleados");
        JMI_REMPLEADOS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JMI_REMPLEADOSActionPerformed(evt);
            }
        });
        jMenu1.add(JMI_REMPLEADOS);

        jMenuItem2.setText("Gestión de empleados");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Horarios");

        jMenuItem3.setText("Registrar Horario");
        jMenu2.add(jMenuItem3);

        jMenuItem4.setText("Gestión de horarios");
        jMenu2.add(jMenuItem4);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Inventario");

        jMenuItem5.setText("Registrar Inventario");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem5);

        jMenuItem6.setText("Gestión de Inventarios");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem6);

        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(JL_TRegistrados)
                    .addComponent(JL_PInventario)
                    .addComponent(jButton1)
                    .addComponent(JL_Hora)
                    .addComponent(JL_NombreAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 349, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(118, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(JL_NombreAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JL_Hora)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JL_TRegistrados)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JL_PInventario)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1)
                .addContainerGap(105, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void JMI_REMPLEADOSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JMI_REMPLEADOSActionPerformed
        RegistrarEmpleados REGM  =  new  RegistrarEmpleados(empleados); 
        REGM.setVisible(true);
         this.setVisible(false);     
    }//GEN-LAST:event_JMI_REMPLEADOSActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
       GestionEmpleados REGINV  =  new  GestionEmpleados(empleados); 
       REGINV.setVisible(true);
        this.setVisible(false);     
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
      GestionProductos GPROD =  new  GestionProductos(cont,cola_inventario); 
        GPROD.setVisible(true);
        this.setVisible(false);     
    }//GEN-LAST:event_jMenuItem6ActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
       RegistrarInventario REGINV  =  new  RegistrarInventario(); 
        REGINV.setVisible(true);
        this.setVisible(false);     
    }//GEN-LAST:event_jMenuItem5ActionPerformed


    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                 new MenuPrincipal(0,null,null,null,null).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel JL_Hora;
    private javax.swing.JLabel JL_NombreAdmin;
    private javax.swing.JLabel JL_PInventario;
    private javax.swing.JLabel JL_TRegistrados;
    private javax.swing.JMenuItem JMI_REMPLEADOS;
    private javax.swing.JButton jButton1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    // End of variables declaration//GEN-END:variables
}




