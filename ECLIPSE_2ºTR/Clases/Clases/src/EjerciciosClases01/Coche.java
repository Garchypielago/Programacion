<<<<<<< HEAD
package EjerciciosClases01;

public class Coche {
	private String color="rojo", marca, matricula; //mejor poner los default en el cosntructor vacio
	private int num_puertas;
	
	public Coche() {
		super();
		System.out.println("as");
	}
	
	public Coche(String color, String marca, String matricula, int num_puertas) {
		super();
		this.color = color;
		this.marca = marca;
		this.matricula = matricula;
		this.num_puertas = num_puertas;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public int getNum_puertas() {
		return num_puertas;
	}

	public void setNum_puertas(int num_puertas) {
		this.num_puertas = num_puertas;
	}

	@Override
	public String toString() {
		return "Coche [color=" + color + ", marca=" + marca + ", matricula=" + matricula + ", num_puertas="
				+ num_puertas + "]";
	}
	
	public void pintarCoche(String color) {
		this.color = color;
		System.out.println("Has pintado el coche con matricula " + matricula + " de color " + color + ".");
	}
	
}
=======
package EjerciciosClases01;

public class Coche {
	private String color="rojo", marca, matricula; //mejor poner los default en el cosntructor vacio
	private int num_puertas;
	
	public Coche() {
		super();
		System.out.println("as");
	}
	
	public Coche(String color, String marca, String matricula, int num_puertas) {
		super();
		this.color = color;
		this.marca = marca;
		this.matricula = matricula;
		this.num_puertas = num_puertas;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public int getNum_puertas() {
		return num_puertas;
	}

	public void setNum_puertas(int num_puertas) {
		this.num_puertas = num_puertas;
	}

	@Override
	public String toString() {
		return "Coche [color=" + color + ", marca=" + marca + ", matricula=" + matricula + ", num_puertas="
				+ num_puertas + "]";
	}
	
	public void pintarCoche(String color) {
		this.color = color;
		System.out.println("Has pintado el coche con matricula " + matricula + " de color " + color + ".");
	}
	
}
>>>>>>> cd9c84d5df7ff962d8ba5fa320e6bfc7b852a830
