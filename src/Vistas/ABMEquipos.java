package Vistas;

import java.util.Date;
import javax.swing.JOptionPane;
import Funciones.Funciones;

public class ABMEquipos extends javax.swing.JInternalFrame {

    public ABMEquipos() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        contenedorPrincipal = new javax.swing.JTabbedPane();
        nuevoDeEquipos = new javax.swing.JPanel();
        nuevoNombre = new javax.swing.JTextField();
        nuevoFecha = new com.toedter.calendar.JDateChooser();
        btnNuevoEquipo = new javax.swing.JButton();
        actualizacionDeEquipos = new javax.swing.JPanel();
        ActualizarNombre = new javax.swing.JTextField();
        actualizarFecha = new com.toedter.calendar.JDateChooser();
        btnActualizarEquipo = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jCheckBox1 = new javax.swing.JCheckBox();
        jCheckBox2 = new javax.swing.JCheckBox();
        btnCerrar = new javax.swing.JButton();

        nuevoNombre.setBorder(javax.swing.BorderFactory.createTitledBorder("NOMBRE"));
        nuevoNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                nuevoNombreKeyTyped(evt);
            }
        });

        nuevoFecha.setBorder(javax.swing.BorderFactory.createTitledBorder("FECHA DE CREACION"));

        btnNuevoEquipo.setText("Crear Equipo");

        javax.swing.GroupLayout nuevoDeEquiposLayout = new javax.swing.GroupLayout(nuevoDeEquipos);
        nuevoDeEquipos.setLayout(nuevoDeEquiposLayout);
        nuevoDeEquiposLayout.setHorizontalGroup(
            nuevoDeEquiposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(nuevoDeEquiposLayout.createSequentialGroup()
                .addGap(113, 113, 113)
                .addGroup(nuevoDeEquiposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(nuevoFecha, javax.swing.GroupLayout.DEFAULT_SIZE, 550, Short.MAX_VALUE)
                    .addComponent(nuevoNombre, javax.swing.GroupLayout.DEFAULT_SIZE, 550, Short.MAX_VALUE)
                    .addComponent(btnNuevoEquipo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(122, Short.MAX_VALUE))
        );
        nuevoDeEquiposLayout.setVerticalGroup(
            nuevoDeEquiposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(nuevoDeEquiposLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(nuevoNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(nuevoFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(90, 90, 90)
                .addComponent(btnNuevoEquipo, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(39, Short.MAX_VALUE))
        );

        contenedorPrincipal.addTab("Nuevo Equipo", nuevoDeEquipos);

        ActualizarNombre.setBorder(javax.swing.BorderFactory.createTitledBorder("NOMBRE"));
        ActualizarNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                ActualizarNombreKeyTyped(evt);
            }
        });

        actualizarFecha.setBorder(javax.swing.BorderFactory.createTitledBorder("FECHA DE CREACION"));

        btnActualizarEquipo.setText("Actualizar Informacion");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Estado del equipo"));

        jCheckBox1.setText("Habilitado");

        jCheckBox2.setText("Deshabilitado");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addComponent(jCheckBox1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jCheckBox2)
                .addGap(114, 114, 114))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCheckBox1)
                    .addComponent(jCheckBox2))
                .addContainerGap(13, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout actualizacionDeEquiposLayout = new javax.swing.GroupLayout(actualizacionDeEquipos);
        actualizacionDeEquipos.setLayout(actualizacionDeEquiposLayout);
        actualizacionDeEquiposLayout.setHorizontalGroup(
            actualizacionDeEquiposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(actualizacionDeEquiposLayout.createSequentialGroup()
                .addGap(113, 113, 113)
                .addGroup(actualizacionDeEquiposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(actualizarFecha, javax.swing.GroupLayout.DEFAULT_SIZE, 550, Short.MAX_VALUE)
                    .addComponent(ActualizarNombre, javax.swing.GroupLayout.DEFAULT_SIZE, 550, Short.MAX_VALUE)
                    .addComponent(btnActualizarEquipo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(122, Short.MAX_VALUE))
        );
        actualizacionDeEquiposLayout.setVerticalGroup(
            actualizacionDeEquiposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(actualizacionDeEquiposLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(ActualizarNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(actualizarFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(btnActualizarEquipo, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(27, Short.MAX_VALUE))
        );

        contenedorPrincipal.addTab("Actualizacion de Equipos", actualizacionDeEquipos);

        btnCerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/cerrar.png"))); // NOI18N
        btnCerrar.setBorder(null);
        btnCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(contenedorPrincipal)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnCerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(btnCerrar, javax.swing.GroupLayout.DEFAULT_SIZE, 32, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(contenedorPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 379, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnCerrarActionPerformed

                /* <<-- Validacion de datos -->> */
    
    // Vista 1 - nuevo Equipo -> NOMBRE: Validacion de datos
    private void nuevoNombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nuevoNombreKeyTyped
        Funciones.soloLetras(nuevoNombre, evt, 45);
    }//GEN-LAST:event_nuevoNombreKeyTyped

    // Vista 2 - Actualizacion Equipo -> NOMBRE: Validacion de datos
    private void ActualizarNombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ActualizarNombreKeyTyped
        Funciones.soloLetras(ActualizarNombre, evt, 45);
    }//GEN-LAST:event_ActualizarNombreKeyTyped

                /* <<-- Metodos Extras -->> */
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField ActualizarNombre;
    private javax.swing.JPanel actualizacionDeEquipos;
    private com.toedter.calendar.JDateChooser actualizarFecha;
    private javax.swing.JButton btnActualizarEquipo;
    private javax.swing.JButton btnCerrar;
    private javax.swing.JButton btnNuevoEquipo;
    private javax.swing.JTabbedPane contenedorPrincipal;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel nuevoDeEquipos;
    private com.toedter.calendar.JDateChooser nuevoFecha;
    private javax.swing.JTextField nuevoNombre;
    // End of variables declaration//GEN-END:variables
}
