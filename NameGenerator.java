
/**
 * Write a description of class NameGenerator here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class NameGenerator
{
    private static final int LETRA_1 = 2;
    private static final int LETRA_2 = 3;
    private static final int LETRA_3 = 4;
    private static final int LETRA_4 = 5;
    
    /**
     * Constructor for objects of class NameGenerator
     */
    public NameGenerator()
    {
        
    }

    /**
     * Método que sirve para generar un nombre de Star Wars.
     * @param primerApellido Se introduce el primer apellido.
     * @param nombreReal Se introduce el nombre real.
     * @param primerApellidoMadre Se introduce el primer apellido de la madre.
     * @param ciudadNacimiento Se introduce la ciudad de nacimiento.
     */
    public void generateStarWarsName(String primerApellido, String nombreReal, String primerApellidoMadre, String ciudadNacimiento)
    {
        System.out.println("Tu nombre para las películas es " + primerApellido.substring(0, LETRA_3) + nombreReal.substring(0,LETRA_2) + " " + primerApellidoMadre.substring(0, LETRA_1) + ciudadNacimiento.substring(0,LETRA_4));
    }
}
