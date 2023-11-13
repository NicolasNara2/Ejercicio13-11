package ClaseTest2;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;

public class Cliente {
    private String nombre;
    private String apellido;
    private String email;
    private Integer edad;
    private List<Producto> productos = new ArrayList<>();

    public void consultarProductos(){
        for (Producto prod:
                productos) {
            System.out.println(prod);
        }
    }
    public String nombreCompleto(){
        System.out.println(getApellido() + ", " + getNombre());
        return (getApellido() + ", " + getNombre());
    }
    public Boolean mayoriaDeEdad() {
        if (this.getEdad() < 18 )
            return (false);
        else return (true);
    }
    public void agregarProductos(String codigo) throws CodigoException {
        if (productos.size() <=4) {
            Producto producto = (Producto)ProductoFactory.getInstance().crearProducto(codigo);
            productos.add(producto);
        } else {
            throw new RuntimeException("Supero el limite de cuatro productos en su carrito");
        }
    }

    public Cliente(String nombre, String apellido, String email, Integer edad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getEdad() {
        return edad;
    }

    public Executable setEdad(Integer edad) throws InputMismatchException {
        if(edad == null)
            throw new NullPointerException("Coloque un dato valido.");
        else if(edad < 0 ) {
            throw new InputMismatchException("Coloque una edad valida.");
        } else {
            this.edad = edad;
        }
        return null;
    }

    public List<Producto> getProductos() {
        return productos;
    }

    public void setProductos(List<Producto> productos) {
        this.productos = productos;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", email='" + email + '\'' +
                ", edad=" + edad +
                ", productos=" + productos +
                '}';
    }
}
