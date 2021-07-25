package laboratoriofinal;

import java.util.Scanner;
import servicio.*;

public class CPJLaboratorioFinal {

    public static void main(String[] args) {
        int opcion = -1;
        Scanner teclado = new Scanner(System.in);
        var catalogo = new CatalogoPeliculasImpl();
        while (opcion != 0) {
            System.out.println("""
                               Elija una opcion: 
                               1. Iniciar catalogo de peliculas 
                               2. Agregar pelicula 
                               3. Listar peliculas 
                               4. Buscar peliculas 
                               0. Salir del programa""");
            opcion = Integer.parseInt(teclado.nextLine().trim());
            switch (opcion) {
                case 1:
                    catalogo.iniciarCatalogoPeliculas();
                    System.out.println("Catálogo iniciado");
                    break;
                case 2:
                    System.out.println("Introduzca el nombre de la pelicula");
                    var nombre = teclado.nextLine();
                    catalogo.agregarPelicula(nombre);
                    break;
                case 3:
                    catalogo.listarPeliculas();
                    break;
                case 4:
                    System.out.println("Introduzca el nombre de la pelicula a buscar");
                    catalogo.buscarPeliculas(teclado.nextLine());
                    break;
                case 0:
                    System.out.println("Hasta pronto!");
                    break;
                default:
                    System.out.println("Número no valido");
            }

        }
    }
}
