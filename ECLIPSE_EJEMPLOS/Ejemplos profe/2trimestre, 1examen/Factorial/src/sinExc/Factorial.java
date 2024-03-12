package sinExc;


public class Factorial {
	
	public static double factorial (int numero){
    	System.out.println ("Empezamos factorial de " + numero);
    	
    	if(numero<0) {
    		System.out.println ("No se puede calcular el factorial de un numero negativo");
    		return -1;	
    	}
    	else if (numero == 0){
    		System.out.println ("El factorial de " + numero + " es: " + 1);
    		return 1;
    	}    	
    	else{ 
    		return numero * factorial(numero-1);
    	} 
   	}
	
	public static void main(String[] args)  {

		double resultado=0;
				
		resultado = factorial(-5);
		
		if (resultado != -1)
			System.out.println ("El resultado es " + resultado);
		}

	}

