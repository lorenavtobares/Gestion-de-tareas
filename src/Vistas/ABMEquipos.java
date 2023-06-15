package Vistas;

import java.util.Date;
import javax.swing.JOptionPane;
import Funciones.Funciones;
import com.toedter.calendar.JCalendar;
import java.awt.Color;
import Modelo.Equipo;
import Modelo.EquipoMiembros;
import Modelo.Miembro;
import Modelo.Proyecto;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.List;

public class ABMEquipos extends javax.swing.JInternalFrame {
    private int idUsuario = -1;
    private int idEquipo = -1;
    private List <Miembro> usuarioSeleccionado = new ArrayList<>();
    private List <Equipo> equipoSeleccionado = new ArrayList<>();
    public ABMEquipos() {
        initComponents();
        nuevoFecha.setMinSelectableDate(new Date());
        cargandoProyectoV1();
        cargandoEquiposV2();
        mostrarUsuariosAsignacion();
        MostrarEquipoAsignacion();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        contenedorPrincipal = new javax.swing.JTabbedPane();
        nuevoDeEquipos = new javax.swing.JPanel();
        nuevoNombre = new javax.swing.JTextField();
        nuevoFecha = new com.toedter.calendar.JDateChooser();
        btnNuevoEquipo = new javax.swing.JButton();
        jcbProyectos = new javax.swing.JComboBox<>();
        actualizacionDeEquipos = new javax.swing.JPanel();
        ActualizarNombre = new javax.swing.JTextField();
        actualizarFecha = new com.toedter.calendar.JDateChooser();
        btnActualizarEquipo = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jcbHabilitado = new javax.swing.JCheckBox();
        jcbDeshabilitados = new javax.swing.JCheckBox();
        jcbListaEquipos = new javax.swing.JComboBox<>();
        jPanel2 = new javax.swing.JPanel();
        listaAsignacionUsuarios = new javax.swing.JComboBox<>();
        listaAsignacionEquipos = new javax.swing.JComboBox<>();
        listaAsignacionRolUsuarios = new javax.swing.JComboBox<>();
        fechaAsignacion = new com.toedter.calendar.JDateChooser();
        btnAsignar = new javax.swing.JButton();
        btnCerrar = new javax.swing.JButton();

        nuevoNombre.setBorder(javax.swing.BorderFactory.createTitledBorder("NOMBRE"));
        nuevoNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                nuevoNombreKeyTyped(evt);
            }
        });

        nuevoFecha.setBorder(javax.swing.BorderFactory.createTitledBorder("FECHA DE CREACION"));

        btnNuevoEquipo.setText("Crear Equipo");
        btnNuevoEquipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoEquipoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout nuevoDeEquiposLayout = new javax.swing.GroupLayout(nuevoDeEquipos);
        nuevoDeEquipos.setLayout(nuevoDeEquiposLayout);
        nuevoDeEquiposLayout.setHorizontalGroup(
            nuevoDeEquiposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(nuevoDeEquiposLayout.createSequentialGroup()
                .addGap(113, 113, 113)
                .addGroup(nuevoDeEquiposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(nuevoFecha, javax.swing.GroupLayout.DEFAULT_SIZE, 550, Short.MAX_VALUE)
                    .addComponent(nuevoNombre, javax.swing.GroupLayout.DEFAULT_SIZE, 550, Short.MAX_VALUE)
                    .addComponent(btnNuevoEquipo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jcbProyectos, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(132, Short.MAX_VALUE))
        );
        nuevoDeEquiposLayout.setVerticalGroup(
            nuevoDeEquiposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(nuevoDeEquiposLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jcbProyectos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(nuevoNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(nuevoFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(63, 63, 63)
                .addComponent(btnNuevoEquipo, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(41, Short.MAX_VALUE))
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
        btnActualizarEquipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarEquipoActionPerformed(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Estado del equipo"));

        jcbHabilitado.setText("Habilitado");

        jcbDeshabilitados.setText("Deshabilitado");

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

        jcbListaEquipos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbListaEquiposActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout actualizacionDeEquiposLayout = new javax.swing.GroupLayout(actualizacionDeEquipos);
        actualizacionDeEquipos.setLayout(actualizacionDeEquiposLayout);
        actualizacionDeEquiposLayout.setHorizontalGroup(
            actualizacionDeEquiposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(actualizacionDeEquiposLayout.createSequentialGroup()
                .addGap(113, 113, 113)
                .addGroup(actualizacionDeEquiposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jcbListaEquipos, javax.swing.GroupLayout.PREFERRED_SIZE, 540, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(actualizacionDeEquiposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(actualizarFecha, javax.swing.GroupLayout.DEFAULT_SIZE, 550, Short.MAX_VALUE)
                        .addComponent(ActualizarNombre, javax.swing.GroupLayout.DEFAULT_SIZE, 550, Short.MAX_VALUE)
                        .addComponent(btnActualizarEquipo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(132, Short.MAX_VALUE))
        );
        actualizacionDeEquiposLayout.setVerticalGroup(
            actualizacionDeEquiposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(actualizacionDeEquiposLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jcbListaEquipos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ActualizarNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(actualizarFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(btnActualizarEquipo, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        contenedorPrincipal.addTab("Actualizacion de Equipos", actualizacionDeEquipos);

        listaAsignacionUsuarios.setBorder(javax.swing.BorderFactory.createTitledBorder("Usuarios"));
        listaAsignacionUsuarios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                listaAsignacionUsuariosMouseClicked(evt);
            }
        });
        listaAsignacionUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listaAsignacionUsuariosActionPerformed(evt);
            }
        });

        listaAsignacionEquipos.setBorder(javax.swing.BorderFactory.createTitledBorder("Equipos"));
        listaAsignacionEquipos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listaAsignacionEquiposActionPerformed(evt);
            }
        });

        listaAsignacionRolUsuarios.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Lider de Equipo", "Project Manager", "Desarrolador de Sotfware", "Diseñador UX y UI" }));
        listaAsignacionRolUsuarios.setBorder(javax.swing.BorderFactory.createTitledBorder("Roles Usuarios"));
        listaAsignacionRolUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listaAsignacionRolUsuariosActionPerformed(evt);
            }
        });

        btnAsignar.setText("Asignacion a Equipo");
        btnAsignar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAsignarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(111, 111, 111)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(listaAsignacionUsuarios, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(listaAsignacionEquipos, 0, 552, Short.MAX_VALUE)
                    .addComponent(listaAsignacionRolUsuarios, 0, 552, Short.MAX_VALUE)
                    .addComponent(fechaAsignacion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnAsignar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(132, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(listaAsignacionUsuarios, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(listaAsignacionEquipos, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(listaAsignacionRolUsuarios, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(fechaAsignacion, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(9, 9, 9)
                .addComponent(btnAsignar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
        );

        contenedorPrincipal.addTab("Asignar Persona a Equipo", jPanel2);

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
    //Solapa 2 -> carga la lista de equipos
    

    private void btnNuevoEquipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoEquipoActionPerformed
        // TODO add your handling code here:
        String nombre = nuevoNombre.getText();
        LocalDate fechaCreacion = nuevoFecha.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        List<Proyecto> arrayProyectos = Menu.proyectoEscritorio.listarProyectosHabilitados();
        Proyecto proyectoLocal = new Proyecto();
        int posicion = -1;
        posicion = jcbProyectos.getSelectedIndex();

        Equipo equipos = new Equipo(arrayProyectos.get(posicion).getId_proyecto(), arrayProyectos.get(posicion), nombre, fechaCreacion, true);

        Menu.equipoEscritorio.GuardarEquipo(equipos);
    }//GEN-LAST:event_btnNuevoEquipoActionPerformed

    public void formatoCalendario() {
        //jdFechaNacimiento.setLocale(new Locale("es"));
        //jdFechaNacimiento.setDateFormatString("dd-MM-yyyy");

        //nuevoFecha.setDate(new Date());
        actualizarFecha.setDate(new Date());
        // actualizarFecha.getJCalendar().setMaxSelectableDate(new Date());
        nuevoFecha.getJCalendar().setMaxSelectableDate(new Date());

    }

    //Solapa 2 - Actualizar Datos -> Btn guardar datos
    private void btnActualizarEquipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarEquipoActionPerformed

        String nombre = ActualizarNombre.getText();
        LocalDate fechaCreacion = actualizarFecha.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        boolean estado;
        List<Proyecto> arrayProyectos = Menu.proyectoEscritorio.listarProyectosHabilitados();
        Proyecto proyectoLocal = new Proyecto();
        int posicion = -1;
        posicion = jcbListaEquipos.getSelectedIndex();
        if (!nombre.isEmpty()) {

            if (jcbHabilitado.isSelected()) {
                estado = true;

            } else {
                estado = false;
            }

            Equipo equipos = new Equipo(arrayProyectos.get(posicion).getId_proyecto(), arrayProyectos.get(posicion), nombre, fechaCreacion, estado);

            Menu.equipoEscritorio.actualizarEquipo(equipos);

        } else {
            JOptionPane.showMessageDialog(null, "Debe ingresar un nombre", "ERROR Validacion", JOptionPane.WARNING_MESSAGE);
            ActualizarNombre.requestFocus();
        }

    }//GEN-LAST:event_btnActualizarEquipoActionPerformed

    //Solapa 2 - Actualizar Datos -> Cargar Datos del furmulario Items ComboBox
    private void jcbListaEquiposActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbListaEquiposActionPerformed

        List<Equipo> arrayEquipos = Menu.equipoEscritorio.listarTodosEquipos();
        int posicion = -1;
        posicion = jcbListaEquipos.getSelectedIndex();
        boolean estado;
        if (posicion > -1) {
            ActualizarNombre.setText(arrayEquipos.get(posicion).getNombre());
            actualizarFecha.setDateFormatString(arrayEquipos.get(posicion).getFecha_cracion() + "");
            estado = arrayEquipos.get(posicion).getEstado();
            if (estado) {
                jcbHabilitado.setSelected(true);
                jcbDeshabilitados.setSelected(false);
            } else {
                jcbHabilitado.setSelected(false);
                jcbDeshabilitados.setSelected(true);
            }

        } else if (posicion == -1) {
            JOptionPane.showMessageDialog(null, "No se encuentran equipos", "", JOptionPane.WARNING_MESSAGE);
        }


    }//GEN-LAST:event_jcbListaEquiposActionPerformed

    private void listaAsignacionUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listaAsignacionUsuariosActionPerformed
        // TODO add your handling code here:
        List <Miembro> listaUsuariosH =  Menu.miembroEscritorio.listarHabilitados();
        int posicion = -1;
        posicion = listaAsignacionUsuarios.getSelectedIndex();
        if (posicion > -1 ){
        Miembro usuarios;
        int dni = listaUsuariosH.get(posicion).getDni();
        String password = listaUsuariosH.get(posicion).getPassword();
        String apellido = listaUsuariosH.get(posicion).getApellido();
        String nombre = listaUsuariosH.get(posicion).getNombre();
        boolean estado = listaUsuariosH.get(posicion).getEstado();
        String rolSistema = listaUsuariosH.get(posicion).getRolSistema();
        usuarios = new Miembro(dni, password, apellido, nombre, estado, rolSistema);
        usuarioSeleccionado.add(usuarios);
        }
        
        
    }//GEN-LAST:event_listaAsignacionUsuariosActionPerformed

    private void listaAsignacionEquiposActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listaAsignacionEquiposActionPerformed
        // TODO add your handling code here:
        List <Equipo> listaEquipoH = Menu.equipoEscritorio.listarEquiposHabilitados();
        int posicion = -1;
        posicion = listaAsignacionEquipos.getSelectedIndex();
        if (posicion > -1 ){
            Equipo equipos;
            int idProyecto = listaEquipoH.get(posicion).getProyecto().getId_proyecto();
            String nombre = listaEquipoH.get(posicion).getNombre();
            LocalDate fechaCreacion = listaEquipoH.get(posicion).getFecha_cracion();
            boolean estado = listaEquipoH.get(posicion).getEstado();
            equipos = new Equipo(nombre, fechaCreacion, estado);
            equipoSeleccionado.add(equipos);
            
        }
    }//GEN-LAST:event_listaAsignacionEquiposActionPerformed

    private void listaAsignacionRolUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listaAsignacionRolUsuariosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_listaAsignacionRolUsuariosActionPerformed

    private void btnAsignarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAsignarActionPerformed
        // TODO add your handling code here:
        int posicionUsuario = -1;
        int posicionEquipo = -1;
        int posicionRolUsuario =-1;
        String rolUsuario ="";
        int idEquipo = -1;
        int idUsuario = -1;
        Equipo equipoBuscar = new Equipo();
        Miembro usuarioBuscar = new Miembro();
        posicionUsuario = listaAsignacionUsuarios.getSelectedIndex();
        posicionEquipo = listaAsignacionEquipos.getSelectedIndex();
        posicionRolUsuario = listaAsignacionRolUsuarios.getSelectedIndex();
        if(posicionRolUsuario == 0){
            rolUsuario = "Lider de Equipo";
        }
        else if(posicionRolUsuario == 1){
            rolUsuario ="Project Manager";
        }
        else if (posicionRolUsuario == 2) {
            rolUsuario = "Desarrolador de Sotfware";
        }
        else if(posicionRolUsuario == 3){
            rolUsuario = "Diseñador UX y UI";
        }
        if(posicionUsuario > -1) {
            idUsuario = usuarioSeleccionado.get(posicionUsuario).getId_miembro();
            usuarioBuscar = Menu.miembroEscritorio.buscarMiembro(idUsuario);
            
        }
        if (posicionEquipo > -1 ) {
            idEquipo = equipoSeleccionado.get(posicionEquipo).getId_equipo();
            equipoBuscar = Menu.equipoEscritorio.buscarEquipo(idEquipo);
        }
        LocalDate fecha_Incorporacion = fechaAsignacion.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        EquipoMiembros usuarioAsignado = new EquipoMiembros(rolUsuario, fecha_Incorporacion, equipoBuscar,usuarioBuscar);
        Menu.equipoMiembosEscritorio.guardarEquipoMiembros(usuarioAsignado);
    }//GEN-LAST:event_btnAsignarActionPerformed

    private void listaAsignacionUsuariosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listaAsignacionUsuariosMouseClicked
        // TODO add your handling code here:
        
    }//GEN-LAST:event_listaAsignacionUsuariosMouseClicked

    /* <<-- Metodos Extras -->> */

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField ActualizarNombre;
    private javax.swing.JPanel actualizacionDeEquipos;
    private com.toedter.calendar.JDateChooser actualizarFecha;
    private javax.swing.JButton btnActualizarEquipo;
    private javax.swing.JButton btnAsignar;
    private javax.swing.JButton btnCerrar;
    private javax.swing.JButton btnNuevoEquipo;
    private javax.swing.JTabbedPane contenedorPrincipal;
    private com.toedter.calendar.JDateChooser fechaAsignacion;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JCheckBox jcbDeshabilitados;
    private javax.swing.JCheckBox jcbHabilitado;
    private javax.swing.JComboBox<Proyecto> jcbListaEquipos;
    private javax.swing.JComboBox<Proyecto> jcbProyectos;
    private javax.swing.JComboBox<Equipo> listaAsignacionEquipos;
    private javax.swing.JComboBox<String> listaAsignacionRolUsuarios;
    private javax.swing.JComboBox<Miembro> listaAsignacionUsuarios;
    private javax.swing.JPanel nuevoDeEquipos;
    private com.toedter.calendar.JDateChooser nuevoFecha;
    private javax.swing.JTextField nuevoNombre;
    // End of variables declaration//GEN-END:variables

    private void cargandoProyectoV1() {
        jcbProyectos.removeAllItems();
        List<Proyecto> arrayProyectos = Menu.proyectoEscritorio.listarProyectosHabilitados();

        for (Proyecto proyectos : arrayProyectos) {
            jcbProyectos.addItem(proyectos);
        }
    }

    private void cargandoEquiposV2() {

        jcbListaEquipos.removeAllItems();
        List<Proyecto> arrayProyectos = Menu.proyectoEscritorio.listarProyectosHabilitados();

        for (Proyecto proyectos : arrayProyectos) {
            jcbListaEquipos.addItem(proyectos);
        }
    }
    
    private void mostrarUsuariosAsignacion(){
        listaAsignacionUsuarios.removeAllItems();
        List <Miembro> listaUsuariosH = Menu.miembroEscritorio.listarHabilitados();
        for (Miembro miembro : listaUsuariosH) {
            listaAsignacionUsuarios.addItem(miembro);
        }
    }
    
    private void MostrarEquipoAsignacion(){
        listaAsignacionEquipos.removeAllItems();
        List <Equipo> listaEquiposH = Menu.equipoEscritorio.listarEquiposHabilitados();
        for (Equipo equipo : listaEquiposH) {
            listaAsignacionEquipos.addItem(equipo);
        }
    }
}
