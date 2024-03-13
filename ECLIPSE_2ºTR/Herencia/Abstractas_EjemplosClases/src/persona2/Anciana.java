package persona2;
/**
  * Ejemplo de herencias y clases abstractas
  */
public class Anciana extends Mujer
{	 
	/* 
	   No hace falta definir ningun metodo, s�lo aquellos en los 
	   que queramos devolver cosas distintas. En este caso, la edad
	*/
	private int edad=74;
	/* 
	   No hace falta definir el metodo ObtClase(), porque ya esta
	   definido en la clase padre. Lo tendr�amos que definir si
	   queremos devolver algo distinto a lo que devuelve all�
	*/
	/* 
	   No hace falta definir el metodo ObtGenero(), porque ya esta
	   definido en la clase padre. Lo tendr�amos que definir si
	   queremos devolver algo distinto a lo que devuelve all�
	*/

	/**
	  * Devuelve la edad de la persona (este metodo si hay que definirlo
	  * porque es abstracto en la clase padre)
	  */
	public int obtEdad()
	{
		return edad;
	}
}