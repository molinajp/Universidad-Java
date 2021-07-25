package domain;

public class Reina extends Piezas {

    public Reina(char c, int columna, int fila) {
        super(c);
        this.posicion = new Posicion(columna, fila);
    }

    @Override
    public String toString() {
        String pieza = "Reina";
        String colorDePieza = "";
        if (this.color == 'b') {
            colorDePieza = " blanca. ";
        } else if (this.color == 'n') {
            colorDePieza = " negra. ";
        }
        return pieza + colorDePieza + posicion;
    }
}
