package domain;

public class Tablero {

    Piezas[][] tablero;

    public Tablero() {
        Piezas[][] casillas = new Piezas[8][8];
        this.tablero = casillas;

    }

    public void setTablero(int fila, int columna, Piezas pieza) {
        this.tablero[fila][columna] = pieza;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Posicion{tablero=");
        for (int i = 0; i < tablero.length; i++) {
            for (int j = 0; j < tablero[i].length; j++) {
                sb.append("Posicion: ").append(i).append("-").append(j).append(tablero[i][j]);
            }
        }
        sb.append('}');
        return sb.toString();
    }

    public void imprimirPieza(int columna, int fila) {
        if (tablero[columna][fila] == null) {
            System.out.println("No hay ninguna pieza en esta casilla");
        } else {
            Piezas pieza = tablero[columna][fila];
            System.out.println("pieza = " + pieza.toString());
        }
    }
    
    public void imprimirPieza(Piezas pieza){
        System.out.println(pieza.posicion);
    }
    
    public Piezas getPieza (int columna,int fila){
        return tablero[columna][fila];
    }
    
    public void eliminarPieza(int columna, int fila){
        tablero[columna][fila] = null;
    }
    
    public void ponerPieza(int columna, int fila, Piezas pieza){
        tablero[columna][fila] = pieza;
    }
    
    
}
