package test;

import static aritmetica.Aritmetica.division;
import excepciones.OperacionExcepcion;

public class TestExcepciones {
    public static void main(String[] args) {
        int resultado = 0;
        //try, catch, finally son para utilizar Exception
        //No hace falta usarlos para RuntimeException
        try{
            resultado = division(resultado, resultado);
        }catch(OperacionExcepcion e){
            System.out.println("Ocurrió un error de tipo OperacionExcepcion");
            System.out.println(e.getMessage());
        }catch(Exception e){
            System.out.println("Ocurrio un error de tipo Excepcion");
            //e.printStackTrace(System.out);
            System.out.println(e.getMessage());
        }
        finally{//siempre se ejecuta
            System.out.println("Se revisó la división entre cero");
        }
        System.out.println("resultado = " + resultado);
    }
}
