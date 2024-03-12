package ejemplos1;

public class AsignacionVariables {

	public static void main(String[] args) {
		int a=5, b=0,c;
		
		b = a*3;  //El valor de b se ha modificado a 15
		c = a;	//Se guarda en c qu el valor de a es 5
		a = a+6;	//Se suma 6 al valor que tenía a
		//ahora c es 11
		b = a - c;	//b guarda 11-5, luego vale 6
		
		System.out.println("La variable a contiene: " + a);
		System.out.println("La variable b contiene: " + b);
		System.out.println("La variable c contiene: " + c);
		
	}

}
