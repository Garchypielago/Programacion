package genericas;

public class Main
{
	public static void main(String[] args)
	{
		ClaseGenerica2<Integer> claseGenericaInteger = new ClaseGenerica2<Integer>(1,2);
		System.out.println("Valor del atributo A:" + claseGenericaInteger.getA());
		System.out.println("Valor del atributo B:" + claseGenericaInteger.getB());
		claseGenericaInteger.intercambiaAB();
		System.out.println("Valor del atributo A:" + claseGenericaInteger.getA());
		System.out.println("Valor del atributo B:" + claseGenericaInteger.getB());
		
		ClaseGenerica2<String> claseGenericaString = new ClaseGenerica2<String>("uno","dos");
		System.out.println("Valor del atributo A:" + claseGenericaString.getA());
		System.out.println("Valor del atributo B:" + claseGenericaString.getB());
		claseGenericaString.intercambiaAB();
		System.out.println("Valor del atributo A:" + claseGenericaString.getA());
		System.out.println("Valor del atributo B:" + claseGenericaString.getB());
		
	}

}
