package Tema2;

public class Bloque {
	static int a;
	static int b;
	
	static {		//solo se inicializa una vez
		a = 10;
		b = 20;
		System.out.println("Inicializa el bloque");
	}

}
