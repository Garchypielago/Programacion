package Ej_01;

import java.util.ArrayList;
import java.util.Iterator;

import modificaciones.Coche;

public class GrupoIsosceles {

	private ArrayList<TrianguloIsosceles> grupoIsosceles;

	public GrupoIsosceles() {
		super();
		this.grupoIsosceles = new ArrayList<TrianguloIsosceles>();
	}

	public void agregar(TrianguloIsosceles t) {
		grupoIsosceles.add(t);
	}

	public void agregar(double base, double altura) {
		grupoIsosceles.add(new TrianguloIsosceles(base, altura));
	}

	public TrianguloIsosceles areaMayor() {
		Iterator<TrianguloIsosceles> it = grupoIsosceles.iterator();
		TrianguloIsosceles mayor = null;
		if (it.hasNext()) {
			mayor = it.next(); // aqui ya ha contado 1
		}

		while (it.hasNext()) {
			TrianguloIsosceles comprobar = it.next();
			if (comprobar.getArea() > mayor.getArea()) {
				mayor = comprobar;
			}
		}

		return mayor;
	}

	public int areaMayorPosicion() {
		Iterator<TrianguloIsosceles> it = grupoIsosceles.iterator();
		TrianguloIsosceles mayor = null;
		int posicion = -1;
		if (it.hasNext()) {
			mayor = it.next(); // aqui ya ha contado 1
			posicion = 0;
		}

		for (int i = 1; it.hasNext(); i++) {
			TrianguloIsosceles comprobar = it.next();
			if (comprobar.getArea() > mayor.getArea()) {
				mayor = comprobar;
				posicion = i;
			}
		}

		return posicion;
	}

	public TrianguloIsosceles perimetroMenor() {
		Iterator<TrianguloIsosceles> it = grupoIsosceles.iterator();
		TrianguloIsosceles menor = null;
		if (it.hasNext()) {
			menor = it.next(); // aqui ya ha contado 1
		}

		while (it.hasNext()) {
			TrianguloIsosceles comprobar = it.next();
			if (comprobar.getPerimetro() < menor.getPerimetro()) {
				menor = comprobar;
			}
		}

		return menor;
	}

	public int perimetroMenorPosicion() {
		Iterator<TrianguloIsosceles> it = grupoIsosceles.iterator();
		TrianguloIsosceles menor = null;
		int posicion = -1;
		if (it.hasNext()) {
			menor = it.next(); // aqui ya ha contado 1
			posicion = 0;
		}

		for (int i = 1; it.hasNext(); i++) {
			TrianguloIsosceles comprobar = it.next();
			if (comprobar.getPerimetro() < menor.getPerimetro()) {
				menor = comprobar;
				posicion = i;
			}
		}

		return posicion;
	}

	public void areaPerimetro(double base, double altura) {
		Iterator<TrianguloIsosceles> it = grupoIsosceles.iterator();
		TrianguloIsosceles comprobar = null;
		while(it.hasNext()) {
			comprobar = it.next();
			if (comprobar.getBase()==base && comprobar.getAltura()==altura) {
				System.out.println(comprobar.toStringSinLado());
			}
		}
	}

//	public void areaPerimetro(int posicion) {
//		Iterator<TrianguloIsosceles> it = grupoIsosceles.iterator();
//		TrianguloIsosceles comprobar = null;
//		while(it.hasNext() && grupoIsosceles.size()<posicion) {
//			comprobar = it.next();
//			if (comprobar.getBase()==grupoIsosceles.get(posicion).getBase() && comprobar.getAltura()==grupoIsosceles.get(posicion).getAltura()) {
//				System.out.println(comprobar.toStringBaseAltura());
//			}
//		}
//	}
	
	public void areaPerimetro(int posicion) {
		System.out.println(grupoIsosceles.get(posicion).toStringSinLado());
		}

	public void areaPerimetro() {
		for (int i=0; i<grupoIsosceles.size();i++) {
			System.out.println(i+") " + grupoIsosceles.get(i).toStringBaseAltura());
		}
		
		int posicion;
		java.util.Scanner sc= new java.util.Scanner(System.in);
		System.out.println("Escribe el numero del triangulo del que quieras saber area y perimtro:");
		posicion=sc.nextInt();
		System.out.println("Area: " + grupoIsosceles.get(posicion).getArea());
		System.out.println("Perimetro: " + grupoIsosceles.get(posicion).getPerimetro());
		
		sc.close();
	}
}
