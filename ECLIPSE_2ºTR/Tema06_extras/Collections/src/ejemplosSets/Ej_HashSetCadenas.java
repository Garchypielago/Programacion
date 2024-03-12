<<<<<<< HEAD
package ejemplosSets;
/**
 * Clase para mostrar los conjuntos (SET) en Java 
 * 
 * */

import java.util.HashSet;
import java.util.Set;

public class Ej_HashSetCadenas {
   public static void main(String args[]) {
      // declaracion de un HashSet
	   Set<String> hset = new HashSet<String>();

      // Aniadimos elementos al HashSet
      hset.add("Manzana");
      hset.add("Mango");
      hset.add("Uvas");
      hset.add("Naranja");
      hset.add("Platano");
      // Aniadimos elementos repetidos, no se aniadiran
      hset.add("Manzana");
      hset.add("Mango");


      //Displaying HashSet elements
      System.out.println(hset);
    }
}

=======
package ejemplosSets;
/**
 * Clase para mostrar los conjuntos (SET) en Java 
 * 
 * */

import java.util.HashSet;
import java.util.Set;

public class Ej_HashSetCadenas {
   public static void main(String args[]) {
      // declaracion de un HashSet
	   Set<String> hset = new HashSet<String>();

      // Aniadimos elementos al HashSet
      hset.add("Manzana");
      hset.add("Mango");
      hset.add("Uvas");
      hset.add("Naranja");
      hset.add("Platano");
      // Aniadimos elementos repetidos, no se aniadiran
      hset.add("Manzana");
      hset.add("Mango");


      //Displaying HashSet elements
      System.out.println(hset);
    }
}

>>>>>>> cd9c84d5df7ff962d8ba5fa320e6bfc7b852a830
