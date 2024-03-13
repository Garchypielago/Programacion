package ejemplos;

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
		while (conjunto1.size() < 100) {
			int aleatorio = (int) (Math.random() * 100) + 1;
			conjunto1.add(aleatorio);
		}
		// El random hace que se generen todos los numeros del 1 al 10
		// En un tree, se ordenan ascendentemente por defecto
		System.out.println(conjunto1);
		System.out.println(conjunto1.size());
	}

}
