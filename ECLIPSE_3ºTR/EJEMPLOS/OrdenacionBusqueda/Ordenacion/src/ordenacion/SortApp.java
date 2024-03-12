package ordenacion;
import java.util.Arrays;
import java.util.Collections; 

public class SortApp {

	public static void main(String[] args) {

		final int TAMANIO=10;
		
		int lista[]=new int [TAMANIO];
		rellenarArray(lista);

		String lista_String[]={"americano", "Zagal", "pedro", "Tocado", "coz"};

		System.out.println("Array de numeros sin ordenar:");
		imprimirArray(lista);

		//ordenamos el array
		Arrays.sort(lista);

		System.out.println("Array de numeros ordenado:");
		imprimirArray(lista);

		System.out.println("Array de String sin ordenar:");
		imprimirArray(lista_String);

		//ordenamos el array, ordenara primero las mayusculas y luego las minusculas
		Arrays.sort(lista_String);

		System.out.println("Array de String ordenado:");
		imprimirArray(lista_String);
		
		/*****************************************/
		/*  Para imprimir en orden descendente:  */
		/*****************************************/
		
		System.out.println("Ahora ordenando descendentemente:");
		
		Integer [] numeros = {3, 5, 1, 2, 1, 7, 0, -1};
		Arrays.sort(numeros, Collections.reverseOrder());
		for (int n : numeros) {
			System.out.println(n);
		}
		
		// Tened en cuenta que primero van las min�sculas y luego las may�sculas
		
		//Arrays.sort(lista_String, Collections.reverseOrder());
		Arrays.sort(lista_String, String.CASE_INSENSITIVE_ORDER);
		// Descendente e ignorando caso???
		for(String s : lista_String)
	     	System.out.println(s);
	}

	public static void imprimirArray (int lista[]){
		for(int i=0;i<lista.length;i++){
			System.out.println(lista[i]);
		}
	}

	public static void imprimirArray (String lista[]){
		for(int i=0;i<lista.length;i++){
			System.out.println(lista[i]);
		}
	}

	public static void rellenarArray (int lista[]){
		for(int i=0;i<lista.length;i++){
			lista[i]=numeroAleatorio();
		}
	}

	private static int numeroAleatorio (){
		return ((int)Math.floor(Math.random()*1000));
	}
}

