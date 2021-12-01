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

public class EliminarHorarios extends javax.swing.JFrame {
    
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
    public EliminarHorarios(int ContadorInv,int ContadorEmp,Empleados[] emp,Cola COLA_INVENTARIO,String Nombre_Administrador, String Hora, Horario[] h, HorariosAsignados[] a, Producto[] arrayp) {
         ImagenFondo imgf = new ImagenFondo("src/imagenes/gestione_1.jpg");
        this.setContentPane(imgf);
        initComponents();
        c = tk.createCustomCursor(img.getImage(),new Point(1,1),null);
        c2 = tk.createCustomCursor(cursorseleccion.getImage(),new Point(1,1),null);
        setCursor(c);
        BT_E.setCursor(c2);
        BT_V.setCursor(c2);
            if(ContadorEmp!=0){
            contEmp=ContadorEmp;
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
         if(Hora!=null){
            HoraCaptada=Hora;
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
        for(int i=0; i<horarios.length; i++){
            if(horarios[i]==null){
                    i=horarios.length;
                }else{ 
            name=horarios[i].getNombre_Horario();
           modelo.addElement(name);
            }
        }
        listaH.setModel(modelo);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BT_E = new javax.swing.JButton();
        BT_V = new javax.swing.JButton();
        EH = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        listaH = new javax.swing.JList<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Eliminar Horario");
        setIconImage(getIconImage());

        BT_E.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 18)); // NOI18N
        BT_E.setForeground(new java.awt.Color(0, 0, 102));
        BT_E.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Eliminar_Horario.png"))); // NOI18N
        BT_E.setText("Eliminar");
        BT_E.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BT_EActionPerformed(evt);
            }
        });

        BT_V.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 18)); // NOI18N
        BT_V.setForeground(new java.awt.Color(0, 0, 102));
        BT_V.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/volver.png"))); // NOI18N
        BT_V.setText("Volver");
        BT_V.setToolTipText("RegresarMenu1");
        BT_V.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BT_VActionPerformed(evt);
            }
        });

        EH.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 24)); // NOI18N
        EH.setForeground(new java.awt.Color(0, 0, 102));
        EH.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        EH.setText("Eliminar Horarios");

        jLabel2.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 102));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Seleccione el empleado:");

        listaH.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 18)); // NOI18N
        listaH.setForeground(new java.awt.Color(0, 0, 102));
        listaH.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                listaHMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(listaH);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 446, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(17, 17, 17)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 411, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(EH, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BT_E)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(BT_V)
                            .addGap(56, 56, 56)))
                    .addContainerGap(18, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 319, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(8, 8, 8)
                    .addComponent(EH)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jLabel2)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(BT_E, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(BT_V, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addContainerGap(8, Short.MAX_VALUE)))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
@Override
    public Image getIconImage(){
        Image ValorRetorno = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("imagenes/IconoGlobal1.png"));
        return ValorRetorno;
    }
    private void BT_EActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BT_EActionPerformed
        if (listaH.isSelectionEmpty()){
            JOptionPane.showMessageDialog(this, "No hay horarios registrados o no se ha selecciando uno!", "No hay horarios o no ha seleccionado uno", JOptionPane.ERROR_MESSAGE);
        } else {
            Horario[] HorarioCopy = new Horario[20];

            if (horarios[0] == null) {
                JOptionPane.showMessageDialog(null, "No hay horarios registrados","No hay horarios registrados!",JOptionPane.INFORMATION_MESSAGE);

            }else{

                String buscador = listaH.getSelectedValue().toString();
                for (int i = 0; i < horarios.length-1; i++) {
                    if(buscador.equals(horarios[i].getNombre_Horario())){
                        HorarioCopy = new Horario[horarios.length - 1];
                        for(int index = 0; index < i; index++){
                            HorarioCopy[index] = horarios[index];
                        }
                        for(int j = i; j < empleados.length - 1; j++){
                            HorarioCopy[j] = horarios[j+1];
                        }
                        JOptionPane.showMessageDialog(null, "Empleado eliminado");
                        break;
                    }
                }
                horarios = Arrays.copyOf(HorarioCopy, HorarioCopy.length);
            }
        }
    }//GEN-LAST:event_BT_EActionPerformed

    private void BT_VActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BT_VActionPerformed
        MenuPrincipal menu  =  new MenuPrincipal(contInv,contEmp,empleados,cola_inventario,NombreRecibido,HoraCaptada,horarios,asignados,productoarray);
        System.out.println("PRODUCTOS RECIBIO: "+contEmp+" TRABAJADORES!");
        menu.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_BT_VActionPerformed

    private void listaHMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listaHMouseClicked

    }//GEN-LAST:event_listaHMouseClicked

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EliminarHorarios(0,0,null,null,null,null,null,null,null).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BT_E;
    private javax.swing.JButton BT_V;
    private javax.swing.JLabel EH;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JList<String> listaH;
    // End of variables declaration//GEN-END:variables
}
