package pruebas;

// La clase Patin no tiene ninguna relacion de herencia con NaveAerea

public class Patin implements Conducible {
	
	// los dos siguientes métodos es obligatorio implementarlos:
	public void girarDerecha(int grados) {
		System.out.println("Patin gira " + grados + " grados a la derecha");
	}

	public void girarIzquierda(int grados) {
		System.out.println("Patin gira " + grados + " grados a la izquierda");
	}
}
