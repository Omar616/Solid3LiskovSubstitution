/**
 * Alumno: Bueno Rosas Brayan Omar
 * 5IM8
 */
package liskovsubstitutionprinciple;

/**
 * La clase Hombre hereda de la clase Personas
 * @author Bueno Rosas Brayan Omar
 */
public class Hombre extends Personas {
/*
    *Evidenciamos el peloformismo de los metodos de las clases abstractas de persona 
    que como ya mencionamos cumplen con el principio de agregar solo comportamiento
    
    */
    @Override
    public void hablar() {
        System.out.println(" Hola soy un hombre y una persona :3 <3");
    }
    
   
   
}
