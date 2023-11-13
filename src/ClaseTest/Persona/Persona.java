package ClaseTest.Persona;

import org.junit.jupiter.api.function.Executable;

import java.util.InputMismatchException;

public class Persona {

    private String nombre;
    private String apellido;
    private String email;
    private Integer edad;


    public String mostrarNombre() {
        return (apellido + ", " + nombre);
    };

    public Boolean mayoriaDeEdad() {
        if (this.getEdad() < 18 )
        return (false);
        else return (true);
}

    @Override
    public String toString() {
        return "ClaseTest.Persona.Persona{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", email='" + email + '\'' +
                ", edad=" + edad +
                '}';
    }

    public Persona(String nombre, String apellido, String email, Integer edad) {
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
}
