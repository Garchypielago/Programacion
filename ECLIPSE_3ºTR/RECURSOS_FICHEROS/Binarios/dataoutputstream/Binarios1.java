package dataoutputstream;
import java.io.*;
import java.util.*;

public class Binarios1 {
	public static void main(String args[]) {
		int nm;
		double nota;
		final String FICHERO = "notas.dat";

		try (Scanner teclado = new Scanner(System.in);
				DataOutputStream dos = new DataOutputStream(new FileOutputStream(FICHERO))) {

			System.out.print("Introduzca un numero de matricula (0 para acabar): ");
			nm = Integer.parseInt(teclado.nextLine());
			
			while (nm != 0) {
				dos.writeInt(nm);
				System.out.print("Introduzca una nota: ");
				nota = Double.parseDouble(teclado.nextLine());
				dos.writeDouble(nota);
				System.out.print("Introduzca un numero de matricula (0 para acabar): ");
				nm = Integer.parseInt(teclado.nextLine());
			}

		} catch (IOException ex) {
			System.out.println("Error: " + ex.getMessage());
		}

	}

}
