package abstractas;

public class TestAbstract {
    public static void main (String[] args) {
    	
        Pelicula pelicula = new Pelicula("Pelicula 1", 2);
        
        Libro libro = new Libro("Libro 1", 20);
        
        System.out.println(pelicula.esAlquilable() ? "Es alquilable": "No es alquilable");
        System.out.println(pelicula.getPrecio());
        
        System.out.println(libro.esAlquilable() ? "Es alquilable": "No es alquilable");
        System.out.println(libro.getPrecio());
        
        System.out.println(libro);
        System.out.println(pelicula);
    }
}