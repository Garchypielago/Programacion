
public class Ejercicio4 {
	
	public static void main(String[] args) {
		double A = 3, B = 4, C = 2;
		
		System.out.println( ((A * B) < (B + C)) && (A== C) );
		//(12<6) && (3==2) F
		
		double A1 = 2, B1 = 5, C1 = 3, D1 = 5;
		
		System.out.println( ((A1 + B1) > C1) || ((B1 / D1 > B1)) );
		//(7 > 3) || (5/5>5) T || (1>5) T
		
		double A2 = 4, B2 = 2, C2 = 3;
		
		System.out.println( (A2/B2) * C2 + (A2 / B2));
		//2*3 + (2) 8
		
		
		double X = 1, Y = 4, Z = 10, PI = 3.141592, E = 2.718281;
		
		System.out.println( (PI * X*X>Y || 2* PI * X <=Z) );
		/*	3.141592 > 4 | | 2*3.141592 <= 10 				
		 *           F   | |             T     :T 
		 */
		System.out.println( (X>3 && Y==4 || X+Y<=Z) );
		/*	1>3 && 4==4    || 5 <= 10 
		 *   F  &&   T : F ||    T    :T
		*/
		System.out.println( (X>3 && (Y==4 || X+Y<=Z)) );
		/*	1>3 && (4==4 || 1+4<=10)
		 * 	 F  && (  T  ||     T  ):T  ->  F&&T: F
		*/
		System.out.println( (!( Y/2==2*X) && !( Y<PI-E*Z)) );
		/*	!(4/2==2) && !(4<3.141592-27.18281)
		 *  !  ( T )  && !(          F        )-> F && T: F
		*/
		double A3=5, B3=4, C3=3, X3=0.05, Y3=2.3;
		
		System.out.println( (A3==B3%C3) );
		/*	5 == 4%3 : 5 == 1 : F
		 */
		System.out.println( (6/C3 < C3 % 6) );
		/*	6/3 < C%6 : 2 < 3 : T
		 */
		System.out.println( (C3 + B3 - 1 != A3 || B3 >= -B3 * A3 && A3 * A3<=10) );
		/*	3+4–1 != 5 || 4 >= -4*5 && 5*5 <= 10 
		 * 		6 != 5 || 4 >=  -20 && 25  <= 10   
		 *         T   ||     T     &&      F    :  T || F : T
		 *		el operador && tiene prioridad al ||
		 */
		System.out.println( (B3 % A3 / C3) );
		// 4%5 / 3 : 4/3 : 1.33333333
		
		System.out.println( (!(X3 *A3 > Y3/B3)) );
		/*	!(0.05 * 5 > 2.3/4) 
		 * 	!(0.25     > 0.575) : !(F) : T
		 */
		
	}
}
