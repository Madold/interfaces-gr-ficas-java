package controlador;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Minutos {
    
    private String numeroTelefonico;
    private String minutos;

    public int getMinutos() {
        return Integer.parseInt(minutos);
    }

    public void setMinutos(String minutos) {
        this.minutos = minutos;
    }
    
    public Minutos(String numeroTelefonico, String minutos) {
        setNumeroTelefonico(numeroTelefonico);
        setMinutos(minutos);
    }
    
    public String getNumeroTelefonico() {
        return numeroTelefonico;
    }
    
    public void setNumeroTelefonico(String numeroTelefonico) {
        this.numeroTelefonico = numeroTelefonico;
    }
    
    
    public boolean esValidoElTelefono() {
        final String REGEX = "^[0-9]{1,10}";
        
        final Pattern patron = Pattern.compile(REGEX);
        final Matcher m = patron.matcher(numeroTelefonico);
                
        return m.matches() && numeroTelefonico.length() >= 3;      
    }
    
    public boolean esValidoLosMinutos() {
        final String REGEX = "^[0-9]{1,10}";
        
        final Pattern patron = Pattern.compile(REGEX);
        final Matcher m = patron.matcher(minutos);
                
        return m.matches(); 
    }
    
    public String obtenerOperador() {
        String operador = "";
        String subNumero = numeroTelefonico.substring(0, 3);
        
        switch (subNumero) {
            case "316":
                operador = "movistar";
                break;
            
            case "300":
                operador = "tigo";
                break;
            
            case "312":
                operador = "claro";
                break;
            
            default:
                operador = "operadora desconocida";
                break;
        }
        
        return operador;
    }
    
    public int obtenerPagoTotal() {
        
        int pagoTotal = 0;
        final int COSTO_MINUTO_TIGO = 100;
        final int COSTO_MINUTO_CLARO = 120;
        final int COSTO_MINUTO_MOVISTAR = 110;
        String operador = obtenerOperador();
        
        switch (operador) {
            case "movistar":
                pagoTotal = getMinutos() * COSTO_MINUTO_MOVISTAR;
                break;
            case "tigo":
                pagoTotal = getMinutos() * COSTO_MINUTO_TIGO;
                break;
            
            case "claro":
                pagoTotal = getMinutos() * COSTO_MINUTO_CLARO;
                break;
            
            default:
                pagoTotal = 0;
                break;
        }
        
        return pagoTotal;
    }
    
}
