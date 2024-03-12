<<<<<<< HEAD
package EjerciciosClases01;

public class AAPruebas {

	public static void main(String[] args) {
		
		//Ej03
		System.out.println("------------EJ03------------");
		
		Circulo c1= new Circulo();
		Circulo c2= new Circulo(2);
		Circulo c3= new Circulo(1,1,3);
		
		c1.mostrarCalculos();
		c2.mostrarCalculos();
		c3.mostrarCalculos();
		
		
		System.out.println();
		//Ej04
		System.out.println("------------EJ04------------");
		
		Punto2 p1=new Punto2();
		Punto2 p2=new Punto2(2,2);
		
		p1.coordenadas();
		p2.coordenadas();
		
		
		System.out.println();
		//Ej05
		System.out.println("------------EJ05------------");
		
		Coche coche1= new Coche();
		Coche coche2= new Coche("azul","toyota", "3435YTP", 5 );
		
		System.out.println(coche1);
		System.out.println(coche2);
		
		coche1.pintarCoche("Negro");
		
		
		System.out.println();
		//Ej06
		System.out.println("------------EJ06------------");
		
		CuentaBancaria A= new CuentaBancaria(1000);
		CuentaBancaria B= new CuentaBancaria();
		
		System.out.println("Saldo de A: " + A.consultaSaldo());
		System.out.println("Saldo de B: " + B.consultaSaldo());
		
		A.retirar(500);
		B.ingresar(500);
		
		System.out.println("Hay " + CuentaBancaria.numeroCuentas() + " cuentas creadas.");

	}
}
=======
package EjerciciosClases01;

public class AAPruebas {

	public static void main(String[] args) {
		
		//Ej03
		System.out.println("------------EJ03------------");
		
		Circulo c1= new Circulo();
		Circulo c2= new Circulo(2);
		Circulo c3= new Circulo(1,1,3);
		
		c1.mostrarCalculos();
		c2.mostrarCalculos();
		c3.mostrarCalculos();
		
		
		System.out.println();
		//Ej04
		System.out.println("------------EJ04------------");
		
		Punto2 p1=new Punto2();
		Punto2 p2=new Punto2(2,2);
		
		p1.coordenadas();
		p2.coordenadas();
		
		
		System.out.println();
		//Ej05
		System.out.println("------------EJ05------------");
		
		Coche coche1= new Coche();
		Coche coche2= new Coche("azul","toyota", "3435YTP", 5 );
		
		System.out.println(coche1);
		System.out.println(coche2);
		
		coche1.pintarCoche("Negro");
		
		
		System.out.println();
		//Ej06
		System.out.println("------------EJ06------------");
		
		CuentaBancaria A= new CuentaBancaria(1000);
		CuentaBancaria B= new CuentaBancaria();
		
		System.out.println("Saldo de A: " + A.consultaSaldo());
		System.out.println("Saldo de B: " + B.consultaSaldo());
		
		A.retirar(500);
		B.ingresar(500);
		
		System.out.println("Hay " + CuentaBancaria.numeroCuentas() + " cuentas creadas.");

	}
}
>>>>>>> cd9c84d5df7ff962d8ba5fa320e6bfc7b852a830
