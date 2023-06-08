package Vistas;

public class ABMEquipos extends javax.swing.JInternalFrame {

    public ABMEquipos() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        contenedorPrincipal = new javax.swing.JTabbedPane();
        altaDeEquipos = new javax.swing.JPanel();
        altaNombre = new javax.swing.JTextField();
        altaFecha = new com.toedter.calendar.JDateChooser();
        btnAltaEquipo = new javax.swing.JButton();
        bajaDeEquipos = new javax.swing.JPanel();
        btnActualizarEquipo1 = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox<>();
        actualizacionDeEquipos = new javax.swing.JPanel();
        ActualizarNombre = new javax.swing.JTextField();
        actualizarFecha = new com.toedter.calendar.JDateChooser();
        btnActualizarEquipo = new javax.swing.JButton();
        btnCerrar = new javax.swing.JButton();

        altaNombre.setBorder(javax.swing.BorderFactory.createTitledBorder("NOMBRE"));

        altaFecha.setBorder(javax.swing.BorderFactory.createTitledBorder("FECHA DE CREACION"));

        btnAltaEquipo.setText("Crear Equipo");

        javax.swing.GroupLayout altaDeEquiposLayout = new javax.swing.GroupLayout(altaDeEquipos);
        altaDeEquipos.setLayout(altaDeEquiposLayout);
        altaDeEquiposLayout.setHorizontalGroup(
            altaDeEquiposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(altaDeEquiposLayout.createSequentialGroup()
                .addGap(113, 113, 113)
                .addGroup(altaDeEquiposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(altaFecha, javax.swing.GroupLayout.DEFAULT_SIZE, 550, Short.MAX_VALUE)
                    .addComponent(altaNombre, javax.swing.GroupLayout.DEFAULT_SIZE, 550, Short.MAX_VALUE)
                    .addComponent(btnAltaEquipo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(122, Short.MAX_VALUE))
        );
        altaDeEquiposLayout.setVerticalGroup(
            altaDeEquiposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(altaDeEquiposLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(altaNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(altaFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(90, 90, 90)
                .addComponent(btnAltaEquipo, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(39, Short.MAX_VALUE))
        );

        contenedorPrincipal.addTab("Alta de Equipos", altaDeEquipos);

        btnActualizarEquipo1.setText("Eliminar Equipo");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBox1.setBorder(javax.swing.BorderFactory.createTitledBorder("EQUIPO"));

        javax.swing.GroupLayout bajaDeEquiposLayout = new javax.swing.GroupLayout(bajaDeEquipos);
        bajaDeEquipos.setLayout(bajaDeEquiposLayout);
        bajaDeEquiposLayout.setHorizontalGroup(
            bajaDeEquiposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bajaDeEquiposLayout.createSequentialGroup()
                .addGap(117, 117, 117)
                .addGroup(bajaDeEquiposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jComboBox1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnActualizarEquipo1, javax.swing.GroupLayout.DEFAULT_SIZE, 550, Short.MAX_VALUE))
                .addContainerGap(118, Short.MAX_VALUE))
        );
        bajaDeEquiposLayout.setVerticalGroup(
            bajaDeEquiposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bajaDeEquiposLayout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(136, 136, 136)
                .addComponent(btnActualizarEquipo1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(67, Short.MAX_VALUE))
        );

        contenedorPrincipal.addTab("Baja de Equipos", bajaDeEquipos);

        ActualizarNombre.setBorder(javax.swing.BorderFactory.createTitledBorder("NOMBRE"));

        actualizarFecha.setBorder(javax.swing.BorderFactory.createTitledBorder("FECHA DE CREACION"));

        btnActualizarEquipo.setText("Actualizar Informacion");

        javax.swing.GroupLayout actualizacionDeEquiposLayout = new javax.swing.GroupLayout(actualizacionDeEquipos);
        actualizacionDeEquipos.setLayout(actualizacionDeEquiposLayout);
        actualizacionDeEquiposLayout.setHorizontalGroup(
            actualizacionDeEquiposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(actualizacionDeEquiposLayout.createSequentialGroup()
                .addGap(113, 113, 113)
                .addGroup(actualizacionDeEquiposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(actualizarFecha, javax.swing.GroupLayout.DEFAULT_SIZE, 550, Short.MAX_VALUE)
                    .addComponent(ActualizarNombre, javax.swing.GroupLayout.DEFAULT_SIZE, 550, Short.MAX_VALUE)
                    .addComponent(btnActualizarEquipo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(122, Short.MAX_VALUE))
        );
        actualizacionDeEquiposLayout.setVerticalGroup(
            actualizacionDeEquiposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(actualizacionDeEquiposLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(ActualizarNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(actualizarFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(90, 90, 90)
                .addComponent(btnActualizarEquipo, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(39, Short.MAX_VALUE))
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


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField ActualizarNombre;
    private javax.swing.JPanel actualizacionDeEquipos;
    private com.toedter.calendar.JDateChooser actualizarFecha;
    private javax.swing.JPanel altaDeEquipos;
    private com.toedter.calendar.JDateChooser altaFecha;
    private javax.swing.JTextField altaNombre;
    private javax.swing.JPanel bajaDeEquipos;
    private javax.swing.JButton btnActualizarEquipo;
    private javax.swing.JButton btnActualizarEquipo1;
    private javax.swing.JButton btnAltaEquipo;
    private javax.swing.JButton btnCerrar;
    private javax.swing.JTabbedPane contenedorPrincipal;
    private javax.swing.JComboBox<String> jComboBox1;
    // End of variables declaration//GEN-END:variables
}
