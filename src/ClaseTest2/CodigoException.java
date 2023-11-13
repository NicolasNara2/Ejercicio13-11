package ClaseTest2;

public class CodigoException extends Exception {
    public CodigoException(String s) {
        System.out.println("Error. Ingrese un codigo valido.");
    }
}
