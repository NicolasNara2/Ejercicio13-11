package ClaseTest2;

public abstract class Producto {
    private String id;
    private String nombre;
    private Double precio;
    private String descripcion;

    @Override
    public String toString() {
        return "Producto{" +
                "id='" + id + '\'' +
                ", nombre='" + nombre + '\'' +
                ", precio=" + precio +
                ", descripcion='" + descripcion + '\'' +
                '}';
    }
}
