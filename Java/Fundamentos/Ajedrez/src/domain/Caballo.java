package domain;

public class Caballo extends Piezas {

    public Caballo(char c, int columna, int fila) {
        super(c);
        this.posicion = new Posicion(columna, fila);
    }

    @Override
    public String toString() {
        String pieza = "Caballo";
        String colorDePieza = "";
        if (this.color == 'b') {
            colorDePieza = " blanco. ";
        } else if (this.color == 'n') {
            colorDePieza = " negro. ";
        }
        return pieza + colorDePieza + posicion;
    }
}
