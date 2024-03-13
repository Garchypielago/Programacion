
public class Ejercicio5 {

	public static void main(String[] args) {
		double x=5;
		
		System.out.println( (x>=1 && x<=10) );
		
		double y=6;
		
		System.out.println( (y>=1 && y<=3 || y>=5 && y<=7) );
		
		double edad=20;
		
		System.out.println( (edad>=18 && edad<=25) );
		
		
		System.out.println( (7==4+3 || 6<2 && 5>=8) );
		/*	7==4+3 || 6<2 && 5>=8
		 *    T    ||  F  &&   F   : T || F : T
		 */
		System.out.println( ((7==4+3 || 6<2) && 5>=8) );
		/*	(7==4+3 || 6<2) && 5>=8
		 *    (T    ||  F)  &&   F   : T || F : F
		 */
	}

}
