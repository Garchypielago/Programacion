package texto;

import java.io.*;
import java.util.Scanner;

public class Ej1_01 {
	
	public static void main(String[] args) {
	
	new File("/home/garchy/Escritorio/Repositorios/Programacion/ECLIPSE_3ºTR/Ficheros/FicherosTxtoEj").mkdir();
	
	
	}
	public static void crarFichero(String nomFich, Scanner teclado) {
		String frase;
		
		File f = new File(nomFich);
		try(BufferedWriter bw = new BufferedWriter(new FileWriter(f))){
			frase= teclado.nextLine();
			
			while (!frase.equalsIgnoreCase("FIN"));{
				bw.write(frase);
				bw.newLine();
				frase=teclado.nextLine();
			}
			
		}catch(IOException e) {
			System.out.println(e + "ERROR DE CREACION DE FICHERO");
		}catch(Exception e) {
			System.out.println(e);
		}
	}
}
