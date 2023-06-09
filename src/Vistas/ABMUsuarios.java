package Vistas;

import javax.swing.JOptionPane;

public class ABMUsuarios extends javax.swing.JInternalFrame {

    public ABMUsuarios() {
        initComponents();
        deshabilitarCampos();
    }
    
    //Campos de formularios solo lectura
    public void deshabilitarCampos(){
        altaDni.setEditable(false);
        altaApellido.setEditable(false);
        altaNombre.setEditable(false);
        bajaDni.setEditable(false);
        bajaApellido.setEditable(false);
        bajaNombre.setEditable(false);
    }    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        contenedorPrincipal = new javax.swing.JTabbedPane();
        crearUsuario = new javax.swing.JPanel();
        nuevoNombre = new javax.swing.JTextField();
        nuevoPassword = new javax.swing.JPasswordField();
        btnNuevoUsuario = new javax.swing.JButton();
        nuevoDni = new javax.swing.JTextField();
        nuevoApellido = new javax.swing.JTextField();
        nuevoListaRolUsuarios = new javax.swing.JComboBox<>();
        altaDeUsuario = new javax.swing.JPanel();
        altaNombre = new javax.swing.JTextField();
        btnAltaUsuario = new javax.swing.JButton();
        altaDni = new javax.swing.JTextField();
        altaApellido = new javax.swing.JTextField();
        listaUsuariosDeshabilitados = new javax.swing.JComboBox<>();
        bajaDeUsuario = new javax.swing.JPanel();
        bajaNombre = new javax.swing.JTextField();
        btnBajaUsuario = new javax.swing.JButton();
        bajaDni = new javax.swing.JTextField();
        bajaApellido = new javax.swing.JTextField();
        listaUsuariosActivos = new javax.swing.JComboBox<>();
        actualizacionDeUsuario = new javax.swing.JPanel();
        upNombre = new javax.swing.JTextField();
        upPassword = new javax.swing.JPasswordField();
        btnUpUsuario = new javax.swing.JButton();
        upDni = new javax.swing.JTextField();
        upApeliido = new javax.swing.JTextField();
        listaUpUsuarios = new javax.swing.JComboBox<>();
        listaCrearRolUsuarios1 = new javax.swing.JComboBox<>();
        btnCerrarABMUsuairos = new javax.swing.JButton();

        nuevoNombre.setBorder(javax.swing.BorderFactory.createTitledBorder("NOMBRES"));
        nuevoNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                nuevoNombreKeyTyped(evt);
            }
        });

        nuevoPassword.setBorder(javax.swing.BorderFactory.createTitledBorder("PASSWORD"));
        nuevoPassword.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                nuevoPasswordKeyTyped(evt);
            }
        });

        btnNuevoUsuario.setText("Crear Usuario");
        btnNuevoUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoUsuarioActionPerformed(evt);
            }
        });

        nuevoDni.setBorder(javax.swing.BorderFactory.createTitledBorder("DNI"));
        nuevoDni.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                nuevoDniKeyTyped(evt);
            }
        });

        nuevoApellido.setBorder(javax.swing.BorderFactory.createTitledBorder("APELLIDO"));
        nuevoApellido.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                nuevoApellidoKeyTyped(evt);
            }
        });

        nuevoListaRolUsuarios.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Administrador", "Usuario" }));
        nuevoListaRolUsuarios.setBorder(javax.swing.BorderFactory.createTitledBorder("PERFIL DEL USUARIO"));
        nuevoListaRolUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nuevoListaRolUsuariosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout crearUsuarioLayout = new javax.swing.GroupLayout(crearUsuario);
        crearUsuario.setLayout(crearUsuarioLayout);
        crearUsuarioLayout.setHorizontalGroup(
            crearUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, crearUsuarioLayout.createSequentialGroup()
                .addContainerGap(120, Short.MAX_VALUE)
                .addGroup(crearUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(btnNuevoUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, 550, Short.MAX_VALUE)
                    .addComponent(nuevoDni, javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(crearUsuarioLayout.createSequentialGroup()
                        .addGroup(crearUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(nuevoPassword, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(nuevoApellido, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 260, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                        .addGroup(crearUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(nuevoListaRolUsuarios, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nuevoNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(115, 115, 115))
        );
        crearUsuarioLayout.setVerticalGroup(
            crearUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(crearUsuarioLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(nuevoDni, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(crearUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nuevoApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nuevoNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(crearUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nuevoPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nuevoListaRolUsuarios, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 76, Short.MAX_VALUE)
                .addComponent(btnNuevoUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
        );

        contenedorPrincipal.addTab("Nuevo Usuario", crearUsuario);

        altaNombre.setBorder(javax.swing.BorderFactory.createTitledBorder("NOMBRES"));

        btnAltaUsuario.setText("Habilitar Usuario");
        btnAltaUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAltaUsuarioActionPerformed(evt);
            }
        });

        altaDni.setBorder(javax.swing.BorderFactory.createTitledBorder("DNI"));

        altaApellido.setBorder(javax.swing.BorderFactory.createTitledBorder("APELLIDO"));

        listaUsuariosDeshabilitados.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        listaUsuariosDeshabilitados.setBorder(javax.swing.BorderFactory.createTitledBorder("USUARIO"));
        listaUsuariosDeshabilitados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listaUsuariosDeshabilitadosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout altaDeUsuarioLayout = new javax.swing.GroupLayout(altaDeUsuario);
        altaDeUsuario.setLayout(altaDeUsuarioLayout);
        altaDeUsuarioLayout.setHorizontalGroup(
            altaDeUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, altaDeUsuarioLayout.createSequentialGroup()
                .addContainerGap(120, Short.MAX_VALUE)
                .addGroup(altaDeUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(btnAltaUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, 550, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, altaDeUsuarioLayout.createSequentialGroup()
                        .addComponent(altaApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                        .addComponent(altaNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(altaDni, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(listaUsuariosDeshabilitados, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(115, 115, 115))
        );
        altaDeUsuarioLayout.setVerticalGroup(
            altaDeUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(altaDeUsuarioLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(listaUsuariosDeshabilitados, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(altaDni, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(altaDeUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(altaApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(altaNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 70, Short.MAX_VALUE)
                .addComponent(btnAltaUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35))
        );

        contenedorPrincipal.addTab("Alta de Usuario", altaDeUsuario);

        bajaNombre.setBorder(javax.swing.BorderFactory.createTitledBorder("NOMBRES"));

        btnBajaUsuario.setText("Eliminar Usuario");
        btnBajaUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBajaUsuarioActionPerformed(evt);
            }
        });

        bajaDni.setBorder(javax.swing.BorderFactory.createTitledBorder("DNI"));

        bajaApellido.setBorder(javax.swing.BorderFactory.createTitledBorder("APELLIDO"));

        listaUsuariosActivos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        listaUsuariosActivos.setBorder(javax.swing.BorderFactory.createTitledBorder("USUARIO"));
        listaUsuariosActivos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listaUsuariosActivosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout bajaDeUsuarioLayout = new javax.swing.GroupLayout(bajaDeUsuario);
        bajaDeUsuario.setLayout(bajaDeUsuarioLayout);
        bajaDeUsuarioLayout.setHorizontalGroup(
            bajaDeUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bajaDeUsuarioLayout.createSequentialGroup()
                .addContainerGap(120, Short.MAX_VALUE)
                .addGroup(bajaDeUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(btnBajaUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, 550, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, bajaDeUsuarioLayout.createSequentialGroup()
                        .addComponent(bajaApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                        .addComponent(bajaNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(bajaDni, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(listaUsuariosActivos, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(115, 115, 115))
        );
        bajaDeUsuarioLayout.setVerticalGroup(
            bajaDeUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bajaDeUsuarioLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(listaUsuariosActivos, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(bajaDni, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(bajaDeUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bajaApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bajaNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 70, Short.MAX_VALUE)
                .addComponent(btnBajaUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35))
        );

        contenedorPrincipal.addTab("Baja de Usuario", bajaDeUsuario);

        upNombre.setBorder(javax.swing.BorderFactory.createTitledBorder("NOMBRES"));
        upNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                upNombreKeyTyped(evt);
            }
        });

        upPassword.setBorder(javax.swing.BorderFactory.createTitledBorder("PASSWORD"));
        upPassword.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                upPasswordKeyTyped(evt);
            }
        });

        btnUpUsuario.setText("Actualizar Informacion");
        btnUpUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpUsuarioActionPerformed(evt);
            }
        });

        upDni.setBorder(javax.swing.BorderFactory.createTitledBorder("DNI"));
        upDni.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                upDniKeyTyped(evt);
            }
        });

        upApeliido.setBorder(javax.swing.BorderFactory.createTitledBorder("APELLIDO"));
        upApeliido.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                upApeliidoKeyTyped(evt);
            }
        });

        listaUpUsuarios.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        listaUpUsuarios.setBorder(javax.swing.BorderFactory.createTitledBorder("USUARIO"));
        listaUpUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listaUpUsuariosActionPerformed(evt);
            }
        });

        listaCrearRolUsuarios1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Administrador", "Usuario" }));
        listaCrearRolUsuarios1.setBorder(javax.swing.BorderFactory.createTitledBorder("PERFIL DEL USUARIO"));
        listaCrearRolUsuarios1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listaCrearRolUsuarios1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout actualizacionDeUsuarioLayout = new javax.swing.GroupLayout(actualizacionDeUsuario);
        actualizacionDeUsuario.setLayout(actualizacionDeUsuarioLayout);
        actualizacionDeUsuarioLayout.setHorizontalGroup(
            actualizacionDeUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, actualizacionDeUsuarioLayout.createSequentialGroup()
                .addContainerGap(120, Short.MAX_VALUE)
                .addGroup(actualizacionDeUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(btnUpUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, 550, Short.MAX_VALUE)
                    .addComponent(upDni, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(listaUpUsuarios, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, actualizacionDeUsuarioLayout.createSequentialGroup()
                        .addGroup(actualizacionDeUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(upPassword, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(upApeliido, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 260, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(actualizacionDeUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(upNombre, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(listaCrearRolUsuarios1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(115, 115, 115))
        );
        actualizacionDeUsuarioLayout.setVerticalGroup(
            actualizacionDeUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(actualizacionDeUsuarioLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(listaUpUsuarios, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(upDni, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(actualizacionDeUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(upApeliido, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(upNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(actualizacionDeUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(upPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(listaCrearRolUsuarios1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnUpUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(53, 53, 53))
        );

        contenedorPrincipal.addTab("Actualizacion de Usuario", actualizacionDeUsuario);

        btnCerrarABMUsuairos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/cerrar.png"))); // NOI18N
        btnCerrarABMUsuairos.setBorder(null);
        btnCerrarABMUsuairos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarABMUsuairosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(contenedorPrincipal)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnCerrarABMUsuairos, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(btnCerrarABMUsuairos, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(contenedorPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 386, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

         
                    /* <<-- Validacion de datos -->> */
    
    // Vista 1 - Creacion de usuario -> DNI: Validacion de datos
    private void nuevoDniKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nuevoDniKeyTyped
        int key = evt.getKeyChar();
        boolean numeros = key >= 48 && key <= 57;
            
        if (!(numeros)) {
            evt.consume();
        }
        
        if (nuevoDni.getText().trim().length() == 8) {
            evt.consume();
            JOptionPane.showMessageDialog(null, "Longitud maxima 8 digitos.", "ERROR validacion de datos",JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_nuevoDniKeyTyped

    // Vista 1 - Creacion de usuario -> APELLIDO: Validacion de datos
    private void nuevoApellidoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nuevoApellidoKeyTyped
        int key = evt.getKeyChar();
        boolean mayusculas = key >= 65 && key <= 90;
        boolean minusculas = key >= 97 && key <= 122;
        boolean espacio = key == 32;

        if (!(minusculas || mayusculas || espacio)){
            evt.consume();
        }
        
        if (nuevoApellido.getText().trim().length() == 45) {
            evt.consume();
            JOptionPane.showMessageDialog(null, "Longitud maxima 45 caracteres.", "ERROR validacion de datos",JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_nuevoApellidoKeyTyped

    // Vista 1 - Creacion de usuario -> NOMBRE: Validacion de datos
    private void nuevoNombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nuevoNombreKeyTyped
        int key = evt.getKeyChar();
        boolean mayusculas = key >= 65 && key <= 90;
        boolean minusculas = key >= 97 && key <= 122;
        boolean espacio = key == 32;

        if (!(minusculas || mayusculas || espacio)){
            evt.consume();
        }
        
        if (nuevoNombre.getText().trim().length() == 45) {
            evt.consume();
            JOptionPane.showMessageDialog(null, "Longitud maxima 45 caracteres.", "ERROR validacion de datos",JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_nuevoNombreKeyTyped

    // Vista 1 - Creacion de usuario -> PASSWORD: Validacion de datos
    private void nuevoPasswordKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nuevoPasswordKeyTyped
        int key = evt.getKeyChar();

        boolean mayusculas = key >= 65 && key <= 90;
        boolean minusculas = key >= 97 && key <= 122;
        boolean numeros = key >= 48 && key <= 57;
            
        if (!(minusculas || mayusculas || numeros))
        {
            evt.consume();
        }
        
        if (nuevoPassword.getText().trim().length() == 15) {
            evt.consume();
            JOptionPane.showMessageDialog(null, "Longitud maxima 15 caracteres.", "ERROR validacion de datos",JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_nuevoPasswordKeyTyped
    
    // Vista 4 - Up de usuario -> DNI: Validacion de datos
    private void upDniKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_upDniKeyTyped
        int key = evt.getKeyChar();
        boolean numeros = key >= 48 && key <= 57;
            
        if (!(numeros)) {
            evt.consume();
        }
        
        if (upDni.getText().trim().length() == 8) {
            evt.consume();
            JOptionPane.showMessageDialog(null, "Longitud maxima 8 digitos.", "ERROR validacion de datos",JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_upDniKeyTyped

    // Vista 4 - Up de usuario -> APELLIDO: Validacion de datos
    private void upApeliidoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_upApeliidoKeyTyped
        int key = evt.getKeyChar();
        boolean mayusculas = key >= 65 && key <= 90;
        boolean minusculas = key >= 97 && key <= 122;
        boolean espacio = key == 32;

        if (!(minusculas || mayusculas || espacio)){
            evt.consume();
        }
        
        if (upApeliido.getText().trim().length() == 45) {
            evt.consume();
            JOptionPane.showMessageDialog(null, "Longitud maxima 45 caracteres.", "ERROR validacion de datos",JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_upApeliidoKeyTyped

    // Vista 4 - Up de usuario -> NOMBRE: Validacion de datos
    private void upNombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_upNombreKeyTyped
        int key = evt.getKeyChar();
        boolean mayusculas = key >= 65 && key <= 90;
        boolean minusculas = key >= 97 && key <= 122;
        boolean espacio = key == 32;

        if (!(minusculas || mayusculas || espacio)){
            evt.consume();
        }
        
        if (upNombre.getText().trim().length() == 45) {
            evt.consume();
            JOptionPane.showMessageDialog(null, "Longitud maxima 45 caracteres.", "ERROR validacion de datos",JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_upNombreKeyTyped

    // Vista 4 - Up de usuario -> PASSWORD: Validacion de datos
    private void upPasswordKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_upPasswordKeyTyped
        int key = evt.getKeyChar();

        boolean mayusculas = key >= 65 && key <= 90;
        boolean minusculas = key >= 97 && key <= 122;
        boolean numeros = key >= 48 && key <= 57;
            
        if (!(minusculas || mayusculas || numeros))
        {
            evt.consume();
        }
        
        if (upPassword.getText().trim().length() == 15) {
            evt.consume();
            JOptionPane.showMessageDialog(null, "Longitud maxima 15 caracteres.", "ERROR validacion de datos",JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_upPasswordKeyTyped

                    /* <<-- ComboBox Recuperando datos -->> */
    
    // Vista 1 - Creacion de usuario -> CB: Rol Sistema
    private void nuevoListaRolUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nuevoListaRolUsuariosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nuevoListaRolUsuariosActionPerformed

    // Vista 2 - Alta de usuario -> CB: Lista de usuarios deshabilitados
    private void listaUsuariosDeshabilitadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listaUsuariosDeshabilitadosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_listaUsuariosDeshabilitadosActionPerformed

    // Vista 3 - Baja de usuario -> CB: Lista de usuarios habilitados
    private void listaUsuariosActivosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listaUsuariosActivosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_listaUsuariosActivosActionPerformed

    // Vista 4 - Up de usuario -> CB: Lista de usuarios habilitados
    private void listaUpUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listaUpUsuariosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_listaUpUsuariosActionPerformed

    // Vista 4 - Up de usuario -> CB: Rol Sistema
    private void listaCrearRolUsuarios1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listaCrearRolUsuarios1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_listaCrearRolUsuarios1ActionPerformed

                /* <<-- Btn Accion -->> */
    
    // Vista 1 - Creacion de usuario -> BTN
    private void btnNuevoUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoUsuarioActionPerformed
        String dni = nuevoDni.getText();
        String password = nuevoPassword.getText();
        String apellido = nuevoApellido.getText();
        String nombre = nuevoNombre.getText();
        
        if ( !dni.isEmpty() ) {
            int dniParceado = Integer.parseInt(dni);
        if( !apellido.isEmpty() ) {
        if( !nombre.isEmpty() ) {
        if( !password.isEmpty() ) {
        
            
            
        }else{
            JOptionPane.showMessageDialog(null, "Debe ingresar una contraseña", "ERROR Validacion",JOptionPane.WARNING_MESSAGE);
            nuevoPassword.requestFocus(); }
        }else{
            JOptionPane.showMessageDialog(null, "Debe ingresar un nombre", "ERROR Validacion",JOptionPane.WARNING_MESSAGE);
            nuevoNombre.requestFocus(); }
        }else{
            JOptionPane.showMessageDialog(null, "Debe ingresar un apellido", "ERROR Validacion",JOptionPane.WARNING_MESSAGE);
            nuevoApellido.requestFocus(); }
        }else{
            JOptionPane.showMessageDialog(null, "Debe ingresar un dni", "ERROR Validacion",JOptionPane.WARNING_MESSAGE);
            nuevoDni.requestFocus(); } 
    }//GEN-LAST:event_btnNuevoUsuarioActionPerformed

    // Vista 2 - Alta de usuario -> BTN
    private void btnAltaUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAltaUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAltaUsuarioActionPerformed

    // Vista 3 - Baja de usuario -> BTN
    private void btnBajaUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBajaUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnBajaUsuarioActionPerformed

    // Vista 4 - Up de usuario -> BTN
    private void btnUpUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpUsuarioActionPerformed
        String dni = upDni.getText();
        String password = upPassword.getText();
        String apellido = upApeliido.getText();
        String nombre = upNombre.getText();
        
        if ( !dni.isEmpty() ) {
            int dniParceado = Integer.parseInt(dni);
        if( !apellido.isEmpty() ) {
        if( !nombre.isEmpty() ) {
        if( !password.isEmpty() ) {
        
            
            
        }else{
            JOptionPane.showMessageDialog(null, "Debe ingresar una contraseña", "ERROR Validacion",JOptionPane.WARNING_MESSAGE);
            upPassword.requestFocus(); }
        }else{
            JOptionPane.showMessageDialog(null, "Debe ingresar un nombre", "ERROR Validacion",JOptionPane.WARNING_MESSAGE);
            upNombre.requestFocus(); }
        }else{
            JOptionPane.showMessageDialog(null, "Debe ingresar un apellido", "ERROR Validacion",JOptionPane.WARNING_MESSAGE);
            upApeliido.requestFocus(); }
        }else{
            JOptionPane.showMessageDialog(null, "Debe ingresar un dni", "ERROR Validacion",JOptionPane.WARNING_MESSAGE);
            upDni.requestFocus(); }   
    }//GEN-LAST:event_btnUpUsuarioActionPerformed

    // Cerrar
    private void btnCerrarABMUsuairosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarABMUsuairosActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnCerrarABMUsuairosActionPerformed
    

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel actualizacionDeUsuario;
    private javax.swing.JTextField altaApellido;
    private javax.swing.JPanel altaDeUsuario;
    private javax.swing.JTextField altaDni;
    private javax.swing.JTextField altaNombre;
    private javax.swing.JTextField bajaApellido;
    private javax.swing.JPanel bajaDeUsuario;
    private javax.swing.JTextField bajaDni;
    private javax.swing.JTextField bajaNombre;
    private javax.swing.JButton btnAltaUsuario;
    private javax.swing.JButton btnBajaUsuario;
    private javax.swing.JButton btnCerrarABMUsuairos;
    private javax.swing.JButton btnNuevoUsuario;
    private javax.swing.JButton btnUpUsuario;
    private javax.swing.JTabbedPane contenedorPrincipal;
    private javax.swing.JPanel crearUsuario;
    private javax.swing.JComboBox<String> listaCrearRolUsuarios1;
    private javax.swing.JComboBox<String> listaUpUsuarios;
    private javax.swing.JComboBox<String> listaUsuariosActivos;
    private javax.swing.JComboBox<String> listaUsuariosDeshabilitados;
    private javax.swing.JTextField nuevoApellido;
    private javax.swing.JTextField nuevoDni;
    private javax.swing.JComboBox<String> nuevoListaRolUsuarios;
    private javax.swing.JTextField nuevoNombre;
    private javax.swing.JPasswordField nuevoPassword;
    private javax.swing.JTextField upApeliido;
    private javax.swing.JTextField upDni;
    private javax.swing.JTextField upNombre;
    private javax.swing.JPasswordField upPassword;
    // End of variables declaration//GEN-END:variables
}
