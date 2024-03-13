package practicaTreeset;

import java.util.*;

public class Ej_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<Integer> tset = new TreeSet<Integer>(new Comparator<Integer>() { //comparator si quiero que la lista loordene

			@Override
			public int compare(Integer o1, Integer o2) {
				// TODO Auto-generated method stub
				return o1-o2;
			}
		});
		
		Scanner sc = new Scanner(System.in);
		String[] nums = sc.nextLine().split(" ");
		
		
		
		for(int i=0; i<nums.length; i++) {
			try {
			if (tset.contains(Integer.parseInt(nums[i])))
				System.out.println("El numero " + nums[i] + " esta repetido");
			tset.add(Integer.parseInt(nums[i]));
			} catch(NumberFormatException e) {}
		}
		
		System.out.println();
		System.out.println("Numeros ordenados ascendentemente sin repetidos:");
		System.out.println(tset);
		
		

//		Set<Integer> tsetrepetidos = new TreeSet<Integer>();
//		
//		for(int i=0; i<nums.length; i++) {
//		try {
//			if (tset.contains(Integer.parseInt(nums[i])))
//				tsetrepetidos.add(Integer.parseInt(nums[i]));
//			tset.add(Integer.parseInt(nums[i]));
//	} catch(NumberFormatException e) {}
//		}
//		
//		System.out.println();
//		System.out.println("Numeros repetidos:");
//		System.out.println(tsetrepetidos);
//		System.out.println("Numeros ordenados ascendentemente sin repetidos:");
//		System.out.println(tset);
		
		
	}

}
