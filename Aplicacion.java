
/**
 * Clase Aplicacion
 *
 * @author (Cristian de la Fuente)
 * @version (25/05/2018)
 */
public class Aplicacion extends Producto
{
    private double espacioMemoria;
    private Categoria categoria;
    private static final double PRECIO_INICIAL = 0.99;

    /**
     * Constructor de la clase Aplicacion
     * 
     * @param nombre            El nombre de la aplicacion
     * @param espacioMemoria    El espacio en memoria de la aplicacion
     * @param categoria         La categoria de la aplicacion
     */
    public Aplicacion(String nombre, double espacioMemoria, Categoria categoria)
    {
        super(nombre);
        this.espacioMemoria = espacioMemoria;
        this.categoria = categoria;
    }
    
    /**
     * Devuelve el tamaño en MB de la Aplicacion
     * 
     * @return    El tamaño en MB de la Aplicacion
     */
    public double getTamanoEnMB()
    {
        return espacioMemoria;
    }
    
    /**
     * Devuelve la categoria de la Aplicacion
     * 
     * @return    La categoria de la Aplicacion
     */
    public String getCategoria()
    {
        return categoria.getNombreCategoria();
    }
    
    /**
     * Devuelve el precio de la aplicacion
     *
     * @return    El precio de la aplicacion
     */
    @Override
    public double getPrecio()
    {
        double aDevolver = PRECIO_INICIAL;
        if (getNumVecesVendido() >= 2){
            switch(getCategoria()){
                case "Juegos":
                aDevolver = 5;
                break;
                case "Comunicaciones":
                aDevolver = 2;
                break;
                case "Productividad":
                aDevolver = 10;
                break;
                case "Multimedia":
                aDevolver = 2;
                break;
            }
        }
        return aDevolver;
    }
    
    /**
     * Devuelve el nombre de la aplicacion
     *
     * @return    El nombre de la aplicacion
     */
    public String getNombre()
    {
        return getIdentificador();
    }
}
