package Explicacion;
public class Ejemplo4 {

	public static void main(String[] args) {
	    
	    subrayar(" Primer ejemplo ");
 
	    subrayar(" Segundo ejemplo ");    
		 
	    subrayar(" Tercer ejemplo ");
	}
	
	static void subrayar(String texto) {
		System.out.println( texto);
	    for (int x = 1; x <= texto.length(); x++) {    	
	    	System.out.print("-");
	    }
	    System.out.println();  
	}
		
	}
