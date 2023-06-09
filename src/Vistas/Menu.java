package Vistas;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import javax.swing.Box;
import javax.swing.ImageIcon;
import javax.swing.JInternalFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class Menu extends javax.swing.JFrame {
    private static Login formularioLogin = new Login();
    
    private JMenuBar barra;
    private JMenu MenuAdmin, MenuProyectos, MenuEquipos, MenuTareas, MenuSalir;
    private JMenuItem MA_ABMUsuario;
    private JMenuItem MP_ABMProyecto;
    private JMenuItem ME_ABMEquipo;
    private JMenuItem MT_ABMTarea;
    private JMenuItem MS_CerrarSesion;
    
    private final String iconoAdmin     = "/Iconos/admin.png";
    private final String iconoProyecto  = "/Iconos/proyecto.png";
    private final String iconoEquipo    = "/Iconos/equipo.png";
    private final String iconoTareas    = "/Iconos/tareas.png";
    private final String iconoSalir     = "/Iconos/salir_sistema.png";
    
    public Menu() {
        crearMenu();
        initComponents();
    }
    
    private void centrarJinternalFrame (JInternalFrame i ){
        Dimension tamanioEscritorio =  Escritorio.getSize();
        Dimension tamanioVentana = i.getSize();
        i.setLocation((tamanioEscritorio.width - tamanioVentana.width) / 2, (tamanioEscritorio.height - tamanioVentana.height) / 2);
    }
    
    private void crearMenu(){
        barra = new JMenuBar();
        MenuAdmin = new JMenu("  Admin  ");
        MenuAdmin.setIcon(new javax.swing.ImageIcon(getClass().getResource(iconoAdmin)) );
        MenuAdmin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        MenuProyectos = new JMenu("  Proyectos  ");
        MenuProyectos.setIcon(new javax.swing.ImageIcon(getClass().getResource(iconoProyecto)));
        MenuProyectos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        MenuEquipos = new JMenu("  Equipos  ");
        MenuEquipos.setIcon(new javax.swing.ImageIcon(getClass().getResource(iconoEquipo)));
        MenuEquipos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        MenuTareas = new JMenu("  Tareas  ");
        MenuTareas.setIcon(new javax.swing.ImageIcon(getClass().getResource(iconoTareas)));
        MenuTareas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        MenuSalir = new JMenu("  Salir  ");
        MenuSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource(iconoSalir)));
        MenuSalir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        
        
    /* <-- Creacion de Menus --> */
        //Menu Admin
            MA_ABMUsuario = new JMenuItem("ABM Usuarios");
            MA_ABMUsuario.addActionListener((java.awt.event.ActionEvent evt) -> {
                Escritorio.removeAll();
                Escritorio.repaint();
                ABMUsuarios abmUsuarios = new ABMUsuarios();
                centrarJinternalFrame(abmUsuarios);
                abmUsuarios.setVisible(true);
                Escritorio.add(abmUsuarios);
                Escritorio.moveToFront(abmUsuarios);
            });
        
        //Menu Proyectos
            MP_ABMProyecto = new JMenuItem("ABM Proyecto");
            MP_ABMProyecto.addActionListener((java.awt.event.ActionEvent evt) -> {
                Escritorio.removeAll();
                Escritorio.repaint();
                ABMProyectos abmProyectos = new ABMProyectos();
                centrarJinternalFrame(abmProyectos);
                abmProyectos.setVisible(true);
                Escritorio.add(abmProyectos);
                Escritorio.moveToFront(abmProyectos);
            });
            
        //Menu Equipos
            ME_ABMEquipo = new JMenuItem("ABM Equipos");
            ME_ABMEquipo.addActionListener((java.awt.event.ActionEvent evt) -> {
                Escritorio.removeAll();
                Escritorio.repaint();
                ABMEquipos abmEquipos = new ABMEquipos();
                centrarJinternalFrame(abmEquipos);
                abmEquipos.setVisible(true);
                Escritorio.add(abmEquipos);
                Escritorio.moveToFront(abmEquipos);
            });
                
        //Menu Tareas
            MT_ABMTarea = new JMenuItem("ABM Tareas");
            MT_ABMTarea.addActionListener((java.awt.event.ActionEvent evt) -> {});
                
        //Menu Salir
            MS_CerrarSesion = new JMenuItem("Cerrar Sesion");
            MS_CerrarSesion.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
            MS_CerrarSesion.addActionListener((java.awt.event.ActionEvent evt) -> {
                this.dispose();
                formularioLogin.setVisible(true);
            });
        
    /* <-- Agregando Items a los Menus --> */
            MenuAdmin.add(MA_ABMUsuario);

            MenuProyectos.add(MP_ABMProyecto);

            MenuEquipos.add(ME_ABMEquipo);

            MenuTareas.add(MT_ABMTarea);

            MenuSalir.add("Usuario: ");
            MenuSalir.add("Perfil: ");
            MenuSalir.add(MS_CerrarSesion);
        
    /* <-- Agregando Menus a la barra --> */
            barra.add(MenuAdmin);
            barra.add(MenuProyectos);
            barra.add(MenuEquipos);
            barra.add(MenuTareas);
            barra.add(Box.createHorizontalGlue());
            barra.add(MenuSalir);
        

    /* <-- Haciendo visible la barra --> */
            setJMenuBar(barra);
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ImageIcon icon = new ImageIcon(getClass().getResource("/Imagenes/fondoFormularios.png"));
        Image image = icon.getImage();
        Escritorio = new javax.swing.JDesktopPane(){
            public void paintComponent(Graphics grafico){
                grafico.drawImage(image,0,0,getWidth(),getHeight(),this);
            }
        };

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        javax.swing.GroupLayout EscritorioLayout = new javax.swing.GroupLayout(Escritorio);
        Escritorio.setLayout(EscritorioLayout);
        EscritorioLayout.setHorizontalGroup(
            EscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 800, Short.MAX_VALUE)
        );
        EscritorioLayout.setVerticalGroup(
            EscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 450, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Escritorio)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Escritorio)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Menu().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane Escritorio;
    // End of variables declaration//GEN-END:variables
}