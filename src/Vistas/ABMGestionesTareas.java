
package Vistas;

import Modelo.*;
import Controlador.*;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;



public class ABMGestionesTareas extends javax.swing.JInternalFrame {
    

                /*|---------------------|*/
                /*|      Variables      |*/
                /*|---------------------|*/
    
    private DefaultTableModel modelo = new DefaultTableModel();
    private static int idProyectoSeleccionado;
    
    public ABMGestionesTareas() {
        initComponents();
        regenerarProyectos();
        armarCabecera();
        llenarTabla();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        GestionDeTarea = new javax.swing.JPanel();
        listaDeProyectos = new javax.swing.JComboBox<>();
        jPanel1 = new javax.swing.JPanel();
        jcbPendiente = new javax.swing.JCheckBox();
        jcbProgeso = new javax.swing.JCheckBox();
        jcbCompletado = new javax.swing.JCheckBox();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablaMostrar = new javax.swing.JTable();
        btnComentario = new javax.swing.JButton();
        btnHistorialDeComentarios = new javax.swing.JButton();
        btnCerrar = new javax.swing.JButton();

        listaDeProyectos.setBorder(javax.swing.BorderFactory.createTitledBorder("Lista de Proyectos"));
        listaDeProyectos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listaDeProyectosActionPerformed(evt);
            }
        });

        jcbPendiente.setText("Pendiente");
        jcbPendiente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbPendienteActionPerformed(evt);
            }
        });

        jcbProgeso.setText("Progreso");
        jcbProgeso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbProgesoActionPerformed(evt);
            }
        });

        jcbCompletado.setText("Completado");
        jcbCompletado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbCompletadoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jcbPendiente)
                .addGap(142, 142, 142)
                .addComponent(jcbProgeso)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jcbCompletado)
                .addGap(20, 20, 20))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jcbPendiente)
                    .addComponent(jcbProgeso)
                    .addComponent(jcbCompletado))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        tablaMostrar.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Nombre de Tarea", "Fecha de Creacion", "Fecha de Cierre", "Descripcion", "Estado"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tablaMostrar.setColumnSelectionAllowed(true);
        jScrollPane2.setViewportView(tablaMostrar);
        tablaMostrar.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_INTERVAL_SELECTION);
        if (tablaMostrar.getColumnModel().getColumnCount() > 0) {
            tablaMostrar.getColumnModel().getColumn(0).setResizable(false);
            tablaMostrar.getColumnModel().getColumn(1).setResizable(false);
            tablaMostrar.getColumnModel().getColumn(2).setResizable(false);
            tablaMostrar.getColumnModel().getColumn(3).setResizable(false);
            tablaMostrar.getColumnModel().getColumn(4).setResizable(false);
        }

        btnComentario.setText("Comentario");
        btnComentario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnComentarioActionPerformed(evt);
            }
        });

        btnHistorialDeComentarios.setText("Historial de Comentarios");
        btnHistorialDeComentarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHistorialDeComentariosActionPerformed(evt);
            }
        });

        btnCerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/cerrar.png"))); // NOI18N
        btnCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout GestionDeTareaLayout = new javax.swing.GroupLayout(GestionDeTarea);
        GestionDeTarea.setLayout(GestionDeTareaLayout);
        GestionDeTareaLayout.setHorizontalGroup(
            GestionDeTareaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(GestionDeTareaLayout.createSequentialGroup()
                .addGap(92, 92, 92)
                .addGroup(GestionDeTareaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, GestionDeTareaLayout.createSequentialGroup()
                        .addComponent(btnComentario, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnHistorialDeComentarios, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 585, Short.MAX_VALUE)
                    .addComponent(listaDeProyectos, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(121, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, GestionDeTareaLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnCerrar)
                .addContainerGap())
        );
        GestionDeTareaLayout.setVerticalGroup(
            GestionDeTareaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(GestionDeTareaLayout.createSequentialGroup()
                .addComponent(btnCerrar)
                .addGap(21, 21, 21)
                .addComponent(listaDeProyectos, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                .addGroup(GestionDeTareaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnComentario)
                    .addComponent(btnHistorialDeComentarios))
                .addGap(23, 23, 23))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(GestionDeTarea, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(GestionDeTarea, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnCerrarActionPerformed

    private void btnHistorialDeComentariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHistorialDeComentariosActionPerformed
        Menu.Escritorio.add(Menu.GIHC);
        Menu.GIHC.toFront();
        Menu.GIHC.setVisible(true);
    }//GEN-LAST:event_btnHistorialDeComentariosActionPerformed
    
    private void listaDeProyectosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listaDeProyectosActionPerformed
        List <Proyecto> listarProyectos = Menu.proyectoDataLocal.listarProyectosHabilitados();
        int posicion =-1;
        posicion = listaDeProyectos.getSelectedIndex();
        if(posicion > -1){
            idProyectoSeleccionado = listarProyectos.get(posicion).getId_proyecto();
            jcbPendiente.setSelected(false);
            jcbPendiente.setSelected(true);
        }
    }//GEN-LAST:event_listaDeProyectosActionPerformed

    private void jcbCompletadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbCompletadoActionPerformed
        jcbCompletado.setSelected(true);
        jcbPendiente.setSelected(false);
        jcbProgeso.setSelected(false);
        llenarTabla();
    }//GEN-LAST:event_jcbCompletadoActionPerformed

    private void jcbProgesoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbProgesoActionPerformed
        jcbProgeso.setSelected(true);
        jcbPendiente.setSelected(false);
        jcbCompletado.setSelected(false);
        llenarTabla();
    }//GEN-LAST:event_jcbProgesoActionPerformed

    private void jcbPendienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbPendienteActionPerformed
        jcbPendiente.setSelected(true);
        jcbProgeso.setSelected(false);
        jcbCompletado.setSelected(false);
        llenarTabla();
    }//GEN-LAST:event_jcbPendienteActionPerformed

    private void btnComentarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnComentarioActionPerformed
        Menu.Escritorio.add(Menu.GIC);
        Menu.GIC.toFront();
        Menu.GIC.setVisible(true);
        
        int filaSeleccionada = tablaMostrar.getSelectedRow();
        List <Tarea> listaTareaSeleccionada = new ArrayList<Tarea>();
        
        if ( filaSeleccionada != -1 ){
            if(jcbPendiente.isSelected()){
                listaTareaSeleccionada = Menu.tareaDataLocal.listarTareasAll(1,idProyectoSeleccionado);
            }
            else if(jcbProgeso.isSelected()){
                listaTareaSeleccionada = Menu.tareaDataLocal.listarTareasAll(3,idProyectoSeleccionado);
            }
            else if(jcbCompletado.isSelected()){
                listaTareaSeleccionada = Menu.tareaDataLocal.listarTareasAll(4,idProyectoSeleccionado);
            }
            
            Tarea tareaSeleccionada = Menu.tareaDataLocal.buscarTarea(listaTareaSeleccionada.get(filaSeleccionada).getId_tarea());
            Menu.tareaSeleccionada = tareaSeleccionada.getNombre();
    }//GEN-LAST:event_btnComentarioActionPerformed
    }
    
    
                /*|--------------------|*/
                /*|        Tabla       |*/
                /*|--------------------|*/
    
    // Tabla - Cabecera
    private void armarCabecera(){
            ArrayList<Object> titulos=new ArrayList<>();
            titulos.add("Npmbre de Tarea");
            titulos.add("Fecha de Creacion");
            titulos.add("Fecha de Cierre");
            titulos.add("Descripcion");
            titulos.add("Estado");

            for (Object titulo : titulos) {
                modelo.addColumn(titulo);
            }
            tablaMostrar.setModel(modelo);
        }

    // Tabla - Llenar tabla
    private void llenarTabla(){
            borrarFilas();
            if(jcbPendiente.isSelected())
            {
                List <Tarea> listarTareasPendiente = Menu.tareaDataLocal.listarTareasAll(1,idProyectoSeleccionado);
                for (Tarea t : listarTareasPendiente) {
                    modelo.addRow(new Object[]{t.getNombre(),t.getFecha_creacion(),t.getFecha_cierre(),t.getDescripcion(), t.getEstado()});
                }
            }
            else if(jcbProgeso.isSelected())
            {
                List <Tarea> listarTareasProgeso = Menu.tareaDataLocal.listarTareasAll(3,idProyectoSeleccionado);
                for (Tarea t : listarTareasProgeso) {
                    modelo.addRow(new Object[]{t.getNombre(),t.getFecha_creacion(),t.getFecha_cierre(), t.getDescripcion(), t.getEstado()});
                }
            }
            else if(jcbCompletado.isSelected()){
                List <Tarea> listarTareasCompletado = Menu.tareaDataLocal.listarTareasAll(4,idProyectoSeleccionado);
                for (Tarea t : listarTareasCompletado) {
                    modelo.addRow(new Object[]{t.getNombre(),t.getFecha_creacion(),t.getFecha_cierre(), t.getDescripcion(), t.getEstado()});
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
    
    private void regenerarProyectos(){
        listaDeProyectos.removeAllItems();
        List <Proyecto> listarProyectosAll = Menu.proyectoDataLocal.listarTodosProyectos();
        for (Proyecto proyecto : listarProyectosAll) {
            listaDeProyectos.addItem(proyecto);
        }
    }
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel GestionDeTarea;
    private javax.swing.JButton btnCerrar;
    private javax.swing.JButton btnComentario;
    private javax.swing.JButton btnHistorialDeComentarios;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JCheckBox jcbCompletado;
    private javax.swing.JCheckBox jcbPendiente;
    private javax.swing.JCheckBox jcbProgeso;
    private javax.swing.JComboBox<Proyecto> listaDeProyectos;
    private javax.swing.JTable tablaMostrar;
    // End of variables declaration//GEN-END:variables
}
