package Vistas;

import java.util.Date;
import javax.swing.JOptionPane;
import Funciones.Funciones;
import com.toedter.calendar.JCalendar;
import java.awt.Color;
import Modelo.Equipo;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.List;


public class ABMEquipos extends javax.swing.JInternalFrame {

    public ABMEquipos() {
        initComponents();
        nuevoFecha.setMinSelectableDate(new Date());
        //nuevoFecha.setDateFormatString("dd/MM/yyyy");
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
        nuevoNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nuevoNombreActionPerformed(evt);
            }
        });
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
                    .addComponent(btnNuevoEquipo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(122, Short.MAX_VALUE))
        );
        nuevoDeEquiposLayout.setVerticalGroup(
            nuevoDeEquiposLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(nuevoDeEquiposLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(nuevoNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(nuevoFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(90, 90, 90)
                .addComponent(btnNuevoEquipo, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(39, Short.MAX_VALUE))
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
                .addContainerGap(122, Short.MAX_VALUE))
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
                .addContainerGap(21, Short.MAX_VALUE))
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

    private void btnCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnCerrarActionPerformed

                /* <<-- Validacion de datos -->> */
    
    // Vista 1 - nuevo Equipo -> NOMBRE: Validacion de datos
    private void nuevoNombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nuevoNombreKeyTyped
        Funciones.soloLetras(nuevoNombre, evt, 45);
    }//GEN-LAST:event_nuevoNombreKeyTyped

    // Vista 2 - Actualizacion Equipo -> NOMBRE: Validacion de datos
    private void ActualizarNombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ActualizarNombreKeyTyped
        Funciones.soloLetras(ActualizarNombre, evt, 45);
    }//GEN-LAST:event_ActualizarNombreKeyTyped

    private void nuevoNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nuevoNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nuevoNombreActionPerformed
    //Solapa 2 -> carga la lista de equipos
        private void cargandoEquiposV2() {
            
        jcbListaEquipos.removeAllItems();
        List<Equipo> arrayEquipos= Menu.equipoEscritorio.listarTodosEquipos();
        
        for (Equipo equipos : arrayEquipos) {
            jcbListaEquipos.addItem(equipos);
        }
    
    }
        
        
    private void btnNuevoEquipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoEquipoActionPerformed
        // TODO add your handling code here:
        String nombre = nuevoNombre.getText();
        LocalDate fechaCreacion = nuevoFecha.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        Equipo equipos = new Equipo(nombre, fechaCreacion, true);
         
        Menu.equipoEscritorio.GuardarEquipo(equipos);
        
        
    }//GEN-LAST:event_btnNuevoEquipoActionPerformed
    
      public void formatoCalendario(){
        //jdFechaNacimiento.setLocale(new Locale("es"));
        //jdFechaNacimiento.setDateFormatString("dd-MM-yyyy");
       
        //nuevoFecha.setDate(new Date());
        actualizarFecha.setDate(new Date());
       // actualizarFecha.getJCalendar().setMaxSelectableDate(new Date());
        nuevoFecha.getJCalendar().setMaxSelectableDate(new Date());
        
    }
    
    //Solapa 2 - Actualizar Datos -> Btn guardar datos
    private void btnActualizarEquipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarEquipoActionPerformed
        
        String nombre = ActualizarNombre.getText();
        LocalDate fechaCreacion = actualizarFecha.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        boolean estado ;
        if (!nombre.isEmpty()) {
            
             if (jcbHabilitado.isSelected()){
               estado = true;  
            } else{
               estado = false;  
            }
            Equipo equipos = new Equipo(nombre, fechaCreacion, estado); 
            Menu.equipoEscritorio.actualizarEquipo(equipos);
                            
        } else {
            JOptionPane.showMessageDialog(null, "Debe ingresar un nombre", "ERROR Validacion",JOptionPane.WARNING_MESSAGE);
            ActualizarNombre.requestFocus(); }
        
    }//GEN-LAST:event_btnActualizarEquipoActionPerformed
//Solapa 2 - Actualizar Datos -> Cargar Datos del furmulario Items ComboBox
    private void jcbListaEquiposActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbListaEquiposActionPerformed
        
         List<Equipo> arrayEquipos = Menu.equipoEscritorio.listarTodosEquipos();
         int posicion = -1;
            posicion = jcbListaEquipos.getSelectedIndex();
        boolean estado;
        if (posicion > -1 ) {
            ActualizarNombre.setText(arrayEquipos.get(posicion).getNombre());
            actualizarFecha.setDateFormatString(arrayEquipos.get(posicion).getFecha_cracion() + "");
            estado = arrayEquipos.get(posicion).getEstado();
            if (estado){
                jcbHabilitado.setSelected(true);
                jcbDeshabilitados.setSelected(false);
            } else{
                jcbHabilitado.setSelected(false);
                jcbDeshabilitados.setSelected(true);}
        }else if (posicion == -1){
            JOptionPane.showMessageDialog(null, "No se encuentran equipos", "",JOptionPane.WARNING_MESSAGE); 
        }
        
        
        
        
    }//GEN-LAST:event_jcbListaEquiposActionPerformed

                /* <<-- Metodos Extras -->> */
  

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
    private javax.swing.JComboBox<Equipo> jcbListaEquipos;
    private javax.swing.JPanel nuevoDeEquipos;
    private com.toedter.calendar.JDateChooser nuevoFecha;
    private javax.swing.JTextField nuevoNombre;
    // End of variables declaration//GEN-END:variables


}
