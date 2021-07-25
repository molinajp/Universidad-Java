package test;

import dominio.Persona;

public class TestFinal {
    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {
        final int miVariable = 10;
        System.out.println("miVariable = " + miVariable);
        //miVariable = 5;
        System.out.println("Mi constante: " + Persona.MI_CONSTANTE);
        
        final Persona persona1 = new Persona();
        //persona = new Persona(); no se puede
        persona1.setNombre("Juan");
        System.out.println("persona1 nombre = " + persona1.getNombre());
        persona1.setNombre("Carlos");
        System.out.println("persona1 nombre = " + persona1.getNombre());
    }
}

