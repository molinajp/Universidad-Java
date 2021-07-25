package test;

public class TestAutoboxingUnboxing {

    public static void main(String[] args) {
        /*Clases envolventes de tipos primitivos
        
        int- Integer
        long - Long
        float - Float
        double - Double
        boolean - Boolean
        byte - Byte
        char - Character
        short - Short
         */

        //AutoBoxing
//        Integer entero = 10;
//        System.out.println("entero = " + entero);
//        System.out.println("entero = " + entero.doubleValue());
//
//        Proceso inverso - Unboxing
//        int entero2 = entero;
//        System.out.println("entero2 = " + entero2);
        int valores[] = {8, 3, 5, 7, 1, 11, 15, 2};
        int numeroMaximo = 0;
        for (int numero : valores) {
            if (numeroMaximo < numero) {
                numeroMaximo = numero;
            }
        }
        System.out.println(numeroMaximo);
    }
}
