<<<<<<< HEAD
package formateo;
import java.util.Formatter;
import java.util.Locale;

public class FormatterDemo {
	public static void main( String[] args)
	{	
		// Con String.format():
		String saludo = String.format(
				  "Hola amigos, bienvenidos a %s !", "Madrid");		
		System.out.println(saludo);
		
		saludo = String.format(
				  "Hola %2$s, bienvenidos  %1$s !", 
				  "Madrid", 
				  "chicos");
		System.out.println(saludo);
		
		System.out.println(String.format(Locale.GERMAN, "%,d", 1234567890));
		
		// Con Formatter:
		int numero = 425;
		
		Formatter fmtr = new Formatter();
		
		fmtr.format("%08d", numero);
		System.out.println("El numero formateado " + fmtr);
		
		Object result = fmtr.format("%1$4d - el a�o %2$4.2f", 1951, Math.PI);
		System.out.println(result);
		
		// Otra forma de hacerlo
		System.out.format("%1$04d - el a�o %2$4.2f%n", 1951, Math.PI);
		
		fmtr.close();
				
		// Con el printf que ya vimos:
		System.out.printf("%1$04d - el a�o %2$4.2f%n", 1951, Math.PI);
		System.out.printf("PI es mas o menos %1$4.2f%n", Math.PI);
		System.out.printf("Tu nombre es %1$s y el mio es %2$s%n", "Juan", "Pepi");				
	}
=======
package formateo;
import java.util.Formatter;
import java.util.Locale;

public class FormatterDemo {
	public static void main( String[] args)
	{	
		// Con String.format():
		String saludo = String.format(
				  "Hola amigos, bienvenidos a %s !", "Madrid");		
		System.out.println(saludo);
		
		saludo = String.format(
				  "Hola %2$s, bienvenidos  %1$s !", 
				  "Madrid", 
				  "chicos");
		System.out.println(saludo);
		
		System.out.println(String.format(Locale.GERMAN, "%,d", 1234567890));
		
		// Con Formatter:
		int numero = 425;
		
		Formatter fmtr = new Formatter();
		
		fmtr.format("%08d", numero);
		System.out.println("El numero formateado " + fmtr);
		
		Object result = fmtr.format("%1$4d - el a�o %2$4.2f", 1951, Math.PI);
		System.out.println(result);
		
		// Otra forma de hacerlo
		System.out.format("%1$04d - el a�o %2$4.2f%n", 1951, Math.PI);
		
		fmtr.close();
				
		// Con el printf que ya vimos:
		System.out.printf("%1$04d - el a�o %2$4.2f%n", 1951, Math.PI);
		System.out.printf("PI es mas o menos %1$4.2f%n", Math.PI);
		System.out.printf("Tu nombre es %1$s y el mio es %2$s%n", "Juan", "Pepi");				
	}
>>>>>>> cd9c84d5df7ff962d8ba5fa320e6bfc7b852a830
}