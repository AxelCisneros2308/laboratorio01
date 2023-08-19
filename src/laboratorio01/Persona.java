/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package laboratorio01;

/**
 *
 * @author Estudiantes
 */
public class Persona {
    private String nombre;
    private String apellido;
    private String dni;
    private int edad;
    private String dirección;
    
    public Persona(){}
    public Persona(String nombre){
        this.nombre = nombre;
    }
    public Persona(
            String nombre, 
            String apellido, 
            String dni){
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getDirección() {
        return dirección;
    }

    public void setDirección(String dirección) {
        this.dirección = dirección;
    }

    public String getConsola(){
        return "--------DATOS-----------"
                + "\nEl nombre es: "+this.getNombre()
                + "\nEl apellido es: "+this.getApellido()
                + "\nEl DNI es: "+this.getDni()
                + "\nLa edad es: "+this.getEdad()
                + "\n------------------------------";
    }
    
}
