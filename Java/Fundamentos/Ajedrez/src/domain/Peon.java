package domain;

public class Peon extends Piezas {

    int movimientos;

    public Peon(char c, int columna, int fila) {
        super(c);
        this.movimientos = 0;
        this.posicion = new Posicion(columna, fila);

    }

    private void calcularMovimientos(Posicion posicion, Tablero tablero) {
        this.posiblesMovimientos.clear();
        int columna = posicion.getColumna();
        int fila = posicion.getFila();

        //Calcular movimientos para peones blancos
        if (columna - 1 >= 0 && this.color == 'b') {
            if (this.movimientos == 0) {
                Piezas pieza = tablero.getPieza(columna - 1, fila);
                if (pieza == null) {
                    Posicion primerMov = new Posicion(columna - 1, fila);
                    this.posiblesMovimientos.add(primerMov);
                    Piezas pieza2 = tablero.getPieza(columna - 2, fila);
                    if (pieza2 == null) {
                        Posicion segundoMov = new Posicion(columna - 2, fila);
                        this.posiblesMovimientos.add(segundoMov);
                    }
                }
            } else {
                Piezas pieza = tablero.getPieza(columna - 1, fila);
                if (pieza == null) {
                    Posicion primerMov = new Posicion(columna - 1, fila);
                    this.posiblesMovimientos.add(primerMov);
                }
            }
        } //Calcular movimientos para peones negros
        else if (columna + 1 <= 7 && this.color == 'n') {
            if (this.movimientos == 0) {
                Piezas pieza = tablero.getPieza(columna + 1, fila);
                if (pieza == null) {
                    Posicion primerMov = new Posicion(columna + 1, fila);
                    this.posiblesMovimientos.add(primerMov);
                    Piezas pieza2 = tablero.getPieza(columna + 2, fila);
                    if (pieza2 == null) {
                        Posicion segundoMov = new Posicion(columna + 2, fila);
                        this.posiblesMovimientos.add(segundoMov);
                    }
                }
            } else {
                Piezas pieza = tablero.getPieza(columna + 1, fila);
                if (pieza == null) {
                    Posicion primerMov = new Posicion(columna + 1, fila);
                    this.posiblesMovimientos.add(primerMov);
                }
            }
        }
    }

    private void calcularCapturas(Posicion posicion, Tablero tablero) {
        this.posiblesCapturas.clear();
        int columna = posicion.getColumna();
        int fila = posicion.getFila();

        // Acá están todas las capturas para los peones blancos
        if (columna + 1 <= 7 && this.color == 'b' && fila <= 6) {
            Piezas pieza = tablero.getPieza(columna + 1, fila + 1);
            if (pieza != null && this.color != pieza.color) {
                Posicion primerMov = new Posicion(columna + 1, fila + 1);
                this.posiblesCapturas.add(primerMov);
            }
            // Para manejar el caso de al paso
            if ((fila == 4 && this.color == 'b')) {
                if (tablero.getPieza(columna + 1, fila).getClass() == this.getClass()
                        && tablero.getPieza(columna + 1, fila).ultimoEnMoverse == true
                        && tablero.getPieza(columna + 1, fila).color != this.color) {
                    Posicion primerMov = new Posicion(columna + 1, fila + 1);
                    this.posiblesCapturas.add(primerMov);
                }
            }
        }
        if (columna - 1 >= 0 && this.color == 'b' && fila <= 6) {
            Piezas pieza = tablero.getPieza(columna - 1, fila + 1);
            if (pieza != null && this.color != pieza.color) {
                Posicion primerMov = new Posicion(columna - 1, fila + 1);
                this.posiblesCapturas.add(primerMov);
            }
            // Para manejar el caso de al paso
            if ((fila == 4 && this.color == 'b')) {
                if (tablero.getPieza(columna - 1, fila).getClass() == this.getClass()
                        && tablero.getPieza(columna - 1, fila).ultimoEnMoverse == true
                        && tablero.getPieza(columna - 1, fila).color != this.color) {
                    Posicion primerMov = new Posicion(columna - 1, fila + 1);
                    this.posiblesCapturas.add(primerMov);
                }
            }
        }

        //Acá están las capturas para los peones negros
        if (columna + 1 <= 7 && this.color == 'n' && fila >= 1) {
            Piezas pieza = tablero.getPieza(columna + 1, fila - 1);
            if (pieza != null && this.color != pieza.color) {
                Posicion primerMov = new Posicion(columna + 1, fila - 1);
                this.posiblesCapturas.add(primerMov);
            }
            // Para manejar el caso de al paso
            if (fila == 4) {
                if (tablero.getPieza(columna + 1, fila).getClass() == this.getClass()
                        && tablero.getPieza(columna + 1, fila).ultimoEnMoverse == true
                        && tablero.getPieza(columna + 1, fila).color != this.color) {
                    Posicion primerMov = new Posicion(columna + 1, fila - 1);
                    this.posiblesCapturas.add(primerMov);
                }
            }
        }
        if (columna - 1 >= 0 && this.color == 'n' && fila >= 1) {
            Piezas pieza = tablero.getPieza(columna - 1, fila - 1);
            if (pieza != null && this.color != pieza.color) {
                Posicion primerMov = new Posicion(columna - 1, fila - 1);
                this.posiblesCapturas.add(primerMov);
            }
            // Para manejar el caso de al paso
            if (fila == 4) {
                if (tablero.getPieza(columna - 1, fila).getClass() == this.getClass()
                        && tablero.getPieza(columna - 1, fila).ultimoEnMoverse == true
                        && tablero.getPieza(columna - 1, fila).color != this.color) {
                    Posicion primerMov = new Posicion(columna - 1, fila - 1);
                    this.posiblesCapturas.add(primerMov);
                }
            }
        }
    }

    public char hacerMovimiento(Tablero tablero, int columna, int fila) {
        calcularMovimientos(this.posicion, tablero);
        calcularCapturas(this.posicion, tablero);
        int antiguaColumna = this.posicion.getColumna();
        int antiguaFila = this.posicion.getFila();
        boolean chequeoMov = false;
        boolean chequeoCap = false;
        //Para llevar a cabo el movimiento
        for (Posicion p : this.posiblesMovimientos) {
            int estaColumna = p.getColumna();
            int estaFila = p.getFila();
            if (estaColumna == columna && estaFila == fila) {
                chequeoMov = true;
                this.posicion.setColumna(columna);
                this.posicion.setFila(fila);
                tablero.ponerPieza(columna, fila, this);
                break;
            }
        }
        if (chequeoMov == true) {
            tablero.eliminarPieza(antiguaColumna, antiguaFila);
            return 'M';
        }
        //Para llevar a cabo la captura
        for (Posicion p : this.posiblesCapturas) {
            int estaColumna = p.getColumna();
            int estaFila = p.getFila();
            if (estaColumna == columna && estaFila == fila) {
                chequeoCap = true;
                tablero.eliminarPieza(columna, fila);
                this.posicion.setColumna(columna);
                this.posicion.setFila(fila);
                tablero.ponerPieza(columna, fila, this);
                break;
            }
        }
        if (chequeoCap == true) {
            tablero.eliminarPieza(antiguaColumna, antiguaFila);
            return 'C';
        }
        if (chequeoCap == false && chequeoMov == false) {
            System.out.println("Este movimiento no es posible");
        }
        return 'N';
    }

    @Override
    public String toString() {
        if (this.estaEnTablero == false) {
            return "Esta pieza no está más en el tablero";
        } else {
            String pieza = "Peon";
            String colorDePieza = "";
            if (this.color == 'b') {
                colorDePieza = " blanco. ";
            } else if (this.color == 'n') {
                colorDePieza = " negro. ";
            }
            return pieza + colorDePieza + posicion;
        }
    }

}
