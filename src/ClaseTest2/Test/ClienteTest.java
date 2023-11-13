package ClaseTest2.Test;

import ClaseTest2.Cliente;
import org.junit.jupiter.api.*;

import java.time.LocalDate;
import java.util.InputMismatchException;

import static org.junit.jupiter.api.Assertions.*;

class ClienteTest {
 static Cliente clientePrueba= new Cliente("Juan", "Perez", "JuanPerez@gmail.com", 17);

 @BeforeAll
    static void fechaDeHoy(){
  LocalDate date = LocalDate.now()  ;
  System.out.println( "esto ocurre antes " + date); }

    @Tag("ProbarAtributosClasePersona")
   @Test
    void setUp() {
    }
    @Tag("ProbarAtributosClasePersona")
  @Test
    void mostrarNombre() {
  assertEquals(clientePrueba.mostrarNombre(),"Perez, Juan");
   System.out.println(clientePrueba.mostrarNombre(););
    }
        @Tag("ProbarAtributosClasePersona")
    @Test
    void mayoriaDeEdad() {
  //assertTrue(clientePrueba.mayoriaDeEdad(),"Verificar si es mayor de edad.");
  assertFalse(clientePrueba.mayoriaDeEdad(),"Verificar si es menor de edad.");
    }
    @Tag("ProbarAtributosClasePersona")
  @Test
    @Disabled
    void setEdadNulo() {
     assertThrows(InputMismatchException.class,()->clientePrueba.setEdad(-1));
    }
        @Tag("ProbarAtributosClasePersona")
    @AfterAll
    static void finalDeTodo(){
        System.out.println("hola, fin de los test");
    }
}