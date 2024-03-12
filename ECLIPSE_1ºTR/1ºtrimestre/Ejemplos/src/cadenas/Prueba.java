<<<<<<< HEAD
package cadenas;

public class Prueba {
	public static void main(String args[]) {
		String a = "abc";
		String b = "abc";
		
		System.out.println(a == b);
		
		a = a.replace('a', 'c');
		System.out.println(a + "  " + b);
		System.out.println(a == b); 
		
		// Aquí dos diferentes objetos se crean y tienen diferentes referencias:

		String c = new String("abc");
		String d = new String("abc");
		
		System.out.println(c == d); 
		
		long tiempo1 = System.nanoTime();
        for (int i = 0; i <= 1000000; i++) {
            String cadena = new String("hola"); 
        }
 
        long tiempo2 = System.nanoTime();
 
        for (int i = 0; i <= 1000000; i++) { 
            String cadena = "hola"; 
        }
 
        long tiempo3 = System.nanoTime();
 
        System.out.println(tiempo2- tiempo1);
        System.out.println(tiempo3 - tiempo2);
        
        // Nota: si quitamos las llaves de los for, observad que pasa
    }

}
=======
package cadenas;

public class Prueba {
	public static void main(String args[]) {
		String a = "abc";
		String b = "abc";
		
		System.out.println(a == b);
		
		a = a.replace('a', 'c');
		System.out.println(a + "  " + b);
		System.out.println(a == b); 
		
		// Aquí dos diferentes objetos se crean y tienen diferentes referencias:

		String c = new String("abc");
		String d = new String("abc");
		
		System.out.println(c == d); 
		
		long tiempo1 = System.nanoTime();
        for (int i = 0; i <= 1000000; i++) {
            String cadena = new String("hola"); 
        }
 
        long tiempo2 = System.nanoTime();
 
        for (int i = 0; i <= 1000000; i++) { 
            String cadena = "hola"; 
        }
 
        long tiempo3 = System.nanoTime();
 
        System.out.println(tiempo2- tiempo1);
        System.out.println(tiempo3 - tiempo2);
        
        // Nota: si quitamos las llaves de los for, observad que pasa
    }

}
>>>>>>> cd9c84d5df7ff962d8ba5fa320e6bfc7b852a830
