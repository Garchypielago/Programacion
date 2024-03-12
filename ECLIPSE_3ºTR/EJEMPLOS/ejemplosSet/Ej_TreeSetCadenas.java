<<<<<<< HEAD
package ejemplos;
/**
 * Clase para mostrar los conjuntos (SET) en Java 
 * 
 * */

import java.util.TreeSet;
public class Ej_TreeSetCadenas {
   public static void main(String args[]) {
      // declaracion de un TreeSet
      TreeSet<String> hset = new TreeSet<String>();

      // Aniadimos elementos al HashSet
      hset.add("Manzana");
      hset.add("Mango");
      hset.add("Uvas");
      hset.add("Naranja");
      hset.add("Platano");
      // Aniadimos elementos repetidos, no se aniadiran
      hset.add("Manzana");
      hset.add("Mango");
      // Distingue mayusculas-minusculas?? Si, lo insertara porque no lo identifica como un elemento diferente
      hset.add("manzana");

      //Como es un arbol, muestra con el orden de compareTo los elementos del Set
      System.out.println(hset);
    }
}

=======
package ejemplos;
/**
 * Clase para mostrar los conjuntos (SET) en Java 
 * 
 * */

import java.util.TreeSet;
public class Ej_TreeSetCadenas {
   public static void main(String args[]) {
      // declaracion de un TreeSet
      TreeSet<String> hset = new TreeSet<String>();

      // Aniadimos elementos al HashSet
      hset.add("Manzana");
      hset.add("Mango");
      hset.add("Uvas");
      hset.add("Naranja");
      hset.add("Platano");
      // Aniadimos elementos repetidos, no se aniadiran
      hset.add("Manzana");
      hset.add("Mango");
      // Distingue mayusculas-minusculas?? Si, lo insertara porque no lo identifica como un elemento diferente
      hset.add("manzana");

      //Como es un arbol, muestra con el orden de compareTo los elementos del Set
      System.out.println(hset);
    }
}

>>>>>>> cd9c84d5df7ff962d8ba5fa320e6bfc7b852a830
