package domain;

public class Torre extends Piezas {

    int movimientos;

    public Torre(char c, int columna, int fila) {
        super(c);
        this.movimientos = 0;
        this.posicion = new Posicion(columna, fila);
    }

    @Override
    public String toString() {
        String pieza = "Torre";
        String colorDePieza = "";
        if (this.color == 'b') {
            colorDePieza = " blanca. ";
        } else if (this.color == 'n') {
            colorDePieza = " negra. ";
        }
        return pieza + colorDePieza + posicion;
    }
}
