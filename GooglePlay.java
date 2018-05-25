import java.util.ArrayList;

/**
 * Clase Google Play
 *
 * @author (Cristian de la Fuente)
 * @version (25/05/2018)
 */
public class GooglePlay
{
    private ArrayList<Usuario> usuarios;
    private ArrayList<Producto> productos;

    /**
     * Constructor de la clase GooglePlay
     */
    public GooglePlay()
    {
        usuarios = new ArrayList<>();
        productos = new ArrayList<>();
    }

    /**
     * Este metodo añade un usuario 
     *
     * @param  Usuario  El usuario a dar de alta
     */
    public void addUsuario(Usuario usuario)
    {
        usuarios.add(usuario);
    }

    /**
     * Este metodo añade un producto 
     *
     * @param  Producto  El producto a añadir
     */
    public void addProducto(Producto producto)
    {
        productos.add(producto);
    }

    /**
     * Devuelve el numero de usuarios
     * 
     * @return    El numero de usuarios
     */
    public int getNumeroUsuarios()
    {
        return usuarios.size();
    }

    /**
     * Devuelve el numero de productos
     * 
     * @return    El numero de productos
     */
    public int getNumeroProductos()
    {
        return productos.size();
    }

    /**
     * Efectua una compra
     * 
     * @return    El numero de productos
     */
    public double comprar(String correoElectronico, String identificador)
    {
        double aDevolver = -1;
        boolean buscando = true;
        boolean usuarioEncontrado = false;
        boolean productoEncontrado = false;
        Producto producto = null;
        int cont = 0;
        while (buscando && cont < usuarios.size()){
            if (usuarios.get(cont).getNombreCuenta().equals(correoElectronico)){
                usuarioEncontrado = true;
                buscando = false;
            }
            cont++;
        }
        buscando = true;
        cont = 0;
        while (buscando && cont < productos.size()){
            if (productos.get(cont).getIdentificador().equals(identificador)){
                productoEncontrado = true;
                producto = productos.get(cont);
                buscando = false;
            }
            cont++;
        }
        if (usuarioEncontrado && productoEncontrado){
            aDevolver = producto.getPrecio();
            producto.incrementaNumVecesVendido();
        }
        return aDevolver;
    }
}
