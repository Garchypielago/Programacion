package orden4PersonasBien;

public class Persona implements Comparable<Persona>{
		private String nombre;
		private int edad;

		public Persona() {
		}

		public Persona(String nombre, int edad) {
			this.nombre = nombre;
			this.edad = edad;
		}

		public String getNombre() {
			return nombre;
		}

		public void setNombre(String nombre) {
			this.nombre = nombre;
		}

		public int getEdad() {
			return edad;
		}

		public void setEdad(int edad) {
			this.edad = edad;
		}
		
		// Para poder sobeescribir compareTo hay que implementar Comparable en esta clase
		@Override
	    public int compareTo(Persona o) {
			//public class Persona implements Comparable<Persona>{
			// Al ser interfaz generica, nos permite especificar que comparamos personas
			// y es valido sobreescribir asi
			
	        return this.nombre.compareTo(o.nombre);
	       
	        // Devuelve lo que devolveria si estuvieramos comparando por el nombre, elemento a elemento
	        // del arrayList en el caso de implementar nosotros el algoritmo de ordenacion con alguno 
	        // de los metodos vistos
	    }
		
		@Override
		public String toString() {
			return this.getNombre() + "  -  " + this.getEdad();
		}

}

