package unit9_b;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Clase a probar - Caja blanca
 * @author Rosa Medina
 */
public class Alumno {
    public boolean validaNif(String nif) {
        if (nif.length() != 9 || nif == null) {       //a
            return false;                             //b
        }
        String dni = nif.substring(0, 8);           
        char letra = nif.charAt(8);
        Pattern pattern = Pattern.compile("[0-9]{8,8}");
        Matcher matcher = pattern.matcher(dni);
        String letras = "TRWAGMYFPDXBNJZSQVHLCKE";
        long ldni = 0;
        try {                                   //c
            ldni = Long.parseLong(dni);         //d
        } catch (NumberFormatException e) {     
            return false;                       //e
        }
        int indice = (int) (ldni % 23);
        char letraEsperada = letras.charAt(indice);
        return matcher.matches() && letra == letraEsperada; //f
    }   
    public float calculaTasaMatricula(int edad, boolean familiaNumerosa,
            boolean repetidor) {
        float tasa = 500.00f;                                       //a
        if ((edad < 25) && (!familiaNumerosa) && (repetidor)) {     //b
            tasa = tasa + 1500.00f;                                 //c
        } else {
            if ((familiaNumerosa) || (edad >= 65)) {                //d
                tasa = tasa / 2;                                    //e
            }
            if ((edad > 50) && (edad < 65)) {                       //f
                tasa = tasa - 100.00f;                              //g
            }
        }
        return tasa;                                                //h
    }
}
