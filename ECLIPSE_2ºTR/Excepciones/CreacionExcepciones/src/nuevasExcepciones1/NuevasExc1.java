package nuevasExcepciones1;

class Limites extends Exception {}
class DemasiadoCalor extends Limites {}
class DemasiadoCansado extends Limites {}
// Solo tenemos constructores por defecto

public class NuevasExc1 {
	// El metodo lanza trata las excepciones
	public void lanza(){
		int temp=41, dormir=5;
		
		try {
			 // Si se captura esta, se va al bloque catch y la otra no se captura
	        if( temp > 40 ) {
	        	System.out.println("Se lanza demasiado calor");
	        	throw( new DemasiadoCalor() );
	        }
	            	    	   
	        if( dormir < 8 ) {
	        	System.out.println("Se lanza demasiado Cansado");
	        	throw( new DemasiadoCansado() );
	        }
	        
	        //return; // Incluso si hacemos return pasa por finally
	            
	    } catch( Limites lim ) {
	        if( lim instanceof DemasiadoCalor )
	            {
	            	System.out.println( "Capturada excesivo calor!" );
	            }
	        if( lim instanceof DemasiadoCansado )
	            {
	            	System.out.println( "Capturada excesivo cansancio!" );
	            }
	    } finally {
	    	System.out.println( "En la clausula finally " );		
	    }
	        	
	}
	
	public static void main(String args[]){	
		NuevasExc1 nuevas = new NuevasExc1();
		nuevas.lanza();	
	}
}

