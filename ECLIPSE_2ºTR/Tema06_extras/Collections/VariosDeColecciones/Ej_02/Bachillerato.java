<<<<<<< HEAD
package Ej_02;

public class Bachillerato extends Alumnos {
	
	Bachiller bach;

	public Bachillerato(String nombre, String apellidos, Bachiller bach) {
		super(nombre, apellidos);
		this.bach = bach;
	}

	public Bachillerato(String nombre, String apellidos, Bachiller bach, int pev, int sev, int tev) {
		super(nombre, apellidos, pev, sev, tev);
		// TODO Auto-generated constructor stub
		this.bach = bach;
	}
	
	public boolean ciencias() {
		if(bach == Bachiller.CIENCIAS)
			return true;
		return false;
	}
	
	@Override
	public String toString() {
		String pevs, sevs, tevs;
		pevs= (pev<0) ? "-" : String.valueOf(pev);
		sevs= (sev<0) ? "-" : String.valueOf(sev);
		tevs= (tev<0) ? "-" : String.valueOf(tev);
		
		String alumno= String.format("%-15s%-20s%-35s%s%14s%14s", nombre, apellidos, bach.name(), pevs, sevs, tevs);
		
		return alumno;
	}
	
	

}
=======
package Ej_02;

public class Bachillerato extends Alumnos {
	
	Bachiller bach;

	public Bachillerato(String nombre, String apellidos, Bachiller bach) {
		super(nombre, apellidos);
		this.bach = bach;
	}

	public Bachillerato(String nombre, String apellidos, Bachiller bach, int pev, int sev, int tev) {
		super(nombre, apellidos, pev, sev, tev);
		// TODO Auto-generated constructor stub
		this.bach = bach;
	}
	
	public boolean ciencias() {
		if(bach == Bachiller.CIENCIAS)
			return true;
		return false;
	}
	
	@Override
	public String toString() {
		String pevs, sevs, tevs;
		pevs= (pev<0) ? "-" : String.valueOf(pev);
		sevs= (sev<0) ? "-" : String.valueOf(sev);
		tevs= (tev<0) ? "-" : String.valueOf(tev);
		
		String alumno= String.format("%-15s%-20s%-35s%s%14s%14s", nombre, apellidos, bach.name(), pevs, sevs, tevs);
		
		return alumno;
	}
	
	

}
>>>>>>> cd9c84d5df7ff962d8ba5fa320e6bfc7b852a830
