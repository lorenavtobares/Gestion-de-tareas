package Vistas;

import Modelo.Comentarios;
import Modelo.Tarea;
import java.time.LocalDate;
import java.time.ZoneId;
import javax.swing.JOptionPane;


public class GestionesInternasComentarios extends javax.swing.JInternalFrame {
    public GestionesInternasComentarios() {
        initComponents();
        Funciones.Funciones.inicializarCalendario(jdcFechaAvance);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        GIC = new javax.swing.JPanel();
        btnGuardar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtaComentarios = new javax.swing.JTextArea();
        btnCerrar = new javax.swing.JButton();
        jdcFechaAvance = new com.toedter.calendar.JDateChooser();

        btnGuardar.setText("Guardar Comentario");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        jtaComentarios.setColumns(20);
        jtaComentarios.setRows(5);
        jScrollPane1.setViewportView(jtaComentarios);

        btnCerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/cerrar.png"))); // NOI18N
        btnCerrar.setBorder(null);
        btnCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout GICLayout = new javax.swing.GroupLayout(GIC);
        GIC.setLayout(GICLayout);
        GICLayout.setHorizontalGroup(
            GICLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(GICLayout.createSequentialGroup()
                .addGap(97, 97, 97)
                .addGroup(GICLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 614, Short.MAX_VALUE)
                    .addComponent(btnGuardar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(100, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, GICLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jdcFechaAvance, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(313, 313, 313)
                .addComponent(btnCerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        GICLayout.setVerticalGroup(
            GICLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(GICLayout.createSequentialGroup()
                .addGroup(GICLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnCerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(GICLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jdcFechaAvance, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 55, Short.MAX_VALUE)
                .addComponent(btnGuardar)
                .addGap(33, 33, 33))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(GIC, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(GIC, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarActionPerformed
        Menu.GIC.dispose();
    }//GEN-LAST:event_btnCerrarActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        // TODO add your handling code here:
        String comentarios = jtaComentarios.getText();   
        if (!comentarios.isEmpty())  
        {  
            System.out.println("Seleccion de idTarea get:" + Menu.tareaSeleccionadaTabla); 
            Tarea tareaSeleccionada = Menu.tareaDataLocal.buscarTarea(Menu.tareaSeleccionadaTabla);   
            LocalDate fechaAvance = jdcFechaAvance.getDate().toInstant().atZone(ZoneId.systemDefault()).toLocalDate();   
            Comentarios comentario = new Comentarios(comentarios, fechaAvance , tareaSeleccionada);   
            Menu.comentarioDataLocal.guardarComentarios(comentario);
            jtaComentarios.removeAll();
        }  
        else  
        {  
            JOptionPane.showMessageDialog(null, Menu.ERROR_COMENTARIOS, Menu.TT_ERROR_VALIDACION,JOptionPane.WARNING_MESSAGE);  
            jdcFechaAvance.requestFocus();  
        } 
    }//GEN-LAST:event_btnGuardarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel GIC;
    private javax.swing.JButton btnCerrar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JScrollPane jScrollPane1;
    private com.toedter.calendar.JDateChooser jdcFechaAvance;
    private javax.swing.JTextArea jtaComentarios;
    // End of variables declaration//GEN-END:variables
}
