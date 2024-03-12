package Ej_02;

public abstract class Alumnos {

	String nombre, apellidos;
	int pev, sev, tev;
	public Alumnos(String nombre, String apellidos) {
		super();
		this.nombre = nombre;
		this.apellidos = apellidos;
		pev=-1;
		sev=-1;
		tev=-1;
	}
	
	public Alumnos(String nombre, String apellidos, int pev, int sev, int tev) {
		super();
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.pev = pev;
		this.sev = sev;
		this.tev = tev;
	}

	public int getPev() {
		return pev;
	}

	public void setPev(int pev) {
		this.pev = pev;
	}

	public int getSev() {
		return sev;
	}

	public void setSev(int sev) {
		this.sev = sev;
	}

	public int getTev() {
		return tev;
	}

	public void setTev(int tev) {
		this.tev = tev;
	}

	public String getNombre() {
		return nombre;
	}

	public String getApellidos() {
		return apellidos;
	}
	
	
	
	
	
}
