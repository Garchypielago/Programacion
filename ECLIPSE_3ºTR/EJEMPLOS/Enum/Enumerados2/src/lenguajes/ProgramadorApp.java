package lenguajes;
public class ProgramadorApp {
 
	private static final int N_PROGRAMADORES = 3;

	public static void main(String[] args) {
		 
        //Array de Programadores
        Programador programadores[]=new Programador[N_PROGRAMADORES];
        programadores[0]=new Programador("Fernando", 23, Lenguajes.JAVA);
        programadores[1]=new Programador("Alberto", 27, Lenguajes.PHP);
        programadores[2]=new Programador("Sergio", 30, Lenguajes.PYTHON);
 
        int cuentaAniosAprendizaje=0;
 
        for(int i=0;i<programadores.length;i++) {
            //Invoco el lenguaje de programacion y a partir de este, el numero de anios de aprendizaje
            cuentaAniosAprendizaje += programadores[i].getExpertoEn().getAniosAprendizaje();
        }
 
        System.out.println("La suma de los anios de aprendizaje de los programadores es de "+cuentaAniosAprendizaje);
    }
 
}