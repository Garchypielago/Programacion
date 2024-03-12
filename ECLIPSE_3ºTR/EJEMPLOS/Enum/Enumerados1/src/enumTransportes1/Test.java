<<<<<<< HEAD
package enumTransportes1;

public class Test {
	
	public static void main(String[] args) {
		Transporte tp = Transporte.AVION;

		// Uso de enum para controlar una sentencia switch

		// Se utiliza CAMION, no Transporte.CAMION. Esto se debe a que el tipo de
		// enumeracion en la expresion de switch ya ha especificado implicitamente el
		// tipo de enumeracion de las constantes de case.
		switch (tp) {
			// case Transporte.COCHE: da error
			case COCHE:
				System.out.println("Es un coche");
			case CAMION:
				System.out.println("Es un camion");
			case TREN:
				System.out.println("Es un tren");
			case BARCO:
				System.out.println("Es un barco");
			case AVION:
				System.out.println("Es un avion");
			}

	}
=======
package enumTransportes1;

public class Test {
	
	public static void main(String[] args) {
		Transporte tp = Transporte.AVION;

		// Uso de enum para controlar una sentencia switch

		// Se utiliza CAMION, no Transporte.CAMION. Esto se debe a que el tipo de
		// enumeracion en la expresion de switch ya ha especificado implicitamente el
		// tipo de enumeracion de las constantes de case.
		switch (tp) {
			// case Transporte.COCHE: da error
			case COCHE:
				System.out.println("Es un coche");
			case CAMION:
				System.out.println("Es un camion");
			case TREN:
				System.out.println("Es un tren");
			case BARCO:
				System.out.println("Es un barco");
			case AVION:
				System.out.println("Es un avion");
			}

	}
>>>>>>> cd9c84d5df7ff962d8ba5fa320e6bfc7b852a830
}