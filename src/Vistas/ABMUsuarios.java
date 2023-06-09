package Vistas;

import Funciones.Funciones;
import javax.swing.JOptionPane;


public class ABMUsuarios extends javax.swing.JInternalFrame {

    public ABMUsuarios() {
        initComponents();
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
        actualizacionDeUsuario = new javax.swing.JPanel();
        upNombre = new javax.swing.JTextField();
        upPassword = new javax.swing.JPasswordField();
        btnUpUsuario = new javax.swing.JButton();
        upDni = new javax.swing.JTextField();
        upApeliido = new javax.swing.JTextField();
        listaUpUsuarios = new javax.swing.JComboBox<>();
        listaCrearRolUsuarios1 = new javax.swing.JComboBox<>();
        jPanel1 = new javax.swing.JPanel();
        jcbHabilitado = new javax.swing.JCheckBox();
        jcbDeshabilitados = new javax.swing.JCheckBox();
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 144, Short.MAX_VALUE)
                .addComponent(btnNuevoUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
        );

        contenedorPrincipal.addTab("Nuevo Usuario", crearUsuario);

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

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Estado del Usuairo"));

        jcbHabilitado.setText("Habilitado");
        jcbHabilitado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbHabilitadoActionPerformed(evt);
            }
        });

        jcbDeshabilitados.setText("Deshabilitado");
        jcbDeshabilitados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbDeshabilitadosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addComponent(jcbHabilitado)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jcbDeshabilitados)
                .addGap(114, 114, 114))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jcbHabilitado)
                    .addComponent(jcbDeshabilitados))
                .addContainerGap(13, Short.MAX_VALUE))
        );

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
                            .addComponent(listaCrearRolUsuarios1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(115, 115, 115))
        );
        actualizacionDeUsuarioLayout.setVerticalGroup(
            actualizacionDeUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(actualizacionDeUsuarioLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(listaUpUsuarios, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(upDni, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(actualizacionDeUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(upApeliido, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(upNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(actualizacionDeUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(upPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(listaCrearRolUsuarios1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                .addComponent(btnUpUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
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
                .addComponent(contenedorPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 454, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
            /* <<-- Validacion de datos -->> */
    
    //Solapa 1 -> Alta de Usuario - DNI
    private void nuevoDniKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nuevoDniKeyTyped
        Funciones.soloNumeros(nuevoDni, evt, 8);
    }//GEN-LAST:event_nuevoDniKeyTyped

    //Solapa 1 -> Alta de Usuario - APELLIDO
    private void nuevoApellidoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nuevoApellidoKeyTyped
        Funciones.soloLetras(nuevoApellido, evt, 45);
    }//GEN-LAST:event_nuevoApellidoKeyTyped

    //Solapa 1 -> Alta de Usuario - NOMBRE
    private void nuevoNombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nuevoNombreKeyTyped
        Funciones.soloLetras(nuevoNombre, evt, 45);
    }//GEN-LAST:event_nuevoNombreKeyTyped

    //Solapa 1 -> Alta de Usuario - PASSWORD
    private void nuevoPasswordKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nuevoPasswordKeyTyped
        Funciones.soloNumerosYLetras(nuevoPassword, evt, 15);
    }//GEN-LAST:event_nuevoPasswordKeyTyped

    //Solapa 2 -> UP de Usuario - DNI
    private void upDniKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_upDniKeyTyped
        Funciones.soloNumeros(upDni, evt, 8);
    }//GEN-LAST:event_upDniKeyTyped

    //Solapa 2 -> UP de Usuario - APELLIDO
    private void upApeliidoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_upApeliidoKeyTyped
        Funciones.soloLetras(upApeliido, evt, 45);
    }//GEN-LAST:event_upApeliidoKeyTyped

    //Solapa 2 -> UP de Usuario - NOMBRE
    private void upNombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_upNombreKeyTyped
        Funciones.soloLetras(upNombre, evt, 45);
    }//GEN-LAST:event_upNombreKeyTyped

    //Solapa 2 -> UP de Usuario - PASSWORD
    private void upPasswordKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_upPasswordKeyTyped
        Funciones.soloNumerosYLetras(upPassword, evt, 15);
    }//GEN-LAST:event_upPasswordKeyTyped

    //Solapa 2 -> UP de Usuario - CHECKBOX
    private void jcbHabilitadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbHabilitadoActionPerformed
        jcbHabilitado.setSelected(true);
        jcbDeshabilitados.setSelected(false);
    }//GEN-LAST:event_jcbHabilitadoActionPerformed

    private void jcbDeshabilitadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbDeshabilitadosActionPerformed
        jcbHabilitado.setSelected(false);
        jcbDeshabilitados.setSelected(true);
    }//GEN-LAST:event_jcbDeshabilitadosActionPerformed

            /* <<-- Btn Acciones -->> */
    
    //Solapa 1 -> Alta de Usuario - BTN
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

    //Solapa 2 -> UP de Usuario - BTN
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

    //BTN Cerrar
    private void btnCerrarABMUsuairosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarABMUsuairosActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnCerrarABMUsuairosActionPerformed

    
            /* <<-- Recuperando datos de combobox -->> */
    
    //Solapa 1 -> Alta de Usuario - CB: Rol de sistema
    private void nuevoListaRolUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nuevoListaRolUsuariosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nuevoListaRolUsuariosActionPerformed

    // Vista 2 - Up de usuario -> CB: Lista de usuarios
    private void listaUpUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listaUpUsuariosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_listaUpUsuariosActionPerformed

    //Solapa 2 -> Up de Usuario - CB: Rol de sistema
    private void listaCrearRolUsuarios1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listaCrearRolUsuarios1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_listaCrearRolUsuarios1ActionPerformed

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel actualizacionDeUsuario;
    private javax.swing.JButton btnCerrarABMUsuairos;
    private javax.swing.JButton btnNuevoUsuario;
    private javax.swing.JButton btnUpUsuario;
    private javax.swing.JTabbedPane contenedorPrincipal;
    private javax.swing.JPanel crearUsuario;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JCheckBox jcbDeshabilitados;
    private javax.swing.JCheckBox jcbHabilitado;
    private javax.swing.JComboBox<String> listaCrearRolUsuarios1;
    private javax.swing.JComboBox<String> listaUpUsuarios;
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
