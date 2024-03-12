package misdoc.rrhh;

public class Contrato{
	private String nombre;
	private int duracionMeses;
	
	public Contrato(String nuevoNombre, int nuevaDuracion){
		nombre = nuevoNombre;
		duracionMeses = nuevaDuracion;
	}
	
	public void imprimirInfo(){
		System.out.print("El contrato esta a nombre de: ");
		System.out.println(nombre);
		System.out.print("Con una duracion de  ");
		System.out.print(duracionMeses);
		System.out.println(" meses. ");		
	}
}