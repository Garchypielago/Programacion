<<<<<<< HEAD
package nuevasExcepciones0;  

// Como está en el mismo paquete no pongo modificador
// solo una clase puede ser publica en el mismo fichero
class nuevaExcepcion extends Exception {

	private static final long serialVersionUID = 6386963178772120771L;

	public nuevaExcepcion(String mensaje){
		super(mensaje);
	}

}

public class NExcepcion3 {  

     public static void main(String[] args) {  
          try {
               lanzaExcepcion();
          }
          catch(Exception e){               
               System.out.println( "e.getMessage(): " + e.getMessage());
          }
     }
     
     public static void lanzaExcepcion() throws nuevaExcepcion {
    	 // Ahora creamos una excepcion propia en una clase aparte
     	throw new nuevaExcepcion("Mi nueva excepcion en una clase");
     }
}
=======
package nuevasExcepciones0;  

// Como está en el mismo paquete no pongo modificador
// solo una clase puede ser publica en el mismo fichero
class nuevaExcepcion extends Exception {

	private static final long serialVersionUID = 6386963178772120771L;

	public nuevaExcepcion(String mensaje){
		super(mensaje);
	}

}

public class NExcepcion3 {  

     public static void main(String[] args) {  
          try {
               lanzaExcepcion();
          }
          catch(Exception e){               
               System.out.println( "e.getMessage(): " + e.getMessage());
          }
     }
     
     public static void lanzaExcepcion() throws nuevaExcepcion {
    	 // Ahora creamos una excepcion propia en una clase aparte
     	throw new nuevaExcepcion("Mi nueva excepcion en una clase");
     }
}
>>>>>>> cd9c84d5df7ff962d8ba5fa320e6bfc7b852a830
