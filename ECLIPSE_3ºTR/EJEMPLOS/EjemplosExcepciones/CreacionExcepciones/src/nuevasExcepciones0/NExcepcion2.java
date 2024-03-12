<<<<<<< HEAD
package nuevasExcepciones0;  

public class NExcepcion2 {  

     public static void main(String[] args) {  
          try {
               lanzaExcepcion();
          }
          catch(Exception e) {  
               System.out.println( "Dentro de catch");
               // Vemos varias posibilidades
               System.out.println( "\n\ne.getMessage(): " + e.getMessage());
               System.out.println( "\n\ne.toString(): " + e.toString());
               System.out.println( "\n\ne.printStackTrace():"); e.printStackTrace();
          }
     }
     
     public static void lanzaExcepcion() throws Exception {
     	throw new Exception("Mi nueva excepcion");
     }
}
=======
package nuevasExcepciones0;  

public class NExcepcion2 {  

     public static void main(String[] args) {  
          try {
               lanzaExcepcion();
          }
          catch(Exception e) {  
               System.out.println( "Dentro de catch");
               // Vemos varias posibilidades
               System.out.println( "\n\ne.getMessage(): " + e.getMessage());
               System.out.println( "\n\ne.toString(): " + e.toString());
               System.out.println( "\n\ne.printStackTrace():"); e.printStackTrace();
          }
     }
     
     public static void lanzaExcepcion() throws Exception {
     	throw new Exception("Mi nueva excepcion");
     }
}
>>>>>>> cd9c84d5df7ff962d8ba5fa320e6bfc7b852a830
