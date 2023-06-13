package Funciones;

import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import com.toedter.calendar.JDateChooser;

public class Funciones {
    
    public static void soloLetras(JTextField e, java.awt.event.KeyEvent evt, int longitud){
        int key = evt.getKeyChar();

        boolean mayusculas = key >= 65 && key <= 90;
        boolean minusculas = key >= 97 && key <= 122;
        boolean especial = key == 164;
        boolean espacio = key == 32;
            
        if (!(minusculas || mayusculas || espacio || especial)){
            evt.consume();
        }
        
        if (e.getText().trim().length() == longitud) {
            evt.consume();
            JOptionPane.showMessageDialog(null, "Longitud maxima " + longitud + " caracteres.", "ERROR validacion de datos",JOptionPane.WARNING_MESSAGE);
        }
    }
    
    public static void soloNumeros(JTextField e, java.awt.event.KeyEvent evt, int longitud){
        int key = evt.getKeyChar();

        boolean numeros = key >= 48 && key <= 57;
            
        if (!(numeros)){
            evt.consume();
        }
        
        if (e.getText().trim().length() == longitud) {
            evt.consume();
            JOptionPane.showMessageDialog(null, "Longitud maxima " + longitud + " caracteres.", "ERROR validacion de datos",JOptionPane.WARNING_MESSAGE);
        }
    }
    
    public static void soloNumerosYLetras(JTextField e, java.awt.event.KeyEvent evt, int longitud){
        int key = evt.getKeyChar();

        boolean mayusculas = key >= 65 && key <= 90;
        boolean minusculas = key >= 97 && key <= 122;
        boolean especial = key == 164;
        boolean espacio = key == 32;
        boolean numeros = key >= 48 && key <= 57;
            
        if (!(numeros || mayusculas || minusculas || espacio || especial)){
            evt.consume();
        }
        
        if (e.getText().trim().length() == longitud) {
            evt.consume();
            JOptionPane.showMessageDialog(null, "Longitud maxima " + longitud + " caracteres.", "ERROR validacion de datos",JOptionPane.WARNING_MESSAGE);
        }
    }
    
    public static void soloNumerosYLetras(JTextArea e, java.awt.event.KeyEvent evt, int longitud){
        int key = evt.getKeyChar();

        boolean mayusculas = key >= 65 && key <= 90;
        boolean minusculas = key >= 97 && key <= 122;
        boolean especial = key == 164;
        boolean espacio = key == 32;
        boolean numeros = key >= 48 && key <= 57;
            
        if (!(numeros || mayusculas || minusculas || espacio || especial)){
            evt.consume();
        }
        
        if (e.getText().trim().length() == longitud) {
            evt.consume();
            JOptionPane.showMessageDialog(null, "Longitud maxima " + longitud + " caracteres.", "ERROR validacion de datos",JOptionPane.WARNING_MESSAGE);
        }
    }
    
    //Validacion de fecha -> Posterior a la actual
    public static boolean validarFechaPosterior(JDateChooser e){
        Date dat = new Date(); //Instancia la fecha del sistema
        boolean bandera = false;
        
        try{
            if ( e.getDate().before(dat) ){ //Compara si la fecha seleccionada es mayor o igual a la fecha actual
                JOptionPane.showMessageDialog(null, "Para el ingreso de un proyecto, se debe seleccionar una fecha posterior a la actual.", "ERROR",JOptionPane.ERROR_MESSAGE);                
            }else {bandera = true;}
        }catch (Exception ex){
            JOptionPane.showMessageDialog(null, "Debe seleccionar una fecha", "ERROR",JOptionPane.ERROR_MESSAGE);
        }
        
        return bandera;
    }
    
    
    
   
    

    
}
