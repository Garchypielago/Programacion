package aleatorios;
import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class PruebaAleatorios1 {
	public static Scanner teclado;
		
    public static void main(String[] ARGUMENTOS)
    {
    	teclado = new Scanner(System.in);
        int n, lim, lim1, lim2;
        
        System.out.println(" Introduce la cantidad de n�meros a generar ");
        n = leer_numero();
        System.out.println(" Introduce el l�mite superior ");
        lim = leer_numero();
        generarAleatorio(n, lim);
        
        System.out.println(" Introduce la cantidad de n�meros a generar en un rango");
        n = leer_numero();
        System.out.println(" Introduce el l�mite inferior ");
        lim1 = leer_numero();
        System.out.println(" Introduce el l�mite superior ");
        lim2 = leer_numero();
        
        generarAleatorio(n, lim1, lim2);              
    }
    
    
    public static int leer_numero()
    {
        int numero;
 
        numero = teclado.nextInt();
 
        return numero;
    }
    
    // Genera de 1 a limite
    public static void generarAleatorio(int num, int limite)
    {       
    	for(int i=1;i<=num;i++)
    		System.out.println( (int)(Math.random()*limite+1));  	        
    }
    
    /*
     *  Probamos varias de las formas en que se puede hacer:
     */
    public static void generarAleatorio(int num, int limite1, int limite2)
    {       
        System.out.println("\nForma 1\n");
    	for(int i=1;i<=num;i++)
    		System.out.print( (int)(Math.random()*(limite2-limite1+1) + limite1 )+ " ");
    	
    	System.out.println();
    	
    	System.out.println("\nForma 2\n");
    	for(int i=1;i<=num;i++) 		
    		System.out.print(Math.floor(Math.random()*(limite2-limite1+1) + limite1 )+ " ");
    		// Muestra decimales con .0, es un double
    	
    	System.out.println();
    	System.out.println("\nForma 3\n");
    	for(int i=1;i<=num;i++)
    		System.out.print(ThreadLocalRandom.current().nextInt(limite1, (limite2+1)) + " ");
    	
    	System.out.println();
    	System.out.println("\nForma 4\n");
    	Random aleatorio = new Random();
    	for(int i=1;i<=num;i++)
    		System.out.print(aleatorio.nextInt((limite2-limite1+1) + limite1 ) + " ");
    	
    	System.out.println();
    	System.out.println("\nForma 5\n");
    	for(int i=1;i<=num;i++)
    		System.out.print( (Math.random()*(limite2-limite1+1) + limite1) + " ");
     	// Muestra decimales, no casteamos y se pasa del limite superior
    }
}
