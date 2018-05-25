
/**
 * Clase ProductoMultimedia
 *
 * @author (Cristian de la Fuente)
 * @version (25/05/2018)
 */
public abstract class ProductoMultimedia extends Producto
{
    private int anoCreacion;

    /**
     * Constructor for objects of class ProductoMultimedia
     */
    public ProductoMultimedia(String titulo, int anoCreacion)
    {
        super(titulo);
        this.anoCreacion = anoCreacion;
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
    
    /**
     * Devuelve el titulo del producto multimedia
     *
     * @return    El titulo del producto multimedia
     */
    public String getTitulo()
    {
        return getIdentificador();
    }
    
    /**
     * Devuelve el precio del producto
     *
     * @return    El precio del producto
     */
    public abstract double getPrecio();
}
