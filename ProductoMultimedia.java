
/**
 * Clase ProductoMultimedia
 *
 * @author (Cristian de la Fuente)
 * @version (25/05/2018)
 */
public abstract class ProductoMultimedia extends Producto
{
    private String titulo;
    private int anoCreacion;

    /**
     * Constructor for objects of class ProductoMultimedia
     */
    public ProductoMultimedia(String titulo, int anoCreacion)
    {
        this.titulo = titulo;
        this.anoCreacion = anoCreacion;
    }

    /**
     * Devuelve el titulo del producto multimedia
     *
     * @return    El titulo del producto multimedia
     */
    public String getTitulo()
    {
        return titulo;
    }
    
    /**
     * Devuelve el ano de creacion del producto multimedia
     *
     * @return    El ano de creacion del producto multimedia
     */
    public int getAno()
    {
        return anoCreacion;
    }
}
