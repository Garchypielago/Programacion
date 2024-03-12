package excepciones;

public class Animal {
	private String nombre;

	public Animal(String nombre) throws Exception {		
		// Si no trato la excepcion dentro, no se crea el objeto
		if (nombre.compareTo("algo") == 0) throw  new Exception("No me gustan los algo");
		
		this.nombre = nombre;
	}
	
	public Animal() throws Exception {
				
		this.nombre = "unNombre";
	}

}
