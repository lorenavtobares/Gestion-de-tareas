package Vistas;

public class ABMTareas extends javax.swing.JInternalFrame {

    public ABMTareas() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        contenedorPrincipal = new javax.swing.JTabbedPane();
        altaDeTarea = new javax.swing.JPanel();
        altaTareaNombre = new javax.swing.JTextField();
        altaTareaMiembro = new javax.swing.JComboBox<>();
        altaTareaGrupo = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        altaTareaDescripcion = new javax.swing.JTextArea();
        btnAltaTareaGuardar = new javax.swing.JButton();
        bajaDeTarea = new javax.swing.JPanel();
        bajaTareaListaMiembro = new javax.swing.JComboBox<>();
        bajaTareaListraGrupo = new javax.swing.JComboBox<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        bajaTareaDescripcion = new javax.swing.JTextArea();
        btnBajaTarea = new javax.swing.JButton();
        bajaTareaListaTarea = new javax.swing.JComboBox<>();
        jPanel3 = new javax.swing.JPanel();
        btnUpdateTareaActualizar = new javax.swing.JButton();
        updateTareaListaTareas = new javax.swing.JComboBox<>();
        updateTareaListaMiembros = new javax.swing.JComboBox<>();
        updateTareaListaGrupos = new javax.swing.JComboBox<>();
        jScrollPane3 = new javax.swing.JScrollPane();
        updateTareaDescripcionTareas = new javax.swing.JTextArea();
        btnCerrar = new javax.swing.JButton();

        altaTareaNombre.setBorder(javax.swing.BorderFactory.createTitledBorder("NOMBRE"));
        altaTareaNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                altaTareaNombreActionPerformed(evt);
            }
        });

        altaTareaMiembro.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { }));
        altaTareaMiembro.setBorder(javax.swing.BorderFactory.createTitledBorder("MIEMBRO"));
        altaTareaMiembro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                altaTareaMiembroActionPerformed(evt);
            }
        });

        altaTareaGrupo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { }));
        altaTareaGrupo.setBorder(javax.swing.BorderFactory.createTitledBorder("GRUPO DE TRABAJO"));
        altaTareaGrupo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                altaTareaGrupoActionPerformed(evt);
            }
        });

        altaTareaDescripcion.setColumns(20);
        altaTareaDescripcion.setRows(5);
        altaTareaDescripcion.setBorder(javax.swing.BorderFactory.createTitledBorder("DESCRIPCION DE LA TAREA"));
        jScrollPane1.setViewportView(altaTareaDescripcion);

        btnAltaTareaGuardar.setText("Crear Tarea");
        btnAltaTareaGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAltaTareaGuardarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout altaDeTareaLayout = new javax.swing.GroupLayout(altaDeTarea);
        altaDeTarea.setLayout(altaDeTareaLayout);
        altaDeTareaLayout.setHorizontalGroup(
            altaDeTareaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, altaDeTareaLayout.createSequentialGroup()
                .addContainerGap(124, Short.MAX_VALUE)
                .addGroup(altaDeTareaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jScrollPane1)
                    .addComponent(altaTareaNombre, javax.swing.GroupLayout.DEFAULT_SIZE, 550, Short.MAX_VALUE)
                    .addGroup(altaDeTareaLayout.createSequentialGroup()
                        .addComponent(altaTareaMiembro, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(altaTareaGrupo, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnAltaTareaGuardar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(111, 111, 111))
        );
        altaDeTareaLayout.setVerticalGroup(
            altaDeTareaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(altaDeTareaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(altaTareaNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(altaDeTareaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(altaTareaMiembro, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(altaTareaGrupo, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 51, Short.MAX_VALUE)
                .addComponent(btnAltaTareaGuardar)
                .addGap(23, 23, 23))
        );

        contenedorPrincipal.addTab("Alta de Tarea", altaDeTarea);

        bajaTareaListaMiembro.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { }));
        bajaTareaListaMiembro.setBorder(javax.swing.BorderFactory.createTitledBorder("MIEMBRO"));
        bajaTareaListaMiembro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bajaTareaListaMiembroActionPerformed(evt);
            }
        });

        bajaTareaListraGrupo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { }));
        bajaTareaListraGrupo.setBorder(javax.swing.BorderFactory.createTitledBorder("GRUPO DE TRABAJO"));
        bajaTareaListraGrupo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bajaTareaListraGrupoActionPerformed(evt);
            }
        });

        bajaTareaDescripcion.setColumns(20);
        bajaTareaDescripcion.setRows(5);
        bajaTareaDescripcion.setBorder(javax.swing.BorderFactory.createTitledBorder("DESCRIPCION DE LA TAREA"));
        jScrollPane2.setViewportView(bajaTareaDescripcion);

        btnBajaTarea.setText("Eliminar Tarea");
        btnBajaTarea.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBajaTareaActionPerformed(evt);
            }
        });

        bajaTareaListaTarea.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { }));
        bajaTareaListaTarea.setBorder(javax.swing.BorderFactory.createTitledBorder("TAREA"));
        bajaTareaListaTarea.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bajaTareaListaTareaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout bajaDeTareaLayout = new javax.swing.GroupLayout(bajaDeTarea);
        bajaDeTarea.setLayout(bajaDeTareaLayout);
        bajaDeTareaLayout.setHorizontalGroup(
            bajaDeTareaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bajaDeTareaLayout.createSequentialGroup()
                .addContainerGap(124, Short.MAX_VALUE)
                .addGroup(bajaDeTareaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(bajaTareaListaTarea, 0, 550, Short.MAX_VALUE)
                    .addComponent(jScrollPane2)
                    .addGroup(bajaDeTareaLayout.createSequentialGroup()
                        .addComponent(bajaTareaListaMiembro, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                        .addComponent(bajaTareaListraGrupo, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnBajaTarea, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(111, 111, 111))
        );
        bajaDeTareaLayout.setVerticalGroup(
            bajaDeTareaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bajaDeTareaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(bajaTareaListaTarea, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(bajaDeTareaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bajaTareaListaMiembro, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bajaTareaListraGrupo, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                .addComponent(btnBajaTarea)
                .addGap(24, 24, 24))
        );

        contenedorPrincipal.addTab("Baja de Tarea", bajaDeTarea);

        btnUpdateTareaActualizar.setText("Actualizar Tarea");
        btnUpdateTareaActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateTareaActualizarActionPerformed(evt);
            }
        });

        updateTareaListaTareas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { }));
        updateTareaListaTareas.setBorder(javax.swing.BorderFactory.createTitledBorder("TAREA"));
        updateTareaListaTareas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateTareaListaTareasActionPerformed(evt);
            }
        });

        updateTareaListaMiembros.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] {  }));
        updateTareaListaMiembros.setBorder(javax.swing.BorderFactory.createTitledBorder("MIEMBRO"));
        updateTareaListaMiembros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateTareaListaMiembrosActionPerformed(evt);
            }
        });

        updateTareaListaGrupos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { }));
        updateTareaListaGrupos.setBorder(javax.swing.BorderFactory.createTitledBorder("GRUPO DE TRABAJO"));
        updateTareaListaGrupos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateTareaListaGruposActionPerformed(evt);
            }
        });

        updateTareaDescripcionTareas.setColumns(20);
        updateTareaDescripcionTareas.setRows(5);
        updateTareaDescripcionTareas.setBorder(javax.swing.BorderFactory.createTitledBorder("DESCRIPCION DE LA TAREA"));
        jScrollPane3.setViewportView(updateTareaDescripcionTareas);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(124, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(updateTareaListaTareas, 0, 550, Short.MAX_VALUE)
                    .addComponent(jScrollPane3)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(updateTareaListaMiembros, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                        .addComponent(updateTareaListaGrupos, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnUpdateTareaActualizar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(111, 111, 111))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(updateTareaListaTareas, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(updateTareaListaMiembros, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(updateTareaListaGrupos, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                .addComponent(btnUpdateTareaActualizar)
                .addGap(24, 24, 24))
        );

        contenedorPrincipal.addTab("Actualizar Tarea", jPanel3);

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
                .addComponent(btnCerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(btnCerrar, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(contenedorPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 379, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnCerrarActionPerformed

    private void altaTareaNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_altaTareaNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_altaTareaNombreActionPerformed

    private void altaTareaMiembroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_altaTareaMiembroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_altaTareaMiembroActionPerformed

    private void altaTareaGrupoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_altaTareaGrupoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_altaTareaGrupoActionPerformed

    private void btnAltaTareaGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAltaTareaGuardarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAltaTareaGuardarActionPerformed

    private void bajaTareaListaTareaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bajaTareaListaTareaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bajaTareaListaTareaActionPerformed

    private void bajaTareaListaMiembroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bajaTareaListaMiembroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bajaTareaListaMiembroActionPerformed

    private void bajaTareaListraGrupoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bajaTareaListraGrupoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bajaTareaListraGrupoActionPerformed

    private void btnBajaTareaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBajaTareaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnBajaTareaActionPerformed

    private void updateTareaListaTareasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateTareaListaTareasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_updateTareaListaTareasActionPerformed

    private void updateTareaListaMiembrosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateTareaListaMiembrosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_updateTareaListaMiembrosActionPerformed

    private void updateTareaListaGruposActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateTareaListaGruposActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_updateTareaListaGruposActionPerformed

    private void btnUpdateTareaActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateTareaActualizarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnUpdateTareaActualizarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel altaDeTarea;
    private javax.swing.JTextArea altaTareaDescripcion;
    private javax.swing.JComboBox<String> altaTareaGrupo;
    private javax.swing.JComboBox<String> altaTareaMiembro;
    private javax.swing.JTextField altaTareaNombre;
    private javax.swing.JPanel bajaDeTarea;
    private javax.swing.JTextArea bajaTareaDescripcion;
    private javax.swing.JComboBox<String> bajaTareaListaMiembro;
    private javax.swing.JComboBox<String> bajaTareaListaTarea;
    private javax.swing.JComboBox<String> bajaTareaListraGrupo;
    private javax.swing.JButton btnAltaTareaGuardar;
    private javax.swing.JButton btnBajaTarea;
    private javax.swing.JButton btnCerrar;
    private javax.swing.JButton btnUpdateTareaActualizar;
    private javax.swing.JTabbedPane contenedorPrincipal;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextArea updateTareaDescripcionTareas;
    private javax.swing.JComboBox<String> updateTareaListaGrupos;
    private javax.swing.JComboBox<String> updateTareaListaMiembros;
    private javax.swing.JComboBox<String> updateTareaListaTareas;
    // End of variables declaration//GEN-END:variables
}
