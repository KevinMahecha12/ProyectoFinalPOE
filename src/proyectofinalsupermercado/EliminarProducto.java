package proyectofinalsupermercado;

import java.awt.Cursor;
import java.awt.Image;
import java.awt.Point;
import java.awt.Toolkit;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class EliminarProducto extends javax.swing.JFrame {

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
    public EliminarProducto(int ContadorInv,int ContadorEmp,Empleados[] emp,Cola COLA_INVENTARIO,String Nombre_Administrador, String Hora, Horario[] h, HorariosAsignados[] a, Producto[] arrayp) {
        initComponents();
        c = tk.createCustomCursor(img.getImage(),new Point(1,1),null);
        c2 = tk.createCustomCursor(cursorseleccion.getImage(),new Point(1,1),null);
        setCursor(c);
        btnInicio.setCursor(c2);
        btnVolver.setCursor(c2);
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
@Override
    public Image getIconImage(){
        Image ValorRetorno = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("imagenes/IconoGlobal1.png"));
        return ValorRetorno;
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnInicio = new javax.swing.JButton();
        btnVolver = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Eliminar producto");
        setBackground(new java.awt.Color(204, 255, 255));
        setIconImage(getIconImage());

        btnInicio.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 24)); // NOI18N
        btnInicio.setForeground(new java.awt.Color(0, 0, 153));
        btnInicio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/delete_inv.png"))); // NOI18N
        btnInicio.setText("Desencolar al inicio");
        btnInicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInicioActionPerformed(evt);
            }
        });

        btnVolver.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 24)); // NOI18N
        btnVolver.setForeground(new java.awt.Color(0, 0, 153));
        btnVolver.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/volver.png"))); // NOI18N
        btnVolver.setText("Volver");
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnInicio)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnVolver, javax.swing.GroupLayout.DEFAULT_SIZE, 177, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnInicio)
                    .addComponent(btnVolver, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
       MenuPrincipal menu  =  new MenuPrincipal(contInv,contEmp,empleados,cola_inventario,NombreRecibido,HoraCaptada,horarios,asignados,productoarray); 
       menu.setVisible(true);
       this.setVisible(false); 
    }//GEN-LAST:event_btnVolverActionPerformed

    private void btnInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInicioActionPerformed
        if(cola_inventario.esVacio()==null){
            JOptionPane.showMessageDialog(this,"No hay elementos para eliminar","Cola vacia", JOptionPane.WARNING_MESSAGE);
        }else{
            cola_inventario.desencolar();
            contInv--;
            JOptionPane.showMessageDialog(this,"Se ha eliminado el elemento al final de la cola","Elemento eliminado", JOptionPane.WARNING_MESSAGE);
        }
        
    }//GEN-LAST:event_btnInicioActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EliminarProducto(0,0,null,null,null,null,null,null,null).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnInicio;
    private javax.swing.JButton btnVolver;
    // End of variables declaration//GEN-END:variables
}
