<<<<<<< HEAD
package ej02;

public class Futbolista {
	private int dorsal;
	private String Nombre;
	private Demarcacion demarcacion;
	private Equipo equipo;

	public Futbolista() {
	}

	public Futbolista(String nombre, int dorsal, Demarcacion demarcacion, Equipo equipo) {
		this.dorsal = dorsal;
		Nombre = nombre;
		this.demarcacion = demarcacion;
		this.equipo = equipo;
	}

	public int getDorsal() {
		return dorsal;
	}

	public void setDorsal(int dorsal) {
		this.dorsal = dorsal;
	}

	public String getNombre() {
		return Nombre;
	}

	public void setNombre(String nombre) {
		Nombre = nombre;
	}

	public Demarcacion getDemarcacion() {
		return demarcacion;
	}

	public void setDemarcacion(Demarcacion demarcacion) {
		this.demarcacion = demarcacion;
	}

	public Equipo getEquipo() {
		return equipo;
	}

	public void setEquipo(Equipo equipo) {
		this.equipo = equipo;
	}

	// Metodos getter y setter
	@Override
	public String toString() {
		return this.dorsal + " - " + this.Nombre + " - " + this.demarcacion.name() + " - "
				+ this.equipo.getNombreClub();
	}
}
=======
package ej02;

public class Futbolista {
	private int dorsal;
	private String Nombre;
	private Demarcacion demarcacion;
	private Equipo equipo;

	public Futbolista() {
	}

	public Futbolista(String nombre, int dorsal, Demarcacion demarcacion, Equipo equipo) {
		this.dorsal = dorsal;
		Nombre = nombre;
		this.demarcacion = demarcacion;
		this.equipo = equipo;
	}

	public int getDorsal() {
		return dorsal;
	}

	public void setDorsal(int dorsal) {
		this.dorsal = dorsal;
	}

	public String getNombre() {
		return Nombre;
	}

	public void setNombre(String nombre) {
		Nombre = nombre;
	}

	public Demarcacion getDemarcacion() {
		return demarcacion;
	}

	public void setDemarcacion(Demarcacion demarcacion) {
		this.demarcacion = demarcacion;
	}

	public Equipo getEquipo() {
		return equipo;
	}

	public void setEquipo(Equipo equipo) {
		this.equipo = equipo;
	}

	// Metodos getter y setter
	@Override
	public String toString() {
		return this.dorsal + " - " + this.Nombre + " - " + this.demarcacion.name() + " - "
				+ this.equipo.getNombreClub();
	}
}
>>>>>>> cd9c84d5df7ff962d8ba5fa320e6bfc7b852a830
