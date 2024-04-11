package texto;

import java.io.*;

public class Ej6_2este {
	public static void main(String[] args) {

		final String FICHERO = "nombres.txt";

		calcularLonMedia(FICHERO);
	}

	public static void calcularLonMedia(String fichero) {
		String nom;
		double sum = 0;
		int cont = 0;

		try (BufferedReader br = new BufferedReader(new FileReader(fichero))) {

			// while((nom=br.readLine())!=null){
			while (br.ready()) { // otra forma, usando el metodo ready
				nom = br.readLine();
				sum = sum + nom.length();
				System.out.println(nom + " longitud " + nom.length());
				cont++;
			}

			System.out.println("La longitud media es " + sum / cont);
		} catch (Exception e) {
			System.out.println("ERROR DE LECTURA");
		}
	}
}
