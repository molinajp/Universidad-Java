package operaciones;

public class PruebaCaja {
    public static void main(String[] args) {
        Caja caja1 = new Caja(3,2,6);
        int volumen = caja1.calcularVolumen();
        System.out.println("volumen = " + volumen);
    }
}
