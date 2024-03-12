package ejemplos1;

public class ErrorIntLong {

	public static void main(String[] args) {
		long l1 = 2147483648L ;
		long l2 = 2147483647L ;
		
		long suma = (l1 + l2);	//se usa byte detras por que lo guarda en int y no lo puede declarar como byte
		//byte resta = (byte) (b1 - b2);
		//byte multiplicacion = (byte) (b1 / b2);
		//byte division = (byte) (b1 * b2);
		
		System.out.println("Suma: " + suma);
		//System.out.println("Resta: " + resta);
		//System.out.println("Multiplicación: " + multiplicacion);
		//System.out.println("División: " + division);

	}

}
