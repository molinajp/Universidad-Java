package domain;


public class Posicion {
    
    int[] posicion;
    
    public Posicion(int columna, int fila){
        this.posicion = new int[2];
        this.posicion[0] = columna;
        this.posicion[1] = fila;
    }

    public int getColumna() {
        return this.posicion[0];
    }
    
    public void setColumna(int columna){
        this.posicion[0] = columna;
    }
    
    public int getFila(){
        return this.posicion[1];
    }
    
    public void setFila(int fila){
        this.posicion[1] = fila;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("La pieza está en la posición: ").append(posicion[0]).append("-").append(posicion[1]);
        return sb.toString();
    }
    
    
}
