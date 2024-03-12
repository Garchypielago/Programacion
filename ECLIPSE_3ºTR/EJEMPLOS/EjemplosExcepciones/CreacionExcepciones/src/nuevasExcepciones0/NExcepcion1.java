<<<<<<< HEAD
package nuevasExcepciones0;  

public class NExcepcion1 {  

     public static void main(String[] args) {  
          try {
               throw new Exception("Mi nueva excepcion");
          }
          catch(Exception e){  
               System.out.println( "Dentro de catch");
               System.out.println( "e.getMessage(): " + e.getMessage());
               System.out.println( "e.toString(): " + e.toString());
               System.out.println( "e.printStackTrace():");
               e.printStackTrace();
          }
     }
}
=======
package nuevasExcepciones0;  

public class NExcepcion1 {  

     public static void main(String[] args) {  
          try {
               throw new Exception("Mi nueva excepcion");
          }
          catch(Exception e){  
               System.out.println( "Dentro de catch");
               System.out.println( "e.getMessage(): " + e.getMessage());
               System.out.println( "e.toString(): " + e.toString());
               System.out.println( "e.printStackTrace():");
               e.printStackTrace();
          }
     }
}
>>>>>>> cd9c84d5df7ff962d8ba5fa320e6bfc7b852a830
