package cadenas;

public class PruebaString2 {
	public static void main(String[] args) {
		
        // Comparacion:
		
        System.out.println("compareTo");
        System.out.println();
        String str="Tomas";
        System.out.println("*********");
	    System.out.println("Orden alfabetico "+str.compareTo("Alberto"));
	    System.out.println();
  	    str="Alberto";
  	    System.out.println("*********");
	    System.out.println("Orden alfabetico "+str.compareTo("Tomas"));
	    System.out.println();
	    
	    // Devuelve el numero de elementos que hay entre sus codigos ASCII
	    
	    System.out.println("*********");
	    System.out.println("Orden alfabetico "+str.compareTo("alberto"));
	    System.out.println("*********");
	    System.out.println();
	    System.out.println("compareToIgnoreCase");
	    System.out.println(str.compareToIgnoreCase("alberto"));	    
	    System.out.println("*********");
	    System.out.println();
	    
	    System.out.println("substring");
	    //Substring
        str="El lenguaje Java";
        System.out.println("*********");
	    System.out.println("Substring "+str.substring(12));
	    System.out.println("*********");
	    System.out.println();
	    System.out.println("Substring "+str.substring(3, 11));	 
	    System.out.println("*********");
	    System.out.println();
	    
	    System.out.println("trim");
	    //Eliminar los espacios en blanco de los extremos
 	    str="  12  ";
 	    System.out.println("*********");
	    System.out.println("string original--------------->" + str + "<");
	    System.out.println("string sin espacios en blanco->" + str.trim() + "<");
	    System.out.println("*********");
	    System.out.println();
	    
	    System.out.println("valueOf");
	    //Convertir un numero en string
        int valor=24;
        str=String.valueOf(valor);
	    System.out.println("numero --> string "+str);
	   
	    //Convertir un string en numero
	    str="  12 ";
	    System.out.println();
	    System.out.println("*********");
	    int numeroInt = Integer.valueOf(str.trim());    
	    System.out.println("string --> numero " + numeroInt);
	    
	    System.out.println("parseInt");
	    // Otra forma de conventir un String en int
	    numeroInt = Integer.parseInt(str.trim());
	    System.out.println("string --> numero (con Trim())" + numeroInt);
	    // numeroInt = Integer.parseInt(str);
	    // System.out.println("string --> numero (sin Trim())" + numeroInt); da error
       
	    str=" 12.35 ";
	    double numeroDouble = Double.valueOf(str);
	    System.out.println("string --> numero "+numeroDouble);
	    
	    numeroDouble = Double.parseDouble(str);
	    System.out.println("string --> numero "+numeroDouble);
	    System.out.println("*********");
	    System.out.println();
	    
	    System.out.println("*********");
	    // Concatenar cadenas
	    System.out.println("concatenar con +");
	    System.out.println();
	    String nombre="Juan ";
		nombre+="Garcia";
		System.out.println(nombre);
		System.out.println();
		
		System.out.println("*********");
		System.out.println("concat");
		System.out.println();
		System.out.println(nombre.concat(" Lopez"));
		
		System.out.println(nombre);
		System.out.println();
		
		System.out.println("*********");
		
		System.out.println("contains");
		System.out.println();
		System.out.println(nombre.contains(" Garcia"));
		 System.out.println("*********");
		
	}
}
