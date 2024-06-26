package ordenArrayPersonas;

public class Persona implements Comparable<Persona> {

	private String nombre;
	private int edad, altura;

	public Persona(String nombre, int edad, int altura) {
		this.nombre = nombre;
		this.edad = edad;
		this.altura = altura;
	}

	public String getNombre() {
		return nombre;
	}

	public int getEdad() {
		return edad;
	}

	public int getAltura() {
		return altura;
	}

	// Orden ascendente
	@Override
	public int compareTo(Persona o) {

		if (altura > o.altura)
			return 1;
		else if (altura < o.altura) {
			return -1;
		}
		else
			return 0;
	}
	
	@Override
	public String toString() {
		return this.getNombre() + "  -  " + this.getEdad() + "  -  " + this.getAltura();
	}
}