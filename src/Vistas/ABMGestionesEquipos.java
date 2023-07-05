
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

public class ABMGestionesEquipos extends javax.swing.JInternalFrame {

    private static Miembro usuario = new Miembro();
    private static MiembroData usuarioData = new  MiembroData();
    private static Equipo equipo = new  Equipo();
    private static EquipoData equipoData = new EquipoData();
    private static Proyecto proyecto = new Proyecto();
    private static ProyectoData proyectoData = new ProyectoData();

    private static List <Miembro> usuarioSeleccionado = new ArrayList<>();
    private static List <Equipo> equipoSeleccionado = new ArrayList<>();
    private static List <Equipo> equipoSeleccionadoTabla = new ArrayList<>();
    private static List <Proyecto> proyectoSeleccionado = new ArrayList<>();
    private static List <EquipoMiembros> listEquiposMiembros = new ArrayList<>();
    
    private int idProyectoSeleccionado = -1;
    private int idEmSeleccionado = -1;
    private int idEquipoSeleccionado = -1;
    
    private DefaultTableModel modelo = new DefaultTableModel();
    
    public ABMGestionesEquipos() {
        super("Gestiones de equipos");
        initComponents();
        Funciones.inicializarCalendario(fechaAsignacion);
        
    // -> Solapa 1 - Asignacion de proyecto
        listaProyectosHabilitados(listaAsigProProyectos);
        listaEquiposHabilitados(listaAsigProEquipos);
    
    // -> Solapa 2 - Asignacion de mienbros
        listaEquiposHabilitados(listaAsignacionEquipos);
        listaUsuariosHabilitados(listaAsignacionUsuarios);
        
    
    // -> Solapa 3 - Informacion del equipo
        listaEquiposHabilitados(listaInfoEquipos);
    
    // -> Tabla
        armarCabecera();
        borrarFilas();
        llenarTabla();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        contenedorPrincipal = new javax.swing.JTabbedPane();
        asignarProyecto = new javax.swing.JPanel();
        listaAsigProEquipos = new javax.swing.JComboBox<>();
        listaAsigProProyectos = new javax.swing.JComboBox<>();
        btnAsignarProyecto = new javax.swing.JButton();
        asignarPersonaaEquipo = new javax.swing.JPanel();
        listaAsignacionUsuarios = new javax.swing.JComboBox<>();
        listaAsignacionEquipos = new javax.swing.JComboBox<>();
        listaAsignacionRolUsuarios = new javax.swing.JComboBox<>();
        fechaAsignacion = new com.toedter.calendar.JDateChooser();
        btnAsignar = new javax.swing.JButton();
        mostrarInformacionDeEquipo = new javax.swing.JPanel();
        panelTablaIntegrantes = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        listaInfoEquipos = new javax.swing.JComboBox<>();
        infoEquipoAsignado = new javax.swing.JTextField();
        btnCerra = new javax.swing.JButton();

        listaAsigProEquipos.setBorder(javax.swing.BorderFactory.createTitledBorder("Equipos"));

        listaAsigProProyectos.setBorder(javax.swing.BorderFactory.createTitledBorder("Proyectos"));

        btnAsignarProyecto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/mas.png"))); // NOI18N
        btnAsignarProyecto.setText("Asignar Proyecto");
        btnAsignarProyecto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAsignarProyectoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout asignarProyectoLayout = new javax.swing.GroupLayout(asignarProyecto);
        asignarProyecto.setLayout(asignarProyectoLayout);
        asignarProyectoLayout.setHorizontalGroup(
            asignarProyectoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, asignarProyectoLayout.createSequentialGroup()
                .addGap(113, 113, 113)
                .addGroup(asignarProyectoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(listaAsigProProyectos, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(listaAsigProEquipos, 0, 552, Short.MAX_VALUE)
                    .addComponent(btnAsignarProyecto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(131, 131, 131))
        );
        asignarProyectoLayout.setVerticalGroup(
            asignarProyectoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(asignarProyectoLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(listaAsigProEquipos, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(listaAsigProProyectos, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 214, Short.MAX_VALUE)
                .addComponent(btnAsignarProyecto, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(64, 64, 64))
        );

        contenedorPrincipal.addTab("Asignar Proyecto a Equipo", asignarProyecto);

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

        contenedorPrincipal.addTab("Asignar Persona a Equipo", asignarPersonaaEquipo);

        mostrarInformacionDeEquipo.setMaximumSize(new java.awt.Dimension(900, 900));
        mostrarInformacionDeEquipo.setPreferredSize(new java.awt.Dimension(800, 482));

        panelTablaIntegrantes.setBorder(javax.swing.BorderFactory.createTitledBorder("Informacion de los integrantes"));
        panelTablaIntegrantes.setMaximumSize(new java.awt.Dimension(900, 900));

        tablaIntegrantes.setModel(new javax.swing.table.DefaultTableModel(
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
        tablaIntegrantes.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        tablaIntegrantes.setMaximumSize(new java.awt.Dimension(800, 64));
        jScrollPane1.setViewportView(tablaIntegrantes);

        javax.swing.GroupLayout panelTablaIntegrantesLayout = new javax.swing.GroupLayout(panelTablaIntegrantes);
        panelTablaIntegrantes.setLayout(panelTablaIntegrantesLayout);
        panelTablaIntegrantesLayout.setHorizontalGroup(
            panelTablaIntegrantesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelTablaIntegrantesLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 697, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14))
        );
        panelTablaIntegrantesLayout.setVerticalGroup(
            panelTablaIntegrantesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelTablaIntegrantesLayout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 210, Short.MAX_VALUE)
                .addContainerGap())
        );

        listaInfoEquipos.setBorder(javax.swing.BorderFactory.createTitledBorder("Lista de equipos"));
        listaInfoEquipos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listaInfoEquiposActionPerformed(evt);
            }
        });

        infoEquipoAsignado.setBorder(javax.swing.BorderFactory.createTitledBorder("Equipo Asignado"));

        javax.swing.GroupLayout mostrarInformacionDeEquipoLayout = new javax.swing.GroupLayout(mostrarInformacionDeEquipo);
        mostrarInformacionDeEquipo.setLayout(mostrarInformacionDeEquipoLayout);
        mostrarInformacionDeEquipoLayout.setHorizontalGroup(
            mostrarInformacionDeEquipoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mostrarInformacionDeEquipoLayout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addComponent(listaInfoEquipos, javax.swing.GroupLayout.PREFERRED_SIZE, 620, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(mostrarInformacionDeEquipoLayout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addComponent(infoEquipoAsignado, javax.swing.GroupLayout.PREFERRED_SIZE, 620, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(mostrarInformacionDeEquipoLayout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(panelTablaIntegrantes, javax.swing.GroupLayout.PREFERRED_SIZE, 720, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        mostrarInformacionDeEquipoLayout.setVerticalGroup(
            mostrarInformacionDeEquipoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mostrarInformacionDeEquipoLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(listaInfoEquipos, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addComponent(infoEquipoAsignado, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19)
                .addComponent(panelTablaIntegrantes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        contenedorPrincipal.addTab("Mostrar Informacion de Equipo", mostrarInformacionDeEquipo);

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
            .addComponent(contenedorPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, 798, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnCerra, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(btnCerra, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(contenedorPrincipal))
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

    private void listaInfoEquiposActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listaInfoEquiposActionPerformed

        try {
            
            idProyectoSeleccionado = listaInfoEquipos.getSelectedIndex();
            
            if ( idProyectoSeleccionado > -1 ){
                llenarTabla();
            }
            

        } catch ( Exception ex ){
            System.out.println("ERROR -> " + ex.getMessage());
        }

    }//GEN-LAST:event_listaInfoEquiposActionPerformed

    // -> Asignar proyecto a equipo
     
    private void btnAsignarProyectoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAsignarProyectoActionPerformed
        
        try{
            idEquipoSeleccionado = listaAsigProEquipos.getSelectedIndex();
            idProyectoSeleccionado = listaAsigProProyectos.getSelectedIndex();
            
            if (idEquipoSeleccionado > -1 && idProyectoSeleccionado > -1) {
                
                int idEquipoLocal = equipoSeleccionado.get(idEquipoSeleccionado).getId_equipo();
                int idProyectoLocal = proyectoSeleccionado.get(idProyectoSeleccionado).getId_proyecto();
                
                Equipo equipoLocal = new  Equipo();
                equipoLocal = regenerarEquiposSinProyect(idEquipoLocal);
                
                Proyecto proyectoLocal = new Proyecto();
                proyectoLocal = regenerarProyecto(idProyectoLocal);
                
                asignarProyecto(equipoLocal, proyectoLocal);

            }
            
        }catch( Exception e){
            System.out.println("Error Asignar -> " + e.getMessage());
        }
        
    }//GEN-LAST:event_btnAsignarProyectoActionPerformed

    
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
            tablaIntegrantes.setModel(modelo);
        }

    // Tabla - Llenar tabla
    private void llenarTabla(){
            borrarFilas();
            //idEmSeleccionado = listaInfoproyectos.getSelectedIndex();
            idEmSeleccionado = 1;

            
            if ( idEmSeleccionado > -1) {
            listEquiposMiembros = Menu.equipoMiembosDataLocal.listarMiembrosEquiposTabla(proyectoSeleccionado.get(idEmSeleccionado).getId_proyecto());

                for (EquipoMiembros EM : listEquiposMiembros) {
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
    
    // Listas
        private void listaProyectosHabilitados( JComboBox<Proyecto> p ){
            listaInfoEquipos.removeAllItems();
            proyectoSeleccionado = Menu.proyectoDataLocal.listarProyectosHabilitados();
            //List <Proyecto> proyectoS = Menu.proyectoDataLocal.listarProyectosHabilitados();
            
            for (Proyecto proyecto : proyectoSeleccionado) {
                p.addItem(proyecto);
            }
        }
        
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
    
    //Asignar Proyecto
        private Equipo asignarProyecto( Equipo e, Proyecto p){
            equipoDataLocal.asignarProyecto(e, p);
            return e;
        }
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel asignarPersonaaEquipo;
    private javax.swing.JPanel asignarProyecto;
    private javax.swing.JButton btnAsignar;
    private javax.swing.JButton btnAsignarProyecto;
    private javax.swing.JButton btnCerra;
    private javax.swing.JTabbedPane contenedorPrincipal;
    private com.toedter.calendar.JDateChooser fechaAsignacion;
    private javax.swing.JTextField infoEquipoAsignado;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox<Equipo> listaAsigProEquipos;
    private javax.swing.JComboBox<Proyecto> listaAsigProProyectos;
    private javax.swing.JComboBox<Equipo> listaAsignacionEquipos;
    private javax.swing.JComboBox<String> listaAsignacionRolUsuarios;
    private javax.swing.JComboBox<Miembro> listaAsignacionUsuarios;
    private javax.swing.JComboBox<Equipo> listaInfoEquipos;
    private javax.swing.JPanel mostrarInformacionDeEquipo;
    private javax.swing.JPanel panelTablaIntegrantes;
    private final javax.swing.JTable tablaIntegrantes = new javax.swing.JTable();
    // End of variables declaration//GEN-END:variables
}
