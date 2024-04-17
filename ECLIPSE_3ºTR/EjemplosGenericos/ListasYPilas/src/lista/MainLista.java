package lista;

public class MainLista {

	public static void main(String[] args) {
		
		Lista l = new Lista();
		
		l.insertarFinal(1);
		l.insertarPrincipio(2);
		l.insertarPrincipio(3);
		l.insertarPrincipio(4);
		l.insertarPrincipio(5);
		l.insertarFinal(6);
		
		System.out.println(l);
	    
		int borrar = 1;
		
		// Borramos por contenido
		if (l.borrar(borrar))
	    	System.out.println("Borrado");
	    else
	    	System.out.println("No borrado");
	   
		System.out.println(l);
		
	    l.insertarFinal(7);
	    l.insertarFinal(8);
	    
	    System.out.println(l);
	    
	    //borrar = 3;
	    
	    if (l.borrar(borrar))
	    	System.out.println("Borrado");
	    else
	    	System.out.println("No borrado");
		
	    System.out.println(l);
	}

}
