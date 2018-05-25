
/**
 * Clase Aplicacion
 *
 * @author (Cristian de la Fuente)
 * @version (25/05/2018)
 */
public class Aplicacion extends Producto
{
    private String nombre;
    private double espacioMemoria;
    private Categoria categoria;

    /**
     * Constructor de la clase Aplicacion
     * 
     * @param nombre            El nombre de la aplicacion
     * @param espacioMemoria    El espacio en memoria de la aplicacion
     * @param categoria         La categoria de la aplicacion
     */
    public Aplicacion(String nombre, double espacioMemoria, Categoria categoria)
    {
        this.nombre = nombre;
        this.espacioMemoria = espacioMemoria;
        this.categoria = categoria;
    }

    /**
     * Devuelve el nombre de la Aplicacion
     * 
     * @return    El nombre de la Aplicacion
     */
    public String getNombre()
    {
        return nombre;
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
}
