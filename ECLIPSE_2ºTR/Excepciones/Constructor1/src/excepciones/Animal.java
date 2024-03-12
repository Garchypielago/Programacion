package excepciones;

public class Animal {
	private String nombre;

	public Animal(String nombre) {
		try {
			if (nombre.compareTo("algo") == 0)
				throw new Exception("No me gustan los algo");

			this.nombre = nombre;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public Animal(){
		this.nombre = "unNombre";
	}

}
