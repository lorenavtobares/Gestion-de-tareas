package Funciones;

import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import com.toedter.calendar.JDateChooser;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.format.*;

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
    public static boolean validarFechaPosterior( JDateChooser e ) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
        String stringParametro = dateFormat.format(e.getDate());
        String stringSistema = dateFormat.format(new Date());
        boolean bandera = false;
        
        try{    
            Date dateParametro = dateFormat.parse(stringParametro);
            Date dateSistema = dateFormat.parse(stringSistema);
            
            if( dateSistema.equals(dateParametro) ){ bandera = true; }
            else if (dateSistema.before(dateParametro)) { bandera = true; }
            else{ JOptionPane.showMessageDialog(null, "Debe seleccionar una fecha mayor a la actual." + bandera, "ERROR",JOptionPane.ERROR_MESSAGE); }
                        
        }catch (Exception ex){
            JOptionPane.showMessageDialog(null, "Debe seleccionar una fecha", "ERROR",JOptionPane.ERROR_MESSAGE);
        }
        
        return bandera;
    }   
    
    //LocalDate a Date
    public static Date convertirLocalDateADate(LocalDate date) {
        return java.util.Date.from(date.atStartOfDay()
                .atZone(ZoneId.systemDefault())
                .toInstant());
    }
}


/*

    Date fechaDeBd = dateFormat.parse(arrayProyectos.get(posicion).getFecha_inicio()+"");
    dateFormat.applyPattern(FORMATO_FECHA);
    String fechaString = dateFormat.format(fechaDeBd);
    Date fechaStringADate = dateFormat.parse(fechaString);

*/