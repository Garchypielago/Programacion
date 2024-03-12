<<<<<<< HEAD
package practicaTreeset;

import java.util.Comparator;
import java.util.Objects;

public class Ej_02_Jugador implements Comparable<Ej_02_Jugador>{ //comparable si quiero que el objeto se ordene el solo
	private String nombre;
	private int estatura;
	
	public Ej_02_Jugador(String nombre, int estatura) {
		super();
		this.nombre=nombre;
		this.estatura=estatura;
	}

	public String getNombre() {
		return nombre;
	}

	public int getEstatura() {
		return estatura;
	}

	@Override
	public int compareTo(Ej_02_Jugador o) {
		// TODO Auto-generated method stub
		return this.nombre.compareToIgnoreCase(o.nombre);
	}

	@Override
	public String toString() {
		return "* " + nombre + ", estatura=" + estatura + "cm *";
	}
	
	
	
	
	

	
}
=======
package practicaTreeset;

import java.util.Comparator;
import java.util.Objects;

public class Ej_02_Jugador implements Comparable<Ej_02_Jugador>{ //comparable si quiero que el objeto se ordene el solo
	private String nombre;
	private int estatura;
	
	public Ej_02_Jugador(String nombre, int estatura) {
		super();
		this.nombre=nombre;
		this.estatura=estatura;
	}

	public String getNombre() {
		return nombre;
	}

	public int getEstatura() {
		return estatura;
	}

	@Override
	public int compareTo(Ej_02_Jugador o) {
		// TODO Auto-generated method stub
		return this.nombre.compareToIgnoreCase(o.nombre);
	}

	@Override
	public String toString() {
		return "* " + nombre + ", estatura=" + estatura + "cm *";
	}
	
	
	
	
	

	
}
>>>>>>> cd9c84d5df7ff962d8ba5fa320e6bfc7b852a830
