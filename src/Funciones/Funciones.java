package Funciones;

import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

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
    

    
}
