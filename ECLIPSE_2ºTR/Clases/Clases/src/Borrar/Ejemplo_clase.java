package Borrar;

import java.util.*;

public class Ejemplo_clase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> names = new ArrayList<>();
		names.add("name 1");
		names.add("name 2");
		names.add("");
		names.add("name 3");
		names.add("");
		System.out.println("Tamaño antes: " + names.size());
		Iterator<String> it = names.iterator();
		while (it.hasNext()) {
		 String el = it.next();
		 if (el.equals("")) {
		 it.remove();
		 }
		}
		System.out.println("Tamaño despues: " + names.size());

	}

}
