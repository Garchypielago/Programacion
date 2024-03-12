package comparacion;

public class Comparacion{
	
	public static void main(String[] args){
		//Integer num = new Integer(6);
		Integer num = 6;
		String cadena = "Adios";
		//String cadena = "adios";
		int resul = num.compareTo(10);
		
		if (resul == 0)
			System.out.println("Son iguales");
		else if (resul > 0)
			System.out.println("num es mayor");
		else
			System.out.println("num es menor");
		
		resul = cadena.compareTo("Hola");
		
		if (resul == 0)
			System.out.println("Son iguales");
		else if (resul > 0)
			System.out.println(cadena + " es mayor");
		else
			System.out.println(cadena + " es menor");
				
	}
}
