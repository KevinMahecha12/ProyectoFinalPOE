package proyectofinalsupermercado;

import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

public class GestionProductos extends javax.swing.JFrame {
    
     Horario[] horarios = new Horario[20];
    Horario h = new Horario();
     int contEmp;
     int contInv;
     Empleados[] empleados = new Empleados[20];
Empleados empleado = new Empleados();
  Producto[] array;
   Object[] datosx = new Object[5];
Cola cola_inventario = new Cola();
HorariosAsignados[] asignados = new HorariosAsignados[20];
Producto[] productoarray = new Producto[20];
String NombreRecibido;
    DefaultTableModel modelo = new DefaultTableModel();
       Object []  datos = new Object[5];
         
    public GestionProductos(int ContadorInv,int ContadorEmp,Empleados[] emp,Cola COLA_INVENTARIO,String Nombre_Administrador, String Hora, Horario[] h, HorariosAsignados[] a, Producto[] arrayp) {
          if(ContadorEmp!=0){
            contEmp=ContadorEmp;
        }
          System.out.println("INVENTARIOS CONTADOS EN LA CLASE: "+ContadorInv);
        if(ContadorInv!=0){
            contInv=ContadorInv;
        }
        ImagenFondo imgf = new ImagenFondo("src/imagenes/fondoginvt.jpg");
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
         DefaultTableModel modelo = (DefaultTableModel) jTable_MostrarProductos.getModel();
        System.out.println("Elementos en tabla:  "+ modelo.getColumnCount());
        funcionamiento();
    }

    public GestionProductos() {
    }

    public int getContadorProductos() {
        return contInv;
    }

    public void setContadorProductos(int ContadorProductos) {
        this.contInv = ContadorProductos;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable_MostrarProductos = new javax.swing.JTable();
        jLabel_TotalProductos = new javax.swing.JLabel();
        jbutton_VolverAlMenu2 = new javax.swing.JButton();
        JL_ERROR = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTable_MostrarProductos.setBackground(new java.awt.Color(102, 153, 255));
        jTable_MostrarProductos.setFont(new java.awt.Font("Microsoft JhengHei UI", 0, 18)); // NOI18N
        jTable_MostrarProductos.setForeground(new java.awt.Color(255, 255, 255));
        jTable_MostrarProductos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nombre", "Cantidad", "Descripcion", "Precio"
            }
        ));
        jScrollPane1.setViewportView(jTable_MostrarProductos);
        if (jTable_MostrarProductos.getColumnModel().getColumnCount() > 0) {
            jTable_MostrarProductos.getColumnModel().getColumn(0).setPreferredWidth(10);
            jTable_MostrarProductos.getColumnModel().getColumn(3).setPreferredWidth(200);
        }

        jLabel_TotalProductos.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 18)); // NOI18N
        jLabel_TotalProductos.setForeground(new java.awt.Color(0, 0, 102));
        jLabel_TotalProductos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_TotalProductos.setToolTipText("ProductosRegistrados");

        jbutton_VolverAlMenu2.setFont(new java.awt.Font("Microsoft JhengHei UI", 0, 18)); // NOI18N
        jbutton_VolverAlMenu2.setForeground(new java.awt.Color(0, 0, 102));
        jbutton_VolverAlMenu2.setText("Volver");
        jbutton_VolverAlMenu2.setToolTipText("RegresarMenu2");
        jbutton_VolverAlMenu2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbutton_VolverAlMenu2ActionPerformed(evt);
            }
        });

        JL_ERROR.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 18)); // NOI18N
        JL_ERROR.setForeground(new java.awt.Color(0, 0, 102));
        JL_ERROR.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 730, Short.MAX_VALUE)
                    .addComponent(JL_ERROR, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel_TotalProductos, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(293, 293, 293)
                .addComponent(jbutton_VolverAlMenu2, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jbutton_VolverAlMenu2, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JL_ERROR, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel_TotalProductos, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
public void funcionamiento() {
       DefaultTableModel modelo = (DefaultTableModel) jTable_MostrarProductos.getModel();
         System.out.println("SE RECIBIO : "+contInv+" INVENTARIOS!");
         if (contInv<1) {
            JL_ERROR.setText("No hay datos registrados!");
         } 
          array = new Producto[cola_inventario.tamaño];
          System.out.println(array.length);
          array = cola_inventario.recorrer();

         for (int i=0; i<array.length; i++){
           
            datosx[0] = array[i].ID_Producto;
            datosx[1] = array[i].Nombre_producto;
            datosx[2] = array[i].Cant_prod;
            datosx[3] = array[i].Desc_prod;
            datosx[4] = array[i].Precio_Producto;
            modelo.addRow(datosx);
        }
         System.out.println("Existen: "+getContadorProductos());
         jLabel_TotalProductos.setText(String.valueOf("Productos registrados: "+getContadorProductos()));
          
}
    private void jbutton_VolverAlMenu2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbutton_VolverAlMenu2ActionPerformed
        MenuPrincipal menu  =  new MenuPrincipal(contInv,contEmp,empleados,cola_inventario,NombreRecibido,null, horarios, asignados,null); 
         menu.setVisible(true);
          this.setVisible(false);        
    }//GEN-LAST:event_jbutton_VolverAlMenu2ActionPerformed

    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GestionProductos(0,0,null,null,null,null,null,null,null).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel JL_ERROR;
    private javax.swing.JLabel jLabel_TotalProductos;
    private javax.swing.JScrollPane jScrollPane1;
    private static javax.swing.JTable jTable_MostrarProductos;
    private javax.swing.JButton jbutton_VolverAlMenu2;
    // End of variables declaration//GEN-END:variables
}
