package test;

import enumeracion.Continente;
import enumeracion.Dias;

public class TestEnumeraciones {
    public static void main(String[] args) {
        System.out.println("Dia 1: " + Dias.LUNES);
        indicarDiaSemana(Dias.LUNES);
        System.out.println("Continenete no.4: " + Continente.AMERICA);
        System.out.println("N° países: " + Continente.AMERICA.getPaises());
    }
    
    private static void indicarDiaSemana(Dias dias){
        switch(dias){
            case LUNES:
                System.out.println("Primer día de la semana");
                break;
            case MARTES:
                System.out.println("Segundo dia de la semana");;
                break;
        }
    }
}
