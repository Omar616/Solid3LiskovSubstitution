/**
 * Alumno: Bueno Rosas Brayan Omar
 * 5IM8
 */
package liskovsubstitutionprinciple;

/**
 * La clase Mujer hereda de la clase Personas
 * @author Bueno Rosas Brayan Omar
 */
public class Mujer extends Personas{

    /**
     *En esta clase se muestra el principio debido a que solo agregamos comportamiento
     * a las clases no modificamos sus metodos 
     */
    @Override
    public void hablar() {
        System.out.println("Hola soy una mujer y soy una persona");
    }
    
}
