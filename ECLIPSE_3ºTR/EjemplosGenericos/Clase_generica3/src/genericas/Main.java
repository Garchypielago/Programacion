package genericas;

public class Main
{
	public static void main(String[] args)
	{
		ClaseGenerica3<Integer, Double> claseGenericaInteger = new ClaseGenerica3<Integer, Double>(1,2.0);
		System.out.println("claseGenericaInteger:" + claseGenericaInteger);
	
		ClaseGenerica3<String, Character> claseGenericaString = new ClaseGenerica3<String, Character>("uno",'A');
		System.out.println("claseGenericaString:" + claseGenericaString);		
	}

}
