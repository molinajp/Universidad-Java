package servicio;

import datos.*;
import domain.Pelicula;
import excepciones.*;
import java.util.List;

public class CatalogoPeliculasImpl implements ICatalogoPeliculas {

    private final IAccesoDatos datos;

    public CatalogoPeliculasImpl() {
        this.datos = new AccesoDatosImpl();
    }

    @Override
    public void agregarPelicula(String nombrePelicula) {
        Pelicula pelicula = new Pelicula(nombrePelicula);
        boolean anexar = false;
        try {
            anexar = datos.existe(NOMBRE_RECURSO);
            datos.escribir(pelicula, NOMBRE_RECURSO, anexar);
        } catch (AccesoDatosEx ex) {
            System.out.println("Error accceso de datos");
            ex.printStackTrace(System.out);

        }
    }

    @Override
    public void listarPeliculas() {
        try {
            List<Pelicula> lista = this.datos.listar(NOMBRE_RECURSO);
            lista.forEach(peli -> {
                System.out.println(peli.getNombre());
            });
        } catch (AccesoDatosEx ex) {
            System.out.println("Error en la lectura de Datos");
            ex.printStackTrace(System.out);
        }
    }

    @Override
    public void buscarPeliculas(String buscar) {
        String resultado = null;
        try {
            resultado = datos.buscar(NOMBRE_RECURSO, buscar);
        } catch (AccesoDatosEx ex) {
            System.out.println("Error de Acceso de Datos:");
            ex.printStackTrace(System.out);
        }
        System.out.println(resultado);

    }

    @Override
    public void iniciarCatalogoPeliculas() {
        try {
            if (this.datos.existe(NOMBRE_RECURSO)) {
                datos.borrar(NOMBRE_RECURSO);
                datos.crear(NOMBRE_RECURSO);
            } else {
                datos.crear(NOMBRE_RECURSO);
            }
        } catch (AccesoDatosEx ex) {
            System.out.println("Error de Acceso de Datos");
            ex.printStackTrace(System.out);
        }
    }

}
