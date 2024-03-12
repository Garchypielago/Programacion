<<<<<<< HEAD
package excepciones;

public class Main {

	public static void main(String[] args) {
		Animal a = null;
		
		try {
			a = new Animal("algo");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();			
		}
		
		if (a != null) System.out.println("Se ha creado algo");
		else System.out.println("No se ha creado algo");
		
		try {
			a = new Animal("caballo");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();			
		}
		
		if (a != null) System.out.println("Se ha creado caballo");
		else System.out.println("No se ha creado caballo");
	}

}
=======
package excepciones;

public class Main {

	public static void main(String[] args) {
		Animal a = null;
		
		try {
			a = new Animal("algo");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();			
		}
		
		if (a != null) System.out.println("Se ha creado algo");
		else System.out.println("No se ha creado algo");
		
		try {
			a = new Animal("caballo");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();			
		}
		
		if (a != null) System.out.println("Se ha creado caballo");
		else System.out.println("No se ha creado caballo");
	}

}
>>>>>>> cd9c84d5df7ff962d8ba5fa320e6bfc7b852a830
