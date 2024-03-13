package enumColores2;

enum Color {
	ROJO, VERDE, AZUL;
}

public class Test {
	
//  Tambien podemos declararlo dentro de la clase:
//	enum Color {
//		ROJO, VERDE, AZUL;
//	}
	
	public static void main(String[] args) {
		// Llamando a values()
		Color arr[] = Color.values();

		// enum con bucle for each
		for (Color col : arr) {
			// Llamando a ordinal() para encontrar el indice
			// de color.
			System.out.println(col + " en el indice " + col.ordinal());
		}

		// Usando valueOf(). Devuelve un objeto de
		// Color con la constante dada.
		// La segunda linea comentada causa la excepcion
		// IllegalArgumentException (Implementa el tratamiento de la excepcion para practicar)
		System.out.println(Color.valueOf("ROJO")); 
		// El system.out.println obliga la conversion a String
		//System.out.println(Color.valueOf("BLANCO"));
	}
}
