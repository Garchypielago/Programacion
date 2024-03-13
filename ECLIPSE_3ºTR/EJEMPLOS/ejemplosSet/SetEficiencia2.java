package ejemplos;

import java.util.*;
// En nanosegundos
public class SetEficiencia2 {

	public static void main(String[] args) {

		// final HashSet<Integer> hashSet
		final Set<Integer> hashSet = new HashSet<Integer>();
		final Long startHashSetTime = System.nanoTime();
		for (int i = 0; i < 10; i++) { // Aniadimos un millon de elementos
			hashSet.add(i);
		}
		final Long endHashSetTime = System.nanoTime();
		System.out.println("Tiempo usado por HashSet: " + (endHashSetTime - startHashSetTime));
		for (Integer e : hashSet )
			System.out.println(e);

		final Set<Integer> treeSet = new TreeSet<Integer>();
		final Long startTreeSetTime = System.nanoTime();
		for (int i = 0; i < 10; i++) {
			treeSet.add(i);
		}
		final Long endTreeSetTime = System.nanoTime();
		System.out.println("Tiempo usado por TreeSet: " + (endTreeSetTime - startTreeSetTime));
		for (Integer e : treeSet )
			System.out.println(e);

		final Set<Integer> linkedHashSet = new LinkedHashSet<Integer>();
		// System.nanoTime() nos permite mas definicion
		final Long startLinkedHashSetTime = System.nanoTime();
		for (int i = 0; i < 10; i++) {
			linkedHashSet.add(i);
		}
		final Long endLinkedHashSetTime = System.nanoTime();
		System.out.println("Tiempo usado por LinkedHashSet: " + (endLinkedHashSetTime - startLinkedHashSetTime));
		for (Integer e : linkedHashSet )
			System.out.println(e);

	}

}
