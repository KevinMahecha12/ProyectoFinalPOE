package proyectofinalsupermercado;

import java.awt.Color;
import java.awt.Font;
import javax.swing.UIManager;

public class MenuPrincipal extends javax.swing.JFrame {
private  int contInv,contEmp;
Cola cola_inventario = new Cola();
String NombreRecibido;
Empleados[] empleados = new Empleados[20];
Horario[] horario = new Horario[20];
HorariosAsignados[] asignados = new HorariosAsignados[20];
Producto[] productoarray = new Producto[20];
String HoraCaptada;
public MenuPrincipal(int ContadorInv,int ContadorEmp,Empleados[] emp,Cola COLA_INVENTARIO,String Nombre_Administrador, String Hora, Horario[] h, HorariosAsignados[] a, Producto[] arrayp) {
        ImagenFondo imgf = new ImagenFondo("src/imagenes/menu3.jpg");
        this.setContentPane(imgf);
        initComponents();
        System.out.println("TRABAJADORES CONTADOS: "+ContadorEmp);
        System.out.println("INVENTARIOS CONTADOS: "+ContadorInv);
        Font f = new Font("sans-serif", Font.PLAIN, 20);
jMenu1.setFont(new Font(jMenu1.getFont().getFontName(), jMenu1.getFont().getStyle(), 20));
jMenu3.setFont(new Font(jMenu3.getFont().getFontName(), jMenu3.getFont().getStyle(), 20));
jMenu2.setFont(new Font(jMenu2.getFont().getFontName(), jMenu2.getFont().getStyle(), 20));
jMenu1.setFont(new Font(jMenu1.getFont().getFontName(), jMenu1.getFont().getStyle(), 20));
jMenu1.setFont(new Font(jMenu1.getFont().getFontName(), jMenu1.getFont().getStyle(), 20));
jMenu1.setFont(new Font(jMenu1.getFont().getFontName(), jMenu1.getFont().getStyle(), 20));
jMenuBar1.setBackground (new java.awt.Color(0,99,177));
        if(COLA_INVENTARIO!=null){
            cola_inventario  = COLA_INVENTARIO;
        }
        if(h!=null){
            horario=h;
        }
        
        if(a!=null){
            asignados=a;
        }
        if(arrayp!=null){
            productoarray=arrayp;
        }
     if(emp!=null){
            empleados = emp;
        }
         if(Hora!=null){
            HoraCaptada = Hora;
            HORA_INGRESO.setText(HoraCaptada);
        }
         if(ContadorEmp!=0){
            contEmp=ContadorEmp;
        }
        if(ContadorInv!=0){
            contInv=ContadorInv;
        }
        NombreRecibido = Nombre_Administrador;
        JL_NombreAdmin.setText("Bienvenido: " + NombreRecibido);
        System.out.println("Nombre que se recibio" + NombreRecibido);
        PRODUCTOS.setText(String.valueOf(contEmp));
        INVENTARIO.setText(String.valueOf(contInv));
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        JL_NombreAdmin = new javax.swing.JLabel();
        JL_Hora = new javax.swing.JLabel();
        JL_TRegistrados = new javax.swing.JLabel();
        JL_PInventario = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        Fecha = new javax.swing.JLabel();
        PRODUCTOS = new javax.swing.JLabel();
        INVENTARIO = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        HORA_INGRESO = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        JMI_REMPLEADOS = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenuItem8 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem9 = new javax.swing.JMenuItem();
        jMenuItem10 = new javax.swing.JMenuItem();
        jMenuItem11 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenuItem12 = new javax.swing.JMenuItem();
        jMenuItem13 = new javax.swing.JMenuItem();
        jMenuItem14 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Menu principal");

        JL_NombreAdmin.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 24)); // NOI18N
        JL_NombreAdmin.setForeground(new java.awt.Color(255, 255, 255));
        JL_NombreAdmin.setText("Bienvenido: ");

        JL_Hora.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 24)); // NOI18N
        JL_Hora.setForeground(new java.awt.Color(255, 255, 255));
        JL_Hora.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Hora_1.png"))); // NOI18N
        JL_Hora.setText("Hora actual: ");

        JL_TRegistrados.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 24)); // NOI18N
        JL_TRegistrados.setForeground(new java.awt.Color(255, 255, 255));
        JL_TRegistrados.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/trabajadores.png"))); // NOI18N
        JL_TRegistrados.setText("Trabajadores registrados: ");

        JL_PInventario.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 24)); // NOI18N
        JL_PInventario.setForeground(new java.awt.Color(255, 255, 255));
        JL_PInventario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/productos.png"))); // NOI18N
        JL_PInventario.setText("Productos en el inventario: ");

        jButton1.setBackground(new java.awt.Color(0, 99, 177));
        jButton1.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 24)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Salir");
        jButton1.setFocusPainted(false);
        jButton1.setRequestFocusEnabled(false);

        Fecha.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fecha_1.png"))); // NOI18N

        PRODUCTOS.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 24)); // NOI18N
        PRODUCTOS.setForeground(new java.awt.Color(255, 255, 255));

        INVENTARIO.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 24)); // NOI18N
        INVENTARIO.setForeground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Se ingresó al sistema a las: ");

        HORA_INGRESO.setFont(new java.awt.Font("Microsoft YaHei UI", 1, 18)); // NOI18N
        HORA_INGRESO.setForeground(new java.awt.Color(255, 255, 255));

        jMenuBar1.setBackground(new java.awt.Color(0, 99, 177));
        jMenuBar1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jMenuBar1.setForeground(new java.awt.Color(204, 51, 0));

        jMenu1.setBackground(new java.awt.Color(102, 102, 255));
        jMenu1.setForeground(new java.awt.Color(255, 255, 255));
        jMenu1.setText("Empleados");

        JMI_REMPLEADOS.setBackground(new java.awt.Color(0, 99, 177));
        JMI_REMPLEADOS.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 18)); // NOI18N
        JMI_REMPLEADOS.setForeground(new java.awt.Color(255, 255, 255));
        JMI_REMPLEADOS.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/reg_emp.png"))); // NOI18N
        JMI_REMPLEADOS.setText("Registrar Empleados");
        JMI_REMPLEADOS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JMI_REMPLEADOSActionPerformed(evt);
            }
        });
        jMenu1.add(JMI_REMPLEADOS);

        jMenuItem2.setBackground(new java.awt.Color(0, 99, 177));
        jMenuItem2.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 18)); // NOI18N
        jMenuItem2.setForeground(new java.awt.Color(255, 255, 255));
        jMenuItem2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/gest.png"))); // NOI18N
        jMenuItem2.setText("Mostrar Empleados");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuItem1.setBackground(new java.awt.Color(0, 99, 177));
        jMenuItem1.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 18)); // NOI18N
        jMenuItem1.setForeground(new java.awt.Color(255, 255, 255));
        jMenuItem1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/modificar_emp.png"))); // NOI18N
        jMenuItem1.setText("Editar empleados");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem7.setBackground(new java.awt.Color(0, 99, 177));
        jMenuItem7.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 18)); // NOI18N
        jMenuItem7.setForeground(new java.awt.Color(255, 255, 255));
        jMenuItem7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/buscar_emp.png"))); // NOI18N
        jMenuItem7.setText("Buscar Empleados");
        jMenu1.add(jMenuItem7);

        jMenuItem8.setBackground(new java.awt.Color(0, 99, 177));
        jMenuItem8.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 18)); // NOI18N
        jMenuItem8.setForeground(new java.awt.Color(255, 255, 255));
        jMenuItem8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Eliminar_emp.png"))); // NOI18N
        jMenuItem8.setText("Eliminar Empleados");
        jMenuItem8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem8ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem8);

        jMenuBar1.add(jMenu1);

        jMenu2.setBackground(new java.awt.Color(0, 99, 177));
        jMenu2.setForeground(new java.awt.Color(255, 255, 255));
        jMenu2.setText("Horarios");

        jMenuItem3.setBackground(new java.awt.Color(0, 99, 177));
        jMenuItem3.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 18)); // NOI18N
        jMenuItem3.setForeground(new java.awt.Color(255, 255, 255));
        jMenuItem3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/RegHorario.png"))); // NOI18N
        jMenuItem3.setText("Registrar Horario");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem3);

        jMenuItem4.setBackground(new java.awt.Color(0, 99, 177));
        jMenuItem4.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 18)); // NOI18N
        jMenuItem4.setForeground(new java.awt.Color(255, 255, 255));
        jMenuItem4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/GestionH.png"))); // NOI18N
        jMenuItem4.setText("Gestión de horarios");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem4);

        jMenuItem9.setBackground(new java.awt.Color(0, 99, 177));
        jMenuItem9.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 18)); // NOI18N
        jMenuItem9.setForeground(new java.awt.Color(255, 255, 255));
        jMenuItem9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Editar_H.png"))); // NOI18N
        jMenuItem9.setText("Editar horario");
        jMenuItem9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem9ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem9);

        jMenuItem10.setBackground(new java.awt.Color(0, 99, 177));
        jMenuItem10.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 18)); // NOI18N
        jMenuItem10.setForeground(new java.awt.Color(255, 255, 255));
        jMenuItem10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/B_Horario.png"))); // NOI18N
        jMenuItem10.setText("Buscar horario");
        jMenu2.add(jMenuItem10);

        jMenuItem11.setBackground(new java.awt.Color(0, 99, 177));
        jMenuItem11.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 18)); // NOI18N
        jMenuItem11.setForeground(new java.awt.Color(255, 255, 255));
        jMenuItem11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Eliminar_Horario.png"))); // NOI18N
        jMenuItem11.setText("Eliminar Horario");
        jMenu2.add(jMenuItem11);

        jMenuBar1.add(jMenu2);

        jMenu3.setBackground(new java.awt.Color(0, 99, 177));
        jMenu3.setForeground(new java.awt.Color(255, 255, 255));
        jMenu3.setText("Inventario");

        jMenuItem5.setBackground(new java.awt.Color(0, 99, 177));
        jMenuItem5.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 18)); // NOI18N
        jMenuItem5.setForeground(new java.awt.Color(255, 255, 255));
        jMenuItem5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Regist_Inv.png"))); // NOI18N
        jMenuItem5.setText("Registrar Inventario");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem5);

        jMenuItem6.setBackground(new java.awt.Color(0, 99, 177));
        jMenuItem6.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 18)); // NOI18N
        jMenuItem6.setForeground(new java.awt.Color(255, 255, 255));
        jMenuItem6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/MostrarInv.png"))); // NOI18N
        jMenuItem6.setText("Mostrar Inventario");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem6);

        jMenuItem12.setBackground(new java.awt.Color(0, 99, 177));
        jMenuItem12.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 18)); // NOI18N
        jMenuItem12.setForeground(new java.awt.Color(255, 255, 255));
        jMenuItem12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/EditarInv.png"))); // NOI18N
        jMenuItem12.setText("Editar inventario");
        jMenuItem12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem12ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem12);

        jMenuItem13.setBackground(new java.awt.Color(0, 99, 177));
        jMenuItem13.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 18)); // NOI18N
        jMenuItem13.setForeground(new java.awt.Color(255, 255, 255));
        jMenuItem13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Busc_Inv.png"))); // NOI18N
        jMenuItem13.setText("Buscar inventario");
        jMenu3.add(jMenuItem13);

        jMenuItem14.setBackground(new java.awt.Color(0, 99, 177));
        jMenuItem14.setFont(new java.awt.Font("Microsoft JhengHei UI", 1, 18)); // NOI18N
        jMenuItem14.setForeground(new java.awt.Color(255, 255, 255));
        jMenuItem14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/delete_inv.png"))); // NOI18N
        jMenuItem14.setText("Eliminar Inventario");
        jMenuItem14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem14ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem14);

        jMenuBar1.add(jMenu3);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(HORA_INGRESO, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(JL_Hora)
                                .addGap(178, 178, 178)
                                .addComponent(Fecha))
                            .addComponent(JL_NombreAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 349, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(JL_PInventario)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(INVENTARIO, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(JL_TRegistrados)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(PRODUCTOS, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(262, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(JL_Hora, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Fecha))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(JL_NombreAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(PRODUCTOS, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(JL_TRegistrados))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(INVENTARIO, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(JL_PInventario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(HORA_INGRESO, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void JMI_REMPLEADOSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JMI_REMPLEADOSActionPerformed
        RegistrarEmpleados REGM  =  new  RegistrarEmpleados(contInv,contEmp,empleados,cola_inventario,NombreRecibido,null,horario,asignados,null); 
        REGM.setVisible(true);
         this.setVisible(false);     
    }//GEN-LAST:event_JMI_REMPLEADOSActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
       GestionEmpleados REGINV  =  new  GestionEmpleados(contInv,contEmp,empleados,cola_inventario,NombreRecibido,null,horario,asignados,null); 
       REGINV.setVisible(true);
        this.setVisible(false);     
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
      GestionProductos GPROD =  new  GestionProductos(contInv,contEmp,empleados,cola_inventario,NombreRecibido,null,horario,asignados,null); 
      GPROD.setVisible(true);
      System.out.println("SE ENVIO A PRODUCTOS: "+contEmp);
        this.setVisible(false);     
    }//GEN-LAST:event_jMenuItem6ActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
       RegistrarInventario REGINV  =  new  RegistrarInventario(contInv,contEmp,empleados,cola_inventario,NombreRecibido,null,horario,asignados,null); 
        REGINV.setVisible(true);
        this.setVisible(false);     
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        RegistrarHorario REGHOR  =  new  RegistrarHorario(contInv,contEmp,empleados,cola_inventario,NombreRecibido,null,horario,asignados,null); 
        REGHOR.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        GestionHorarios REGHOR  =  new GestionHorarios(contInv,contEmp,empleados,cola_inventario,NombreRecibido,null,horario,asignados,null); 
        REGHOR.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
     EditarEmpleados EE = new EditarEmpleados(contInv,contEmp,empleados,cola_inventario,NombreRecibido,null,horario,asignados,null);
     EE.setVisible(true);
     this.setVisible(false);
     
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem9ActionPerformed
     EditarHorarios EH = new EditarHorarios(contInv,contEmp,empleados,cola_inventario,NombreRecibido,null,horario,asignados,null);
     EH.setVisible(true);
     this.setVisible(false);
    }//GEN-LAST:event_jMenuItem9ActionPerformed

    private void jMenuItem12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem12ActionPerformed
     EditarInventario EI = new EditarInventario(contInv,contEmp,empleados,cola_inventario,NombreRecibido,null,horario,asignados,null);
     EI.setVisible(true);
     this.setVisible(false);
    }//GEN-LAST:event_jMenuItem12ActionPerformed

    private void jMenuItem14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem14ActionPerformed
        EliminarProducto eli = new EliminarProducto(contInv,contEmp,empleados,cola_inventario,NombreRecibido,null,horario,asignados,null);
        eli.setVisible(true);
     this.setVisible(false);
    }//GEN-LAST:event_jMenuItem14ActionPerformed

    private void jMenuItem8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem8ActionPerformed
        // TODO add your handling code here:
        EliminarEmpleados REGINV  =  new  EliminarEmpleados (contInv,contEmp,empleados,cola_inventario,NombreRecibido,null,horario,asignados,null); 
       REGINV.setVisible(true);
        this.setVisible(false);   
    }//GEN-LAST:event_jMenuItem8ActionPerformed


    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                 new MenuPrincipal(0,0,null,null,null,null,null,null,null).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Fecha;
    private javax.swing.JLabel HORA_INGRESO;
    private javax.swing.JLabel INVENTARIO;
    private javax.swing.JLabel JL_Hora;
    private javax.swing.JLabel JL_NombreAdmin;
    private javax.swing.JLabel JL_PInventario;
    private javax.swing.JLabel JL_TRegistrados;
    private javax.swing.JMenuItem JMI_REMPLEADOS;
    private javax.swing.JLabel PRODUCTOS;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem10;
    private javax.swing.JMenuItem jMenuItem11;
    private javax.swing.JMenuItem jMenuItem12;
    private javax.swing.JMenuItem jMenuItem13;
    private javax.swing.JMenuItem jMenuItem14;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JMenuItem jMenuItem9;
    // End of variables declaration//GEN-END:variables
}




