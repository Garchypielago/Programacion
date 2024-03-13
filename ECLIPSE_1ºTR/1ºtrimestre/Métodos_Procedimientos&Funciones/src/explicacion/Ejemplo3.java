package Explicacion;
public class Ejemplo3 {

	public static void main(String[] args) {
	    
	    subrayar(" Primer ejemplo", 16);
 
	    subrayar(" Segundo ejemplo", 17); 
		 
	    subrayar(" Tercer ejemplo", 16);
	}
	
	static void subrayar(String texto, int cantidad) {
		System.out.println( texto);
	    for (int x = 1; x < cantidad; x++) {
	    	
	    	System.out.print(" -");
	    }
	    System.out.println();  
	}
		
	}

