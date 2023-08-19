package laboratorio01;

/**
 *
 * @author Estudiantes
 */
public class Laboratorio01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        //Primer ejemplo
        //------------------------------------
        
        
        String nombre = "Juan";
        
        Persona per = new Persona(nombre);
        per.setApellido("Perez");
        per.setDni ("73188709");
        per.setEdad (16);
        
        String imprimir = ""
                + "\nEl nombre es: "+per.getNombre()
                + "\nEl apellido es: "+per.getApellido()
                + "\nEl DNI es: "+per.getDni()
                + "\nLa edad es: "+per.getEdad()
                + "\n------------------------------";
        
        System.out.println("" );
        
        // Segundo ejemplo
        //-----------------------------------
        
        String nombre2 = "Miguel";
        String apellido = "Cervantes";
        String dni = "11112222";
        
        Persona per2 = new Persona (
                nombre2, apellido,dni);
        
        String imprimir2=per2.getConsola();
        
        System.out.println(imprimir2);
        
    }
    
}
