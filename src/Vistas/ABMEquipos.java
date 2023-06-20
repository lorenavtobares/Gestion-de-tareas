package Vistas;


import Controlador.*;
import Funciones.*;
import Modelo.*;
import static Vistas.Menu.*;
import java.util.Date;
import javax.swing.JOptionPane;
import com.toedter.calendar.JCalendar;
import java.awt.Color;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.DefaultTableModel;

public class ABMEquipos extends javax.swing.JInternalFrame {

                /*|---------------------|*/
                /*|      Variables      |*/
                /*|---------------------|*/
    
    private static Miembro usuario = new Miembro();
    private static MiembroData usuarioData = new  MiembroData();
    private static Equipo equipo = new  Equipo();
    private static EquipoData equipoData = new EquipoData();
    
    
    
    
    
    public ABMEquipos() {
        initComponents();
        nuevoFecha.setMinSelectableDate(new Date());
        cargandoProyectoV1();
        cargandoEquiposV2();
      
        
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
                .addContainerGap(47, Short.MAX_VALUE))
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

                /*|-------------------------|*/
                /*|   Validacion de datos   |*/
                /*|-------------------------|*/
    
    // Vista 1 - nuevo Equipo -> NOMBRE: Validacion de datos
    private void nuevoNombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nuevoNombreKeyTyped
        Funciones.soloLetras(nuevoNombre, evt, 45);
    }//GEN-LAST:event_nuevoNombreKeyTyped

    // Vista 2 - Actualizacion Equipo -> NOMBRE: Validacion de datos
    private void ActualizarNombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ActualizarNombreKeyTyped
        Funciones.soloLetras(ActualizarNombre, evt, 45);
    }//GEN-LAST:event_ActualizarNombreKeyTyped
    

                /*|-------------------------|*/
                /*|         Celendario      |*/
                /*|-------------------------|*/
    
    public void formatoCalendario() {
        actualizarFecha.setDate(new Date());
        nuevoFecha.getJCalendar().setMaxSelectableDate(new Date());
    }
    
    
    
                /*|-------------------------|*/
                /*|    Eventos Generados    |*/
                /*|-------------------------|*/
    
    private void btnNuevoEquipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoEquipoActionPerformed
        String nombre = nuevoNombre.getText();
        LocalDate fechaCreacion = nuevoFecha.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        List<Proyecto> arrayProyectos = Menu.proyectoDataLocal.listarProyectosHabilitados();
        //Proyecto proyectoLocal = new Proyecto();
        int posicion = -1;
        posicion = jcbProyectos.getSelectedIndex();

        Menu.equipoLocal = new Equipo(arrayProyectos.get(posicion).getId_proyecto(), arrayProyectos.get(posicion), nombre, fechaCreacion, true);
        Menu.equipoDataLocal.GuardarEquipo(equipoLocal);
    }//GEN-LAST:event_btnNuevoEquipoActionPerformed

    //Solapa 2 - Actualizar Datos -> Btn guardar datos
    private void btnActualizarEquipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarEquipoActionPerformed
        String nombre = ActualizarNombre.getText();
        LocalDate fechaCreacion = actualizarFecha.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        boolean estado;
        List<Proyecto> arrayProyectos = Menu.proyectoDataLocal.listarProyectosHabilitados();
        Proyecto proyectoLocal = new Proyecto();
        int posicion = -1;
        posicion = jcbListaEquipos.getSelectedIndex();
        
        if (!nombre.isEmpty()) {

            if (jcbHabilitado.isSelected()) {
                estado = true;
            } else {
                estado = false;
            }

            Menu.equipoLocal = new Equipo(arrayProyectos.get(posicion).getId_proyecto(), arrayProyectos.get(posicion), nombre, fechaCreacion, estado);
            Menu.equipoDataLocal.actualizarEquipo(equipoLocal);

        } else {
            JOptionPane.showMessageDialog(null, Menu.ERROR_NOMBRE, Menu.TT_ERROR, JOptionPane.WARNING_MESSAGE);
            ActualizarNombre.requestFocus();
        }

    }//GEN-LAST:event_btnActualizarEquipoActionPerformed

    //Solapa 2 - Actualizar Datos -> Cargar Datos del furmulario Items ComboBox
    private void jcbListaEquiposActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbListaEquiposActionPerformed
        List<Equipo> arrayEquipos = Menu.equipoDataLocal.listarTodosEquipos();
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
            JOptionPane.showMessageDialog(null, Menu.ERROR_EQUIPOS, Menu.TT_ERROR, JOptionPane.WARNING_MESSAGE);
        }


    }//GEN-LAST:event_jcbListaEquiposActionPerformed

    private void btnCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnCerrarActionPerformed

    
                
    
    
    
                /*|--------------------|*/
                /*|   Metodos Extras   |*/
                /*|--------------------|*/
    
    // Regenerar Usuario
    private Miembro regenerarUsuarios (int idUsuario){
            usuario = usuarioData.buscarMiembro(idUsuario);
            return usuario;
        }

    // Regenerar Equipos
    private Equipo regenerarEquipos(int idEquipo){
            equipo = equipoData.buscarEquipo(idEquipo);
            return equipo;
        }

    // Listar Proyectos Habiltiados
    private void cargandoProyectoV1() {
            jcbProyectos.removeAllItems();
            List<Proyecto> arrayProyectos = Menu.proyectoDataLocal.listarProyectosHabilitados();

            for (Proyecto proyectos : arrayProyectos) {
                jcbProyectos.addItem(proyectos);
            }
        }

 

    // Cargar Equipos Version 2
    private void cargandoEquiposV2() {

            jcbListaEquipos.removeAllItems();
            List<Proyecto> arrayProyectos = Menu.proyectoDataLocal.listarProyectosHabilitados();

            for (Proyecto proyectos : arrayProyectos) {
                jcbListaEquipos.addItem(proyectos);
            }
        }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField ActualizarNombre;
    private javax.swing.JPanel actualizacionDeEquipos;
    private com.toedter.calendar.JDateChooser actualizarFecha;
    private javax.swing.JButton btnActualizarEquipo;
    private javax.swing.JButton btnCerrar;
    private javax.swing.JButton btnNuevoEquipo;
    private javax.swing.JTabbedPane contenedorPrincipal;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JCheckBox jcbDeshabilitados;
    private javax.swing.JCheckBox jcbHabilitado;
    private javax.swing.JComboBox<Proyecto> jcbListaEquipos;
    private javax.swing.JComboBox<Proyecto> jcbProyectos;
    private javax.swing.JPanel nuevoDeEquipos;
    private com.toedter.calendar.JDateChooser nuevoFecha;
    private javax.swing.JTextField nuevoNombre;
    // End of variables declaration//GEN-END:variables
   
}