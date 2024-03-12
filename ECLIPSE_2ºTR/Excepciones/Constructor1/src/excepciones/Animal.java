<<<<<<< HEAD
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
=======
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
>>>>>>> cd9c84d5df7ff962d8ba5fa320e6bfc7b852a830
