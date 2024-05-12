package binario;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class Ej_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double cantidad, numero;
		final String FICHERO = "Ej_01.dat";

		try (Scanner teclado = new Scanner(System.in);
				DataOutputStream dos = new DataOutputStream(new FileOutputStream(FICHERO))) {

			System.out.println("Rango de los numeros: ");
			cantidad = Double.parseDouble(teclado.nextLine());

			for (int i = 1; i <= cantidad; i++) {
				numero = (double) ((double) Math.random() * 11);
				dos.writeDouble(numero);
			}

		} catch (IOException ex) {
			System.out.println("Error de entrada/salida: " + ex.getMessage());
		} catch (Exception ex) {
			System.out.println("Error: " + ex.getMessage());
		}

		double readnum;

		try (DataInputStream dis = new DataInputStream(new FileInputStream(FICHERO))) {
			try {
				while (true) {
					readnum = dis.readDouble();
					System.out.println(readnum);
				}
			} catch (EOFException ex) {
				// System.out.println("FINAL DE FICHERO " + ex.getMessage());
				// Este error no se muestra
			} catch (IOException ex) {
				System.out.println("Error: " + ex.getMessage());
			} catch (Exception ex) {
				System.out.println("Error: " + ex.getMessage());
			}
		} catch (IOException ex) {
			System.out.println("Error: " + ex.getMessage());
		}

	}

}
