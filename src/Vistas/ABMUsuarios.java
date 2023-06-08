package Vistas;

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
        jButton1 = new javax.swing.JButton();

        nuevoNombre.setBorder(javax.swing.BorderFactory.createTitledBorder("NOMBRES"));

        nuevoPassword.setBorder(javax.swing.BorderFactory.createTitledBorder("PASSWORD"));

        btnNuevoUsuario.setText("Crear Usuario");

        nuevoDni.setBorder(javax.swing.BorderFactory.createTitledBorder("DNI"));

        nuevoApellido.setBorder(javax.swing.BorderFactory.createTitledBorder("APELLIDO"));

        javax.swing.GroupLayout crearUsuarioLayout = new javax.swing.GroupLayout(crearUsuario);
        crearUsuario.setLayout(crearUsuarioLayout);
        crearUsuarioLayout.setHorizontalGroup(
            crearUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, crearUsuarioLayout.createSequentialGroup()
                .addContainerGap(120, Short.MAX_VALUE)
                .addGroup(crearUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(btnNuevoUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, 550, Short.MAX_VALUE)
                    .addGroup(crearUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(crearUsuarioLayout.createSequentialGroup()
                            .addComponent(nuevoApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                            .addComponent(nuevoNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(nuevoDni)
                        .addComponent(nuevoPassword, javax.swing.GroupLayout.Alignment.TRAILING)))
                .addGap(115, 115, 115))
        );
        crearUsuarioLayout.setVerticalGroup(
            crearUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(crearUsuarioLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(nuevoDni, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(crearUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nuevoApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nuevoNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(nuevoPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                .addComponent(btnNuevoUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42))
        );

        contenedorPrincipal.addTab("Nuevo Usuario", crearUsuario);

        altaNombre.setBorder(javax.swing.BorderFactory.createTitledBorder("NOMBRES"));

        btnAltaUsuario.setText("Habilitar Usuario");

        altaDni.setBorder(javax.swing.BorderFactory.createTitledBorder("DNI"));

        altaApellido.setBorder(javax.swing.BorderFactory.createTitledBorder("APELLIDO"));

        listaUsuariosDeshabilitados.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        listaUsuariosDeshabilitados.setBorder(javax.swing.BorderFactory.createTitledBorder("USUARIO"));

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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 58, Short.MAX_VALUE)
                .addComponent(btnAltaUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35))
        );

        contenedorPrincipal.addTab("Alta de Usuario", altaDeUsuario);

        bajaNombre.setBorder(javax.swing.BorderFactory.createTitledBorder("NOMBRES"));

        btnBajaUsuario.setText("Eliminar Usuario");

        bajaDni.setBorder(javax.swing.BorderFactory.createTitledBorder("DNI"));

        bajaApellido.setBorder(javax.swing.BorderFactory.createTitledBorder("APELLIDO"));

        listaUsuariosActivos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        listaUsuariosActivos.setBorder(javax.swing.BorderFactory.createTitledBorder("USUARIO"));

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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 58, Short.MAX_VALUE)
                .addComponent(btnBajaUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35))
        );

        contenedorPrincipal.addTab("Baja de Usuario", bajaDeUsuario);

        upNombre.setBorder(javax.swing.BorderFactory.createTitledBorder("NOMBRES"));

        upPassword.setBorder(javax.swing.BorderFactory.createTitledBorder("PASSWORD"));

        btnUpUsuario.setText("Actualizar Informacion");

        upDni.setBorder(javax.swing.BorderFactory.createTitledBorder("DNI"));

        upApeliido.setBorder(javax.swing.BorderFactory.createTitledBorder("APELLIDO"));

        listaUpUsuarios.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        listaUpUsuarios.setBorder(javax.swing.BorderFactory.createTitledBorder("USUARIO"));

        javax.swing.GroupLayout actualizacionDeUsuarioLayout = new javax.swing.GroupLayout(actualizacionDeUsuario);
        actualizacionDeUsuario.setLayout(actualizacionDeUsuarioLayout);
        actualizacionDeUsuarioLayout.setHorizontalGroup(
            actualizacionDeUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, actualizacionDeUsuarioLayout.createSequentialGroup()
                .addContainerGap(120, Short.MAX_VALUE)
                .addGroup(actualizacionDeUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(btnUpUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, 550, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, actualizacionDeUsuarioLayout.createSequentialGroup()
                        .addComponent(upApeliido, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                        .addComponent(upNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(upDni, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(upPassword)
                    .addComponent(listaUpUsuarios, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                .addComponent(upPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnUpUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(53, 53, 53))
        );

        contenedorPrincipal.addTab("Actualizacion de Usuario", actualizacionDeUsuario);

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/cerrar.png"))); // NOI18N
        jButton1.setBorder(null);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(contenedorPrincipal)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(contenedorPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 374, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed


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
    private javax.swing.JButton btnNuevoUsuario;
    private javax.swing.JButton btnUpUsuario;
    private javax.swing.JTabbedPane contenedorPrincipal;
    private javax.swing.JPanel crearUsuario;
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox<String> listaUpUsuarios;
    private javax.swing.JComboBox<String> listaUsuariosActivos;
    private javax.swing.JComboBox<String> listaUsuariosDeshabilitados;
    private javax.swing.JTextField nuevoApellido;
    private javax.swing.JTextField nuevoDni;
    private javax.swing.JTextField nuevoNombre;
    private javax.swing.JPasswordField nuevoPassword;
    private javax.swing.JTextField upApeliido;
    private javax.swing.JTextField upDni;
    private javax.swing.JTextField upNombre;
    private javax.swing.JPasswordField upPassword;
    // End of variables declaration//GEN-END:variables
}
