package datainputstream;

import java.io.*;

public class Binarios2_0 {
	public static void main(String args[]) {
		int nm;
		double nota;
		FileInputStream fis = null;
		DataInputStream dis = null;
		final String FICHERO = "notas.dat";

		try {
			dis = new DataInputStream(new FileInputStream(FICHERO));

			System.out.println("  NMAT   Nota");
			try {
				while (true) {
					nm = dis.readInt();
					nota = dis.readDouble();
					// System.out.printf("%6d %7.2f \n", nm, nota);
					System.out.println(String.format("%6d %7.2f", nm, nota));
					// 7 es el num total de digitos incluyendo decimales
				}
			} catch (EOFException ex) {
				System.out.println("FINAL DE FICHERO " + ex.getMessage());
				// Este mensaje de error no se debe mostrar,
			}
		} catch (IOException ex) {
			System.out.println("Error: " + ex.getMessage());
		} catch (Exception ex) {
			System.out.println("Error: " + ex.getMessage());
		} finally {
			if (dis != null)
				try {
					dis.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			if (fis != null)
				try {
					fis.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		}
	}
}
