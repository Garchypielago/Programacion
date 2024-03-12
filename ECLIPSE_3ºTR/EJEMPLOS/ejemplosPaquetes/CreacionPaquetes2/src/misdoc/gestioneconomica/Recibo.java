<<<<<<< HEAD
package misdoc.gestioneconomica;

public class Recibo{
	public String concepto;
	public int dia;
	public int mes;
	public int anio;
	
	public Recibo(String nuevoConcepto, int nuevoDia, int nuevoMes, int nuevoAnio){
		concepto = nuevoConcepto;
		dia = nuevoDia;
		mes = nuevoMes;
		anio = nuevoAnio;
	}
	
	public void imprimirInfo(){
		System.out.println("----RECIBO----");
		System.out.print("Recibo emitido el ");
		System.out.print("El contrato esta a nombre de: ");
		System.out.print(dia);
		System.out.print("-");
		System.out.print(mes);
		System.out.print("-");
		System.out.println(anio);
		System.out.print("Bajo el concepto: ");
		System.out.println(concepto);	
	}
=======
package misdoc.gestioneconomica;

public class Recibo{
	public String concepto;
	public int dia;
	public int mes;
	public int anio;
	
	public Recibo(String nuevoConcepto, int nuevoDia, int nuevoMes, int nuevoAnio){
		concepto = nuevoConcepto;
		dia = nuevoDia;
		mes = nuevoMes;
		anio = nuevoAnio;
	}
	
	public void imprimirInfo(){
		System.out.println("----RECIBO----");
		System.out.print("Recibo emitido el ");
		System.out.print("El contrato esta a nombre de: ");
		System.out.print(dia);
		System.out.print("-");
		System.out.print(mes);
		System.out.print("-");
		System.out.println(anio);
		System.out.print("Bajo el concepto: ");
		System.out.println(concepto);	
	}
>>>>>>> cd9c84d5df7ff962d8ba5fa320e6bfc7b852a830
}