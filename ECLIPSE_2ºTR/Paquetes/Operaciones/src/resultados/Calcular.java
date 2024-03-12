<<<<<<< HEAD
package resultados;

import operaciones.*;

public class Calcular {

	public static void main(String[] args) {
		
		java.util.Scanner sc = new java.util.Scanner(System.in);
		
		IntroducirNumeros nums = new IntroducirNumeros(sc);
		new Sumar(nums.getI(),nums.getJ()).suma();;
		new Restar(nums.getI(),nums.getJ()).resta();;
		new Multiplicar(nums.getI(),nums.getJ()).multiplica();;
		new Dividir(nums.getI(),nums.getJ()).divide();;
	}

}
=======
package resultados;

import operaciones.*;

public class Calcular {

	public static void main(String[] args) {
		
		java.util.Scanner sc = new java.util.Scanner(System.in);
		
		IntroducirNumeros nums = new IntroducirNumeros(sc);
		new Sumar(nums.getI(),nums.getJ()).suma();;
		new Restar(nums.getI(),nums.getJ()).resta();;
		new Multiplicar(nums.getI(),nums.getJ()).multiplica();;
		new Dividir(nums.getI(),nums.getJ()).divide();;
	}

}
>>>>>>> cd9c84d5df7ff962d8ba5fa320e6bfc7b852a830
