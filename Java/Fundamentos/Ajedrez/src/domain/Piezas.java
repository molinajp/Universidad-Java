package domain;

import java.util.ArrayList;

public class Piezas {

    protected char color;
    protected boolean ultimoEnMoverse;
    protected boolean estaEnTablero;
    protected ArrayList<Posicion> posiblesMovimientos;
    protected ArrayList<Posicion> posiblesCapturas;
    protected Posicion posicion;

    public Piezas(char color) {
        this.color = color;
        this.ultimoEnMoverse = false;
        this.estaEnTablero = true;
        this.posiblesMovimientos = new ArrayList<>();
        this.posiblesCapturas = new ArrayList<>();
    }

    public boolean isUltimoEnMoverse() {
        return this.ultimoEnMoverse;
    }

    public void setUltimoEnMoverse(boolean a) {
        this.ultimoEnMoverse = a;
    }

    public boolean isEstaEnTablero() {
        return this.estaEnTablero;
    }

    public void setEstaEnTablero(boolean estaEnTablero) {
        this.estaEnTablero = estaEnTablero;
    }

}
