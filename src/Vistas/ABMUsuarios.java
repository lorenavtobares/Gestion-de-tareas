package Vistas;

import Funciones.Funciones;
import Modelo.Miembro;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;


public class ABMUsuarios extends javax.swing.JInternalFrame {
    
    public ABMUsuarios() {
        initComponents();
        cargarListaUsuarios();
        itemsRolUsuarios();
        listaUpdateUsuarios.setSelectedIndex(0);
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
        nuevoListaRolUsuario = new javax.swing.JComboBox<>();
        actualizacionDeUsuario = new javax.swing.JPanel();
        updateNombre = new javax.swing.JTextField();
        updatePassword = new javax.swing.JPasswordField();
        btnUpdateUsuario = new javax.swing.JButton();
        updateDni = new javax.swing.JTextField();
        updateApeliido = new javax.swing.JTextField();
        listaUpdateUsuarios = new javax.swing.JComboBox<>();
        jPanel1 = new javax.swing.JPanel();
        jcbHabilitado = new javax.swing.JCheckBox();
        jcbDeshabilitados = new javax.swing.JCheckBox();
        listaUpdateRolUsuarios = new javax.swing.JComboBox<>();
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

        nuevoListaRolUsuario.setBorder(javax.swing.BorderFactory.createTitledBorder("Perfil de Usuario"));

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
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(crearUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(nuevoNombre, javax.swing.GroupLayout.DEFAULT_SIZE, 260, Short.MAX_VALUE)
                            .addComponent(nuevoListaRolUsuario, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
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
                    .addComponent(nuevoListaRolUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 146, Short.MAX_VALUE)
                .addComponent(btnNuevoUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
        );

        contenedorPrincipal.addTab("Nuevo Usuario", crearUsuario);

        updateNombre.setBorder(javax.swing.BorderFactory.createTitledBorder("NOMBRES"));
        updateNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                updateNombreKeyTyped(evt);
            }
        });

        updatePassword.setBorder(javax.swing.BorderFactory.createTitledBorder("PASSWORD"));
        updatePassword.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                updatePasswordKeyTyped(evt);
            }
        });

        btnUpdateUsuario.setText("Actualizar Informacion");
        btnUpdateUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateUsuarioActionPerformed(evt);
            }
        });

        updateDni.setBorder(javax.swing.BorderFactory.createTitledBorder("DNI"));
        updateDni.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                updateDniKeyTyped(evt);
            }
        });

        updateApeliido.setBorder(javax.swing.BorderFactory.createTitledBorder("APELLIDO"));
        updateApeliido.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                updateApeliidoKeyTyped(evt);
            }
        });

        listaUpdateUsuarios.setBorder(javax.swing.BorderFactory.createTitledBorder("USUARIO"));
        listaUpdateUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listaUpdateUsuariosActionPerformed(evt);
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

        listaUpdateRolUsuarios.setBorder(javax.swing.BorderFactory.createTitledBorder("¨Perfil de Usuario"));

        javax.swing.GroupLayout actualizacionDeUsuarioLayout = new javax.swing.GroupLayout(actualizacionDeUsuario);
        actualizacionDeUsuario.setLayout(actualizacionDeUsuarioLayout);
        actualizacionDeUsuarioLayout.setHorizontalGroup(
            actualizacionDeUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, actualizacionDeUsuarioLayout.createSequentialGroup()
                .addContainerGap(120, Short.MAX_VALUE)
                .addGroup(actualizacionDeUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(btnUpdateUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, 550, Short.MAX_VALUE)
                    .addComponent(updateDni, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(listaUpdateUsuarios, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, actualizacionDeUsuarioLayout.createSequentialGroup()
                        .addGroup(actualizacionDeUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(updatePassword, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(updateApeliido, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 260, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(actualizacionDeUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(updateNombre, javax.swing.GroupLayout.DEFAULT_SIZE, 260, Short.MAX_VALUE)
                            .addComponent(listaUpdateRolUsuarios, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(115, 115, 115))
        );
        actualizacionDeUsuarioLayout.setVerticalGroup(
            actualizacionDeUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(actualizacionDeUsuarioLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(listaUpdateUsuarios, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(updateDni, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(actualizacionDeUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(updateApeliido, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(updateNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(actualizacionDeUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(updatePassword, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                    .addComponent(listaUpdateRolUsuarios))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                .addComponent(btnUpdateUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        listaUpdateRolUsuarios.getAccessibleContext().setAccessibleName("Perfil de Usuario");

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

    
                /*|-------------------------|*/
                /*|   Validacion de datos   |*/
                /*|-------------------------|*/
    
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
    private void updateDniKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_updateDniKeyTyped
        Funciones.soloNumeros(updateDni, evt, 8);
    }//GEN-LAST:event_updateDniKeyTyped

    //Solapa 2 -> UP de Usuario - APELLIDO
    private void updateApeliidoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_updateApeliidoKeyTyped
        Funciones.soloLetras(updateApeliido, evt, 45);
    }//GEN-LAST:event_updateApeliidoKeyTyped

    //Solapa 2 -> UP de Usuario - NOMBRE
    private void updateNombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_updateNombreKeyTyped
        Funciones.soloLetras(updateNombre, evt, 45);
    }//GEN-LAST:event_updateNombreKeyTyped

    //Solapa 2 -> UP de Usuario - PASSWORD
    private void updatePasswordKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_updatePasswordKeyTyped
        Funciones.soloNumerosYLetras(updatePassword, evt, 15);
    }//GEN-LAST:event_updatePasswordKeyTyped

    
    
                /*|-------------------------|*/
                /*|    Eventos Generados    |*/
                /*|-------------------------|*/
    
    //Solapa 2 -> UP de Usuario - CHECKBOX
    private void jcbHabilitadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbHabilitadoActionPerformed
        jcbHabilitado.setSelected(true);
        jcbDeshabilitados.setSelected(false);
    }//GEN-LAST:event_jcbHabilitadoActionPerformed

    private void jcbDeshabilitadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbDeshabilitadosActionPerformed
        jcbHabilitado.setSelected(false);
        jcbDeshabilitados.setSelected(true);
    }//GEN-LAST:event_jcbDeshabilitadosActionPerformed

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
                        int posicion = -1;
                        posicion = nuevoListaRolUsuario.getSelectedIndex();
        
                        if ( posicion != 0 ){

                            String rolSistema = Funciones.rolUsuario(posicion);                        
                            Miembro usuario = new Miembro(dniParceado, password, apellido, nombre, true, rolSistema);
                            Menu.miembroDataLocal.guardarMiembro(usuario);
                            limpiar();
                            
                        }else{
                            JOptionPane.showMessageDialog(null, Menu.ERROR_ROL, Menu.TT_ERROR_VALIDACION,JOptionPane.WARNING_MESSAGE);
                        }
                        
            
                    }else{
                        JOptionPane.showMessageDialog(null, Menu.ERROR_PASSWORD, Menu.TT_ERROR_VALIDACION,JOptionPane.WARNING_MESSAGE);
                        nuevoPassword.requestFocus(); }
                }else{
                    JOptionPane.showMessageDialog(null, Menu.ERROR_NOMBRE, Menu.TT_ERROR_VALIDACION,JOptionPane.WARNING_MESSAGE);
                    nuevoNombre.requestFocus(); }
            }else{
                JOptionPane.showMessageDialog(null, Menu.ERROR_APELLIDO, Menu.TT_ERROR_VALIDACION,JOptionPane.WARNING_MESSAGE);
                nuevoApellido.requestFocus(); }
        }else{
            JOptionPane.showMessageDialog(null, Menu.ERROR_DNI, Menu.TT_ERROR_VALIDACION,JOptionPane.WARNING_MESSAGE);
            nuevoDni.requestFocus(); } 
        
    }//GEN-LAST:event_btnNuevoUsuarioActionPerformed

    //Solapa 2 -> UP de Usuario - BTN
    private void btnUpdateUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateUsuarioActionPerformed
        String dni = updateDni.getText();
        String password = updatePassword.getText();
        String apellido = updateApeliido.getText();
        String nombre = updateNombre.getText();
        boolean estado;
        
        List <Miembro> listaUsuariosAll = Menu.miembroDataLocal.listarTodosMiembros();
        int posicionUsuario = -1;
        posicionUsuario = listaUpdateUsuarios.getSelectedIndex();
        
        try{
        
            if ( !dni.isEmpty() ) {
                int dniParceado = Integer.parseInt(dni);
                if( !apellido.isEmpty() ) {
                    if( !nombre.isEmpty() ) {
                        if( !password.isEmpty() ) {

                            int posicionRol = -1;
                            posicionRol = listaUpdateRolUsuarios.getSelectedIndex();
                            String rolSistema = Funciones.rolUsuario(posicionRol);

                                if (posicionRol != 0){

                                    if(jcbHabilitado.isSelected()){
                                        estado = true;
                                        jcbHabilitado.setSelected(true);
                                        jcbDeshabilitados.setSelected(false);
                                    }
                                    else{
                                        estado = false;
                                        jcbHabilitado.setSelected(false);
                                        jcbDeshabilitados.setSelected(true);
                                    }

                                    if( posicionUsuario > -1 ){
                                        int IdUsuario = listaUsuariosAll.get(posicionUsuario).getId_miembro();
                                        Miembro usuarioActualizado = new Miembro(IdUsuario,dniParceado, password, apellido, nombre, estado, rolSistema);
                                        Menu.miembroDataLocal.actualizarMiembro(usuarioActualizado);
                                    }
                                }else{
                                    JOptionPane.showMessageDialog(null, Menu.ERROR_ROL, Menu.TT_ERROR_VALIDACION,JOptionPane.WARNING_MESSAGE);
                                }

                        }else{
                            JOptionPane.showMessageDialog(null, Menu.ERROR_PASSWORD, Menu.TT_ERROR_VALIDACION,JOptionPane.WARNING_MESSAGE);
                            updatePassword.requestFocus(); }
                    }else{
                        JOptionPane.showMessageDialog(null, Menu.ERROR_NOMBRE, Menu.TT_ERROR_VALIDACION,JOptionPane.WARNING_MESSAGE);
                        updateNombre.requestFocus(); }
                }else{
                    JOptionPane.showMessageDialog(null, Menu.ERROR_APELLIDO, Menu.TT_ERROR_VALIDACION,JOptionPane.WARNING_MESSAGE);
                    updateApeliido.requestFocus(); }
            }else{
                JOptionPane.showMessageDialog(null, Menu.ERROR_DNI , Menu.TT_ERROR_VALIDACION,JOptionPane.WARNING_MESSAGE);
                updateDni.requestFocus(); }   
        
        }catch (NumberFormatException ex){
            JOptionPane.showMessageDialog(null, Menu.ERROR_ROL, Menu.TT_ERROR_VALIDACION,JOptionPane.WARNING_MESSAGE);
        }
        
    }//GEN-LAST:event_btnUpdateUsuarioActionPerformed

    private void btnCerrarABMUsuairosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarABMUsuairosActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnCerrarABMUsuairosActionPerformed

    // Vista 2 - Up de usuario -> CB: Lista de usuarios
    private void listaUpdateUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listaUpdateUsuariosActionPerformed
        
        try {
            List <Miembro> listaUsuariosAll = Menu.miembroDataLocal.listarTodosMiembros();
            int posicion = -1;
            posicion = listaUpdateUsuarios.getSelectedIndex();
            boolean estado;

            if ( posicion > -1 ) {
                String rolName = listaUsuariosAll.get(posicion).getRolSistema();
                int rol = Funciones.posicionRolUsuario(rolName);
                
                System.out.println("Rol name -> " + rolName);
                System.out.println("Ron int -> " + rol);
                
                updateDni.setText(listaUsuariosAll.get(posicion).getDni() + " ");
                updateApeliido.setText(listaUsuariosAll.get(posicion).getApellido());
                updateNombre.setText(listaUsuariosAll.get(posicion).getNombre());
                updatePassword.setText(listaUsuariosAll.get(posicion).getPassword());
                listaUpdateRolUsuarios.setSelectedIndex(rol);

                estado = listaUsuariosAll.get(posicion).getEstado();

                if (estado) {
                    jcbHabilitado.setSelected(true);
                    jcbDeshabilitados.setSelected(false);
                } else {
                    jcbHabilitado.setSelected(false);
                    jcbDeshabilitados.setSelected(true);
                }

            }else if (posicion == -1){
                JOptionPane.showMessageDialog(null, Menu.ERROR_USUARIOS, Menu.TT_ERROR,JOptionPane.WARNING_MESSAGE); 
            } 
        }catch(Exception ex){
            JOptionPane.showMessageDialog(null, ex.getMessage(), Menu.TT_ERROR,JOptionPane.WARNING_MESSAGE); 
        }
    }//GEN-LAST:event_listaUpdateUsuariosActionPerformed

    
    
                /*|--------------------|*/
                /*|   Metodos Extras   |*/
                /*|--------------------|*/
    
    private void cargarListaUsuarios(){
        listaUpdateUsuarios.removeAllItems();
        List <Miembro> listaUsuarios = Menu.miembroDataLocal.listarTodosMiembros();
        
        for (Miembro listaUsuario : listaUsuarios) {
            listaUpdateUsuarios.addItem(listaUsuario);
        }
    }
    
    private void limpiar(){
        nuevoDni.setText("");
        nuevoApellido.setText("");
        nuevoNombre.setText("");
        nuevoPassword.setText("");
        nuevoListaRolUsuario.setSelectedIndex(0);
    }
    
    private void itemsRolUsuarios(){
        listaUpdateRolUsuarios.addItem(Menu.ROL_DEFAULT);
        listaUpdateRolUsuarios.addItem(Menu.ROL_ADMINISTRADOR);
        listaUpdateRolUsuarios.addItem(Menu.ROL_USUARIO);
        
        nuevoListaRolUsuario.addItem(Menu.ROL_DEFAULT);
        nuevoListaRolUsuario.addItem(Menu.ROL_ADMINISTRADOR);
        nuevoListaRolUsuario.addItem(Menu.ROL_USUARIO);
        
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel actualizacionDeUsuario;
    private javax.swing.JButton btnCerrarABMUsuairos;
    private javax.swing.JButton btnNuevoUsuario;
    private javax.swing.JButton btnUpdateUsuario;
    private javax.swing.JTabbedPane contenedorPrincipal;
    private javax.swing.JPanel crearUsuario;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JCheckBox jcbDeshabilitados;
    private javax.swing.JCheckBox jcbHabilitado;
    private javax.swing.JComboBox<String> listaUpdateRolUsuarios;
    private javax.swing.JComboBox<Miembro> listaUpdateUsuarios;
    private javax.swing.JTextField nuevoApellido;
    private javax.swing.JTextField nuevoDni;
    private javax.swing.JComboBox<String> nuevoListaRolUsuario;
    private javax.swing.JTextField nuevoNombre;
    private javax.swing.JPasswordField nuevoPassword;
    private javax.swing.JTextField updateApeliido;
    private javax.swing.JTextField updateDni;
    private javax.swing.JTextField updateNombre;
    private javax.swing.JPasswordField updatePassword;
    // End of variables declaration//GEN-END:variables
}
