<<<<<<< HEAD
package misdoc;

public class Factura{
	private String comprador;
	private double importe;
	
	public Factura(String nuevoComprador, double nuevoImporte){
		comprador = nuevoComprador;
		importe = nuevoImporte;
	}
	
	public void imprimirInfo(){
		System.out.print("Factura a nombre de: ");
		System.out.println(comprador);
		System.out.print("Por un importe de: ");
		System.out.println(importe);	
	}
=======
package misdoc;

public class Factura{
	private String comprador;
	private double importe;
	
	public Factura(String nuevoComprador, double nuevoImporte){
		comprador = nuevoComprador;
		importe = nuevoImporte;
	}
	
	public void imprimirInfo(){
		System.out.print("Factura a nombre de: ");
		System.out.println(comprador);
		System.out.print("Por un importe de: ");
		System.out.println(importe);	
	}
>>>>>>> cd9c84d5df7ff962d8ba5fa320e6bfc7b852a830
}