package sesion04.interfaces;

// ((Libro) libro).set....

public class Cliente {

    public static void main(String[] args) {
        Producto libro = new Libro();
        libro.setPrecio(10.99);
        libro.setNombre("Mi Planta de Naranja Lima");
        libro.setColor("Verde");

        ((Libro) libro).setAutor("Jorge Ramirez");
        ((Libro) libro).setPaginas(345);
        ((Libro) libro).setIsbn("2332332323231131");

        System.out.println(libro.toString());
    }
}
