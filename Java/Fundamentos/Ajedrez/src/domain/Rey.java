package domain;

public class Rey extends Piezas {

    int movimientos;
    boolean mate;

    public Rey(char c, int columna, int fila) {
        super(c);
        this.movimientos = 0;
        this.mate = false;
        this.posicion = new Posicion(columna, fila);
    }

    @Override
    public String toString() {
        String pieza = "Rey";
        String colorDePieza = "";
        if (this.color == 'b') {
            colorDePieza = " blanco. ";
        } else if (this.color == 'n') {
            colorDePieza = " negro. ";
        }
        return pieza + colorDePieza + posicion;
    }
}
