package musica;
// Ejemplo de implementacion de herencia
public class Musica {
	public static final int NUM_INST = 5;
    
	public static void devolverTipo(Instrumento i) {	
		System.out.println("tipo devuelto " + i.tipo()); 	
    }
    
    public static void tocarYAfinar(Instrumento[] inst) {
    	 // No importa el tipo de Instrumento,
         // seguirá funcionando debido a Polimorfismo:
		for (int i = 0; i < inst.length; i++) {
	    	inst[i].tocar(); //Saldran todas, pues tocar lo tienen todas implementado
	    	inst[i].afinar(); // Solo saldra Guzla, que es la unica que tiene este metodo implementado
		}
	    	
    }
    
    public static void obtTipos(Instrumento[] inst) {
	
		for (int i = 0; i < inst.length; i++)
	    	devolverTipo(inst[i]);	    // Guzla es la unica que no tiene implementado tipo()	
    }

    public static void main(String[] args) {
		Instrumento orquesta []= new Instrumento[NUM_INST]; // uso de polimorfismo
		int i = 0;
		
		orquesta[i++] = new Guitarra();
		orquesta[i++] = new Piano();
		orquesta[i++] = new Saxofon();
		orquesta[i++] = new Guzla();
		orquesta[i++] = new Ukelele();
		
		tocarYAfinar(orquesta);
		
		System.out.println();
		
		// Guzla no tiene tipo() por lo que mostrará guitarra, el tipo de su padre
		obtTipos(orquesta);
			
		System.out.println();
		
		// instanceof me devuelve la clase de cada uno
		for (i=0;i<NUM_INST;i++)
	 	 if (orquesta[i] instanceof Piano)
	 	 	System.out.println("Piano ");
	 	 else if (orquesta[i] instanceof Saxofon)
	 	 	System.out.println("Saxofon ");
	 	 else if (orquesta[i] instanceof Guzla)
	 	 	System.out.println("Guzla ");
	 	 else if (orquesta[i] instanceof Ukelele)
	 	 	System.out.println("Ukelele ");	
	 	 else if (orquesta[i] instanceof Guitarra)
	 	 	System.out.println("Guitarra ");
	 	  
    }	
}
