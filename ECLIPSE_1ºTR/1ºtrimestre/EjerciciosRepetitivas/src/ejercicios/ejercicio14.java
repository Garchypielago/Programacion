<<<<<<< HEAD
package ejercicios;

public class ejercicio14 {

	public static void main(String[] args) {
		double km1=70, km2=150, kmT;
		
		
		while (km1!=km2 && km1<km2) {
			km1++;
			km2--;
		}
		
		if (km1==km2) {
			kmT=km1;
			System.out.println("Se han encontrado en el kilómetro " + kmT);
		}else {
			kmT=km2+(km1-km2);
			System.out.println("Se han encontrado en el kilómetro " + kmT);
		}
		
	}

}
=======
package ejercicios;

public class ejercicio14 {

	public static void main(String[] args) {
		double km1=70, km2=150, kmT;
		
		
		while (km1!=km2 && km1<km2) {
			km1++;
			km2--;
		}
		
		if (km1==km2) {
			kmT=km1;
			System.out.println("Se han encontrado en el kilómetro " + kmT);
		}else {
			kmT=km2+(km1-km2);
			System.out.println("Se han encontrado en el kilómetro " + kmT);
		}
		
	}

}
>>>>>>> cd9c84d5df7ff962d8ba5fa320e6bfc7b852a830
