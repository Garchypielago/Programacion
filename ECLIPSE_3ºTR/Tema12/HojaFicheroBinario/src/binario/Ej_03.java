package binario;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import javax.swing.*;

public class Ej_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final String fichero = "datosbeca.bin";
		String nombre, apellido;
		Character genero = 0;
		int edad, suspensos;
		boolean residencia = false;
		double ingresos;

		try (DataOutputStream dos = new DataOutputStream(new FileOutputStream(fichero))) {

			nombre = JOptionPane.showInputDialog("Nombre del alumno");
			dos.writeUTF(nombre);
			apellido = JOptionPane.showInputDialog("Apellido del alumno");
			dos.writeUTF(apellido);
			while (genero!='M' && genero != 'F') {
				genero = JOptionPane.showInputDialog("Genero (M o F)").toCharArray()[0];
			}
			dos.writeChar(genero);
			edad = Integer.parseInt(JOptionPane.showInputDialog("Edad"));
			dos.writeInt(edad);
			suspensos = Integer.parseInt(JOptionPane.showInputDialog("Numero de suspensos (0-4)"));
			dos.writeInt(suspensos);
			if (JOptionPane.showInputDialog("Residendia familiar (S o N)").toUpperCase().equals("S"))
				residencia = true;
			dos.writeBoolean(residencia);
			ingresos = Double.parseDouble(JOptionPane.showInputDialog("Ingresos anuales de la unidad familiar"));
			dos.writeDouble(ingresos);

		} catch (IOException ex) {
			System.out.println("Error de entrada/salida: " + ex.getMessage());
		} catch (Exception ex) {
			System.out.println("Error: " + ex.getMessage());
		}
		
		try (DataInputStream dis = new DataInputStream(new FileInputStream(fichero))) {
			try {
				System.out.println(String.format("%-15s %-15s %-6s %-5s %-10s %-10s", "Nombre", "Apellido", "Genero", "Edad", "Suspensos", "Ingresos")); 
				
				while (true) {
					nombre=dis.readUTF();
					apellido=dis.readUTF();
					genero=dis.readChar();
					edad=dis.readInt();
					suspensos=dis.readInt();
					ingresos=dis.readDouble();
					
					System.out.println(String.format("%-15s %-15s %-6s %-5d %-10d %-10f", nombre, apellido, genero, edad, suspensos, ingresos)); 

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
