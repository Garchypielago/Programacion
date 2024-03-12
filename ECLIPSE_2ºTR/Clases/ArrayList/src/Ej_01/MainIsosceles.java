<<<<<<< HEAD
package Ej_01;

import java.util.ArrayList;

public class MainIsosceles {


	public static void main(String[] args) { 
	
		GrupoIsosceles g1 = new GrupoIsosceles();
		
		g1.agregar(6,3);
		g1.agregar(2,2);
		g1.agregar(2,3);
		g1.agregar(3,3);
		
		System.out.println("El triangulo con mas area es:" + g1.areaMayor());
		System.out.println("El triangulo con mas area esta en la posicion:" + g1.areaMayorPosicion());
		
		System.out.println();
		
		System.out.println("El triangulo con menos perimetro es:" + g1.perimetroMenor());
		System.out.println("El triangulo con menos perimetro esta en la posicion:" + g1.perimetroMenorPosicion());
		
		System.out.println();
		
		g1.areaPerimetro(2, 3);
		g1.areaPerimetro(2);
		g1.areaPerimetro();
	}

}
=======
package Ej_01;

import java.util.ArrayList;

public class MainIsosceles {


	public static void main(String[] args) { 
	
		GrupoIsosceles g1 = new GrupoIsosceles();
		
		g1.agregar(6,3);
		g1.agregar(2,2);
		g1.agregar(2,3);
		g1.agregar(3,3);
		
		System.out.println("El triangulo con mas area es:" + g1.areaMayor());
		System.out.println("El triangulo con mas area esta en la posicion:" + g1.areaMayorPosicion());
		
		System.out.println();
		
		System.out.println("El triangulo con menos perimetro es:" + g1.perimetroMenor());
		System.out.println("El triangulo con menos perimetro esta en la posicion:" + g1.perimetroMenorPosicion());
		
		System.out.println();
		
		g1.areaPerimetro(2, 3);
		g1.areaPerimetro(2);
		g1.areaPerimetro();
	}

}
>>>>>>> cd9c84d5df7ff962d8ba5fa320e6bfc7b852a830
