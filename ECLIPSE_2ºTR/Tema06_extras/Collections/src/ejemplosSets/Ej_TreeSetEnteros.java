<<<<<<< HEAD
package ejemplosSets;

//import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

//class MyComparator implements Comparator<Integer> {
//	  public int compare(Integer a, Integer b) {
//	    return b.compareTo(a);
//	  }
//}

public class Ej_TreeSetEnteros {
	
	public static void main(String[] args) {
//		Set<Integer> conjunto1 = new TreeSet<Integer>(new MyComparator());
		Set<Integer> conjunto1 = new TreeSet<Integer>();
		while (conjunto1.size() < 30) {
			int aleatorio = (int) (Math.random() * 100) + 1;
			conjunto1.add(aleatorio);
			System.out.println(conjunto1);
		}
		// El random hace que se generen todos los numeros del 1 al 10
		// En un tree, se ordenan ascendentemente por defecto
		System.out.println(conjunto1);
		System.out.println(conjunto1.size());
	}

}
=======
package ejemplosSets;

//import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

//class MyComparator implements Comparator<Integer> {
//	  public int compare(Integer a, Integer b) {
//	    return b.compareTo(a);
//	  }
//}

public class Ej_TreeSetEnteros {
	
	public static void main(String[] args) {
//		Set<Integer> conjunto1 = new TreeSet<Integer>(new MyComparator());
		Set<Integer> conjunto1 = new TreeSet<Integer>();
		while (conjunto1.size() < 30) {
			int aleatorio = (int) (Math.random() * 100) + 1;
			conjunto1.add(aleatorio);
			System.out.println(conjunto1);
		}
		// El random hace que se generen todos los numeros del 1 al 10
		// En un tree, se ordenan ascendentemente por defecto
		System.out.println(conjunto1);
		System.out.println(conjunto1.size());
	}

}
>>>>>>> cd9c84d5df7ff962d8ba5fa320e6bfc7b852a830
