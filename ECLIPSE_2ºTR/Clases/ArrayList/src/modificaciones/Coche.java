package modificaciones;

public class Coche {
	private String color, marca, matricula;
	private int numPuertas;

	public Coche() {
	}

	public Coche(String color, String marca, String matricula, int numPuertas) {
		this.color = color;
		this.marca = marca;
		this.matricula = matricula;
		this.numPuertas = numPuertas;
	}
	
	public Coche(String marca) {
		this.marca = marca;
	}


	public String devMarca() {
		return marca;
	}

	public void ponMarca(String marca) {
		this.marca = marca;
	}

	// Hago que dos objetos sean iguales si su marca es igual
//	public boolean equals(Object obj) {
//		if (this.marca.equals(((Coche) obj).marca))
//			return true;
//		else
//			return false;
//	}

	public String toString() {
		return "El color del coche es " + color + ", la marca es " + marca + ", la matricula es " + matricula + " y "
				+ numPuertas + " puertas";
	}
}