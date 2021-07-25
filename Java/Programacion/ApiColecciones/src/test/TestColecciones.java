package test;

import java.util.*;

public class TestColecciones {

    public static void main(String[] args) {
        //La lista mantiene el orden, pero puede ser más lenta
        //Tambien se pueden duplicar elementos
        List miLista = new ArrayList();
        miLista.add("Lunes");
        miLista.add("Martes");
        miLista.add("Miercoles");
        miLista.add("Jueves");
        miLista.add("Viernes");
        miLista.add("Viernes");
        //imprimir(miLista);

        //El set puede mantener el orden o no, pero es más rápido
        //No se pueden duplicar elementos
        Set miSet = new HashSet();
        miSet.add("Lunes");
        miSet.add("Martes");
        miSet.add("Miercoles");
        miSet.add("Jueves");
        miSet.add("Viernes");
        miSet.add("Viernes");
        //imprimir(miSet);
        
        Map miMapa = new HashMap();
        miMapa.put("valor1", "Juan");
        miMapa.put("valor2", "Karla");
        miMapa.put("valor3", "Rosario");
        
        
        String elemento1 = (String)miMapa.get("valor1");
        //System.out.println("elemento1 = " + elemento1);
        
        //valor1 valor2 y valor3(las keys del mapa), son parte de un Set, 
        //dentro del mapa por eso se puede llamar el metodo imprimir
        //Lo mismo con Juan Karla y Rosario(los valores del mapa), son un Set
        imprimir(miMapa.keySet());
        imprimir(miMapa.values());
    }

    public static void imprimir(Collection coleccion) {

        /*iterar con for each
        for(Object elemento : coleccion){
            System.out.println("elemento = " + elemento);
        }*/
        //iterar con funcion Lambda
        coleccion.forEach(elemento -> {
            System.out.println("elemento = " + elemento);
        });
    }
}
