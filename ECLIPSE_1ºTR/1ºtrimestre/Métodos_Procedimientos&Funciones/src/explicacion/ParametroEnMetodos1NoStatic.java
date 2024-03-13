package Explicacion;

public class ParametroEnMetodos1NoStatic {
static int miGlobal=19;

	public static void main(String[] args) {		
	
		ParametroEnMetodos1NoStatic obj= new ParametroEnMetodos1NoStatic();
		
		obj.modificarGlobal1(miGlobal);
		System.out.println("Valor de miGlobal tras modificarGlobal1 " + miGlobal);
		System.out.println();
		obj.modificarGlobal2();
		System.out.println("Valor de miGlobal tras modificarGlobal2 " + miGlobal);
		System.out.println();
		
		int p=9;
		// 		
		obj.modificar1(p);
		System.out.println("Valor de p tras modificar1 " + p);
		System.out.println();
		
		p=obj.modificar2(p);
		System.out.println("Valor de p tras modificar2 " + p);
		System.out.println();
		
		int [] array= {9, 4};
		int [] arrayDoble;
		// 		
		obj.modificarA1(array);		
		System.out.println("Valor de array tras modificarA1 " + array);
		obj.escribirArray(array);
		System.out.println();
		System.out.println();
		
		arrayDoble=obj.crearArrayDoble(array);		
		System.out.println("Valor de array tras crearArrayDoble " + array);
		obj.escribirArray(array);
		obj.escribirArray(arrayDoble);
	}
	
	public void modificarGlobal1(int v){
		System.out.println("Valor de v dentro del metodo antes de mod " + v);		
		v += 100;
		System.out.println("Valor de v dentro del metodo despues de mod " + v);		
	}
	
	public void modificarGlobal2(){
		System.out.println("Valor de miGlobal dentro del metodo antes de mod " + miGlobal);		
		miGlobal += 100;
		System.out.println("Valor de miGlobal dentro del metodo despues de mod " + miGlobal);		
	}
	
	/*  Comprobacion de que una variable int que se modifica en un metodo no se modifica, 
	  * sino que solo se modifica su copia
    */
	public void modificar1(int v){
		System.out.println("Valor de v dentro del metodo antes " + v);
		v += 100;
		System.out.println("Valor de v dentro del metodo despues " + v);		
	}

	public int modificar2(int v){
		System.out.println("Valor de v dentro del metodo antes " + v);
		v += 100;
		System.out.println("Valor de v dentro del metodo despues " + v);	
		return v;
	}
	
	public void modificarA1(int [] v){
		System.out.println("Valor de v dentro del metodo antes " + v);
		for (int i=0; i < v.length;i++)
			v[i] += 100;
		System.out.println("Valor de v dentro del metodo despues " + v);		
	}

	public int[] crearArrayDoble(int [] v){
		int[] doble = new int[v.length];
		
		System.out.println("Valor de v dentro del metodo " + v);
		for (int i=0; i < v.length;i++)
			doble[i] = v[i]*2;
		System.out.println("Valor de doble dentro del metodo " + doble);
		
		return doble;
	}

	public void escribirArray(int[] a){
    	for(int i=0;i<a.length;i++){
    		System.out.print(a[i]+" "); 		
    	}
    }
}