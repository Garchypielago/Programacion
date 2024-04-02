package datainputstream;
import java.io.*;
public class Binarios2_2 {
	public static void main(String args[]) {
		int nm;
		double nota;
		final String FICHERO = "notas.dat";

		try (DataInputStream dis = new DataInputStream(
				new FileInputStream(FICHERO))) {
			System.out.println("  NMAT   Nota");

			while (dis.available() > 0) { // Asi no llegamos a leer el eof
				nm = dis.readInt();
				nota = dis.readDouble();
				// System.out.printf("%6d %5.1f \n", nm, nota);
				System.out.println(String.format("%6d %5.1f", nm, nota));
			}
		} catch (IOException ex) {
			System.out.println("Error: " + ex.getMessage());
		} catch (Exception ex) {
			System.out.println("Error: " + ex.getMessage());
		}
	}
}
