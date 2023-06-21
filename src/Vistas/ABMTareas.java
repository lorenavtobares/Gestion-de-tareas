package Vistas;

import Controlador.TareaData;
import Modelo.Equipo;
import Modelo.EquipoMiembros;
import Modelo.Miembro;
import Modelo.Tarea;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;
import javax.swing.JOptionPane;

public class ABMTareas extends javax.swing.JInternalFrame {

    private Date fechaSistema = new Date();

    private List<Miembro> listaMiembro = new ArrayList<>();
    private List<Equipo> listaEquipo = new ArrayList<>();
    private List<Tarea> listaTareas = new ArrayList<>();
    private List<EquipoMiembros> listaEquipoMiembros = new ArrayList<>();

    private Miembro miembro = new Miembro();
    private Tarea tarea = new Tarea();
    private EquipoMiembros equipoMiembro = new EquipoMiembros();

    private TareaData tareaData = new TareaData();

    public ABMTareas() {
        initComponents();
        cargandoEquipos();
        cargandoMiembros();
        cargandoTareas();
        jcbEquipos.setSelectedIndex(0);
        actualizandoFecha();

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        contenedorPrincipal = new javax.swing.JTabbedPane();
        altaDeTarea = new javax.swing.JPanel();
        altaTareaNombre = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        altaTareaDescripcion = new javax.swing.JTextArea();
        btnAltaTareaGuardar = new javax.swing.JButton();
        jcbMiembros = new javax.swing.JComboBox<>();
        jcbEquipos = new javax.swing.JComboBox<>();
        jdcDateInicio = new com.toedter.calendar.JDateChooser();
        jdcDateCierre = new com.toedter.calendar.JDateChooser();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        btnUpdateTareaActualizar = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        updateTareaDescripcionTareas = new javax.swing.JTextArea();
        jdcDateInicio_V2 = new com.toedter.calendar.JDateChooser();
        jdcDateCierre_V2 = new com.toedter.calendar.JDateChooser();
        jcbDeshabilitar = new javax.swing.JCheckBox();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jcbListaTareasHabilitadas = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jcbEquipos_V2 = new javax.swing.JComboBox<>();
        jcbMiembros_V2 = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        btnCerrar = new javax.swing.JButton();

        altaTareaNombre.setBorder(javax.swing.BorderFactory.createTitledBorder("NOMBRE"));

        altaTareaDescripcion.setColumns(20);
        altaTareaDescripcion.setRows(5);
        altaTareaDescripcion.setBorder(javax.swing.BorderFactory.createTitledBorder("DESCRIPCION DE LA TAREA"));
        jScrollPane1.setViewportView(altaTareaDescripcion);

        btnAltaTareaGuardar.setText("Crear Tarea");
        btnAltaTareaGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAltaTareaGuardarActionPerformed(evt);
            }
        });

        jcbMiembros.setBorder(javax.swing.BorderFactory.createTitledBorder("Mienbros"));

        jcbEquipos.setBorder(javax.swing.BorderFactory.createTitledBorder("Equipos"));
        jcbEquipos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbEquiposActionPerformed(evt);
            }
        });

        jLabel1.setText("Fecha de Inicio");

        jLabel2.setText("Fecha de Cierre");

        javax.swing.GroupLayout altaDeTareaLayout = new javax.swing.GroupLayout(altaDeTarea);
        altaDeTarea.setLayout(altaDeTareaLayout);
        altaDeTareaLayout.setHorizontalGroup(
            altaDeTareaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, altaDeTareaLayout.createSequentialGroup()
                .addContainerGap(124, Short.MAX_VALUE)
                .addGroup(altaDeTareaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(altaDeTareaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(altaDeTareaLayout.createSequentialGroup()
                            .addComponent(jcbEquipos, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jcbMiembros, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(altaTareaNombre, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 550, Short.MAX_VALUE))
                    .addGroup(altaDeTareaLayout.createSequentialGroup()
                        .addGroup(altaDeTareaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jdcDateInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(altaDeTareaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(altaDeTareaLayout.createSequentialGroup()
                                .addGap(223, 223, 223)
                                .addComponent(jLabel2))
                            .addGroup(altaDeTareaLayout.createSequentialGroup()
                                .addGap(191, 191, 191)
                                .addComponent(jdcDateCierre, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(btnAltaTareaGuardar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 550, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(111, 111, 111))
        );
        altaDeTareaLayout.setVerticalGroup(
            altaDeTareaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(altaDeTareaLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(altaTareaNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(altaDeTareaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jcbEquipos, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jcbMiembros))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(altaDeTareaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(altaDeTareaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jdcDateInicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jdcDateCierre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addComponent(btnAltaTareaGuardar)
                .addGap(23, 23, 23))
        );

        contenedorPrincipal.addTab("Alta de Tarea", altaDeTarea);

        btnUpdateTareaActualizar.setText("Actualizar Tarea");
        btnUpdateTareaActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateTareaActualizarActionPerformed(evt);
            }
        });

        updateTareaDescripcionTareas.setColumns(20);
        updateTareaDescripcionTareas.setRows(5);
        updateTareaDescripcionTareas.setBorder(javax.swing.BorderFactory.createTitledBorder("DESCRIPCION DE LA TAREA"));
        jScrollPane3.setViewportView(updateTareaDescripcionTareas);

        jcbDeshabilitar.setText("Deshabilitar");
        jcbDeshabilitar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbDeshabilitarActionPerformed(evt);
            }
        });

        jLabel3.setText("Fecha de Inicio");

        jLabel4.setText("Fecha de cierre");

        jcbListaTareasHabilitadas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbListaTareasHabilitadasActionPerformed(evt);
            }
        });

        jLabel5.setText("Tarea");

        jLabel6.setText("Miembros");

        jLabel7.setText("Equipos");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(73, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jdcDateInicio_V2, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(41, 41, 41)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jdcDateCierre_V2, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(47, 47, 47)
                                .addComponent(jcbDeshabilitar))))
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 550, Short.MAX_VALUE)
                        .addComponent(btnUpdateTareaActualizar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jcbListaTareasHabilitadas, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jcbEquipos_V2, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel7))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel6)
                                .addComponent(jcbMiembros_V2, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(111, 111, 111))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jcbListaTareasHabilitadas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jcbEquipos_V2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jcbMiembros_V2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 57, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jdcDateCierre_V2, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jcbDeshabilitar)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jdcDateInicio_V2, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(24, 24, 24)
                .addComponent(btnUpdateTareaActualizar)
                .addGap(24, 24, 24))
        );

        contenedorPrincipal.addTab("Actualizar Tarea", jPanel3);

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
                .addComponent(btnCerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(btnCerrar, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(contenedorPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 379, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /*|---------------------|*/
 /*|    Regeneradores    |*/
 /*|---------------------|*/
    private Miembro regenerarMiembro(int idMiembro) {
        miembro = Menu.miembroDataLocal.buscarMiembro(idMiembro);
        return miembro;
    }

    private EquipoMiembros regenerarEquipoMiembro(int idEquipoMiembro) {
        equipoMiembro = Menu.equipoMiembosDataLocal.buscarEquipoMiembros(idEquipoMiembro);
        return equipoMiembro;
    }

    private void btnCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnCerrarActionPerformed
    // Vista 1 -> Crea una nueva tarea
    private void btnAltaTareaGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAltaTareaGuardarActionPerformed
        listaEquipo = Menu.equipoDataLocal.listarEquiposHabilitados();
        listaEquipoMiembros = Menu.equipoMiembosDataLocal.listarEquiposMiembros();

        int posicionMiembros = -1;
        int posicionEquipoMiembro = -1;
        int idEquipoMiembro = -1;

        String nombreTarea = altaTareaNombre.getText();
        String descripcion = altaTareaDescripcion.getText();
        LocalDate fechaInicio = jdcDateInicio.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        LocalDate fechaCierre = jdcDateCierre.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        posicionMiembros = jcbMiembros.getSelectedIndex();
        posicionEquipoMiembro = jcbEquipos.getSelectedIndex();
        int estado = 1;
        if (posicionEquipoMiembro != -1) {
            if (!nombreTarea.isEmpty()) {
                if (!descripcion.isEmpty()) {

                    int idMiembro = listaMiembro.get(posicionMiembros).getId_miembro();
                    miembro = regenerarMiembro(idMiembro);
                    listaMiembro.add(miembro);

                    for (int i = 1; i < listaEquipoMiembros.size(); i++) {

                        if (listaEquipoMiembros.get(i).getMiembro().getId_miembro() == idMiembro) {

                            idEquipoMiembro = listaEquipoMiembros.get(i).getId_equipo_miembros();
                            equipoMiembro = regenerarEquipoMiembro(idEquipoMiembro);
                            // LocalDate fechaActual = LocalDate.now();
                            if (fechaInicio.isEqual(fechaCierre) || fechaInicio.isBefore(fechaCierre)) {
                               
                                Tarea tareaLocal = new Tarea(nombreTarea, fechaInicio, fechaCierre, estado ,descripcion, equipoMiembro);
                                Menu.tareaDataLocal.guardarTarea(tareaLocal);
                                limpiar();
                                break;
                            } else {
                                JOptionPane.showMessageDialog(null, "La fecha de cierre debe ser la misma y despues que la fecha de inicio", "ERROR Validacion", JOptionPane.WARNING_MESSAGE);

                            }
                        }
                    }

                } else {
                    JOptionPane.showMessageDialog(null, Menu.ERROR_DESCRIPCION, Menu.TT_ERROR_VALIDACION, JOptionPane.WARNING_MESSAGE);
                    altaTareaDescripcion.requestFocus();
                }
            } else {
                JOptionPane.showMessageDialog(null, Menu.ERROR_NOMBRE, Menu.TT_ERROR_VALIDACION, JOptionPane.WARNING_MESSAGE);
                altaTareaNombre.requestFocus();
            }
        }


    }//GEN-LAST:event_btnAltaTareaGuardarActionPerformed

    private void btnUpdateTareaActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateTareaActualizarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnUpdateTareaActualizarActionPerformed
    // Vista 1 -> Carga la lista de miembros segun el equipo que se seleccione
    private void jcbEquiposActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbEquiposActionPerformed
        jcbMiembros.removeAllItems();
        listaMiembro.clear();

        listaEquipo = Menu.equipoDataLocal.listarEquiposHabilitados();
        int posicion = -1;

        posicion = jcbEquipos.getSelectedIndex();
        listaEquipoMiembros = Menu.equipoMiembosDataLocal.listarEquiposMiembros();

        if (posicion != -1) {
            for (int i = 0; i < listaEquipoMiembros.size(); i++) {

                if (listaEquipo.get(posicion).getId_equipo() == listaEquipoMiembros.get(i).getEquipo().getId_equipo()) {
                    int id = listaEquipoMiembros.get(i).getMiembro().getId_miembro();
                    miembro = Menu.miembroDataLocal.buscarMiembro(id);
                    listaMiembro.add(miembro);
                }
            }
        } else {
            JOptionPane.showMessageDialog(null, Menu.ERROR_EQUIPO_SELECT, Menu.TT_ERROR_VALIDACION, JOptionPane.WARNING_MESSAGE);
        }
        for (Miembro equipos : listaMiembro) {
            jcbMiembros.addItem(equipos);
        }

    }//GEN-LAST:event_jcbEquiposActionPerformed

    private void jcbDeshabilitarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbDeshabilitarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcbDeshabilitarActionPerformed

    //Solapa 2 -> carga el equipo y los miembros segun la tarea seleccionada
    private void jcbListaTareasHabilitadasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbListaTareasHabilitadasActionPerformed
        limpiarVista2();

        int posicionTarea = -1, idEquipoMiembro = -1, idTarea = -1;
        posicionTarea = jcbListaTareasHabilitadas.getSelectedIndex();
        listaTareas = Menu.tareaDataLocal.listarTareasHabilitadas();
        listaEquipoMiembros = Menu.equipoMiembosDataLocal.listarEquiposMiembros();
        if (posicionTarea != -1) {
            idTarea = listaTareas.get(posicionTarea).getId_tarea();
         //   tarea = Menu.tareaDataLocal.buscarTarea(idTarea);
/*
            tarea.getEquipoMiembros().getMiembro();
            for (int i = 0; i < listaEquipoMiembros.size(); i++) {

                if (listaTareas.get(posicionTarea).getEquipoMiembros().getId_equipo_miembros() == listaEquipoMiembros.get(i).getId_equipo_miembros()) {
                    int id = listaEquipoMiembros.get(i).getMiembro().getId_miembro();
                    miembro = Menu.miembroDataLocal.buscarMiembro(id);
                    listaMiembro.add(miembro);
                }
            }
            for (Miembro equipos : listaMiembro) {
                jcbMiembros_V2.addItem(equipos);
                System.out.println(equipos);
            }
*/
            /*
            for (int i = 0; i < listaTareas.size(); i++) {
                if (listaTareas.get(posicionTarea).getEquipoMiembros().getId_equipo_miembros()
                        == equipoMiembro.getId_equipo_miembros()) {

                    idEquipoMiembro = listaTareas.get(i).getEquipoMiembros().getId_equipo_miembros();
                    equipoMiembro = regenerarEquipoMiembro(idEquipoMiembro);
                    listaEquipoMiembros.add(equipoMiembro);

                    

                }

            }*/
        }


    }//GEN-LAST:event_jcbListaTareasHabilitadasActionPerformed

    private void limpiarVista2() {
        jcbEquipos_V2.removeAllItems();
        jcbMiembros_V2.removeAllItems();
        updateTareaDescripcionTareas.setText("");
        jdcDateInicio_V2.setCalendar(null);
        jdcDateCierre_V2.setCalendar(null);
        jcbDeshabilitar.setSelected(false);
        listaEquipo.clear();
        listaEquipoMiembros.clear();
        listaMiembro.clear();
    }

    // Vista 1 -> Carga la lista de  equipos 
    private void cargandoEquipos() {
        jcbEquipos.removeAllItems();
        List<Equipo> arrayEquipos = Menu.equipoDataLocal.listarEquiposHabilitados();

        for (Equipo equipos : arrayEquipos) {
            jcbEquipos.addItem(equipos);
        }

    }

    //Solapa 1 -> Limpiar campos
    private void limpiar() {
        altaTareaNombre.setText("");
        jcbEquipos.setSelectedIndex(0);
        jcbMiembros.setSelectedIndex(0);
        altaTareaDescripcion.setText("");
        jdcDateInicio.setDate(new Date());
        jdcDateCierre.setCalendar(null);

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel altaDeTarea;
    private javax.swing.JTextArea altaTareaDescripcion;
    private javax.swing.JTextField altaTareaNombre;
    private javax.swing.JButton btnAltaTareaGuardar;
    private javax.swing.JButton btnCerrar;
    private javax.swing.JButton btnUpdateTareaActualizar;
    private javax.swing.JTabbedPane contenedorPrincipal;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JCheckBox jcbDeshabilitar;
    private javax.swing.JComboBox<Equipo> jcbEquipos;
    private javax.swing.JComboBox<Equipo> jcbEquipos_V2;
    private javax.swing.JComboBox<Tarea> jcbListaTareasHabilitadas;
    private javax.swing.JComboBox<Miembro> jcbMiembros;
    private javax.swing.JComboBox<Miembro> jcbMiembros_V2;
    private com.toedter.calendar.JDateChooser jdcDateCierre;
    private com.toedter.calendar.JDateChooser jdcDateCierre_V2;
    private com.toedter.calendar.JDateChooser jdcDateInicio;
    private com.toedter.calendar.JDateChooser jdcDateInicio_V2;
    private javax.swing.JTextArea updateTareaDescripcionTareas;
    // End of variables declaration//GEN-END:variables

    private void cargandoMiembros() {
        jcbMiembros.removeAllItems();
        /*
        List<EquipoMiembros> arrayMiembros = Menu.equipoMiembosEscritorio.listarEquiposMiembros();

        for (EquipoMiembros equipos : arrayMiembros) {
            jcbMiembros.addItem(equipos);
        }*/
    }

    //Solapa 2 -> Carga la lista de tareas habilitadas
    private void cargandoTareas() {
        jcbListaTareasHabilitadas.removeAllItems();
        List<Tarea> arrayTareas = Menu.tareaDataLocal.listarTareasHabilitadas();

        for (Tarea tareas : arrayTareas) {
            jcbListaTareasHabilitadas.addItem(tareas);
        }
    }

    private void actualizandoFecha() {
        Calendar c2 = new GregorianCalendar();
        jdcDateInicio.setCalendar(c2);
    }
}
