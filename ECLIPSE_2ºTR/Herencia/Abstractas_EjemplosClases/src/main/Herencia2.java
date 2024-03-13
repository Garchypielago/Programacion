package main;
import persona2.Anciana;
import persona2.Anciano;
import persona2.Hombre;
import persona2.Mujer;
import persona2.Persona;

/**
  * Ejemplo de herencias y clases abstractas
  */
public class Herencia2
{	 
	/**
	  * Main
	  */
	public static void main(String args[])
	{
		Hombre  h = new Hombre();
		Anciano a = new Anciano();
		// La clase persona no se puede instanciar, ya que es abstracta.
		// solo hacemos un casting de anciano a persona
		Persona p = (Persona)a;
		
		System.out.println ("Edad del anciano: " + a.obtEdad());
		System.out.println ("Edad del hombre: " + h.obtEdad());	
		System.out.println ("Edad de la persona (anciano): " + p.obtEdad());
		System.out.println ();
			
		System.out.println ("Genero del anciano: " + a.obtGenero());
		System.out.println ("Genero del hombre: " + h.obtGenero());
		System.out.println ("Genero de la persona (anciano): " + p.obtGenero());

		System.out.println ();
		System.out.println ("Clase del anciano: " + a.obtClase());
		System.out.println ("Clase del hombre: " + h.obtClase());		
		System.out.println ("Clase de la persona (anciano): " + p.obtClase());
		
		Mujer  m = new Mujer();
		Anciana an = new Anciana();
		// La clase persona no se puede instanciar, ya que es abstracta.
		// solo hacemos un casting de anciana a persona
		Persona p1 = (Persona)an;
		
		System.out.println ("Edad de la anciana: " + an.obtEdad());
		System.out.println ("Edad de la mujer: " + m.obtEdad());	
		System.out.println ("Edad de la persona (anciana): " + p1.obtEdad());
		System.out.println ();
			
		System.out.println ("Genero de la anciana: " + an.obtGenero());
		System.out.println ("Genero de la mujer: " + m.obtGenero());
		System.out.println ("Genero de la persona (anciana): " + p1.obtGenero());

		System.out.println ();
		System.out.println ("Clase de la anciana: " + an.obtClase());
		System.out.println ("Clase de la mujer: " + m.obtClase());		
		System.out.println ("Clase de la persona (anciana): " + p1.obtClase());
	}
}

