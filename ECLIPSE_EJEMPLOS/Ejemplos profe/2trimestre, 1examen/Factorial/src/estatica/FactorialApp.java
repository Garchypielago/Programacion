<<<<<<< HEAD
package estatica;

public class FactorialApp {

	public static double factorial (int numero) throws FactorialNegExc{
    	System.out.println ("Empezamos factorial de " + numero);
    	if(numero<0)
			throw new FactorialNegExc("No se puede calcular el factorial de un numero negativo");
    	else if (numero == 0){
    		return 1;
    	}    	
    	else{ 
    		return numero * factorial(numero-1);
    	} 
   	}
	
	public static void main(String[] args)  {

		double resultado=0;
		
		try {
			resultado = factorial(-5);
		}
		catch (FactorialNegExc ex) {
			System.out.println ("NumeroNegativoException " + ex.getMessage());
		}
		catch (Exception ex) {
			System.out.println (ex.getMessage());
		}
		finally {
			if (resultado != 0) System.out.println ("El resultado es " + resultado);
		}

	}

}

=======
package estatica;

public class FactorialApp {

	public static double factorial (int numero) throws FactorialNegExc{
    	System.out.println ("Empezamos factorial de " + numero);
    	if(numero<0)
			throw new FactorialNegExc("No se puede calcular el factorial de un numero negativo");
    	else if (numero == 0){
    		return 1;
    	}    	
    	else{ 
    		return numero * factorial(numero-1);
    	} 
   	}
	
	public static void main(String[] args)  {

		double resultado=0;
		
		try {
			resultado = factorial(-5);
		}
		catch (FactorialNegExc ex) {
			System.out.println ("NumeroNegativoException " + ex.getMessage());
		}
		catch (Exception ex) {
			System.out.println (ex.getMessage());
		}
		finally {
			if (resultado != 0) System.out.println ("El resultado es " + resultado);
		}

	}

}

>>>>>>> cd9c84d5df7ff962d8ba5fa320e6bfc7b852a830
