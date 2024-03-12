package enumTransportes2;

//Una enumeracion de transporte
enum Transporte {
	COCHE, CAMION, AVION, TREN, BARCO;
}

public class Enumerados {
	public static void main(String[] args) {
		Transporte tp;

		tp = Transporte.AVION;

		System.out.println("Valor de tp: " + tp);
		System.out.println();

		tp = Transporte.TREN;

		// Comparacion de 2 valores enum, se puede hacer de las dos formas:
		if (tp == Transporte.TREN)
			System.out.println("tp tiene el valor de TREN\n");

		if (tp.equals(Transporte.TREN))
			System.out.println("tp tiene el valor de TREN\n");

		// enum para controlar sentencia switch
		switch (tp) {
		case COCHE:
			System.out.println("Un auto lleva personas.");
			break;
		case CAMION:
			System.out.println("Un camion lleva carga.");
			break;
		case AVION:
			System.out.println("Un avion vuela.");
			break;
		case TREN:
			System.out.println("Un tren corre sobre railes.");
			break;
		case BARCO:
			System.out.println("Un barco navega en el agua.");
			break;
		}
	}
}
