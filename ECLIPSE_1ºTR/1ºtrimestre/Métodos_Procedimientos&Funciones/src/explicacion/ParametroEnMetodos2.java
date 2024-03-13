package Explicacion;

public class ParametroEnMetodos2 {

	public static void main(String[] args) {			
		int [] array= {9, 4};
					
		escribirArray(array);
		System.out.println();
		System.out.println();
				
		int [] aDoble;
		aDoble=crearArrayDoble(array);
		System.out.println("Valor de array original " + array);
		System.out.println("Valor de array nuevo tras duplicarlo " + aDoble);
		System.out.println("Contenido del array doblado");
		escribirArray(aDoble);
		System.out.println();
		System.out.println();
		System.out.println("Contenido del array original");
		escribirArray(array);
		
	}
	
	public static int[] crearArrayDoble(int [] v){
		int[] doble = new int[v.length];
		
		System.out.println("Valor de v dentro del metodo " + v);
		for (int i=0; i < v.length;i++)
			doble[i] = v[i]*2;
		System.out.println("Valor de doble dentro del metodo " + doble);
		
		return doble;
	}

	static void escribirArray(int[] a){
    	for(int i=0;i<a.length;i++){
    		System.out.print(a[i]+" "); 		
    	}
    }
}