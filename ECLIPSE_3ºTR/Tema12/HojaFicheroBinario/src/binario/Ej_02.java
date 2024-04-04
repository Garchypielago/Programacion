package binario;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import javax.swing.*;

import javax.swing.JOptionPane;

public class Ej_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String matricula, marca, modelo;
		double tamdeposito;
		
		final String fichero = "Ej_02.dat";

		
		try (DataOutputStream dos = new DataOutputStream(new FileOutputStream(fichero, true))) {
			
			matricula = JOptionPane.showInputDialog("Matricula: ");
			dos.writeUTF(matricula);
			marca = JOptionPane.showInputDialog("Marca: ");
			dos.writeUTF(marca);
			modelo = JOptionPane.showInputDialog("Modelo: ");
			dos.writeUTF(modelo);
			tamdeposito = Double.parseDouble(JOptionPane.showInputDialog("L de depósito: "));
			dos.writeDouble(tamdeposito);

		} catch (IOException ex) {
			System.out.println("Error de entrada/salida: " + ex.getMessage());
		} catch (Exception ex) {
			System.out.println("Error: " + ex.getMessage());
		}
		
		
		try (DataInputStream dis = new DataInputStream(new FileInputStream(fichero))) {
			try {
				System.out.println(String.format("%-10s %-10s %-10s %5s", "Matricula", "Marca", "Modelo", "L Deposito")); 
				
				while (true) {
					matricula=dis.readUTF();
					marca=dis.readUTF();
					modelo=dis.readUTF();
					tamdeposito=dis.readDouble();
					
					System.out.println(String.format("%-10s %-10s %-10s %5f", matricula, marca, modelo, tamdeposito)); 
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
