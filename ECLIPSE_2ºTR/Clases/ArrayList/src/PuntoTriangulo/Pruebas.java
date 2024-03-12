package PuntoTriangulo;

import java.util.*;

public class Pruebas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Punto p = new Punto(Double.parseDouble(args[1]), Double.parseDouble(args[2]));
		System.out.println(p);
		System.out.println(p.distanciaAlOrigen());

		Punto p1 = new Punto(-1, 1);
		System.out.println(p.distanciaAPunto(p1));

		System.out.println("cuadrante: " + p.cuadrante());
		System.out.println("cuadrante: " + p1.cuadrante());

		ArrayList<Punto> puntos = new ArrayList<Punto>();
		puntos.add(p1);
		Punto p2 = new Punto(0, 6);
		puntos.add(p2);
		Punto p3 = new Punto(-1, -8);
		puntos.add(p3);

		System.out.println("Punto mas cercano: " + p.masCercano(puntos));
		
		
		Triangulo t = new Triangulo(p,p1,p2);
		double[] lados = t.calcularLados();
		for (int i=0; i<3; i++) {
			System.out.println(lados[i]);
		}
		
	}

}
