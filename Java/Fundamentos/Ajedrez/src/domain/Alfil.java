package domain;

public class Alfil extends Piezas {

    public Alfil(char c, int columna, int fila) {
        super(c);
        this.posicion = new Posicion(columna, fila);
    }

    @Override
    public String toString() {
        String pieza = "Alfil";
        String colorDePieza = "";
        if (this.color == 'b') {
            colorDePieza = " blanco. ";
        } else if (this.color == 'n') {
            colorDePieza = " negro. ";
        }
        return pieza + colorDePieza + posicion;
    }
}
