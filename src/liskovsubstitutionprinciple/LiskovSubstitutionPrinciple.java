/**
 * Alumno: López Esquivel Andrés
 * Grupo: 5IM8.
 * Version 1.0
 * Fecha: 06/09/2017
 */
package liskovsubstitutionprinciple;

/**
 *
 * @author Andrés
 */
public class LiskovSubstitutionPrinciple {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Hombre ObjetoPerro = new Hombre();
        Mujer ObjetoGato = new Mujer();
        
        ObjetoPerro.hablar();
        ObjetoGato.hablar();
    }
    
}
