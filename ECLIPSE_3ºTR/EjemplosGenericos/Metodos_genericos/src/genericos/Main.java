package genericos;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String[] arrayString = { "uno", "dos", "tres", "cuatro", "cinco" };
		Utilidades.alReves(arrayString);
		Utilidades.muestraArray(arrayString);		
		// sustituyeArray reemplaza los elementos por el que se manda
		Utilidades.sustituyeArray(arrayString, "hola");
		Utilidades.muestraArray(arrayString);

		Integer[] arrayInteger = { 1, 2, 3, 4, 5 };
		Utilidades.alReves(arrayInteger);
		Utilidades.muestraArray(arrayInteger);
		// sustituyeArray reemplaza los elementos por el que se manda
		Utilidades.sustituyeArray(arrayInteger, 4);
		Utilidades.muestraArray(arrayInteger);

		Alumno[] alumnos = new Alumno[3];
		try {
			alumnos[0] = new Alumno("uno", 20);
			alumnos[1] = new Alumno("dos", 16);
			alumnos[2] = new Alumno("tres", 21);
		} catch (Exception e) {
			e.printStackTrace();
		}

		Utilidades.muestraArray(alumnos);// Ahora mandamos un array de una clase propia
		Utilidades.alReves(alumnos);
		
		try {
			Utilidades.sustituyeArray(alumnos, new Alumno("todos", 24));
		} catch (Exception e) {
			e.printStackTrace();
		}

		Utilidades.muestraArray(alumnos);
		
		// Ponemos la nota a todos los alumnos:
		
		float nota;
		
		for (int i = 0; i < alumnos.length; i++) {
			System.out.println("Introduce la nota del alumno " + (i+1));
			nota = Float.parseFloat(sc.nextLine());
			try {
				alumnos[i].setNota(nota);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}	
		
		Utilidades.muestraArray(alumnos);
		
		// Que ha ocurrido con las notas de los alumnos?
		
		sc.close();
	}

}
