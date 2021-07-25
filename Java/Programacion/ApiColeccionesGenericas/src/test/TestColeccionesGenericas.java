package test;

import java.util.*;

public class TestColeccionesGenericas {

    public static void main(String[] args) {
        //La lista mantiene el orden, pero puede ser más lenta
        //Tambien se pueden duplicar elementos
        List<String> miLista = new ArrayList<>();
        miLista.add("Lunes");
        miLista.add("Martes");
        miLista.add("Miercoles");
        miLista.add("Jueves");
        miLista.add("Viernes");
        miLista.add("Viernes");
        //Al usar <String> en  List recuperamos un String y no un
        //object, y no hace falta hacer casting para recuperarlo
        String elemento = miLista.get(0);
        //System.out.println("elemento = " + elemento);
        //imprimir(miLista);

        //El set puede mantener el orden o no, pero es más rápido
        //No se pueden duplicar elementos
        Set<String> miSet = new HashSet<>();
        miSet.add("Lunes");
        miSet.add("Martes");
        miSet.add("Miercoles");
        miSet.add("Jueves");
        miSet.add("Viernes");
        miSet.add("Viernes");
        //imprimir(miSet);
        
        Map<String,String> miMapa = new HashMap<>();
        miMapa.put("llave1", "Juan");
        miMapa.put("llave2", "Karla");
        miMapa.put("llave3", "Rosario");
        miMapa.put("llave3", "Carlos");
        
        
        String elementoMapa = miMapa.get("llave3");
        //System.out.println("elementoMapa = " + elementoMapa);
        
        //valor1 valor2 y valor3(las keys del mapa), son parte de un Set, 
        //dentro del mapa por eso se puede llamar el metodo imprimir
        //Lo mismo con Juan Karla y Rosario(los valores del mapa), son un Set
        imprimir(miMapa.keySet());
        imprimir(miMapa.values());
    }

    public static void imprimir(Collection<String> coleccion) {

        /*iterar con for each
        for(String elemento : coleccion){
            System.out.println("elemento = " + elemento);
        }*/
        //iterar con funcion Lambda
        coleccion.forEach(elemento -> {
            System.out.println("elemento = " + elemento);
        });
    }
}
