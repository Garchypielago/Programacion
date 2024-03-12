package milpies;

public class Milpies {
	protected int numeroDePies;
	
	public Milpies(){
		numeroDePies = 1000;
		escribePies(); // Observa que se llama desde este constructor a su propio "escribePies()"
		// si hemos llamado con un objeto MilpiesEsquiador, se ejecutara el metodo escribePies de la clase
		// MilpiesEsquiador
		// si se llama desde un Milpies, se ejecuta el suyo, el de abajo:
	}
	
	public void escribePies(){
		System.out.println("Un Milpies o Cochinilla tiene " + numeroDePies + " pies");
	}
}