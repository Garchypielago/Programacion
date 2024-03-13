package Tema2;

public class ejemplos {

	public static void main(String[] args) {			//nicializa los parametro con el bloque static
		Bloque bloque1 = new Bloque();
		System.out.println("Valor de a= " + Bloque.a);
		System.out.println("Valor de a= " + Bloque.b);
		
		Bloque bloque2 = new Bloque();					//cuando ejecutamos este no vuelve a ejcutar el bloque static ya que se ha iniciado antes
		System.out.println("Valor de a= " + Bloque.a);
		System.out.println("Valor de a= " + Bloque.b);
	}

}


