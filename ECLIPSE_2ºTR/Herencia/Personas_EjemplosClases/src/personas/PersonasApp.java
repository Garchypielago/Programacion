package personas;

import java.util.*;

public class PersonasApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		Persona p = new Persona();
		p.leer(sc);
		System.out.println(p);
		
		Alumno a = new Alumno();
		a.leer(sc);
		System.out.println(a);
		
		Alumno b = new Alumno("123","asd","2");
		System.out.println(b);

	}

}
