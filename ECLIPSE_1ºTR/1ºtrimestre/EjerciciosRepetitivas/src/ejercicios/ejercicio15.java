package ejercicios;

public class ejercicio15 {

	public static void main(String[] args) {
		int mes, pago=10, total=0;
		
		for (mes=1;mes<20+1;mes++) {
			pago = pago*2;
			total=total + pago;
			System.out.println("El mes " + mes + " debes pagar " + pago + "€.");
		}
		System.out.println("El ahorro total es de " + total + "€.");
	}

}
