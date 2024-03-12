package persona2;
/**
  * Ejemplo de herencias y clases abstractas
  */
public abstract class Persona
{	  
	private int edad;
	private String genero;
	private static String clase = "mamiferos";
	
	/**
	  * Devuelve la clase a la que pertenecen las personas
	  */
	public String obtClase() 
	{ 
		return clase; 
	} 

	/**
	  * Devuelve el genero de la persona
	  */
	
	public abstract String obtGenero();
	/**
	  * Pone el genero de la persona
	  */
	
	public abstract void setGenero(String genero);

	/**
	  * Devuelve la edad de la persona
	  */
	
	public abstract int obtEdad();
	/**
	  * Pone la edad de la persona
	  */
	
	public abstract void setEdad(int edad);
}
