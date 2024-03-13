package ejercicio2;

public class Ej_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String texto = "La magia y la fantasia son el sustento principal de la imaginacion de los peques";
		char letra, car;
		letra='a';
		car='*';
		
		System.out.println("El numero de veces que aparece en el texto la letra es " + sustituirLetra(texto, letra, car));
	}

	public static int sustituirLetra(String texto, char letra, char car) {
		int num = 0;
		String Sletra = Character.toString(letra);
		String Scar = Character.toString(car);

		for (int i = 0; i < texto.length(); i++) {
			if (texto.contains(Sletra)) {
				num++;
				texto = texto.replaceFirst(Sletra, Scar);
			}
		}
		System.out.println(texto + "\n");

		return num;
	}

}
