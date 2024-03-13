package Estaticos01;

public class SerHumano {
	private String nombre;
	private String colorOjos;
	private int edad;

	/*
	 * Declaracion e inicializacion de una variable de instancia estatica Tiene
	 * sentido declararla estatica pues todos los objetos de la clase, teniendo en
	 * cuenta que esta modela a un ser humano, habitan en el mismo planeta
	 */
	private static String planeta = "Tierra";

	public void mostrarCaracteristicas() {
		System.out.println(nombre + " tiene " + edad + " anios.");
		System.out.println("Sus ojos son " + colorOjos);
		System.out.println("Su planeta es " + planeta);
	}

	public void esMayorEdad() {
		if (edad >= 18)
			System.out.println(nombre + " es mayor de edad.");
		else
			System.out.println(nombre + " es menor de edad");
		
		System.out.println("Tiene " + edad + " anios");
	}

	public static void main(String args[]) {
		SerHumano sh1 = new SerHumano();
		sh1.nombre = "Jesus";
		sh1.colorOjos = "azules";
		sh1.edad = 28;
		sh1.mostrarCaracteristicas();
		sh1.esMayorEdad();

		System.out.println("---------------------");

		SerHumano.planeta = "Marte";
		SerHumano sh2 = new SerHumano();
		sh2.nombre = "Rebeca";
		sh2.colorOjos = "verdes";
		sh2.edad = 27;
		sh2.mostrarCaracteristicas();
		sh2.esMayorEdad();

		sh1.mostrarCaracteristicas();

		System.out.println("---------------------");
		System.out.println("FIN DEL PROGRAMA");
	}
}
