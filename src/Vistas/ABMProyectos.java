package Vistas;

import Funciones.Funciones;
import Modelo.Proyecto;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;

public class ABMProyectos extends javax.swing.JInternalFrame {

    public ABMProyectos() {
        initComponents();
        cargandoListaProyectos();
        nuevoFechaInicio.setMinSelectableDate(new Date());
        dehsabilitandoEdicion();
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        contenedorPrincipal = new javax.swing.JTabbedPane();
        nuevoProyecto = new javax.swing.JPanel();
        nuevoNombre = new javax.swing.JTextField();
        nuevoFechaInicio = new com.toedter.calendar.JDateChooser();
        jScrollPane1 = new javax.swing.JScrollPane();
        nuevoDescripcion = new javax.swing.JTextArea();
        btnCrearProyecto = new javax.swing.JButton();
        actualizacionDeProyecto = new javax.swing.JPanel();
        updateFechaInicio = new com.toedter.calendar.JDateChooser();
        jScrollPane2 = new javax.swing.JScrollPane();
        updateDescripcion = new javax.swing.JTextArea();
        btnUpdateProyecto = new javax.swing.JButton();
        updateProyecto = new javax.swing.JComboBox<>();
        upProyectoEstado = new javax.swing.JPanel();
        jcbHabilitado = new javax.swing.JCheckBox();
        jcbDeshabilitados = new javax.swing.JCheckBox();
        jcbListProyecto = new javax.swing.JComboBox<>();
        btnCerrar = new javax.swing.JButton();

        contenedorPrincipal.setPreferredSize(new java.awt.Dimension(800, 450));

        nuevoProyecto.setPreferredSize(new java.awt.Dimension(800, 450));

        nuevoNombre.setBorder(javax.swing.BorderFactory.createTitledBorder("NOMBRE"));
        nuevoNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                nuevoNombreKeyTyped(evt);
            }
        });

        nuevoFechaInicio.setBorder(javax.swing.BorderFactory.createTitledBorder("FECHA DE INICIO"));

        nuevoDescripcion.setColumns(20);
        nuevoDescripcion.setRows(5);
        nuevoDescripcion.setBorder(javax.swing.BorderFactory.createTitledBorder("DESCRIPCION"));
        nuevoDescripcion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                nuevoDescripcionKeyTyped(evt);
            }
        });
        jScrollPane1.setViewportView(nuevoDescripcion);

        btnCrearProyecto.setText("Crear Proyecto");
        btnCrearProyecto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCrearProyectoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout nuevoProyectoLayout = new javax.swing.GroupLayout(nuevoProyecto);
        nuevoProyecto.setLayout(nuevoProyectoLayout);
        nuevoProyectoLayout.setHorizontalGroup(
            nuevoProyectoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(nuevoProyectoLayout.createSequentialGroup()
                .addGap(110, 110, 110)
                .addGroup(nuevoProyectoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(nuevoNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 550, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nuevoFechaInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 550, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 550, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCrearProyecto, javax.swing.GroupLayout.PREFERRED_SIZE, 550, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(135, Short.MAX_VALUE))
        );
        nuevoProyectoLayout.setVerticalGroup(
            nuevoProyectoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(nuevoProyectoLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(nuevoNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(nuevoFechaInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addComponent(btnCrearProyecto, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(60, Short.MAX_VALUE))
        );

        contenedorPrincipal.addTab("Nuevo Proyecto", nuevoProyecto);

        actualizacionDeProyecto.setPreferredSize(new java.awt.Dimension(800, 450));

        updateFechaInicio.setBorder(javax.swing.BorderFactory.createTitledBorder("FECHA DE INICIO"));

        updateDescripcion.setColumns(20);
        updateDescripcion.setRows(5);
        updateDescripcion.setBorder(javax.swing.BorderFactory.createTitledBorder("DESCRIPCION"));
        updateDescripcion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                updateDescripcionKeyTyped(evt);
            }
        });
        jScrollPane2.setViewportView(updateDescripcion);

        btnUpdateProyecto.setText("Actualizar Informacion");
        btnUpdateProyecto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateProyectoActionPerformed(evt);
            }
        });

        updateProyecto.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { }));
        updateProyecto.setBorder(javax.swing.BorderFactory.createTitledBorder("PROYECTO"));

        upProyectoEstado.setBorder(javax.swing.BorderFactory.createTitledBorder("Estado del proyecto"));

        jcbHabilitado.setText("Habilitado");

        jcbDeshabilitados.setText("Deshabilitado");

        javax.swing.GroupLayout upProyectoEstadoLayout = new javax.swing.GroupLayout(upProyectoEstado);
        upProyectoEstado.setLayout(upProyectoEstadoLayout);
        upProyectoEstadoLayout.setHorizontalGroup(
            upProyectoEstadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(upProyectoEstadoLayout.createSequentialGroup()
                .addGap(57, 57, 57)
                .addComponent(jcbHabilitado)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jcbDeshabilitados)
                .addGap(114, 114, 114))
        );
        upProyectoEstadoLayout.setVerticalGroup(
            upProyectoEstadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(upProyectoEstadoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(upProyectoEstadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jcbHabilitado)
                    .addComponent(jcbDeshabilitados))
                .addContainerGap(13, Short.MAX_VALUE))
        );

        jcbListProyecto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbListProyectoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout actualizacionDeProyectoLayout = new javax.swing.GroupLayout(actualizacionDeProyecto);
        actualizacionDeProyecto.setLayout(actualizacionDeProyectoLayout);
        actualizacionDeProyectoLayout.setHorizontalGroup(
            actualizacionDeProyectoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(actualizacionDeProyectoLayout.createSequentialGroup()
                .addGroup(actualizacionDeProyectoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(actualizacionDeProyectoLayout.createSequentialGroup()
                        .addGap(109, 109, 109)
                        .addGroup(actualizacionDeProyectoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(updateFechaInicio, javax.swing.GroupLayout.DEFAULT_SIZE, 550, Short.MAX_VALUE)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 550, Short.MAX_VALUE)
                            .addComponent(btnUpdateProyecto, javax.swing.GroupLayout.DEFAULT_SIZE, 550, Short.MAX_VALUE)
                            .addComponent(upProyectoEstado, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(actualizacionDeProyectoLayout.createSequentialGroup()
                        .addGap(63, 63, 63)
                        .addComponent(updateProyecto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jcbListProyecto, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(120, Short.MAX_VALUE))
        );
        actualizacionDeProyectoLayout.setVerticalGroup(
            actualizacionDeProyectoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(actualizacionDeProyectoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(actualizacionDeProyectoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(updateProyecto, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jcbListProyecto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(updateFechaInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(upProyectoEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                .addComponent(btnUpdateProyecto, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        contenedorPrincipal.addTab("Actualizacion de Proyecto", actualizacionDeProyecto);

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
            .addComponent(contenedorPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, 797, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnCerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(btnCerrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(contenedorPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnCerrarActionPerformed

                /* <<-- Validacion de datos -->> */
    
    // Vista 1 - nuevo proyecto -> NOMBRE: validacion de datos
    private void nuevoNombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nuevoNombreKeyTyped
        Funciones.soloLetras(nuevoNombre, evt, 150);
    }//GEN-LAST:event_nuevoNombreKeyTyped

    // Vista 1 - nuevo proyecto -> DESCRIPCION: validacion de datos
    private void nuevoDescripcionKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nuevoDescripcionKeyTyped
        Funciones.soloNumerosYLetras(nuevoDescripcion, evt, 45);
    }//GEN-LAST:event_nuevoDescripcionKeyTyped

    // Vista 2 - actualizar proyecto -> DESCRIPCION: validacion de datos
    private void updateDescripcionKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_updateDescripcionKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_updateDescripcionKeyTyped

    private void btnCrearProyectoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCrearProyectoActionPerformed
        String nombre = nuevoNombre.getText();
        String descripcion = nuevoDescripcion.getText();
    
        if (!nombre.isEmpty()){
            boolean estadoFecha = Funciones.validarFechaPosterior(nuevoFechaInicio);
            if (estadoFecha  == true)
            if ( !descripcion.isEmpty() ){
                LocalDate fechaInicio = nuevoFechaInicio.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();

                try{
                    
                    Proyecto proyecto = new Proyecto(0, nombre, descripcion, fechaInicio);
                    Menu.proyectoEscritorio.guardarProyecto(proyecto);
                    
                }catch(Exception ex){
                    JOptionPane.showMessageDialog(null, "Error al guardar el registro " + ex.getMessage(), "ERROR",JOptionPane.ERROR_MESSAGE);
                }

            }else{
                JOptionPane.showMessageDialog(null, "Debe ingresar una descripcion", "ERROR",JOptionPane.WARNING_MESSAGE);
                nuevoDescripcion.requestFocus();
            }else{
                System.out.println("-> Prueba Error <-");
            }
        }else{
            JOptionPane.showMessageDialog(null, "Debe ingresar un nombre", "ERROR",JOptionPane.WARNING_MESSAGE);
            nuevoNombre.requestFocus();
        }
    }//GEN-LAST:event_btnCrearProyectoActionPerformed
//Solapa 2 -> Carga los datos segun la posicion de la lista
    private void jcbListProyectoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbListProyectoActionPerformed
         List<Proyecto> arrayProyectos= Menu.proyectoEscritorio.listarTodosProyectos();
         int posicion = -1;
            posicion = jcbListProyecto.getSelectedIndex();
           
          
        boolean estado;
        if (posicion != -1 ) {
            updateFechaInicio.setDateFormatString(arrayProyectos.get(posicion).getFecha_inicio()+ "" );
            updateDescripcion.setText(arrayProyectos.get(posicion).getDescripcion());
            updateFechaInicio.setDateFormatString(arrayProyectos.get(posicion).getFecha_inicio()+ "");
         
            estado = arrayProyectos.get(posicion).getEstado();
            if (estado){
                jcbHabilitado.setSelected(true);
                jcbDeshabilitados.setSelected(false);
            } else{
                jcbHabilitado.setSelected(false);
                jcbDeshabilitados.setSelected(true);}
        }else if (posicion == -1){
            JOptionPane.showMessageDialog(null, "No se encuentran proyectos", "",JOptionPane.WARNING_MESSAGE); 
        }
    }//GEN-LAST:event_jcbListProyectoActionPerformed
//Solapa 2 -> Guarda los proyectos actualizados
    private void btnUpdateProyectoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateProyectoActionPerformed
        // TODO add your handling code here:
         List<Proyecto> arrayProyectos= Menu.proyectoEscritorio.listarTodosProyectos();
         int posicion = -1;
            posicion = jcbListProyecto.getSelectedIndex();
         
        boolean estadoLocal;
        
        if (posicion != -1) {
            String nombreLocal = arrayProyectos.get(posicion).getNombre();
            String descripcionLocal = updateDescripcion.getText();
            LocalDate fechaInicioLocal = updateFechaInicio.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
            int idLocal =arrayProyectos.get(posicion).getId_proyecto();
            if (jcbHabilitado.isSelected()){
                    jcbHabilitado.setSelected(true);
                    jcbDeshabilitados.setSelected(false);
                    estadoLocal = true;
                } else{
                    jcbHabilitado.setSelected(false);
                    jcbDeshabilitados.setSelected(true);
                    estadoLocal = false;
                }
        
            
            Proyecto actualizandoProyecto = new Proyecto(idLocal, nombreLocal, descripcionLocal, fechaInicioLocal, estadoLocal);
            Menu.proyectoEscritorio.actualizarProyecto(actualizandoProyecto);
        }
        
    }//GEN-LAST:event_btnUpdateProyectoActionPerformed
    
    
                /* <<-- Metodos Extreas -->> */
    
    //Solapa 2 -> Carga los datos de la lista
    private void cargandoListaProyectos() {
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
       jcbListProyecto.removeAllItems();
        List<Proyecto> arrayProyectos= Menu.proyectoEscritorio.listarTodosProyectos();
        
        for (Proyecto proyectos : arrayProyectos) {
            jcbListProyecto.addItem(proyectos);
        }
    
        
    }
    private void dehsabilitandoEdicion(){
    }
    
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel actualizacionDeProyecto;
    private javax.swing.JButton btnCerrar;
    private javax.swing.JButton btnCrearProyecto;
    private javax.swing.JButton btnUpdateProyecto;
    private javax.swing.JTabbedPane contenedorPrincipal;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JCheckBox jcbDeshabilitados;
    private javax.swing.JCheckBox jcbHabilitado;
    private javax.swing.JComboBox<Proyecto> jcbListProyecto;
    private javax.swing.JTextArea nuevoDescripcion;
    private com.toedter.calendar.JDateChooser nuevoFechaInicio;
    private javax.swing.JTextField nuevoNombre;
    private javax.swing.JPanel nuevoProyecto;
    private javax.swing.JPanel upProyectoEstado;
    private javax.swing.JTextArea updateDescripcion;
    private com.toedter.calendar.JDateChooser updateFechaInicio;
    private javax.swing.JComboBox<String> updateProyecto;
    // End of variables declaration//GEN-END:variables


}
