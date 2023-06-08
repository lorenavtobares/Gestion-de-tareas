package Vistas;

public class ABMProyectos extends javax.swing.JInternalFrame {


    public ABMProyectos() {
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        contenedorPrincipal = new javax.swing.JTabbedPane();
        altaDeProyecto = new javax.swing.JPanel();
        altaNombre = new javax.swing.JTextField();
        altaFechaInicio = new com.toedter.calendar.JDateChooser();
        jScrollPane1 = new javax.swing.JScrollPane();
        altaDescripcion = new javax.swing.JTextArea();
        btnCrearProyecto = new javax.swing.JButton();
        bajaDeProyecto = new javax.swing.JPanel();
        updateCrearProyecto1 = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox<>();
        actualizacionDeProyecto = new javax.swing.JPanel();
        updateFechaInicio = new com.toedter.calendar.JDateChooser();
        jScrollPane2 = new javax.swing.JScrollPane();
        updateDescripcion = new javax.swing.JTextArea();
        updateCrearProyecto = new javax.swing.JButton();
        jComboBox2 = new javax.swing.JComboBox<>();
        jButton3 = new javax.swing.JButton();

        contenedorPrincipal.setPreferredSize(new java.awt.Dimension(800, 450));

        altaDeProyecto.setPreferredSize(new java.awt.Dimension(800, 450));

        altaNombre.setBorder(javax.swing.BorderFactory.createTitledBorder("NOMBRE"));

        altaFechaInicio.setBorder(javax.swing.BorderFactory.createTitledBorder("FECHA DE INICIO"));

        altaDescripcion.setColumns(20);
        altaDescripcion.setRows(5);
        altaDescripcion.setBorder(javax.swing.BorderFactory.createTitledBorder("DESCRIPCION"));
        jScrollPane1.setViewportView(altaDescripcion);

        btnCrearProyecto.setText("Crear Proyecto");

        javax.swing.GroupLayout altaDeProyectoLayout = new javax.swing.GroupLayout(altaDeProyecto);
        altaDeProyecto.setLayout(altaDeProyectoLayout);
        altaDeProyectoLayout.setHorizontalGroup(
            altaDeProyectoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(altaDeProyectoLayout.createSequentialGroup()
                .addGap(110, 110, 110)
                .addGroup(altaDeProyectoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(altaNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 550, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(altaFechaInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 550, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 550, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCrearProyecto, javax.swing.GroupLayout.PREFERRED_SIZE, 550, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(125, Short.MAX_VALUE))
        );
        altaDeProyectoLayout.setVerticalGroup(
            altaDeProyectoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(altaDeProyectoLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(altaNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(altaFechaInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addComponent(btnCrearProyecto, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(60, Short.MAX_VALUE))
        );

        contenedorPrincipal.addTab("Alta de Proyecto", altaDeProyecto);

        bajaDeProyecto.setPreferredSize(new java.awt.Dimension(800, 450));

        updateCrearProyecto1.setText("Eliminar Proyecto");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBox1.setBorder(javax.swing.BorderFactory.createTitledBorder("PROYECTO"));

        javax.swing.GroupLayout bajaDeProyectoLayout = new javax.swing.GroupLayout(bajaDeProyecto);
        bajaDeProyecto.setLayout(bajaDeProyectoLayout);
        bajaDeProyectoLayout.setHorizontalGroup(
            bajaDeProyectoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bajaDeProyectoLayout.createSequentialGroup()
                .addContainerGap(119, Short.MAX_VALUE)
                .addGroup(bajaDeProyectoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jComboBox1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(updateCrearProyecto1, javax.swing.GroupLayout.PREFERRED_SIZE, 550, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(116, 116, 116))
        );
        bajaDeProyectoLayout.setVerticalGroup(
            bajaDeProyectoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bajaDeProyectoLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(220, 220, 220)
                .addComponent(updateCrearProyecto1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(65, Short.MAX_VALUE))
        );

        contenedorPrincipal.addTab("Baja de Proyecto", bajaDeProyecto);

        actualizacionDeProyecto.setPreferredSize(new java.awt.Dimension(800, 450));

        updateFechaInicio.setBorder(javax.swing.BorderFactory.createTitledBorder("FECHA DE INICIO"));

        updateDescripcion.setColumns(20);
        updateDescripcion.setRows(5);
        updateDescripcion.setBorder(javax.swing.BorderFactory.createTitledBorder("DESCRIPCION"));
        jScrollPane2.setViewportView(updateDescripcion);

        updateCrearProyecto.setText("Actualizar Informacion");

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        jComboBox2.setBorder(javax.swing.BorderFactory.createTitledBorder("PROYECTO"));

        javax.swing.GroupLayout actualizacionDeProyectoLayout = new javax.swing.GroupLayout(actualizacionDeProyecto);
        actualizacionDeProyecto.setLayout(actualizacionDeProyectoLayout);
        actualizacionDeProyectoLayout.setHorizontalGroup(
            actualizacionDeProyectoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(actualizacionDeProyectoLayout.createSequentialGroup()
                .addGap(109, 109, 109)
                .addGroup(actualizacionDeProyectoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jComboBox2, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(updateFechaInicio, javax.swing.GroupLayout.DEFAULT_SIZE, 550, Short.MAX_VALUE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 550, Short.MAX_VALUE)
                    .addComponent(updateCrearProyecto, javax.swing.GroupLayout.DEFAULT_SIZE, 550, Short.MAX_VALUE))
                .addContainerGap(126, Short.MAX_VALUE))
        );
        actualizacionDeProyectoLayout.setVerticalGroup(
            actualizacionDeProyectoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(actualizacionDeProyectoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(updateFechaInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addComponent(updateCrearProyecto, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(62, Short.MAX_VALUE))
        );

        contenedorPrincipal.addTab("Actualizacion de Proyecto", actualizacionDeProyecto);

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/cerrar.png"))); // NOI18N
        jButton3.setBorder(null);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(contenedorPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, 790, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, 37, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(contenedorPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButton3ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel actualizacionDeProyecto;
    private javax.swing.JPanel altaDeProyecto;
    private javax.swing.JTextArea altaDescripcion;
    private com.toedter.calendar.JDateChooser altaFechaInicio;
    private javax.swing.JTextField altaNombre;
    private javax.swing.JPanel bajaDeProyecto;
    private javax.swing.JButton btnCrearProyecto;
    private javax.swing.JTabbedPane contenedorPrincipal;
    private javax.swing.JButton jButton3;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton updateCrearProyecto;
    private javax.swing.JButton updateCrearProyecto1;
    private javax.swing.JTextArea updateDescripcion;
    private com.toedter.calendar.JDateChooser updateFechaInicio;
    // End of variables declaration//GEN-END:variables
}
