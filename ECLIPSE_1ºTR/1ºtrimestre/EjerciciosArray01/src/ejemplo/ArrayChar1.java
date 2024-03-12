package ejemplo;

import java.util.Scanner;

public class ArrayChar1 {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int n;
		/*
		 * do{ System.out.println("Introducir numero de componentes del array ");
		 * n=teclado.nextInt(); }while(n<=0);
		 */
		// Para asegurarme lo que pruebo despues
		n = 5;

		char[] vocales = { 'a', 'e', 'i', 'o', 'u' };
		System.out.println("\nARRAY CON VOCALES\n");
		System.out.println(vocales);

		// Asi escribe la direccion del array
		System.out.println("\nARRAY CONVERTIDO EN STRING\n");
		// los arrays de char permiten imprimir su contenido si no los concateno con nada:
		System.out.println("Vocales " + vocales);
		System.out.println("Vocales vocales.toString() " + vocales.toString());
		System.out.println("Vocales new String() " + new String (vocales));
		// lo de arriba escribe el hashcode en hexadecimal e indica que es un array [ de char C
		// El método hashCode sirve para obtener un código hash que sería como un identificador del objeto
		System.out.println("Vocales hashCode: " + vocales.hashCode());
		System.out.println(vocales.getClass().getName() + '@' + Integer.toHexString(vocales.hashCode()));
		System.out.println("Vocales " + String.valueOf(vocales));


		char[] array1 = new char[n];
		System.out.println("\nARRAY SIN INICIALIZAR\n");
		System.out.println(array1); // No imprime nada

		// Observamos como se introducen espacios en blanco
		array1[0] = 'm';
		array1[2] = 'n';
		System.out.println("\nARRAY CON ALGUNOS VALORES\n");
		System.out.println("array " + array1);// Aqui se convierte en cadena
		System.out.println(array1);// Aqui se escribe el contenido del array

		System.out.println("\nARRAY CON ALGUNOS VALORES ESCRITO USANDO FUNCION\n");
		escribir(array1);

		// Creamos un String:
		String s = "Ordenador";

		System.out.println("\nARRAY DE CHAR A PARTIR DE UNA CADENA\n");
		// Convierte una cadena en un array de caracteres
		char[] nuevo = s.toCharArray();
		System.out.println(nuevo);

		System.out.println("\nCADENA A PARTIR DE UN ARRAY DE CHAR\n");
		// Convierte un array de caracteres en una cadena
		s = new String(vocales);

		// Nuevo sigue teniendo sus datos
		System.out.println("*****");
		System.out.println(nuevo);
		System.out.println(s);
		System.out.println("*****");

		System.out.println("\nULTIMO CARACTER DE UNA CADENA \n");
		// Imprimo el ultimo caracter
		System.out.println("Ultimo caracter " + s.charAt(s.length() - 1));

		// String prueba = "prueba"; System.out.println(prueba.replace('u', 'b'));

		int i = 0;

		System.out.println("\nELIMINAMOS EL ULTIMO CARACTER DE UNA CADENA \n");
		s = s.replace(s.charAt(s.length() - 1), '\0');

		// s contiene las vocales, pero hemos borrado la ultima
		// Lo imprimimos caracter a caracter
		System.out.println("\nELIMINAMOS EL ULTIMO CARACTER DE UN ARRAY \n");
		while (s.charAt(i) != '\0') {
			System.out.println(s.charAt(i));
			i++;
		}

		System.out.println();
		// nuevo contiene ordenador
		// Hacemos lo mismo, aunque en este caso es un String,
		// internamente es un array de char
		nuevo[nuevo.length - 1] = '\0';
		i = 0;
		while (nuevo[i] != '\0') {
			System.out.println(nuevo[i]);
			i++;
		}

		 rellenar(nuevo, teclado);
		 escribir(nuevo);

		// Llamar a rellenar
		teclado.close();
	}

	static void rellenar(char[] a, Scanner tec) {
		for (int i = 0; i < a.length; i++) {
			System.out.println("Introducir valor en el array ");
			a[i] = (char) (tec.next().charAt(0)); // solo cogemos el primer caracter
		}
	}

	static void escribir(char[] a) {
		for (int i = 0; i < a.length; i++)
			System.out.print(a[i]);
		System.out.println();
	}
}
