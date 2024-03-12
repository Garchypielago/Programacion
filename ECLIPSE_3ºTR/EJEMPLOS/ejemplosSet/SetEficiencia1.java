package ejemplos;

import java.util.*;
//En milisegundos
public class SetEficiencia1 {

	public static void main(String[] args) {

		// final HashSet<Integer> hashSet
		final Set<Integer> hashSet = new HashSet<Integer>();
		final Long startHashSetTime = System.currentTimeMillis();
		for (int i = 0; i < 1000000; i++) { // Aniadimos un millon de elementos
			hashSet.add(i);
		}
		final Long endHashSetTime = System.currentTimeMillis();
		System.out.println("Tiempo usado por HashSet: " + (endHashSetTime - startHashSetTime));
//		for (Integer e : hashSet )
//			System.out.println(e);

		final Set<Integer> treeSet = new TreeSet<Integer>();
		final Long startTreeSetTime = System.currentTimeMillis();
		for (int i = 0; i < 1000000; i++) {
			treeSet.add(i);
		}
		final Long endTreeSetTime = System.currentTimeMillis();
		System.out.println("Tiempo usado por TreeSet: " + (endTreeSetTime - startTreeSetTime));
//		for (Integer e : treeSet )
//			System.out.println(e);

		final Set<Integer> linkedHashSet = new LinkedHashSet<Integer>();
		// System.nanoTime() nos permite mas definicion
		final Long startLinkedHashSetTime = System.currentTimeMillis();
		for (int i = 0; i < 1000000; i++) {
			linkedHashSet.add(i);
		}
		final Long endLinkedHashSetTime = System.currentTimeMillis();
		System.out.println("Tiempo usado por LinkedHashSet: " + (endLinkedHashSetTime - startLinkedHashSetTime));
//		for (Integer e : linkedHashSet )
//			System.out.println(e);

	}

}
