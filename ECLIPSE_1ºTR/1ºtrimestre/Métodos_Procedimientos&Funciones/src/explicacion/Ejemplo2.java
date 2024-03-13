package Explicacion;

public class Ejemplo2 {

	public static void main(String[] args) {
		
	    System.out.println(" Primer ejemplo");
	    
	    Ejemplo2.subrayar();  
	    
	    System.out.println(" Segundo ejemplo");
	    
	    subrayar();
	    
	    System.out.println(" Tercer ejemplo");
		 
	    subrayar();

	}
	
	 static void subrayar() {
			 
	    for (int x = 1; x < 20; x++) {
	    	System.out.print(" -");
	    }
	    System.out.println();  
	}
		
	}

