
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
import javax.swing.ListSelectionModel;

public class GEInformacionEquipo extends javax.swing.JInternalFrame {

    private static Miembro usuario = new Miembro();
    private static MiembroData usuarioData = new  MiembroData();
    private static Equipo equipo = new  Equipo();
    private static EquipoData equipoData = new EquipoData();
    private static Proyecto proyecto = new Proyecto();
    private static ProyectoData proyectoData = new ProyectoData();

    private static List <Miembro> usuarioSeleccionado = new ArrayList<>();
    private static List <Equipo> equipoSeleccionado = new ArrayList<>();
    private static List <Proyecto> proyectoSeleccionado = new ArrayList<>();
    private static List <EquipoMiembros> listEquiposMiembros = new ArrayList<>();
    
    private int idProyectoSeleccionado = -1;
    private int EmIndex = -1;
    private int EmIDSeleccionado = -1;
    private int idEquipoSeleccionado = -1;
    private int filaSeleccionada = -1;
    private String nombreEquipo = "";

    private DefaultTableModel modelo = new DefaultTableModel();
    
    public GEInformacionEquipo() {
        super("Gestiones de equipos");
        initComponents();
    
    // -> Solapa 3 - Informacion del equipo
        listaProyectosHabilitados(listaInfoProyectos);
    
    // -> Tabla
        armarCabecera();
        llenarTabla();
        tablaIntegrantes.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mostrarInformacionDeEquipo = new javax.swing.JPanel();
        panelTablaIntegrantes = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        listaInfoProyectos = new javax.swing.JComboBox<>();
        btnDesvincular = new javax.swing.JButton();
        btnCerra = new javax.swing.JButton();

        mostrarInformacionDeEquipo.setMaximumSize(new java.awt.Dimension(900, 900));
        mostrarInformacionDeEquipo.setPreferredSize(new java.awt.Dimension(800, 482));

        panelTablaIntegrantes.setBorder(javax.swing.BorderFactory.createTitledBorder("Informacion de los integrantes"));
        panelTablaIntegrantes.setMaximumSize(new java.awt.Dimension(900, 900));

        tablaIntegrantes.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        tablaIntegrantes.setMaximumSize(new java.awt.Dimension(800, 64));
        tablaIntegrantes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablaIntegrantesMouseClicked(evt);
            }
        });
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
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 282, Short.MAX_VALUE)
                .addContainerGap())
        );

        listaInfoProyectos.setBorder(javax.swing.BorderFactory.createTitledBorder("Lista de Proyectos"));
        listaInfoProyectos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listaInfoProyectosActionPerformed(evt);
            }
        });

        btnDesvincular.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/cerrar.png"))); // NOI18N
        btnDesvincular.setText("Desvincular miembro del equipo");
        btnDesvincular.setEnabled(false);
        btnDesvincular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDesvincularActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout mostrarInformacionDeEquipoLayout = new javax.swing.GroupLayout(mostrarInformacionDeEquipo);
        mostrarInformacionDeEquipo.setLayout(mostrarInformacionDeEquipoLayout);
        mostrarInformacionDeEquipoLayout.setHorizontalGroup(
            mostrarInformacionDeEquipoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mostrarInformacionDeEquipoLayout.createSequentialGroup()
                .addGroup(mostrarInformacionDeEquipoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(mostrarInformacionDeEquipoLayout.createSequentialGroup()
                        .addGap(80, 80, 80)
                        .addComponent(listaInfoProyectos, javax.swing.GroupLayout.PREFERRED_SIZE, 620, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(mostrarInformacionDeEquipoLayout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(panelTablaIntegrantes, javax.swing.GroupLayout.PREFERRED_SIZE, 720, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(mostrarInformacionDeEquipoLayout.createSequentialGroup()
                        .addGap(139, 139, 139)
                        .addComponent(btnDesvincular, javax.swing.GroupLayout.PREFERRED_SIZE, 461, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(44, 44, 44))
        );
        mostrarInformacionDeEquipoLayout.setVerticalGroup(
            mostrarInformacionDeEquipoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mostrarInformacionDeEquipoLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(listaInfoProyectos, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(panelTablaIntegrantes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                .addComponent(btnDesvincular)
                .addGap(14, 14, 14))
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
                .addContainerGap(736, Short.MAX_VALUE)
                .addComponent(btnCerra, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(mostrarInformacionDeEquipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                    .addComponent(mostrarInformacionDeEquipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCerraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerraActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnCerraActionPerformed

    private void listaInfoProyectosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listaInfoProyectosActionPerformed
        EmIndex = listaInfoProyectos.getSelectedIndex();
        try{
            if ( EmIndex > -1 ){
                llenarTabla();
            }
        }catch (Exception ex){
            System.out.println("Error jcb\n" + ex.getMessage());
        }
    }//GEN-LAST:event_listaInfoProyectosActionPerformed

    private void tablaIntegrantesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablaIntegrantesMouseClicked
        filaSeleccionada = tablaIntegrantes.getSelectedRow();
        btnDesvincular.setEnabled(true);
    }//GEN-LAST:event_tablaIntegrantesMouseClicked

    private void btnDesvincularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDesvincularActionPerformed
        try{
        
            if(filaSeleccionada > -1){
                int idMiembro = listEquiposMiembros.get(filaSeleccionada).getId_equipo_miembros();
                Menu.equipoMiembosDataLocal.eliminarMiembros(idMiembro);
                llenarTabla();
            }
            
        }catch ( Exception ex ){
            System.out.println("Error Desvincular\n" + ex.getMessage());
        }
    }//GEN-LAST:event_btnDesvincularActionPerformed

    
                /*|--------------------|*/
                /*|        Tabla       |*/
                /*|--------------------|*/
    
    // Tabla - Cabecera
        private void armarCabecera(){
            ArrayList <Object> titulos = new ArrayList<>();

            titulos.add("Dni");
            titulos.add("Apellido");
            titulos.add("Nombre");
            titulos.add("Rol");

            for (Object titulo : titulos) {
                modelo.addColumn(titulo);
            }
            tablaIntegrantes.setModel(modelo);
        }
    
    // Tabla - Borrar Filas
        private void borrarFilas(){
            int filas = modelo.getRowCount()-1;
            
            for( int i = filas ; i >= 0 ; i--){
                modelo.removeRow(i);
            }
            
        }

    // Tabla - Llenar tabla
        private void llenarTabla(){
            try{
                borrarFilas();  
                listEquiposMiembros = Menu.equipoMiembosDataLocal.listarMiembrosEquiposTabla( proyectoSeleccionado.get( EmIndex ).getId_proyecto() );

                for ( EquipoMiembros e : listEquiposMiembros )
                {
                    modelo.addRow(new Object[]{ e.getMiembro().getDni(), e.getMiembro().getApellido(), e.getMiembro().getNombre(), e.getRol() });
                }
            }catch ( Exception ex ){
                System.out.println("Error Tabla \n" + ex.getMessage());
            }

        }
  
    
    
    
                /*|--------------------|*/
                /*|   Metodos Extras   |*/
                /*|--------------------|*/
    
    // Listas
        private void listaProyectosHabilitados( JComboBox<Proyecto> p ){
            listaInfoProyectos.removeAllItems();
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
    private javax.swing.JButton btnCerra;
    private javax.swing.JButton btnDesvincular;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox<Proyecto> listaInfoProyectos;
    private javax.swing.JPanel mostrarInformacionDeEquipo;
    private javax.swing.JPanel panelTablaIntegrantes;
    private final javax.swing.JTable tablaIntegrantes = new javax.swing.JTable();
    // End of variables declaration//GEN-END:variables
}
