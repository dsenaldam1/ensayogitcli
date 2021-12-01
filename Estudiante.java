
/**
 *  Descripción de un estudiante
 * 
 * @author - Montse 
 *  
 */
public class Estudiante
{
    private String nombre;
    private int nota;
    private int edad;
    /**
     * Constructor  
     */
    public Estudiante(String queNombre, int queNota, int queEdad)    {
        nombre = queNombre;
        nota = queNota;
        edad = queEdad;
    }

    /**
     * Accesor para el nombre
     */
    public String getNombre() {
        return nombre;

    }

    /**
     * Accesor para la nota
     */
    public int getNota() {
        return nota;

    }
    
    /**
     * Accesor para la edad
     */
    public int getEdad() {
        return edad;

    }

    /**
     * 
     */
    public void printEstudiante() {
        System.out.println("Nombre: " + nombre +
            "\nNota: " + nota + "\nEdad: " + edad);

    }

}
