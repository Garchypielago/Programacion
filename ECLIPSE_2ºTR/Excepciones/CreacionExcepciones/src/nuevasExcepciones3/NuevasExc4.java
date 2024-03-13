package nuevasExcepciones3;

import java.util.Scanner;
public class NuevasExc4 {
	
	//En este caso ya creamos constructores con par�metro
	public void lanza(int temp, int dormir) throws Limites {
		
	        if( temp > 40 )
	            throw( new DemasiadoCalor("Demasiado Calor") );
	            // Si se lanza esta, la otra ya no se lanza 
	        if( dormir < 8 ) {
	        	throw( new DemasiadoCansado("Demasiado Cansancio") );
	        }           
	}
	
	public static void main(String args[]) {
		
		NuevasExc4 nuevas = new NuevasExc4();

		Scanner lector = new Scanner(System.in);
		
		System.out.print("Introduce la temperatura: ");
		int temperatura = Integer.parseInt(lector.nextLine());
		System.out.print("Introduce las horas que has dormido: ");
		int horas =  Integer.parseInt(lector.nextLine());
		
		lector.close();

		try {
			nuevas.lanza(temperatura, horas);// Puede lanzar una excepcion
		} 
//		catch( Limites lim ) {
//	        System.out.println( lim.getMessage() );  	
//		}
		
	// Tambien se podria poner a partir de la version 8 de java:
		catch ( DemasiadoCansado | DemasiadoCalor lim ) {
	        System.out.println( lim.getMessage() );  
		}
		catch(Limites l) {
			
		}
		
	}
}
    
