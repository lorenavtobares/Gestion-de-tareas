
package Vistas;

import Controlador.*;
import Funciones.*;
import Modelo.*;
import static Vistas.Menu.*;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import java.time.LocalDate;
import java.time.ZoneId;
import javax.swing.JComboBox;

public class GEAsignarMiembro extends javax.swing.JInternalFrame {

    private static Miembro usuario = new Miembro();
    private static MiembroData usuarioData = new  MiembroData();
    private static Equipo equipo = new  Equipo();
    private static EquipoData equipoData = new EquipoData();
    private static Proyecto proyecto = new Proyecto();
    private static ProyectoData proyectoData = new ProyectoData();

    private static List <Miembro> usuarioSeleccionado = new ArrayList<>();
    private static List <Equipo> equipoSeleccionado = new ArrayList<>();
    private static List <EquipoMiembros> listEquiposMiembros = new ArrayList<>();
    
    private int idProyectoSeleccionado = -1;
    private int idEmSeleccionado = -1;
    private int idEquipoSeleccionado = -1;
    
    private DefaultTableModel modelo = new DefaultTableModel();
    
    public GEAsignarMiembro() {
        super("Gestiones de equipos");
        initComponents();
        Funciones.inicializarCalendario(fechaAsignacion);
    
    // -> Solapa 2 - Asignacion de mienbros
        listaEquiposHabilitados(listaAsignacionEquipos);
        listaUsuariosHabilitados(listaAsignacionUsuarios);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        asignarPersonaaEquipo = new javax.swing.JPanel();
        listaAsignacionUsuarios = new javax.swing.JComboBox<>();
        listaAsignacionEquipos = new javax.swing.JComboBox<>();
        listaAsignacionRolUsuarios = new javax.swing.JComboBox<>();
        fechaAsignacion = new com.toedter.calendar.JDateChooser();
        btnAsignar = new javax.swing.JButton();
        btnCerra = new javax.swing.JButton();

        listaAsignacionUsuarios.setBorder(javax.swing.BorderFactory.createTitledBorder("Usuarios"));
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

        btnAsignar.setText("Asignacion a Equipo");
        btnAsignar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAsignarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout asignarPersonaaEquipoLayout = new javax.swing.GroupLayout(asignarPersonaaEquipo);
        asignarPersonaaEquipo.setLayout(asignarPersonaaEquipoLayout);
        asignarPersonaaEquipoLayout.setHorizontalGroup(
            asignarPersonaaEquipoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(asignarPersonaaEquipoLayout.createSequentialGroup()
                .addGap(111, 111, 111)
                .addGroup(asignarPersonaaEquipoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(listaAsignacionUsuarios, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(listaAsignacionEquipos, 0, 552, Short.MAX_VALUE)
                    .addComponent(listaAsignacionRolUsuarios, 0, 552, Short.MAX_VALUE)
                    .addComponent(fechaAsignacion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnAsignar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(133, Short.MAX_VALUE))
        );
        asignarPersonaaEquipoLayout.setVerticalGroup(
            asignarPersonaaEquipoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(asignarPersonaaEquipoLayout.createSequentialGroup()
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

        btnCerra.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/cerrar.png"))); // NOI18N
        btnCerra.setBorder(null);
        btnCerra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerraActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(734, Short.MAX_VALUE)
                .addComponent(btnCerra, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(asignarPersonaaEquipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(btnCerra, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(526, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(asignarPersonaaEquipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Solapa 2 - Lista de usuarios
    private void listaAsignacionUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listaAsignacionUsuariosActionPerformed
        List <Miembro> listaUsuariosH =  Menu.miembroDataLocal.listarHabilitados();
        
        int posicion = -1;
        posicion = listaAsignacionUsuarios.getSelectedIndex();

        for (Miembro miembro : listaUsuariosH) {
            usuarioSeleccionado.add(miembro);
        }
        
    }//GEN-LAST:event_listaAsignacionUsuariosActionPerformed

    // Solapa 2 - Lista de equipos
    private void listaAsignacionEquiposActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listaAsignacionEquiposActionPerformed
        List <Equipo> listaEquipoH = Menu.equipoDataLocal.listarEquiposHabilitados();
        int posicion = -1;
        posicion = listaAsignacionEquipos.getSelectedIndex();

        for (Equipo equipo1 : listaEquipoH) {
            equipoSeleccionado.add(equipo1);
        }
    }//GEN-LAST:event_listaAsignacionEquiposActionPerformed

    private void btnAsignarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAsignarActionPerformed
        int idEquipo = -1;
        int idUsuario = -1;
        int posicionEquipo = -1;
        int posicionRolUsuario = -1;        
        int posicionUsuario = -1;
        String rolUsuario ="";

        //Obteniendo la posicion de los jcb
        posicionUsuario = listaAsignacionUsuarios.getSelectedIndex();
        posicionEquipo = listaAsignacionEquipos.getSelectedIndex();
        posicionRolUsuario = listaAsignacionRolUsuarios.getSelectedIndex();

        //Obteniendo el rol del usuario en sistema
        rolUsuario = Funciones.rolUsuarioEquipo(posicionRolUsuario);

        if(posicionUsuario > -1) {
            idUsuario = usuarioSeleccionado.get(posicionUsuario).getId_miembro();
            usuario = regenerarUsuarios(idUsuario);
            System.out.println("id usuario " + idUsuario + "\nusuario: " + usuario.toString());
        }
        if (posicionEquipo > -1 ) {
            idEquipo = equipoSeleccionado.get(posicionEquipo).getId_equipo();
            equipo = regenerarEquiposSinProyect(idEquipo);
        }

        LocalDate fecha_Incorporacion = fechaAsignacion.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        EquipoMiembros usuarioAsignado = new EquipoMiembros(rolUsuario, fecha_Incorporacion, equipo,usuario);
        Menu.equipoMiembosDataLocal.guardarEquipoMiembros(usuarioAsignado);
    }//GEN-LAST:event_btnAsignarActionPerformed

    private void btnCerraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerraActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnCerraActionPerformed

    
             
    
    // Listas
        private void listaEquiposHabilitados( JComboBox<Equipo> e ){
            e.removeAllItems();
            List <Equipo> equipoS = Menu.equipoDataLocal.listarEquiposHabilitados();
        
            for (Equipo equipo : equipoS) {
                e.addItem(equipo);
            }
        }
        
        private void listaUsuariosHabilitados ( JComboBox <Miembro> m){        
            m.removeAllItems();
            List <Miembro> miembroS = Menu.miembroDataLocal.listarHabilitados();
            
            for (Miembro miembro : miembroS){
                m.addItem(miembro);
            }
        }
    
        
    // Tabla - Mostrar Asignacion de Usuarios
        private void mostrarUsuariosAsignacion(){
            listaAsignacionUsuarios.removeAllItems();
            List <Miembro> listaUsuariosH = Menu.miembroDataLocal.listarHabilitados();
        
            for (Miembro miembro : listaUsuariosH) {
                listaAsignacionUsuarios.addItem(miembro);
            }
        }
    
    // Regenerar Usuario
        private Miembro regenerarUsuarios (int idUsuario){
            usuario = usuarioData.buscarMiembro(idUsuario);
            return usuario;
        }

    // Regenerar Equipos
        private Equipo regenerarEquiposSinProyect(int idEquipo){
                equipo = equipoData.buscarEquipoSinProyecto(idEquipo);
                return equipo;
        }
    
    // Regenerar Proyecto
        private Proyecto regenerarProyecto(int idProyecto){
                proyecto = proyectoData.buscarProyecto(idProyecto);
                return proyecto;
        }

    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel asignarPersonaaEquipo;
    private javax.swing.JButton btnAsignar;
    private javax.swing.JButton btnCerra;
    private com.toedter.calendar.JDateChooser fechaAsignacion;
    private javax.swing.JComboBox<Equipo> listaAsignacionEquipos;
    private javax.swing.JComboBox<String> listaAsignacionRolUsuarios;
    private javax.swing.JComboBox<Miembro> listaAsignacionUsuarios;
    // End of variables declaration//GEN-END:variables
}
