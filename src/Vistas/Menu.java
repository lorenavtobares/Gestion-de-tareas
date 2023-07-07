package Vistas;

import Controlador.*;
import Modelo.*;
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
import javax.swing.JOptionPane;

public class Menu extends javax.swing.JFrame {
    
                /*|----------------------|*/
                /*|      Constantes      |*/
                /*|----------------------|*/
    
    public static final String FORMATO_FECHA = "dd/MM/yyyy";
    
    public static final String TT_ERROR = "Error";
    public static final String TT_ERROR_VALIDACION = "Error de validacion";
    public static final String TT_ERROR_AUTENTICACION = "Error de Autenticacion";
    
    public static final String ERROR = "Error: ";
    public static final String ERROR_APELLIDO = "Debe ingresar un apellido.";
    public static final String ERROR_DESCRIPCION = "Debe ingresar una descripcion.";
    public static final String ERROR_DNI = "Debe ingresar un dni.";
    public static final String ERROR_DNI_DUPLICADO = "El DNI ingresado ya se encuentra registado.";
    public static final String ERROR_EQUIPOS = "No se encuentran equipos.";
    public static final String ERROR_EQUIPOS_DUPLICADO = "Ya existe un equipo con ese nombre.\nPor favor ingresa un nuevo nombre.";
    public static final String ERROR_EQUIPO_SELECT = "Debe seleccionar un Equipo.";
    public static final String ERROR_FECHA = "Debe selecciona una fecha valida \nFormato correcto: dd/MM/yyyy\n";
    public static final String ERROR_GUARDAR_R = "No se pudo guardar el registro.";
    public static final String ERROR_NOMBRE = "Debe ingresar un nombre.";
    public static final String ERROR_PASSWORD = "Debe ingresar una contraseña.";
    public static final String ERROR_PASSWORD_LOGIN = "Contraseña incorrecta";
    public static final String ERROR_PROYECTOS = "No se encuentran proyectos.";
    public static final String ERROR_PROYECTOS_DUPLICADO = "Ya existe un proyecto con ese nombre.\nPor favor ingresa un nuevo nombre.";
    public static final String ERROR_ROL = "Debe seleccionar un rol de usuario.";
    public static final String ERROR_USUARIOS = "No se encuentran usuarios.";
    public static final String ERROR_USUARIO_LOGIN = "Usuario incorrecto";
    public static final String ERROR_COMENTARIOS = "Debe ingresar un comentario."; 
    
    public static final String ROL_ADMINISTRADOR = "admin";
    public static final String ROL_DEFAULT = "-- Seleccione una opcion --";
    public static final String ROL_DEVELOPER = "Desarrolador de Sotfware";
    public static final String ROL_DISENIADOR = "Diseñador UX y UI";
    public static final String ROL_LIDER_PROYECTO = "Lider de Equipo";
    public static final String ROL_PROJECT_MANAGER = "Project Manager";
    public static final String ROL_USUARIO = "usuario";
    
    
    
    
                /*|---------------------|*/
                /*|      Variables      |*/
                /*|---------------------|*/
    
    private static Login formularioLogin = new Login();
    
    private String usuarioValidado = formularioLogin.usuarioSesion;
    private String rolValidado = formularioLogin.rolSesion;;
    
    public static ComentariosData comentarioDataLocal = new ComentariosData();
    public static EquipoData equipoDataLocal = new EquipoData();
    public static EquipoMiembrosData equipoMiembosDataLocal = new EquipoMiembrosData();
    public static MiembroData miembroDataLocal = new MiembroData();
    public static ProyectoData proyectoDataLocal = new ProyectoData();
    public static TareaData tareaDataLocal = new TareaData();
    
    public static Comentarios comentarioLocal = new Comentarios();
    public static Equipo equipoLocal = new Equipo();
    public static EquipoMiembros equipoMiembrosLocal = new EquipoMiembros();
    public static Miembro miembroLocal = new Miembro();
    public static Proyecto proyectoLocal = new Proyecto();
    public static Tarea tareaLocal = new Tarea();
    
    public static GestionesInternasComentarios GIC = new GestionesInternasComentarios();
    public static GestionesInternasHistorialComentarios GIHC = new GestionesInternasHistorialComentarios();
    public static String tareaSeleccionada = "";
    public static int tareaSeleccionadaTabla; 
            
    
                /*|----------------------|*/
                /*|         Menu         |*/
                /*|----------------------|*/
    
    private JMenuBar barra;
    private JMenu MenuAdmin, MenuProyectos, MenuEquipos, MenuTareas, MenuGestiones, MenuSalir;
    private JMenuItem MA_ABMUsuario;
    private JMenuItem MP_ABMProyecto;
    private JMenuItem ME_ABMEquipo;
    private JMenuItem MT_ABMTarea;
    private JMenuItem MG_GestionesTareas;
    private JMenuItem MG_AsignarProyecto;
    private JMenuItem MG_AsignarMiembro;
    private JMenuItem MG_InformacionEquipo;
    private JMenuItem MS_CerrarSesion;
    
    private final String nameMenuAdmin      = "  Admin  ";
    private final String nameMenuProyectos  = "  Proyectos  ";
    private final String nameMenuEquipos    = "  Equipos  ";
    private final String nameMenuTareas     = "  Tareas  ";
    private final String nameMenuGestiones  = "  Gestiones  ";
    private final String nameMenuSalir      = "  Salir  ";
    
    private final String nameItemsABMAdmin          = "ABM Usuarios";
    private final String nameItemsABMProyecto       = "ABM Proyecto";
    private final String nameItemsABMEquipo         = "ABM Equipo";
    private final String nameItemsABMTareas         = "ABM Tareas";
    private final String nameItemsAsignarProyecto   = "Asignar Proyecto a Equipo";
    private final String nameItemsAsignarMiembro    = "Asignar Miembro a Equipo";
    private final String nameItemsInformacionEquipo = "Informacion de equipos";
    private final String nameItemsGestionesTareas   = "Gestion de tareas";
    private final String nameItemsSalir             = "Cerrar Sesion";
    private final String nameItemsSalirPefil        = "Perfil: " + rolValidado;
    private final String nameItemsSalirUsuario      = "Usuario: " + usuarioValidado;
    
    private final String iconoAdmin     = "/Iconos/admin.png";
    private final String iconoProyecto  = "/Iconos/proyecto.png";
    private final String iconoEquipo    = "/Iconos/equipo.png";
    private final String iconoTareas    = "/Iconos/tareas.png";
    private final String iconoGestion   = "/Iconos/gestion.png";
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
        MenuAdmin = new JMenu(nameMenuAdmin);
        MenuAdmin.setIcon(new javax.swing.ImageIcon(getClass().getResource(iconoAdmin)) );
        MenuAdmin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        MenuProyectos = new JMenu(nameMenuProyectos);
        MenuProyectos.setIcon(new javax.swing.ImageIcon(getClass().getResource(iconoProyecto)));
        MenuProyectos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        MenuEquipos = new JMenu(nameMenuEquipos);
        MenuEquipos.setIcon(new javax.swing.ImageIcon(getClass().getResource(iconoEquipo)));
        MenuEquipos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        MenuTareas = new JMenu(nameMenuTareas);
        MenuTareas.setIcon(new javax.swing.ImageIcon(getClass().getResource(iconoTareas)));
        MenuTareas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        MenuGestiones = new JMenu(nameMenuGestiones);
        MenuGestiones.setIcon(new javax.swing.ImageIcon(getClass().getResource(iconoGestion)));
        MenuGestiones.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        MenuSalir = new JMenu(nameMenuSalir);
        MenuSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource(iconoSalir)));
        MenuSalir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        
        
    /* <-- Creacion de Menus --> */
        //Menu Admin
            MA_ABMUsuario = new JMenuItem(nameItemsABMAdmin);
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
            MP_ABMProyecto = new JMenuItem(nameItemsABMProyecto);
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
            ME_ABMEquipo = new JMenuItem(nameItemsABMEquipo);
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
            MT_ABMTarea = new JMenuItem(nameItemsABMTareas);
            MT_ABMTarea.addActionListener((java.awt.event.ActionEvent evt) -> {
                Escritorio.removeAll();
                Escritorio.repaint();
                ABMTareas abmTareas = new ABMTareas();
                centrarJinternalFrame(abmTareas);
                abmTareas.setVisible(true);
                Escritorio.add(abmTareas);
                Escritorio.moveToFront(abmTareas);
            });
            
        //Menu Gestiones
            MG_GestionesTareas = new JMenuItem(nameItemsGestionesTareas);
            MG_GestionesTareas.addActionListener((java.awt.event.ActionEvent evt) -> {
                Escritorio.removeAll();
                Escritorio.repaint();
                ABMGestionesTareas abmGTareas = new ABMGestionesTareas();
                centrarJinternalFrame(abmGTareas);
                abmGTareas.setVisible(true);
                Escritorio.add(abmGTareas);
                Escritorio.moveToFront(abmGTareas);
            });
            
            MG_AsignarProyecto = new JMenuItem(nameItemsAsignarProyecto);
            MG_AsignarProyecto.addActionListener((java.awt.event.ActionEvent evt) -> {
                Escritorio.removeAll();
                Escritorio.repaint();
                GEAsignarProyecto abmGEquipos = new GEAsignarProyecto();
                centrarJinternalFrame(abmGEquipos);
                abmGEquipos.setVisible(true);
                Escritorio.add(abmGEquipos);
                Escritorio.moveToFront(abmGEquipos);
            });
            
            MG_AsignarMiembro = new JMenuItem(nameItemsAsignarMiembro);
            MG_AsignarMiembro.addActionListener((java.awt.event.ActionEvent evt) -> {
                Escritorio.removeAll();
                Escritorio.repaint();
                GEAsignarMiembro abmGEquipos = new GEAsignarMiembro();
                centrarJinternalFrame(abmGEquipos);
                abmGEquipos.setVisible(true);
                Escritorio.add(abmGEquipos);
                Escritorio.moveToFront(abmGEquipos);
            });
            
            MG_InformacionEquipo = new JMenuItem(nameItemsInformacionEquipo);
            MG_InformacionEquipo.addActionListener((java.awt.event.ActionEvent evt) -> {
                Escritorio.removeAll();
                Escritorio.repaint();
                GEInformacionEquipo abmGEquipos = new GEInformacionEquipo();
                centrarJinternalFrame(abmGEquipos);
                abmGEquipos.setVisible(true);
                Escritorio.add(abmGEquipos);
                Escritorio.moveToFront(abmGEquipos);
            });
                
        //Menu Salir
            MS_CerrarSesion = new JMenuItem(nameItemsSalir);
            MS_CerrarSesion.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
            MS_CerrarSesion.addActionListener((java.awt.event.ActionEvent evt) -> {
                int opcion = JOptionPane.showConfirmDialog(null, "¿Desea salir del sistema?", "", JOptionPane.YES_NO_OPTION, JOptionPane.INFORMATION_MESSAGE);
                
                if( opcion == 0 ) {
                    this.dispose();
                    formularioLogin.setVisible(true);
                }
                
            });
        
    /* <-- Agregando Items a los Menus --> */
            MenuAdmin.add(MA_ABMUsuario);

            MenuProyectos.add(MP_ABMProyecto);

            MenuEquipos.add(ME_ABMEquipo);

            MenuTareas.add(MT_ABMTarea);
            
            MenuGestiones.add(MG_AsignarProyecto);
            MenuGestiones.add(MG_AsignarMiembro);
            MenuGestiones.add(MG_InformacionEquipo);
            MenuGestiones.add(MG_GestionesTareas);

            MenuSalir.add(nameItemsSalirUsuario);
            MenuSalir.add(nameItemsSalirPefil);
            MenuSalir.add(MS_CerrarSesion);
        
    /* <-- Agregando Menus a la barra --> */
    
            if ( formularioLogin.rolSesion.equals("admin") ){
                barra.add(MenuAdmin);
                barra.add(MenuProyectos);
                barra.add(MenuEquipos);
                barra.add(MenuTareas);
                barra.add(MenuGestiones);
                barra.add(Box.createHorizontalGlue());
                barra.add(MenuSalir);
            }
            if ( formularioLogin.rolSesion.equals("usuario") ){
                barra.add(MenuProyectos);
                barra.add(MenuEquipos);
                barra.add(MenuTareas);
                barra.add(MenuGestiones);
                barra.add(Box.createHorizontalGlue());
                barra.add(MenuSalir);
            }
            
        

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
    public static javax.swing.JDesktopPane Escritorio;
    // End of variables declaration//GEN-END:variables
}
