package borrado;

import java.util.ArrayList;

public class Ejemplo01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> listaPaises = new ArrayList(); 
		listaPaises.add("España"); //Ocupa la posición 0 
		listaPaises.add("Francia"); //Ocupa la posición 1 
		listaPaises.add("Portugal"); //Ocupa la posición 2
		
		ArrayList<Integer> edades = new ArrayList<Integer> (); 
		edades.add(22); 
		edades.add(31); 
		edades.add(18);
		
		//
		ArrayList<String> listaPaises2 = new ArrayList(); 
		listaPaises2.add("España"); 
		listaPaises2.add("Francia"); 
		listaPaises2.add("Portugal"); //El orden es: España, Francia, Portugal 
		listaPaises2.add(1, "Italia"); //Ahora es: España, Italia, Francia, Portugal

		//
		ArrayList<String> listaPaises3 = new ArrayList(); 
		listaPaises3.add("España"); 
		listaPaises3.add("Francia"); 
		listaPaises3.add("Portugal"); //El orden es: España, Francia, Portugal 
		listaPaises3.add(1, "Italia"); //Ahora es: España, Italia, Francia, Portugal 
		listaPaises3.remove(2); //Eliminada Francia, queda: España, Italia, Portugal 
		listaPaises3.remove("Portugal"); //Eliminada Portugal, queda: España, Italia
		
		//
		 System.out.println(listaPaises.get(3)); // Mostraría: Portugal
		 
		 //
		 listaPaises.set(1, "Alemania");
		 
		 //
		 String paisBuscado = "Francia"; 
		 int pos = listaPaises.indexOf(paisBuscado); 
		 if (pos != -1) 
		 System.out.println(paisBuscado + " encontrado en la posición: "+pos); 
		 else 
		 System.out.println(paisBuscado + " no se ha encontrado");

		 //
		 for (int i=0; i<listaPaises.size(); i++) 
		 System.out.println(listaPaises.get(i));
		 
		 //
		 for (String pais:listaPaises) 
			 System.out.println(pais);
		
		 

	}

}
