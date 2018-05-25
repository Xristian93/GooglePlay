
/**
 * Enum Categoria
 *
 * @author (Cristian de la Fuente)
 * @version (25/05/2018)
 */
public enum Categoria
{
    JUEGOS("Juegos"),

    COMUNICACIONES("Comunicaciones"), 

    PRODUCTIVIDAD("Productividad"), 

    MULTIMEDIA("Multimedia");
    private String nombreCategoria;

    private Categoria(String nombreCategoria){
        this.nombreCategoria = nombreCategoria;
    }
    
    public String getNombreCategoria(){
        return nombreCategoria;
    }
}
