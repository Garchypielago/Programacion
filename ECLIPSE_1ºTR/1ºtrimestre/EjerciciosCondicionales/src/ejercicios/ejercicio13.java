<<<<<<< HEAD
package ejercicios;
import java.util.Scanner;
public class ejercicio13 {

	public static void main(String[] args) {
		 int dia, mes, year, dias;
		 
		 Scanner sc = new Scanner(System.in);
		 System.out.println("Escribe el dia");
		 dia = Integer.parseInt(sc.nextLine());
		 
		 System.out.println("Escribe el mes");
		 mes = Integer.parseInt(sc.nextLine());
		 
		 System.out.println("Escribe el año");
		 year = Integer.parseInt(sc.nextLine());
		 
		 
		 /*if (year>=0) {
			 
		 } else if ( dia >= 1 && dia<=28 && mes==2) {
			 System.out.println("la fecha es correcta");
		 } else if ( dia >= 1 && dia<=30 && (mes==4|| mes==6|| mes==9|| mes==11) ){
			 System.out.println("la fecha es correcta");
		 } else if ( dia >= 1 && dia<=31 && (mes==1|| mes==3|| mes==5|| mes==7|| mes==8|| mes==10|| mes==12) ) {
			 System.out.println("la fecha es correcta");
		 } else {
			 System.out.println("La fecha es incorrecta");
		 }
		 */
		 
			 switch (mes) {		//el switch lo puedo usar pra modificar una variable dependiendo de otra
			 case 4: 
			 case 6: 
			 case 9: 
			 case 11: dias = 30 ;
			 break; 
			 case 2: dias = 28; 
			 break; 
			 default: dias = 31; 
			 break; 
			 }
			 
			 if (year>=0 && dia>=1 && dia<=dias && mes>=1 && mes<=12) {
				 System.out.println("La fecha es correcta");
			 }	else {
				 System.out.println("La fecha es incorrecta");
			 }
		 
	
	
		 sc.close();
	}
}
=======
package ejercicios;
import java.util.Scanner;
public class ejercicio13 {

	public static void main(String[] args) {
		 int dia, mes, year, dias;
		 
		 Scanner sc = new Scanner(System.in);
		 System.out.println("Escribe el dia");
		 dia = Integer.parseInt(sc.nextLine());
		 
		 System.out.println("Escribe el mes");
		 mes = Integer.parseInt(sc.nextLine());
		 
		 System.out.println("Escribe el año");
		 year = Integer.parseInt(sc.nextLine());
		 
		 
		 /*if (year>=0) {
			 
		 } else if ( dia >= 1 && dia<=28 && mes==2) {
			 System.out.println("la fecha es correcta");
		 } else if ( dia >= 1 && dia<=30 && (mes==4|| mes==6|| mes==9|| mes==11) ){
			 System.out.println("la fecha es correcta");
		 } else if ( dia >= 1 && dia<=31 && (mes==1|| mes==3|| mes==5|| mes==7|| mes==8|| mes==10|| mes==12) ) {
			 System.out.println("la fecha es correcta");
		 } else {
			 System.out.println("La fecha es incorrecta");
		 }
		 */
		 
			 switch (mes) {		//el switch lo puedo usar pra modificar una variable dependiendo de otra
			 case 4: 
			 case 6: 
			 case 9: 
			 case 11: dias = 30 ;
			 break; 
			 case 2: dias = 28; 
			 break; 
			 default: dias = 31; 
			 break; 
			 }
			 
			 if (year>=0 && dia>=1 && dia<=dias && mes>=1 && mes<=12) {
				 System.out.println("La fecha es correcta");
			 }	else {
				 System.out.println("La fecha es incorrecta");
			 }
		 
	
	
		 sc.close();
	}
}
>>>>>>> cd9c84d5df7ff962d8ba5fa320e6bfc7b852a830
