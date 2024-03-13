import java.util.*;

// Importamos el paquete java.util entero
// En este caso tenemos el problema de que podríamos crear una clase propia que 
// tuviera el mismo nombre que una del paquete importado y cogería la local.
public class AccesoPaquete3{
	public static void main(String args[]){
		// Se crea el objeto
		Random generadorNumeros = new Random();
		// Se genera e imprime el numero
		System.out.println(generadorNumeros.nextInt(1000));
	}
}