package libros;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class PruebasStreams {
	private static Biblioteca biblioteca;

	public static void main(String[] args) {
		biblioteca = new Biblioteca();

		System.out.println("\n**********************collect********************\n");
		collect();
		System.out.println("\n**********************peek********************\n");
		peek();
		System.out.println("\n**********************map********************\n");
		map();
		System.out.println("\n**********************forEach********************\n");
		forEach();
		System.out.println("\n**********************mapAndPeek********************\n");
		mapAndPeek();
		System.out.println("\n**********************findFirst********************\n");
		findFirst();
		System.out.println("\n**********************filter********************\n");
		filter();
		System.out.println("\n**********************max********************\n");
		max() ;
		System.out.println("\n**********************min********************\n");
		min();	
		System.out.println("\n**********************findFirst********************\n");
		toArray() ;
		System.out.println("\n**********************sorted********************\n");
		sorted();
	
	}

	public static void collect() {

//		collect aqui, pasa de un stream de numeros a una coleccion de tipo lista
//		Stream.of devuelve un Stream

		List<Integer> listCollected = Stream.of(0, 1, 2, 3, 4, 5).collect(Collectors.toList());
		System.out.println("listCollected " + listCollected);

//		collect aqui, pasa de una serie de cadenas a una coleccion de tipo set
		Set<String> setCollected = Stream.of("0", "0", "1", "1", "2", "2", "3", "3", "4", "4", "5", "5")
				.collect(Collectors.toSet());
		System.out.println("setCollected " + setCollected);

	}

	public static void peek() {
		// A diferencia de 'map()', con 'peek()' hace algo con el objeto pero devuelve
		// el mismo objeto, no otro tipo de dato.
		// Con 'peek()' se realizan operaciones sobre un objeto y se devuelve ese mismo
		// objeto. Con 'map()' se recibe un objeto y se devuelve uno de otro tipo o del
		// mismo.
// No es buena practica modificar con peek ????

//		Stream<Libro> java.util.Collection.stream(), devuelve un stream con los elementos de la coleccion

		List<Libro> libros = biblioteca.getLibros().stream().peek(libro -> libro.setAutor("miTitulo"))
				.peek(libro -> System.out.println(libro)).collect(Collectors.toList());

		System.out.println("\n" + libros);

	}

	public static void map() {
		List<String> libros = biblioteca.getLibros().stream().map(libro -> libro.getTitulo())
				.peek(title -> System.out.println(title)).collect(Collectors.toList());

		System.out.println("\n" + libros);
	}

	public static void forEach() {
		biblioteca.getLibros().stream().forEach(libro -> {
			double nuevoPrecio = libro.getPrecio();
			nuevoPrecio *= 2;
			libro.setPrecio(nuevoPrecio);
			System.out.println(libro);
		});
	}

	
	public static void mapAndPeek() {
		List<String> titulos = biblioteca.getLibros().stream().map(libro -> libro.getTitulo())
				.peek(title -> System.out.println(title)).collect(Collectors.toList());

		System.out.println(titulos);
	}

	
	public static void filter() {
		List<Libro> libros = biblioteca.getLibros().stream().filter(libro -> libro.getPrecio() >= 15)
				.peek(book -> System.out.println(book)).collect(Collectors.toList());

		System.out.println(libros);
	}

	public static void findFirst() {
		Libro libroPrimero = biblioteca.getLibros().stream().filter(book -> book.getPrecio() >= 15)
				.peek(System.out::println).findFirst().orElse(null);

		// Nota.- Hay 2 libros que cumplen la condición del 'filter()' pero como se
		// utiliza evaluación 'lazyEvaluation' al existir el 'findFirst()'
		// ya no se realiza la siguiente iteración sobre el stream. Se observa que pasa
		// esto porque en el 'peek()' solo se visualiza el primer
		// elemento que cumple la condición y que justamente es el resultado de la
		// consulta.
	}

	public static void toArray() {
		// Como se hacía antes de los Streams (2 formas distintas):
		Libro[] librosArray = biblioteca.getLibros().toArray(Libro[]::new);
		librosArray = biblioteca.getLibros().toArray(new Libro[biblioteca.getLibros().size()]);

		// Como se hace con Streams (sirve para cualquier tipo de 'Collection', no solo
		// para listas):
		librosArray = biblioteca.getLibros().stream().toArray(Libro[]::new);

		// Convertimos el array en un stream para visualizar su contenido más fácilmente
		// sin tener que utilizar el 'for(Book book: booksArray)' de toda la vida:
		Stream.of(librosArray).peek(System.out::println).collect(Collectors.toList());

	}

	public static void sorted() {
		List<Libro> libros = biblioteca.getLibros().stream()
				.sorted((book1, book2) -> book1.getAutor().compareToIgnoreCase(book2.getAutor()))
				.peek(System.out::println).collect(Collectors.toList());

		System.out.println(libros);
	}

	public static void min() {
		Libro libro = biblioteca.getLibros().stream()
				.min((book1, book2) -> book1.getPrecio().compareTo(book2.getPrecio())).orElse(null);

		System.out.println(libro);

	}


	public static void max() {
		Libro libro = biblioteca.getLibros().stream().max((book1, book2) -> {
			return (book1.getPrecio().compareTo(book2.getPrecio()));
		}).orElse(null);

		System.out.println(libro);

	}



}
