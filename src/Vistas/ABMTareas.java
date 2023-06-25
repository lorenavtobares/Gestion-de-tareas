package Vistas;

import Controlador.TareaData;
import Funciones.Funciones;
import Modelo.Equipo;
import Modelo.EquipoMiembros;
import Modelo.Miembro;
import Modelo.Tarea;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;
import javax.swing.JOptionPane;
import jdk.nashorn.internal.parser.DateParser;

public class ABMTareas extends javax.swing.JInternalFrame {

    private Date fechaSistema = new Date();
    private int idTarea;
    private List<Miembro> listaMiembro = new ArrayList<>();
    private List<Equipo> listaEquipo = new ArrayList<>();
    private List<Tarea> listaTareas = new ArrayList<>();
    private List<EquipoMiembros> listaEquipoMiembros = new ArrayList<>();
    private List<EquipoMiembros> listaEquipoMiembrosGrupos = new ArrayList<>();
    private Miembro miembro = new Miembro();
    private Tarea tarea = new Tarea();
    private Equipo equipo = new Equipo();
    private EquipoMiembros equipoMiembro = new EquipoMiembros();

    private TareaData tareaData = new TareaData();

    public ABMTareas() {
        initComponents();
        cargandoEquipos();
        //cargandoMiembros();
        // cargandoTareas();
        //jcbEquipos.setSelectedIndex(0);
        actualizandoFecha();
        cargandoEquiposV2();

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
                .addContainerGap(131, Short.MAX_VALUE)
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
                        .addGap(191, 191, 191)
                        .addGroup(altaDeTareaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jdcDateCierre, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2)))
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
                .addGroup(altaDeTareaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
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

        jLabel5.setText("Tarea");

        jcbEquipos_V2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbEquipos_V2ActionPerformed(evt);
            }
        });

        jcbMiembros_V2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbMiembros_V2ActionPerformed(evt);
            }
        });

        jLabel6.setText("Miembros");

        jLabel7.setText("Equipos");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(73, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnUpdateTareaActualizar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 562, Short.MAX_VALUE)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 552, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jcbListaTareasHabilitadas, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 481, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(151, 151, 151)
                                .addComponent(jLabel4))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jdcDateInicio_V2, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(73, 73, 73)
                                .addComponent(jdcDateCierre_V2, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(72, 72, 72)
                                .addComponent(jcbDeshabilitar)))
                        .addGap(11, 11, 11))
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel5)
                        .addGroup(jPanel3Layout.createSequentialGroup()
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                    .addComponent(jLabel6)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                                .addGroup(jPanel3Layout.createSequentialGroup()
                                    .addComponent(jLabel7)
                                    .addGap(18, 18, 18)))
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jcbEquipos_V2, 0, 481, Short.MAX_VALUE)
                                .addComponent(jcbMiembros_V2, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                .addGap(157, 157, 157))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jcbEquipos_V2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jcbMiembros_V2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jcbListaTareasHabilitadas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 62, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(17, 17, 17)))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jdcDateInicio_V2, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jcbDeshabilitar)
                    .addComponent(jdcDateCierre_V2, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
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
/*
    private EquipoMiembros regenerarEquipoMiembro(int idEquipoMiembro) {
        equipoMiembro = Menu.equipoMiembosDataLocal.buscarEquipoMiembros(idEquipoMiembro);
        return equipoMiembro;
    }*/

    private void btnCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnCerrarActionPerformed
    // Vista 1 -> Crea una nueva tarea
    private void btnAltaTareaGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAltaTareaGuardarActionPerformed
        listaEquipo = Menu.equipoDataLocal.listarEquiposHabilitados();
        listaEquipoMiembros = Menu.equipoMiembosDataLocal.listarEquiposMiembros();

        int posicionMiembros = -1; // se debe poner en una linea una vez limpio
        int posicionEquipoMiembro = -1;
        int idMiembros = -1;
        int idEquipo = -1;
        /*
            int i=1;
            System.out.println("Mostrando lista de miembros");
            for( Miembro miem : listaMiembro){
            System.out.println(" i" + miem);
            i++;
        }
        System.out.println("----------------------------");
         */
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
                     System.out.println("id miembro " + idMiembro);
                    miembro = regenerarMiembro(idMiembro);
                    listaMiembro.add(miembro);

                    for (int i = 1; i < listaEquipoMiembros.size(); i++) {

                        if (listaEquipoMiembros.get(i).getMiembro().getId_miembro() == idMiembro) {

                            idMiembros = listaEquipoMiembros.get(i).getMiembro().getId_miembro();
                            idEquipo = listaEquipo.get(posicionEquipoMiembro).getId_equipo();
                              System.out.println(" ---------------------");
                         //   System.out.println(" if " + listaEquipoMiembros.get(i).getMiembro().getId_miembro());
                            System.out.println("id  miembro " + idMiembros);
                          //  System.out.println("id miembro " + idMiembro);
                            
                               System.out.println("Equipo id " + idEquipo);
                            
                            System.out.println(" ---------------------");
                            equipoMiembro = Menu.equipoMiembosDataLocal.buscarEquipoAndMiembros(idMiembros, idEquipo);

                            System.out.println(equipoMiembro);
                            
                            
                            //  System.out.println(equipoMiembro);
                            // LocalDate fechaActual = LocalDate.now();
                            if (fechaInicio.isEqual(fechaCierre) || fechaInicio.isBefore(fechaCierre)) {

                                Tarea tareaLocal = new Tarea(nombreTarea, fechaInicio, fechaCierre, estado, descripcion, equipoMiembro);

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
        int miembro = -1;
        miembro = jcbMiembros_V2.getSelectedIndex();

        if (jcbDeshabilitar.isSelected()) {

            Menu.tareaDataLocal.eliminarTarea(idTarea);

        }

        /* listaTareas = Menu.tareaDataLocal.listarTodasTareas();
        //System.out.println(listaTareas);
        if (miembro != -1) {
            for (int p = 0; p < listaTareas.size(); p++) {

                if (listaTareas.get(p).getEquipoMiembros().getMiembro().getId_miembro()
                        == listaMiembro.get(miembro).getId_miembro()) {

                    if (jcbDeshabilitar.isSelected()) {
                        
                        System.out.println(jcbDeshabilitar.isSelected());
                        int idTarea = listaTareas.get(p).getId_tarea();
                        System.out.println(idTarea);
                        Menu.tareaDataLocal.eliminarTarea(idTarea);
                        
                    }
                }

            }*/

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
//Solapa 2 -> carga la lista de miembros segun el equipo
    private void jcbEquipos_V2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbEquipos_V2ActionPerformed
        jcbMiembros_V2.removeAllItems();
        listaMiembro.clear();
        listaTareas.clear();
        listaEquipo = Menu.equipoDataLocal.listarEquiposHabilitados();
        int posicion = -1;

        posicion = jcbEquipos_V2.getSelectedIndex();
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
            jcbMiembros_V2.addItem(equipos);
        }
    }//GEN-LAST:event_jcbEquipos_V2ActionPerformed

//Solapa 2 -> carga la lista de tareas segun el miembro    
    private void jcbMiembros_V2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbMiembros_V2ActionPerformed
        int miembro = -1;
        miembro = jcbMiembros_V2.getSelectedIndex();
        jcbListaTareasHabilitadas.removeAllItems();

        //System.out.println(listaTareas);
        if (miembro != -1) {
            for (int p = 0; p < listaTareas.size(); p++) {

                if (listaTareas.get(p).getEquipoMiembros().getMiembro().getId_miembro()
                        == listaMiembro.get(miembro).getId_miembro()) {

                    jcbListaTareasHabilitadas.addItem(listaTareas.get(p).getNombre());
                    jdcDateInicio_V2.setDateFormatString(listaTareas.get(p).getFecha_creacion() + "");
                    jdcDateCierre_V2.setDateFormatString(listaTareas.get(p).getFecha_cierre() + "");

                    //System.out.println(listaTareas.get(p).getFecha_cierre());
                    //System.out.println(listaTareas.get(p).getFecha_creacion());
                    listaTareas.get(p).setEstado(0);

                    idTarea = listaTareas.get(p).getId_tarea();
                    //System.out.println(idTarea);
                    //System.out.println(listaTareas.get(p).getNombre());
                    updateTareaDescripcionTareas.setText(listaTareas.get(p).getDescripcion());

                }
            }
        }


    }//GEN-LAST:event_jcbMiembros_V2ActionPerformed

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

    // Vista 2 -> Carga la lista de  equipos 
    private void cargandoEquiposV2() {
        jcbEquipos_V2.removeAllItems();
        List<Equipo> arrayEquipos = Menu.equipoDataLocal.listarEquiposHabilitados();

        for (Equipo equipos : arrayEquipos) {
            jcbEquipos_V2.addItem(equipos);
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

    public void formatoCalendario() {
        jdcDateInicio_V2.setDate(new Date());
        jdcDateCierre_V2.setDate(new Date());
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
    private javax.swing.JComboBox<String> jcbListaTareasHabilitadas;
    private javax.swing.JComboBox<Miembro> jcbMiembros;
    private javax.swing.JComboBox<Miembro> jcbMiembros_V2;
    private com.toedter.calendar.JDateChooser jdcDateCierre;
    private com.toedter.calendar.JDateChooser jdcDateCierre_V2;
    private com.toedter.calendar.JDateChooser jdcDateInicio;
    private com.toedter.calendar.JDateChooser jdcDateInicio_V2;
    private javax.swing.JTextArea updateTareaDescripcionTareas;
    // End of variables declaration//GEN-END:variables

    private void actualizandoFecha() {
        Calendar c2 = new GregorianCalendar();
        jdcDateInicio.setCalendar(c2);
    }
}
