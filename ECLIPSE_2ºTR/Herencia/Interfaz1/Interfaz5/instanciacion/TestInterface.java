package instanciacion;

import pruebas.Conducible;
import pruebas.Globo;
import pruebas.NaveAerea;
import pruebas.Patin;

public class TestInterface {
	public static void main(String[] args) {
		
		// Globo extends NaveAerea implements Conducible
		Globo zepelin = new Globo();

		zepelin.setDireccion('N');
		zepelin.girarDerecha(90);
		System.out.println("Zepelin nueva direccion " + zepelin.getDireccion());

		// Patin implements Conducible
		Patin patin = new Patin();

		patin.girarDerecha(90);
		patin.girarIzquierda(90);
	}
}