package mx.com.gm.ventas;

public class Producto {

    private final int idProducto;
    private String nombre;
    private double precio;
    private static int CONTADOR_PRODUCTOS;

    private Producto() {
        this.idProducto = ++Producto.CONTADOR_PRODUCTOS;
    }

    public Producto(String nombre, double precio) {
        this();
        this.nombre = nombre;
        this.precio = precio;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return this.precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public static int getCONTADOR_PRODUCTOS() {
        return Producto.CONTADOR_PRODUCTOS;
    }

    public int getIdProducto() {
        return this.idProducto;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Producto{idProducto=").append(idProducto);
        sb.append(", nombre=").append(nombre);
        sb.append(", precio=").append(precio);
        sb.append('}');
        return sb.toString();
    }
}
