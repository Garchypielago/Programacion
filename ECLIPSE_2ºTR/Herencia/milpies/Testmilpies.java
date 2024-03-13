package milpies;

public class Testmilpies {
	public static void main(String[] args) {
		// El constructor de MilpiesEsquiador ejecuta el constructor padre antes que su propio
		// constructor, pero llama a su metodo propio escribePies
		MilpiesEsquiador mE = new MilpiesEsquiador();

		// Milpies m = new Milpies();
		// Al ser un objeto Milpies, ahora se ejecuta su propio metodo MilpiesEsquiador
	}
}
