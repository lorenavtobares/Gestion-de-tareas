package Funciones;

import static com.sun.javafx.tk.Toolkit.getToolkit;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import com.toedter.calendar.JDateChooser;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.format.*;
import java.util.ArrayList;
import static java.util.Calendar.DATE;
import java.util.List;

public class Funciones {
    private static final String FORMATO_FECHA = "dd-MM-yyyy";
    
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
    
    public static void soloFechas(JDateChooser e, java.awt.event.KeyEvent evt, int longitud){
        int key = evt.getKeyChar();

        boolean especial = key == 47;
        boolean numeros = key >= 48 && key <= 57;
            
        if (!(numeros  ||  especial)){
            evt.consume();
        }
        

    }
    
    //Validacion de fecha -> Posterior a la actual
    public static boolean validarFechaPosterior( JDateChooser e ) {
        SimpleDateFormat dateFormat = new SimpleDateFormat(FORMATO_FECHA);
        String stringParametro = dateFormat.format(e.getDate());
        String stringSistema = dateFormat.format(new Date());
        boolean bandera = false;
        boolean isStringParametro = false;
        boolean isStringSistema = false;
        
        //Validando si es Date

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
    
    // Validar si un String es Date
    private static boolean isDateValid(String date){
        try {
            DateFormat df = new SimpleDateFormat(FORMATO_FECHA);
            df.setLenient(false);
            df.parse(date);
            return true;
        } catch (ParseException e) {
            return false;
        }
}
  
    //Convertir de LocalDate a Date
    public static Date convertirLocalDateADate(LocalDate date) {
        return java.util.Date.from(date.atStartOfDay()
                .atZone(ZoneId.systemDefault())
                .toInstant());
    }
    
    //Validar Fecha -> Form 1
    public static boolean verificarFecha(JDateChooser e ){
        SimpleDateFormat dateFormat = new SimpleDateFormat(FORMATO_FECHA);
        Date dat = new Date();//Instancia la fecha del sistema
        String stringParametro = dateFormat.format(e.getDate());
        
        if ( e.getDate().getTime() >= dat.getTime() ){//Compara si la fecha seleccionada es mayor o igual a la fecha actual
            return true;
        }
        
        if( stringParametro.length() <= 10){
            return true;
        }
        
        return false;
        
    }
    
}
