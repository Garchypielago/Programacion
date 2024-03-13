package aleatorios;
import java.util.*;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class PruebaAleatorios0 {

		
    public static void main(String[] ARGUMENTOS)
    {
    	Scanner teclado;
    	
    	teclado = new Scanner(System.in);
        int n, lim, lim1, lim2;
        // int 
        
        System.out.println(" Introduce la cantidad de n�meros a generar ");
        n = teclado.nextInt();
        System.out.println(" Introduce el l�mite superior ");
        lim = teclado.nextInt();
        
        System.out.println(" *** Aleatorios generados de 1 a " + lim + " ***");
        for(int i=1; i<=n; i++)
    		System.out.println( (int)(Math.random()*lim+1));  	     
        
        System.out.println(" Introduce la cantidad de n�meros a generar en un rango");
        n = teclado.nextInt();
        System.out.println(" Introduce el l�mite inferior ");
        lim1 = teclado.nextInt();
        System.out.println(" Introduce el l�mite superior ");
        lim2 = teclado.nextInt(); 
        
        System.out.println("\n*** Forma 1 ***\n");
    	for(int i=1;i<=n;i++)
    		System.out.print( (int)(Math.random()*(lim2-lim1+1) + lim1 )+ " ");
    	
    	System.out.println();
    	
    	System.out.println("\n*** Forma 2 ***\n");
    	for(int i=1;i<=n;i++) 		
    		System.out.print(Math.floor(Math.random()*(lim2-lim1+1) + lim1 )+ " ");
    		// Muestra decimales con .0, es un double
    	
    	System.out.println();
    	System.out.println("\n*** Forma 3 ***\n");
    	for(int i=1;i<=n;i++)
    		System.out.print(ThreadLocalRandom.current().nextInt(lim1, (lim2+1)) + " ");
    	
    	System.out.println();
    	System.out.println("\n*** Forma 4 ***\n");
    	Random aleatorio = new Random();
    	for(int i=1;i<=n;i++)
    		System.out.print(aleatorio.nextInt((lim2-lim1+1) + lim1 ) + " ");
    	
    	System.out.println();
    	System.out.println("\n*** Forma 5 ***\n");
    	for(int i=1;i<=n;i++)
    		System.out.print( (Math.random()*(lim2-lim1+1) + lim1) + " ");
     	// Muestra decimales, no casteamos y se pasa del limite superior
    	
    	teclado.close();
    }
       
}
