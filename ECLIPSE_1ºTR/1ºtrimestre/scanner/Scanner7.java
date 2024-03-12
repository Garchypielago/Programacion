package scanner;
import java.util.Scanner;

public class Scanner7 {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println(readInt("Introduzca numero entre 20 y 30", 20, 30, scan)); 
	}

	public static int readInt(String prompt, int min, int max, Scanner sc) {

		int number = 0;

		// Run once and loop until the input is within the specified range.
		do {
			// Print users message.
			System.out.printf("\n%s > ", prompt);

			// Prevent string input crashing the program.
			while (!sc.hasNextInt()) {
				System.out.printf("Input doesn't match specifications. Try again.");
				System.out.printf("\n%s > ", prompt);
				sc.next(); 
				// Recoge del buffer hasta el siguiente espacio en blanco si no habia un int en el buffer almacenado
			}

			// Set the number.
			number = sc.nextInt();

			// If the number is outside range print an error message.
			if (number < min || number > max)
				System.out.printf("Input doesn't match specifications. Try again.");

		} while (number < min || number > max);

		return number;
	}

}
