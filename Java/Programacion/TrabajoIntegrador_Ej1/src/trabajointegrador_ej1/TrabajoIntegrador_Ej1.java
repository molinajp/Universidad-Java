package trabajointegrador_ej1;

import java.util.Scanner;

public class TrabajoIntegrador_Ej1 {

    public static void main(String[] args) {
        int azul = 40;
        int verde = 35;
        int amarillo = 30;
        int cantidadAlumnos;
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Ingrese la cantidad de alumnos a inscribir:");
        cantidadAlumnos = teclado.nextInt();
        
        if (cantidadAlumnos > azul) {
            System.out.println("Ingrese un valor igual o menor a 40");
        }
        else{
            if(cantidadAlumnos <= amarillo){
                System.out.println("El aula a utilizar es el aula amarilla");
            }
            else if(cantidadAlumnos <= verde){
                System.out.println("El aula a utilizar es el aula verde");
            }
            else{
                System.out.println("El aula a utilizar es el aula azul");
            }
        }
        teclado.close();
    }
}
    

