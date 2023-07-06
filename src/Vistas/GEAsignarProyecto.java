
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

public class GEAsignarProyecto extends javax.swing.JInternalFrame {

    private static Equipo equipo = new  Equipo();
    private static EquipoData equipoData = new EquipoData();
    private static Proyecto proyecto = new Proyecto();
    private static ProyectoData proyectoData = new ProyectoData();

    private static List <Equipo> equipoSeleccionado = new ArrayList<>();
    private static List <Proyecto> proyectoSeleccionado = new ArrayList<>();
    private static List <EquipoMiembros> listEquiposMiembros = new ArrayList<>();
    
    private int idProyectoSeleccionado = -1;
    private int idEmSeleccionado = -1;
    private int idEquipoSeleccionado = -1;
    
    public GEAsignarProyecto() {
        super("Gestiones de equipos");
        initComponents();
                
    // -> Solapa 1 - Asignacion de proyecto
        listaProyectosHabilitados(listaAsigProProyectos);
        listaEquiposHabilitados(listaAsigProEquipos);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        asignarProyecto = new javax.swing.JPanel();
        listaAsigProEquipos = new javax.swing.JComboBox<>();
        listaAsigProProyectos = new javax.swing.JComboBox<>();
        btnAsignarProyecto = new javax.swing.JButton();
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
                    .addComponent(asignarProyecto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                    .addComponent(asignarProyecto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCerraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerraActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnCerraActionPerformed

    // -> Asignar proyecto a equipo
     
    private void btnAsignarProyectoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAsignarProyectoActionPerformed

        try{
            idEquipoSeleccionado = listaAsigProEquipos.getSelectedIndex();
            idProyectoSeleccionado = listaAsigProProyectos.getSelectedIndex();
            
            if (idEquipoSeleccionado > -1 && idProyectoSeleccionado > -1) {
                
                int idEquipoLocal = equipoSeleccionado.get(idEquipoSeleccionado).getId_equipo();
                int idProyectoLocal = proyectoSeleccionado.get(idProyectoSeleccionado).getId_proyecto();
                
                System.out.println("ID Equipo Local " + idEquipoLocal);
                System.out.println("ID Proyecto Local" + idProyectoLocal);
                
                Equipo equipoLocal = new  Equipo();
                equipoLocal = regenerarEquiposSinProyect(idEquipoLocal);

                Proyecto proyectoLocal = new Proyecto();
                proyectoLocal = regenerarProyecto(idProyectoLocal);

                asignarProyecto(equipoLocal, proyectoLocal);

            }else{
                System.out.println("No ingresa al If");
            }

        }catch( Exception e){
            System.out.println("Error Asignar -> " + e.getMessage());
        }

    }//GEN-LAST:event_btnAsignarProyectoActionPerformed


    
                /*|--------------------|*/
                /*|   Metodos Extras   |*/
                /*|--------------------|*/
    
    // Listas
        private void listaProyectosHabilitados( JComboBox<Proyecto> p ){
            p.removeAllItems();
            proyectoSeleccionado = Menu.proyectoDataLocal.listarProyectosHabilitados();
            
            for (Proyecto proyecto : proyectoSeleccionado) {
                p.addItem(proyecto);
            }
        }
        
        private void listaEquiposHabilitados( JComboBox<Equipo> e ){
            e.removeAllItems();
            equipoSeleccionado = Menu.equipoDataLocal.listarEquiposHabilitados();
        
            for (Equipo equipo : equipoSeleccionado) {
                e.addItem(equipo);
            }
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
    private javax.swing.JPanel asignarProyecto;
    private javax.swing.JButton btnAsignarProyecto;
    private javax.swing.JButton btnCerra;
    private javax.swing.JComboBox<Equipo> listaAsigProEquipos;
    private javax.swing.JComboBox<Proyecto> listaAsigProProyectos;
    // End of variables declaration//GEN-END:variables
}
