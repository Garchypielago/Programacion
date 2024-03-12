<<<<<<< HEAD
package centro2;

import java.util.*;
import alumnos2.Alumno;
import excepciones2.*;

public class Academia {
	
	private ArrayList<Asig> opciones;
	private ArrayList<Alumno> estudiantes;
	private boolean asig;
	private static int nalum, nasig;

	public Academia() {
		super();
		opciones= new ArrayList<Asig>();
		estudiantes= new ArrayList<Alumno>();
		asig=false;
		nalum=0;
		nasig=0;
	}
	
	public void agregarAsignaturas(String nombre, double precio) throws AsignaturasIniciadasException {
		if (!asig) {
			Asig.values()[nasig].setNombre(nombre);
			Asig.values()[nasig].setPrecio(precio);
			nasig++;
			if(nasig==4) {
				asig=true;
			}
		} else {
			throw new AsignaturasIniciadasException("Las asignaturas ya han sido establecidas");
		}
	}
	
	public void agregarAlumno(String nombre, String DNI, int curso, char grupo) {
		
	}

	public boolean isAsig() {
		return asig;
	}

	public static int getNalum() {
		return nalum;
	}

	public static int getNasig() {
		return nasig;
	}
	
	
	
	

	
}
=======
package centro2;

import java.util.*;
import alumnos2.Alumno;
import excepciones2.*;

public class Academia {
	
	private ArrayList<Asig> opciones;
	private ArrayList<Alumno> estudiantes;
	private boolean asig;
	private static int nalum, nasig;

	public Academia() {
		super();
		opciones= new ArrayList<Asig>();
		estudiantes= new ArrayList<Alumno>();
		asig=false;
		nalum=0;
		nasig=0;
	}
	
	public void agregarAsignaturas(String nombre, double precio) throws AsignaturasIniciadasException {
		if (!asig) {
			Asig.values()[nasig].setNombre(nombre);
			Asig.values()[nasig].setPrecio(precio);
			nasig++;
			if(nasig==4) {
				asig=true;
			}
		} else {
			throw new AsignaturasIniciadasException("Las asignaturas ya han sido establecidas");
		}
	}
	
	public void agregarAlumno(String nombre, String DNI, int curso, char grupo) {
		
	}

	public boolean isAsig() {
		return asig;
	}

	public static int getNalum() {
		return nalum;
	}

	public static int getNasig() {
		return nasig;
	}
	
	
	
	

	
}
>>>>>>> cd9c84d5df7ff962d8ba5fa320e6bfc7b852a830
