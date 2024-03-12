<<<<<<< HEAD
package practicaLinkedlist;

public class Persona implements Comparable<Persona>{
	private String nombre;
	private int edad;
	public Persona(String nombre, int edad) {
		super();
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
	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", edad=" + edad + "]";
	}
	
	public boolean equals(Object p) {
		if (nombre.equals(((Persona)p).nombre) && edad==((Persona)p).edad)
			return true;
		else
			return false;
	}
	@Override
	public int compareTo(Persona o) {
		// TODO Auto-generated method stub
		if(this.nombre.compareTo(o.nombre)>0) {
			return 1;
		}
		if(this.nombre.compareTo(o.nombre)<0) {
			return -1;
		}
		if(this.edad>o.edad) {
			return 1;
		}
		if(this.edad<o.edad) {
			return -1;
		}
		return 0;
	}

}
=======
package practicaLinkedlist;

public class Persona implements Comparable<Persona>{
	private String nombre;
	private int edad;
	public Persona(String nombre, int edad) {
		super();
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
	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", edad=" + edad + "]";
	}
	
	public boolean equals(Object p) {
		if (nombre.equals(((Persona)p).nombre) && edad==((Persona)p).edad)
			return true;
		else
			return false;
	}
	@Override
	public int compareTo(Persona o) {
		// TODO Auto-generated method stub
		if(this.nombre.compareTo(o.nombre)>0) {
			return 1;
		}
		if(this.nombre.compareTo(o.nombre)<0) {
			return -1;
		}
		if(this.edad>o.edad) {
			return 1;
		}
		if(this.edad<o.edad) {
			return -1;
		}
		return 0;
	}

}
>>>>>>> cd9c84d5df7ff962d8ba5fa320e6bfc7b852a830
