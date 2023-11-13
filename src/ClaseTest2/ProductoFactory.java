package ClaseTest2;

public class ProductoFactory {
    private static ProductoFactory instance;
    private ProductoFactory() {
    }
    public static ProductoFactory getInstance(){
        if (instance==null) instance= new ProductoFactory();
        return instance;
    }
    public Producto crearProducto(String codigo) throws CodigoException {
        Producto producto = null;
        if (codigo == "01") {
            producto = new ProductoCosmetologia();}
           else if(codigo == "02"){
               producto= new ProductoComestible();
        } else {
               throw new CodigoException("Supero el límite de articulos guardados.");
    }
           return producto;
}

}