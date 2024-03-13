package excepciones;

public class Main {

	public static void main(String[] args) {
		Animal a = null;

		a = new Animal("algo");

		if (a != null)
			System.out.println("Se ha creado");
		else
			System.out.println("No se ha creado");
	}

}
