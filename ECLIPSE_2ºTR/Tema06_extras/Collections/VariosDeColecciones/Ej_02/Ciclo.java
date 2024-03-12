<<<<<<< HEAD
package Ej_02;

public class Ciclo extends Alumnos {

	String familiaCiclo, ciclo;

	public Ciclo(String nombre, String apellidos, String familiaCiclo, String ciclo) {
		super(nombre, apellidos);
		this.familiaCiclo = familiaCiclo;
		this.ciclo = ciclo;
	}

	public Ciclo(String nombre, String apellidos, String familiaCiclo, String ciclo, int pev, int sev, int tev) {
		super(nombre, apellidos, pev, sev, tev);
		// TODO Auto-generated constructor stub
		this.familiaCiclo = familiaCiclo;
		this.ciclo = ciclo;
	}

	public boolean aprobado() {
		if (pev < 0 || sev < 0 || tev < 0)
			return false;
		else if ((pev + sev + tev) / 3 >= 5)
			return true;
		return false;
	}

	@Override
	public String toString() {
		String pevs, sevs, tevs;
		pevs= (pev<0) ? "-" : String.valueOf(pev);
		sevs= (sev<0) ? "-" : String.valueOf(sev);
		tevs= (tev<0) ? "-" : String.valueOf(tev);
		
		String alumno= String.format("%-15s%-20s%-35s%s%14s%14s", nombre, apellidos, familiaCiclo +": "+ ciclo, pevs, sevs, tevs);
		
		return alumno;
	}
	
	

}
=======
package Ej_02;

public class Ciclo extends Alumnos {

	String familiaCiclo, ciclo;

	public Ciclo(String nombre, String apellidos, String familiaCiclo, String ciclo) {
		super(nombre, apellidos);
		this.familiaCiclo = familiaCiclo;
		this.ciclo = ciclo;
	}

	public Ciclo(String nombre, String apellidos, String familiaCiclo, String ciclo, int pev, int sev, int tev) {
		super(nombre, apellidos, pev, sev, tev);
		// TODO Auto-generated constructor stub
		this.familiaCiclo = familiaCiclo;
		this.ciclo = ciclo;
	}

	public boolean aprobado() {
		if (pev < 0 || sev < 0 || tev < 0)
			return false;
		else if ((pev + sev + tev) / 3 >= 5)
			return true;
		return false;
	}

	@Override
	public String toString() {
		String pevs, sevs, tevs;
		pevs= (pev<0) ? "-" : String.valueOf(pev);
		sevs= (sev<0) ? "-" : String.valueOf(sev);
		tevs= (tev<0) ? "-" : String.valueOf(tev);
		
		String alumno= String.format("%-15s%-20s%-35s%s%14s%14s", nombre, apellidos, familiaCiclo +": "+ ciclo, pevs, sevs, tevs);
		
		return alumno;
	}
	
	

}
>>>>>>> cd9c84d5df7ff962d8ba5fa320e6bfc7b852a830
