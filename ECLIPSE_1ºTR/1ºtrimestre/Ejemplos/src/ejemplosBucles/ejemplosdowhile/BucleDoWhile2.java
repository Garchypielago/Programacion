package ejemplosdowhile;

public class BucleDoWhile2 {

	public static void main(String args[]) {
		int i=1;
		
		do {
			System.out.println(i);
			i+=2;
		}while (i<=10);
		
		// Cuanto vale num fuera del bucle
		System.out.println(i);
	}


}

