package main;
import misdoc.Factura;

public class ImportacionDePaquetes0{
	public static void main(String args[]){
		Factura factura1 = new Factura("Jesus Carretero", 100.00);
		Factura factura2 = new Factura("Felix Garcia", 300.00);
				
		factura1.imprimirInfo();
		factura2.imprimirInfo();		
	}
}