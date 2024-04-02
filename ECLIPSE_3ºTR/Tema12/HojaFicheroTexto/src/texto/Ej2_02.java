package texto;

import java.io.*;
import java.util.Scanner;

public class Ej2_02 {
	
	
	
	
	
	public static void crearFichero(String nomFich1, String nomFich2) {
		String vocales = "aeiou";
		int c;
		
		try (FileWriter fw = new FileWriter(nomFich2);
				FileReader fr = new FileReader(nomFich1);){
			while((c = fr.read())!= -1) {
				if (vocales.indexOf((char)c)==-1)
					fw.write((char) c);
			}
			
		}catch (Exception e) {
			
		}
	}
	
}
