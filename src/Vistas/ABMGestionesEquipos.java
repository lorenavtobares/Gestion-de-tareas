
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

public class ABMGestionesEquipos extends javax.swing.JInternalFrame {

    private static Miembro usuario = new Miembro();
    private static MiembroData usuarioData = new  MiembroData();
    private static Equipo equipo = new  Equipo();
    private static EquipoData equipoData = new EquipoData();

    private static List <Miembro> usuarioSeleccionado = new ArrayList<>();
    private static List <Equipo> equipoSeleccionado = new ArrayList<>();
    private static List <Equipo> equipoSeleccionadoTabla = new ArrayList<>();
    private DefaultTableModel modelo = new DefaultTableModel();
    public ABMGestionesEquipos() {
        initComponents();
        mostrarUsuariosAsignacion();
        mostrarEquipoAsignacion();
        mostrarEquiposInfo();
        armarCabecera();
        borrarFilas();
        llenarTabla();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        contenedorPrincipal = new javax.swing.JTabbedPane();
        asignarPersonaaEquipo = new javax.swing.JPanel();
        listaAsignacionUsuarios = new javax.swing.JComboBox<>();
        listaAsignacionEquipos = new javax.swing.JComboBox<>();
        listaAsignacionRolUsuarios = new javax.swing.JComboBox<>();
        fechaAsignacion = new com.toedter.calendar.JDateChooser();
        btnAsignar = new javax.swing.JButton();
        mostrarInformacionDeEquipo = new javax.swing.JPanel();
        listaEquiposMiembrosInfo = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        btnCerra = new javax.swing.JButton();

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

        contenedorPrincipal.addTab("Asignar Persona a Equipo", asignarPersonaaEquipo);

        listaEquiposMiembrosInfo.setBorder(javax.swing.BorderFactory.createTitledBorder(" Equipos"));
        listaEquiposMiembrosInfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listaEquiposMiembrosInfoActionPerformed(evt);
            }
        });

        tablaMostrar.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Dni", "Apellido", "Nombre", "Fecha Incorporacion", "Rol"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tablaMostrar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jScrollPane1.setViewportView(tablaMostrar);

        javax.swing.GroupLayout mostrarInformacionDeEquipoLayout = new javax.swing.GroupLayout(mostrarInformacionDeEquipo);
        mostrarInformacionDeEquipo.setLayout(mostrarInformacionDeEquipoLayout);
        mostrarInformacionDeEquipoLayout.setHorizontalGroup(
            mostrarInformacionDeEquipoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mostrarInformacionDeEquipoLayout.createSequentialGroup()
                .addGap(112, 112, 112)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 569, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(115, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, mostrarInformacionDeEquipoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(listaEquiposMiembrosInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 569, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(106, 106, 106))
        );
        mostrarInformacionDeEquipoLayout.setVerticalGroup(
            mostrarInformacionDeEquipoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mostrarInformacionDeEquipoLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(listaEquiposMiembrosInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(96, Short.MAX_VALUE))
        );

        contenedorPrincipal.addTab("Mostrar Informacion de Equipo", mostrarInformacionDeEquipo);

        btnCerra.setText("Cerrar");
        btnCerra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerraActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(contenedorPrincipal)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnCerra)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnCerra)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(contenedorPrincipal))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void listaAsignacionUsuariosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listaAsignacionUsuariosMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_listaAsignacionUsuariosMouseClicked

    private void listaAsignacionUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listaAsignacionUsuariosActionPerformed
        List <Miembro> listaUsuariosH =  Menu.miembroDataLocal.listarHabilitados();
        int posicion = -1;
        posicion = listaAsignacionUsuarios.getSelectedIndex();

        for (Miembro miembro : listaUsuariosH) {
            usuarioSeleccionado.add(miembro);
        }
    }//GEN-LAST:event_listaAsignacionUsuariosActionPerformed

    private void listaAsignacionEquiposActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listaAsignacionEquiposActionPerformed
        List <Equipo> listaEquipoH = Menu.equipoDataLocal.listarEquiposHabilitados();
        int posicion = -1;
        posicion = listaAsignacionEquipos.getSelectedIndex();

        for (Equipo equipo1 : listaEquipoH) {
            equipoSeleccionado.add(equipo1);
        }
    }//GEN-LAST:event_listaAsignacionEquiposActionPerformed

    private void listaAsignacionRolUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listaAsignacionRolUsuariosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_listaAsignacionRolUsuariosActionPerformed

    private void btnAsignarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAsignarActionPerformed
        int posicionUsuario = -1;
        int posicionEquipo = -1;
        int posicionRolUsuario =-1;
        String rolUsuario ="";
        int idEquipo = -1;
        int idUsuario = -1;

        posicionUsuario = listaAsignacionUsuarios.getSelectedIndex();
        posicionEquipo = listaAsignacionEquipos.getSelectedIndex();
        posicionRolUsuario = listaAsignacionRolUsuarios.getSelectedIndex();

        switch(posicionRolUsuario){
            case 0:
            rolUsuario = Menu.ROL_LIDER_PROYECTO;
            break;
            case 1:
            rolUsuario = Menu.ROL_PROJECT_MANAGER;
            break;
            case 2:
            rolUsuario = Menu.ROL_DEVELOPER;
            break;
            case 3:
            rolUsuario = Menu.ROL_DISENIADOR;
            break;
        }

        if(posicionUsuario > -1) {
            idUsuario = usuarioSeleccionado.get(posicionUsuario).getId_miembro();
            usuario = regenerarUsuarios(idUsuario);
        }
        if (posicionEquipo > -1 ) {
            idEquipo = equipoSeleccionado.get(posicionEquipo).getId_equipo();
            equipo = regenerarEquipos(idEquipo);
        }

        LocalDate fecha_Incorporacion = fechaAsignacion.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        EquipoMiembros usuarioAsignado = new EquipoMiembros(rolUsuario, fecha_Incorporacion, equipo,usuario);
        Menu.equipoMiembosDataLocal.guardarEquipoMiembros(usuarioAsignado);
    }//GEN-LAST:event_btnAsignarActionPerformed

    private void listaEquiposMiembrosInfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listaEquiposMiembrosInfoActionPerformed
        List <Equipo> listaEquipoH = Menu.equipoDataLocal.listarEquiposHabilitados();
        int posicion = -1;
        posicion = listaEquiposMiembrosInfo.getSelectedIndex();

        for (Equipo equipo1 : listaEquipoH) {
            equipoSeleccionadoTabla.add(equipo1);
        }
        llenarTabla();
    }//GEN-LAST:event_listaEquiposMiembrosInfoActionPerformed

    private void btnCerraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerraActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_btnCerraActionPerformed

    
                /*|--------------------|*/
                /*|        Tabla       |*/
                /*|--------------------|*/
    
    // Tabla - Cabecera
    private void armarCabecera(){
            ArrayList<Object> titulos=new ArrayList<>();
            titulos.add("Dni");
            titulos.add("Apellido");
            titulos.add("Nombre");
            titulos.add("Fecha Incorporacion");
            titulos.add("Rol");

            for (Object titulo : titulos) {
                modelo.addColumn(titulo);
            }
            tablaMostrar.setModel(modelo);
        }

    // Tabla - Llenar tabla
    private void llenarTabla(){
            borrarFilas();
            int posicionEquipo =-1;
            posicionEquipo = listaEquiposMiembrosInfo.getSelectedIndex();

            if(posicionEquipo > -1){
            List <EquipoMiembros> EMSeleccionado = Menu.equipoMiembosDataLocal.listarMiembrosEquiposTabla(equipoSeleccionadoTabla.get(posicionEquipo).getId_equipo());

                for (EquipoMiembros EM : EMSeleccionado) {
                    modelo.addRow(new Object[]{EM.getMiembro().getDni(),EM.getMiembro().getApellido(),EM.getMiembro().getNombre(),EM.getFecha_incorporacion(),EM.getRol()});
                }

            }

        }
  
    // Tabla - Borrar Filas
    private void borrarFilas(){
            int filas=modelo.getRowCount()-1;
            
            for(int i=filas;i >=0;i--){
                modelo.removeRow(i);
            }
            
        }

                /*|--------------------|*/
                /*|   Metodos Extras   |*/
                /*|--------------------|*/
    
    
       // Listar - Mostrar Equipos Informacion
    private void mostrarEquiposInfo(){
            listaEquiposMiembrosInfo.removeAllItems();
            List <Equipo> listaEquiposH = Menu.equipoDataLocal.listarEquiposHabilitados();
            
            for (Equipo equipo : listaEquiposH) {
                listaEquiposMiembrosInfo.addItem(equipo);
            }
        }
        
    // Listar - Mostrar Asignacion de equipos
    private void mostrarEquipoAsignacion(){
            listaAsignacionEquipos.removeAllItems();
            List <Equipo> listaEquiposH = Menu.equipoDataLocal.listarEquiposHabilitados();
        
            for (Equipo equipo : listaEquiposH) {
                listaAsignacionEquipos.addItem(equipo);
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
    private Equipo regenerarEquipos(int idEquipo){
            equipo = equipoData.buscarEquipo(idEquipo);
            return equipo;
        }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel asignarPersonaaEquipo;
    private javax.swing.JButton btnAsignar;
    private javax.swing.JButton btnCerra;
    private javax.swing.JTabbedPane contenedorPrincipal;
    private com.toedter.calendar.JDateChooser fechaAsignacion;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox<Equipo> listaAsignacionEquipos;
    private javax.swing.JComboBox<String> listaAsignacionRolUsuarios;
    private javax.swing.JComboBox<Miembro> listaAsignacionUsuarios;
    private javax.swing.JComboBox<Equipo> listaEquiposMiembrosInfo;
    private javax.swing.JPanel mostrarInformacionDeEquipo;
    private final javax.swing.JTable tablaMostrar = new javax.swing.JTable();
    // End of variables declaration//GEN-END:variables
}
