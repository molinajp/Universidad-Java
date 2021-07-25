package test;

import domain.Alfil;
import domain.Caballo;
import domain.Peon;
import domain.Piezas;
import domain.Reina;
import domain.Rey;
import domain.Tablero;
import domain.Torre;

public class Ajedrez {

    public static void main(String[] args) {
        Tablero tablero = new Tablero();
        ordenarTablero(tablero);
        Peon peonBlanco = (Peon)tablero.getPieza(6, 4);
        Peon peonNegro = (Peon)tablero.getPieza(1, 0);
        Peon peonNegro2 = (Peon)tablero.getPieza(1, 3);
        peonBlanco.hacerMovimiento(tablero, 4, 4);
        peonBlanco.hacerMovimiento(tablero, 4, 3);
        peonNegro.hacerMovimiento(tablero, 3, 3);
        peonBlanco.hacerMovimiento(tablero, 3, 2);
        peonBlanco.setUltimoEnMoverse(false);
        System.out.println("peonBlanco = " + peonBlanco);
        tablero.imprimirPieza(3, 3);
        tablero.imprimirPieza(3, 2);
        tablero.imprimirPieza(4, 3);
    }

    public static void ordenarTablero(Tablero tablero) {
        Peon peon1Blancas = new Peon('b', 6, 0);
        Peon peon2Blancas = new Peon('b', 6, 1);
        Peon peon3Blancas = new Peon('b', 6, 2);
        Peon peon4Blancas = new Peon('b', 6, 3);
        Peon peon5Blancas = new Peon('b', 6, 4);
        Peon peon6Blancas = new Peon('b', 6, 5);
        Peon peon7Blancas = new Peon('b', 6, 6);
        Peon peon8Blancas = new Peon('b', 6, 7);
        Peon peon1Negras = new Peon('n', 1, 0);
        Peon peon2Negras = new Peon('n', 1, 1);
        Peon peon3Negras = new Peon('n', 1, 2);
        Peon peon4Negras = new Peon('n', 1, 3);
        Peon peon5Negras = new Peon('n', 1, 4);
        Peon peon6Negras = new Peon('n', 1, 5);
        Peon peon7Negras = new Peon('n', 1, 6);
        Peon peon8Negras = new Peon('n', 1, 7);
        tablero.setTablero(6, 0, peon1Blancas);
        tablero.setTablero(6, 1, peon2Blancas);
        tablero.setTablero(6, 2, peon3Blancas);
        tablero.setTablero(6, 3, peon4Blancas);
        tablero.setTablero(6, 4, peon5Blancas);
        tablero.setTablero(6, 5, peon6Blancas);
        tablero.setTablero(6, 6, peon7Blancas);
        tablero.setTablero(6, 7, peon8Blancas);
        tablero.setTablero(1, 0, peon1Negras);
        tablero.setTablero(1, 1, peon2Negras);
        tablero.setTablero(1, 2, peon3Negras);
        tablero.setTablero(1, 3, peon4Negras);
        tablero.setTablero(1, 4, peon5Negras);
        tablero.setTablero(1, 5, peon6Negras);
        tablero.setTablero(1, 6, peon7Negras);
        tablero.setTablero(1, 7, peon8Negras);
        Caballo caballo1Blancas = new Caballo('b', 7, 1);
        Caballo caballo2Blancas = new Caballo('b', 7, 6);
        Caballo caballo1Negras = new Caballo('n', 0, 1);
        Caballo caballo2Negras = new Caballo('n', 0, 6);
        tablero.setTablero(7, 1, caballo1Blancas);
        tablero.setTablero(7, 6, caballo2Blancas);
        tablero.setTablero(0, 1, caballo1Negras);
        tablero.setTablero(0, 6, caballo2Negras);
        Alfil alfil1Blancas = new Alfil('b', 7, 2);
        Alfil alfil2Blancas = new Alfil('b', 7, 5);
        Alfil alfil1Negras = new Alfil('n', 0, 2);
        Alfil alfil2Negras = new Alfil('n', 0, 5);
        Torre torre1Blancas = new Torre('b', 7, 0);
        Torre torre2Blancas = new Torre('b', 7, 7);
        Torre torre1Negras = new Torre('n', 0, 0);
        Torre torre2Negras = new Torre('n', 0, 7);
        Rey reyBlanco = new Rey('b', 7, 4);
        Rey reyNegro = new Rey('n', 0, 4);
        Reina reinaBlanca = new Reina('b', 7, 3);
        Reina reinaNegra = new Reina('n', 0, 3);
        tablero.setTablero(7, 2, alfil1Blancas);
        tablero.setTablero(7, 5, alfil2Blancas);
        tablero.setTablero(0, 2, alfil1Negras);
        tablero.setTablero(0, 5, alfil2Negras);
        tablero.setTablero(7, 0, torre1Blancas);
        tablero.setTablero(7, 7, torre2Blancas);
        tablero.setTablero(0, 0, torre1Negras);
        tablero.setTablero(0, 7, torre2Negras);
        tablero.setTablero(7, 4, reyBlanco);
        tablero.setTablero(0, 4, reyNegro);
        tablero.setTablero(7, 3, reinaBlanca);
        tablero.setTablero(0, 3, reinaNegra);
    }
}
