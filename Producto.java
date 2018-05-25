
/**
 * Clase Producto
 *
 * @author (Cristian de la Fuente)
 * @version (25/05/2018)
 */
public abstract class Producto
{
    private String identificador;
    private int numVecesVendido;

    /**
     * Constructor for objects of class Producto
     */
    public Producto(String identificador)
    {
        this.identificador = identificador;
        numVecesVendido = 0;
    }
    
    /**
     * Devuelve el identificador del producto
     *
     * @return    El identificador del producto 
     */
    public String getIdentificador()
    {
        return identificador;
    }
    
    /**
     * Incrementa el numero de veces vendido
     */
    public void incrementaNumVecesVendido()
    {
        numVecesVendido++;
    }
    
    /**
     * Devuelve el numero de veces que se ha vendido el producto
     *
     * @return    El numero de veces que se ha vendido el producto
     */
    public int getNumVecesVendido()
    {
        return numVecesVendido;
    }
    
    /**
     * Devuelve el precio del producto
     *
     * @return    El precio del producto
     */
    public abstract double getPrecio();
}
