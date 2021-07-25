package trabajointegrador_ej2;

import java.util.ArrayList;
import java.util.Scanner;

public class TrabajoIntegrador_Ej2 {

    public static void main(String[] args) {
        
        String nombreIngresado;
        
        ArrayList<String> clientes = new ArrayList<String>();
        
        clientes.add("Juan");
        clientes.add("Pedro");
        clientes.add("Julieta");
        clientes.add("Emilia");
        clientes.add("Lucas");
        
        System.out.println("Ingrese el nombre del cliente a buscar:");
        
        Scanner teclado = new Scanner(System.in);
        nombreIngresado = teclado.nextLine();
        
        for (int i = 0; i < clientes.size(); i++) {
            String nombre = clientes.get(i);
            if(nombre.equalsIgnoreCase(nombreIngresado)){
                System.out.println("El cliente fue encontrado en el índice " + i);
                break;
            }
            else if (i + 1 == clientes.size()){
                System.out.println("El cliente no fue encontrado");
            }
        }
    }
    
}
