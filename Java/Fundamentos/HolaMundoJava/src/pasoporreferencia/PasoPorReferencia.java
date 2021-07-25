package pasoporreferencia;

import clases.Persona;


public class PasoPorReferencia {
    public static void main(String[] args) {
        Persona persona1 = new Persona();
        persona1.nombre = "Juan";
        System.out.println("persona1 nombre = " + persona1.nombre);
        persona1 = cambiarValor(persona1);
        System.out.println("persona1 nombre cambio = " + persona1.nombre);
    }
    
    public static Persona cambiarValor(Persona persona){
        persona.nombre = "Karla";
        return persona;
    }
}
