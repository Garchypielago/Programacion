package principal;

import java.util.Scanner;

import listaObjetos.Centros;
import objetosHijo.Concertado;
import objetosHijo.Privado;
import objetosHijo.Publico;

public class Mai {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		Publico pu=new Publico("publico","calle", 12);
		Concertado co = new Concertado("concertado","calle", 12, 23);
		Privado pr=new Privado("privado","calle", 12);
		
		Centros c = new Centros();
		c.agregar(pu);
		c.agregar(co);
		c.agregar(pr);
		
		c.mostrarCentros();
	}

}
