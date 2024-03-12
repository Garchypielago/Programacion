package triangulos2;

import java.util.*;

public class Principal {

	static int menu(int tope_op, Scanner sc) {
		int opcion_menu;

		System.out.println(
				"1.Aniadir triangulo\n2.Triangulo con area mas grande\n3.Triangulo con perimetro mas pequenio");
		System.out.println("4.Informacion de un triangulo\n5.Informacion de todos los triangulos\n6.Salir\n");

		do {
			System.out.print("\n\tElija opcion:");
			opcion_menu = Integer.parseInt(sc.nextLine());
		} while (opcion_menu < 1 || opcion_menu > tope_op);

		return opcion_menu;
	}

	public static void main(String[] args) {
		final int MAX_OPC = 6;
		Scanner teclado = new Scanner(System.in);
		int opc = 0, nT;
		int i;
		Triangulo t;

		Triangulos ATriangulos = new Triangulos();

		while (opc != MAX_OPC) {
			opc = menu(MAX_OPC, teclado);
			switch (opc) {

			case 1:
				ATriangulos.aniadir(PeticionDatos.altaTriangulo(teclado));
				break;
			case 2:
				i = ATriangulos.mayorAreaTriangulo();
				System.out.println("i " + i);
				if (i >= 0) {
					System.out.println("El triangulo con el mayor area es el " + (i + 1) + "\n Sus datos son\n   Base "
							+ ATriangulos.dame(i));
					System.out.println("   Area " + ATriangulos.dame(i).area() + "\n   Perimetro "
							+ ATriangulos.dame(i).perimetro());
				}
				// De otra forma:
				t = ATriangulos.mayorAreaTriangulo_O();
				if (t != null) {
					System.out.println("El triangulo con el mayor area es el de " + t);
					System.out.printf("Area %1$.2f %nPerimetro %2$.2f%n%n", t.area(), t.perimetro());
				}
				break;
			case 3:
				/*
				 * i = ATriangulos.menorPeriTriangulo(); //System.out.println("i "+ i); if
				 * (i>=0) {
				 * System.out.println("El triangulo con el menor perimetro es el "+(i+1)
				 * +"\n Sus datos son\n   Base "+ ATriangulos.dame(i).getBase()+"\n   Altura " +
				 * ATriangulos.dame(i).getAltura());
				 * System.out.println("   Area "+ATriangulos.dame(i).area()+"\n   Perimetro "
				 * +ATriangulos.dame(i).perimetro() +"\n"); }
				 */

				// Hacer tambien devolviendo un objeto como con el area
				t = ATriangulos.menorPerimetroTriangulo_O();
				if (t != null) {
					System.out.println("El triangulo con el menor perimetro es el de " + t);
					System.out.printf("Area %1$.2f %nPerimetro %2$.2f%n%n", t.area(), t.perimetro());
				}
				break;
			case 4:
				if (ATriangulos.estaVacio())
					System.out.println("No hay triangulos.\n");
				else {
					if ((nT = ATriangulos.buscaTriangulo(PeticionDatos.altaTriangulo(teclado))) != -1)
						ATriangulos.mostrarUnTriangulo(nT);
					else
						System.out.println("Ese triangulo no existe.\n");
				}
				break;
			case 5:
				// ATriangulos.mostrarTriangulos();
				// Con toString():
				if (ATriangulos.estaVacio())
					System.out.println("No hay triangulos.\n");
				else
					System.out.println(ATriangulos);
				break;
			}
		}
		teclado.close();
	}

}