
import java.util.Scanner;

//Mi clase en Java
public class HolaMundo {

    /**
     *
     * @param args
     */
    public static void main(String args[]) {
        inicio: 
        for(var contador = 0;contador < 3; contador++){
            if(contador % 2 != 0){
                continue inicio;
            }
            System.out.println("contador = " + contador);
        }
    
//        var contador = 0;
//        while (contador < 3){
//            System.out.println("contador = " + contador);
//            contador++;
//        }
//        var contador = 0;
//        do {
//            System.out.println("contador = " + contador);
//            contador++;
//        } while (contador < 0);
    }
}
