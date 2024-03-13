package scanner;
import java.util.Scanner;
// Programa Java para leer algunos valores usando la clase Scanner
// e imprimir su media

public class Scanner12 {
	public static void main(String args[]) {
		// Create Scanner object
		Scanner scan = new Scanner("Hello World!");
		// Printing the delimiter used
		System.out.println("Delimiter:" + scan.delimiter());
		// Print the Strings
		while (scan.hasNext()) {
			System.out.println(scan.next());
		}
		// Close the scanner
		scan.close();
	}
//https://www.javatpoint.com/post/java-scanner-hasnext-method
}
