package Linea;

/**************************************************************/
/* Comprueba si una linea es paralela a alguno de los ejes    */
/**************************************************************/

public class PruebasApp2 {

	public static void main(String[] args) {
		Linea2 l1, l2, l3;
		Punto2 punto1, punto2;
		
		punto1 = new Punto2(1, 10);
		punto2 = new Punto2(1, 20);
		l1 = new Linea2(punto1, punto2);
		System.out.println(l1);
		System.out.println("Longitud " + l1.longitud());
		
		if (esLineaParalelaEjes(punto1, punto2))
			System.out.println("Es una linea paralela a un eje");
		else 
			System.out.println("No es una linea paralela a un eje");
		
		punto1 = new Punto2(1, 1);
		punto2 = new Punto2(2, 2);
		l2 = new Linea2(punto1, punto2);
		System.out.println(l2);
		System.out.println("Longitud " + l2.longitud());
		
		if (esLineaParalelaEjes(punto1, punto2))
			System.out.println("Es una linea paralela a un eje");
		else 
			System.out.println("No es una linea paralela a un eje");
		
		// Probamos el segundo metodo:	
		punto1 = new Punto2(10, -1);
		punto2 = new Punto2(-2, 20);
		l3 = new Linea2(punto1, punto2);
		System.out.println(l3);
		
		System.out.println("Longitud " + l3.longitud());
		if (esLineaParalelaEjes(l3))
			System.out.println("Es una linea paralela a un eje");
		else 
			System.out.println("No es una linea paralela a un eje");
	}
	
	/************************************************************/
	/* recibe los puntos										*/
	/************************************************************/
	public static boolean esLineaParalelaEjes(Punto2 p1, Punto2 p2) {
		if ((p1.getX() == p2.getX()) || (p1.getY() == p2.getY())) return true;
		else return false;
	}
	
	/************************************************************/
	/* recibe la linea 											*/
	/************************************************************/
	public static boolean esLineaParalelaEjes(Linea2 l) {
		if ((l.getP1().getX() == l.getP2().getX()) || (l.getP1().getY() == l.getP2().getY())) return true;
		else return false;
	}

}
