package enumPrecio1;

public class Main {

	public static void main(String args[]) {	
		Precio a = Precio.MEDIO;
		Precio b = Precio.BARATO;
		
		//if (Precio.MEDIO.equals(a)) {
		if (Precio.MEDIO == a) {
		   System.out.println ("a tiene precio "+Precio.MEDIO);
		}
		
		System.out.println ("b tiene precio " + b); // invoca su toString()
		
		System.out.println ();
		
		System.out.println (Precio.MEDIO);
		System.out.println (Precio.valueOf("MEDIO"));
		
		System.out.println ();
		
		Precio[] valores = Precio.values();
		
		for  (Precio valor : valores) {
			System.out.println (valor);
		}
		
	}

}