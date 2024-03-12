<<<<<<< HEAD
package ejercicios;
import java.util.Scanner;
public class ejercicio12 {
	
	 public static void main(String[] args) {
		 int año;
		 
		 Scanner sc = new Scanner(System.in);
		 
		 System.out.println("Escribe el año: ");
		 año = Integer.parseInt(sc.nextLine());
		 
		 
		 /*if (año%4==0 && año%100==0 && año%400!=0) {
			 System.out.println("Ese año no es bisiesto");
		 } else {
			 System.out.println("Ese año es bisiesto");
		 }
		 */
		 
		 if ( año%4==0 && año%100!=0 || año%100==0) {
			 System.out.println("Ese año es bisiesto");
		 } else {
			 System.out.println("Ese año no es bisiesto");
		 }
		 
		 
		 sc.close();
		 
	 }
}
=======
package ejercicios;
import java.util.Scanner;
public class ejercicio12 {
	
	 public static void main(String[] args) {
		 int año;
		 
		 Scanner sc = new Scanner(System.in);
		 
		 System.out.println("Escribe el año: ");
		 año = Integer.parseInt(sc.nextLine());
		 
		 
		 /*if (año%4==0 && año%100==0 && año%400!=0) {
			 System.out.println("Ese año no es bisiesto");
		 } else {
			 System.out.println("Ese año es bisiesto");
		 }
		 */
		 
		 if ( año%4==0 && año%100!=0 || año%100==0) {
			 System.out.println("Ese año es bisiesto");
		 } else {
			 System.out.println("Ese año no es bisiesto");
		 }
		 
		 
		 sc.close();
		 
	 }
}
>>>>>>> cd9c84d5df7ff962d8ba5fa320e6bfc7b852a830
