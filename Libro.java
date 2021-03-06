
/**
 * Clase Libro
 *
 * @author (Cristian de la Fuente)
 * @version (25/05/2018)
 */
public class Libro extends ProductoMultimedia
{
    private int numPaginas;
    private boolean ficcion;
    private static final int AÑO_REFERENCIA = 100;
    private static final int DIVISOR = 100;

    /**
     * Constructor de la clase Libro
     * 
     * @param titulo            El titulo del libro
     * @param anoCreacion       El ano de creacion del libro
     * @param numPaginas        El numero de paginas del libro
     * @param ficcion           Indica si el libro es de ficcion o no
     */
    public Libro(String titulo, int anoCreacion, int numPaginas, boolean ficcion)
    {
        super(titulo, anoCreacion);
        this.numPaginas = numPaginas;
        this.ficcion = ficcion;
    }
    
    /**
     * Devuelve el numero de paginas del libro
     *
     * @return    El numero de paginas del libro
     */
    public int getNumeroPaginas()
    {
        return numPaginas;
    }
    
    /**
     * Devuelve si el libro es de ficcion o no
     *
     * @return    Un booleano indicando si el libro es de ficcion o no
     */
    public boolean getFiccion()
    {
        return ficcion;
    }
    
    /**
     * Devuelve el precio del libro
     *
     * @return    El precio del Libro
     */
    public double getPrecio()
    {
        double aDevolver = numPaginas/DIVISOR * (AÑO_REFERENCIA - getAno());
        return aDevolver;
    }
}
