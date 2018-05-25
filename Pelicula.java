
/**
 * Clase Pelicula
 *
 * @author (Cristian de la Fuente)
 * @version (25/05/2018)
 */
public class Pelicula extends ProductoMultimedia
{
    private int duracionMin;
    private int calidad;
    private static final int CALIDAD_HD = 1080;

    /**
     * Constructor de la clase Pelicula
     * 
     * @param titulo            El titulo de la pelicula
     * @param anoCreacion       El ano de creacion de la pelicula
     * @param duracionMin       La duracion en minutos de la pelicula
     * @param calidad           La calidad de la pelicula
     */
    public Pelicula(String titulo, int anoCreacion,int duracionMin, int calidad)
    {
        super(titulo, anoCreacion);
        this.duracionMin = duracionMin;
        this.calidad = calidad;
    }
    
    /**
     * Devuelve la duracion de la pelicula
     *
     * @return    La duracion de la pelicula
     */
    public int getDuracion()
    {
        return duracionMin;
    }
    
    /**
     * Devuelve la calidad de la pelicula
     *
     * @return    La calidad de la pelicula
     */
    public String getCalidad()
    {
        String aDevolver = "HD";
        if (calidad >= CALIDAD_HD){
            aDevolver = "FullHD";
        }
        return aDevolver;
    }
}
