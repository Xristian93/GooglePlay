
/**
 * Clase Usuario
 *
 * @author (Cristian de la Fuente)
 * @version (25/05/2018)
 */
public class Usuario
{
    private String correoElectronico;

    /**
     * Constructor de la clase Usuario
     * 
     * @param correo    El correo del Usuario
     */
    public Usuario(String correo)
    {
        correoElectronico = correo;
    }
    
    /**
     * Devuelve el nombre de la cuenta del usuario
     * 
     * @return    El nombre de la cuenta del usuario
     */
    public String getNombreCuenta()
    {
        return correoElectronico;
    }
}
