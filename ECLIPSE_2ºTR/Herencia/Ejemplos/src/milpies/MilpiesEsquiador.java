package milpies;

public class MilpiesEsquiador extends Milpies {
	protected int piesRotos;
	
	public MilpiesEsquiador(){
		piesRotos = 100;
		escribePies();
		// Ademas de llamar aqui a su propio constructor, llamara al constructor de MilPies
		// Se esta llamando con un objeto de tipo MilPiesEsquiador, que tiene el metodo reescrito
		// aunque sea el constructor de Milpies, se invoca el metodo escribePies de MilpiesEsquiador
		// Como se ejecuta como primer metodo del constructor, piesRotos no tiene el valor 100, sino 0
	}
	public void escribePies(){
		System.out.println("A un Milpies esquiador le quedan " + (numeroDePies-piesRotos)+" pies");
	}
} 

