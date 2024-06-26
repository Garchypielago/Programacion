package nuevasExcepciones2;

class Limites extends Exception {}
class DemasiadoCalor extends Limites {}
class DemasiadoCansado extends Limites {}
//Solo tenemos constructores por defecto

public class NuevasExc2 {
	// El metodo lanza ahora no trata las excepciones
	public void lanza() throws Limites{
		int temp=41, dormir=7;
		
	        if( temp > 40 )
	            throw( new DemasiadoCalor() );
	            // Si se lanza Calor, la otra ya no se lanza 
	        if( dormir < 8 ) {
	           	throw( new DemasiadoCansado() );
	        }	            
	}
	
	public static void main(String args[]) {
		
		NuevasExc2 nuevas = new NuevasExc2();

		// Se tratan las excepciones en el metodo que llama al metodo que las lanza
		try {
			nuevas.lanza();// Puede lanzar una excepcion
		} catch( Limites lim ) {
			if( lim instanceof DemasiadoCalor )
	            {
	            	System.out.println( "Capturada excesivo calor!" );      
	            }
	        if( lim instanceof DemasiadoCansado )
	            {
	            	System.out.println( "Capturada excesivo cansancio!" );
	            }	
		}	
	}
}
    
