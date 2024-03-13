package persona2;
/**
  * Ejemplo de herencias y clases abstractas
  */
public class Mujer extends Persona
{	 
	private int edad=39;
	private static String genero="femenino";
	/* 
	   No hace falta definir el metodo clase(), porque ya esta
	   definido en la clase padre. Lo tendriamos que definir si
	   queremos devolver algo distinto a lo que devuelve alli
	*/
	
	//@Override
		public String obtGenero() {
			return genero;
		}
		
		//@Override
		public void setGenero(String _genero){
			genero = _genero;
		}
		
		//@Override
		public int obtEdad() {
			return edad;
		}
		
		//@Override
		public void setEdad (int edad){
			this.edad = edad;
		}	
		
}
