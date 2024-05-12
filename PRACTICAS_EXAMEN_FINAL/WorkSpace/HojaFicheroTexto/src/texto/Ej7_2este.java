package texto;

import java.io.*;

public class Ej7_2este {
	public static void main(String[] args) {
		final String FICHERO = "nombres.txt";

		double[] resultado = calcularLonMedia(FICHERO);
		System.out.println(resultado[0] + " " + resultado[1]);

	}
	
	public static double[] calcularLonMedia(String fichero) {
		String nom;
		double sumNom = 0, sumApel = 0;
		double[] res= new double[2];
		int cont = 0;
		
		try (BufferedReader br = new BufferedReader(new FileReader(fichero))) {
			while ((nom = br.readLine()) != null) {
				String nombApell[] = nom.split(" ");
				sumNom = sumNom + nombApell[0].length();
				sumApel = sumApel + nombApell[1].length();
				cont++;
			}
			res[0] = sumNom / cont;
			res[1] = sumApel / cont;
		} catch (Exception e) {
			System.out.println("ERROR DE LECTURA " + e);
		}
		return res;
	}

	// Merece la pena hacer dos metodos distintos para nombre y apellido ?
	
//	public static void calcularLonMedia(String fichero) {
//		String nom;
//		double sumNom = 0, sumApel = 0;
//		int cont = 0;
//		
//		try (BufferedReader br = new BufferedReader(new FileReader(fichero))) {
//			while ((nom = br.readLine()) != null) {
//				String nombApell[] = nom.split(" ");
//				sumNom = sumNom + nombApell[0].length();
//				sumApel = sumApel + nombApell[1].length();
//				System.out.println(nombApell[0] + " longitud " + nombApell[0].length());
//				System.out.println(nombApell[1] + " longitud " + nombApell[1].length());
//				cont++;
//			}
//			System.out.println("La longitud media de nombres es " + sumNom / cont);
//			System.out.println("La longitud media de apellidos es " + sumApel / cont);
//		} catch (Exception e) {
//			System.out.println("ERROR DE LECTURA " + e);
//		}
//	}
	
}
