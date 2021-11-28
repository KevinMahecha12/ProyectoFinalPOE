package proyectofinalsupermercado;

import java.awt.Cursor;
import java.awt.Image;
import java.awt.Point;
import java.awt.Toolkit;
import java.util.Arrays;
import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

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
          ImageIcon img = new ImageIcon("src/imagenes/cursor.png");
      ImageIcon cursorseleccion = new ImageIcon("src/imagenes/cursor2.png");
    Cursor c,c2;
        Toolkit tk = Toolkit.getDefaultToolkit();
        String HoraCaptada;
    public EliminarEmpleados(int ContadorInv,int ContadorEmp,Empleados[] emp,Cola COLA_INVENTARIO,String Nombre_Administrador, String Hora, Horario[] h, HorariosAsignados[] a, Producto[] arrayp) {
        ImagenFondo imgf = new ImagenFondo("src/imagenes/gestione_1.jpg");
        this.setContentPane(imgf);
        initComponents();
           c = tk.createCustomCursor(img.getImage(),new Point(1,1),null);
        c2 = tk.createCustomCursor(cursorseleccion.getImage(),new Point(1,1),null);
        setCursor(c);
        jButton1.setCursor(c2);
        jbutton_VolverAlMenu1.setCursor(c2);
            if(ContadorEmp!=0){
            contEmp=ContadorEmp;
        }
        if(ContadorInv!=0){
            contInv=ContadorInv;
        }
           if(Hora!=null){
            HoraCaptada=Hora;
        }
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
        
    }
    @Override
    public Image getIconImage(){
        Image ValorRetorno = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("imagenes/IconoGlobal1.png"));
        return ValorRetorno;
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jbutton_VolverAlMenu1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txt = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        listaE = new javax.swing.JList<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Eliminar empleado");
        setIconImage(getIconImage());

        jButton1.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 0, 102));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Eliminar_emp.png"))); // NOI18N
        jButton1.setText("Eliminar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jbutton_VolverAlMenu1.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 18)); // NOI18N
        jbutton_VolverAlMenu1.setForeground(new java.awt.Color(0, 0, 102));
        jbutton_VolverAlMenu1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/volver.png"))); // NOI18N
        jbutton_VolverAlMenu1.setText("Volver");
        jbutton_VolverAlMenu1.setToolTipText("RegresarMenu1");
        jbutton_VolverAlMenu1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbutton_VolverAlMenu1ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 102));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Eliminar Empleado");

        jLabel2.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 102));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Seleccione el empleado:");

        listaE.setFont(new java.awt.Font("Microsoft JhengHei UI", 0, 18)); // NOI18N
        listaE.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                listaEMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(listaE);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(txt)
                .addGap(222, 222, 222))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 411, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(112, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jbutton_VolverAlMenu1)
                .addGap(106, 106, 106))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbutton_VolverAlMenu1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(txt)
                .addGap(27, 27, 27))
        );

        setSize(new java.awt.Dimension(526, 367));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
            if (listaE.isSelectionEmpty()){
             JOptionPane.showMessageDialog(this, "No hay empleados registrados o no se ha selecciando uno!", "No hay empleado o no ha seleccionado uno", JOptionPane.ERROR_MESSAGE);
        } else {
                  Empleados[] empleCopy = new Empleados[20];
        
         if (empleados[0] == null) {
            JOptionPane.showMessageDialog(null, "No hay empleados registrados","No hay empleados registrados!",JOptionPane.INFORMATION_MESSAGE);
                        
        }else{
             
        String buscador = listaE.getSelectedValue().toString();
                        for (int i = 0; i < empleados.length-1; i++) {
            if(buscador.equals(empleados[i].getNombre_Empleado())){
                empleCopy = new Empleados[empleados.length - 1];
                for(int index = 0; index < i; index++){
                    empleCopy[index] = empleados[index];
                }
                for(int j = i; j < empleados.length - 1; j++){
                    empleCopy[j] = empleados[j+1];
                }
                 contEmp--;
                JOptionPane.showMessageDialog(null, "Empleado eliminado");
                break;
            }
        }
                        empleados = Arrays.copyOf(empleCopy, empleCopy.length);
              }
    }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jbutton_VolverAlMenu1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbutton_VolverAlMenu1ActionPerformed
       MenuPrincipal menu  =  new MenuPrincipal(contInv,contEmp,empleados,cola_inventario,NombreRecibido,HoraCaptada,horarios,asignados,productoarray); 
        System.out.println("PRODUCTOS RECIBIO: "+contEmp+" TRABAJADORES!");
       menu.setVisible(true);
       this.setVisible(false); 
    }//GEN-LAST:event_jbutton_VolverAlMenu1ActionPerformed

    private void listaEMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listaEMouseClicked
    
    }//GEN-LAST:event_listaEMouseClicked

    public static void main(String args[]) {
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
    private javax.swing.JLabel txt;
    // End of variables declaration//GEN-END:variables
}
