package proyectofinalsupermercado;

import javax.swing.JOptionPane;


public class RegistrarInventario extends javax.swing.JFrame {
    static Cola c = new Cola();
   Horario[] horarios = new Horario[20];
    Horario h = new Horario();
     int contEmp;
     int contInv;
     Empleados[] empleados = new Empleados[20];
Empleados empleado = new Empleados();
HorariosAsignados[] asignados = new HorariosAsignados[20];
Producto[] productoarray = new Producto[20];
Inventario inv = new Inventario();
String NombreRecibido;
String HoraCaptada;
    public RegistrarInventario(int ContadorInv,int ContadorEmp,Empleados[] emp,Cola COLA_INVENTARIO,String Nombre_Administrador, String Hora, Horario[] h, HorariosAsignados[] a, Producto[] arrayp) {
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
              ImagenFondo imgf = new ImagenFondo("src/imagenes/invent.jpg");
        this.setContentPane(imgf); 
          initComponents();
           if(COLA_INVENTARIO!=null){
            c  = COLA_INVENTARIO;
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
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        TF_IDPROD = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        TF_NOMPROD = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        TF_CANTPROD = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TXA_DESPROD = new javax.swing.JTextArea();
        jLabel6 = new javax.swing.JLabel();
        TF_PRECIOPROD = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        BT_AGREGARPROD = new javax.swing.JButton();
        BT_VOLVER = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Registrar productos");

        jLabel1.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 102));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Registrar un producto");

        jLabel2.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 102));
        jLabel2.setText("Ingrese un ID para el producto: ");

        TF_IDPROD.setFont(new java.awt.Font("Microsoft JhengHei UI", 0, 18)); // NOI18N
        TF_IDPROD.setForeground(new java.awt.Color(0, 0, 102));

        jLabel3.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 102));
        jLabel3.setText("Nombre del producto:");

        TF_NOMPROD.setFont(new java.awt.Font("Microsoft JhengHei UI", 0, 18)); // NOI18N
        TF_NOMPROD.setForeground(new java.awt.Color(0, 0, 102));

        jLabel4.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 102));
        jLabel4.setText("Introduzca la cantidad del producto: ");

        TF_CANTPROD.setFont(new java.awt.Font("Microsoft JhengHei UI", 0, 18)); // NOI18N
        TF_CANTPROD.setForeground(new java.awt.Color(0, 0, 102));

        jLabel5.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 102));
        jLabel5.setText("Descripcion del producto:");

        TXA_DESPROD.setColumns(20);
        TXA_DESPROD.setFont(new java.awt.Font("Microsoft JhengHei UI", 0, 18)); // NOI18N
        TXA_DESPROD.setForeground(new java.awt.Color(0, 0, 102));
        TXA_DESPROD.setRows(5);
        jScrollPane1.setViewportView(TXA_DESPROD);

        jLabel6.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 51));
        jLabel6.setText("Ingrese el precio del producto:");

        TF_PRECIOPROD.setFont(new java.awt.Font("Microsoft JhengHei UI", 0, 18)); // NOI18N
        TF_PRECIOPROD.setForeground(new java.awt.Color(0, 0, 102));

        jPanel1.setLayout(new java.awt.GridLayout(1, 0, 15, 0));

        BT_AGREGARPROD.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 18)); // NOI18N
        BT_AGREGARPROD.setForeground(new java.awt.Color(0, 0, 102));
        BT_AGREGARPROD.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Regist_Inv.png"))); // NOI18N
        BT_AGREGARPROD.setText("Agregar producto");
        BT_AGREGARPROD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BT_AGREGARPRODActionPerformed(evt);
            }
        });
        jPanel1.add(BT_AGREGARPROD);

        BT_VOLVER.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 18)); // NOI18N
        BT_VOLVER.setForeground(new java.awt.Color(0, 0, 102));
        BT_VOLVER.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/volver.png"))); // NOI18N
        BT_VOLVER.setText("Volver");
        BT_VOLVER.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BT_VOLVERActionPerformed(evt);
            }
        });
        jPanel1.add(BT_VOLVER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(TF_PRECIOPROD))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(TF_NOMPROD))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(TF_CANTPROD, javax.swing.GroupLayout.DEFAULT_SIZE, 64, Short.MAX_VALUE)
                                    .addComponent(TF_IDPROD)))
                            .addComponent(jLabel5)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 532, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(TF_IDPROD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(TF_CANTPROD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(TF_NOMPROD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(TF_PRECIOPROD, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
  public int getContadorProductos() {
        return contInv;
    }

    public void setContadorProductos(int ContadorProductos) {
        this.contInv = ContadorProductos;
    }
    private void BT_VOLVERActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BT_VOLVERActionPerformed
      
        MenuPrincipal menu  =  new MenuPrincipal(contInv,contEmp,empleados,c,NombreRecibido,HoraCaptada,horarios,asignados,productoarray); 
        menu.setVisible(true);
        this.setVisible(false);         

    }//GEN-LAST:event_BT_VOLVERActionPerformed

    private void BT_AGREGARPRODActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BT_AGREGARPRODActionPerformed
       if(TF_IDPROD.getText().equals("") || TF_CANTPROD.getText().equals("") || TF_NOMPROD.getText().equals("") || TXA_DESPROD.getText().equals("") || TF_PRECIOPROD.getText().equals("")){
             JOptionPane.showMessageDialog(this,"Por favor, llene todos los campos para continuar","Campos vacios", JOptionPane.ERROR_MESSAGE);
       } else {
           JOptionPane.showMessageDialog(this,"Se registro el inventario correctamente!","Registro exitoso", JOptionPane.INFORMATION_MESSAGE);
            contInv = contInv+1;
            setContadorProductos(contInv);
            inv.setID_Producto(Integer.parseInt(TF_IDPROD.getText()));
            inv.setCant_prod(Integer.parseInt(TF_CANTPROD.getText()));
            inv.setNombre_producto(TF_NOMPROD.getText());
            inv.setDesc_prod(TXA_DESPROD.getText());
            inv.setPrecio_Producto(Double.parseDouble(TF_PRECIOPROD.getText()));
            Producto obj = new Producto(inv.getID_Producto(),inv.getCant_prod(),inv.getNombre_producto(),inv.getDesc_prod(),inv.getPrecio_Producto());
            c.push(obj);
       }
    }//GEN-LAST:event_BT_AGREGARPRODActionPerformed

   
   public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegistrarInventario(0,0,null,null,null,null,null,null,null).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BT_AGREGARPROD;
    private javax.swing.JButton BT_VOLVER;
    private javax.swing.JTextField TF_CANTPROD;
    private javax.swing.JTextField TF_IDPROD;
    private javax.swing.JTextField TF_NOMPROD;
    private javax.swing.JTextField TF_PRECIOPROD;
    private javax.swing.JTextArea TXA_DESPROD;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
