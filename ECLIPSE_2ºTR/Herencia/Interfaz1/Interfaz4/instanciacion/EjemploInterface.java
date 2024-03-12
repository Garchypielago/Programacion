<<<<<<< HEAD
package instanciacion;

import pruebas.InstrumentoCuerda;
import pruebas.InstrumentoMusical;
import pruebas.InstrumentoViento;

public class EjemploInterface {
	static void ManejoInstrumento(InstrumentoMusical f) {
		System.out.println(f.tipoInstrumento());
		f.afinar();
		f.tocar();
	}

	public static void main(String[] args) {
		InstrumentoMusical guitarra = new InstrumentoCuerda();
		ManejoInstrumento(guitarra);

		System.out.println();
		
		InstrumentoMusical trompeta = new InstrumentoViento();
		ManejoInstrumento(trompeta);

		// InstrumentoMusical im = new InstrumentoMusical();
	}
=======
package instanciacion;

import pruebas.InstrumentoCuerda;
import pruebas.InstrumentoMusical;
import pruebas.InstrumentoViento;

public class EjemploInterface {
	static void ManejoInstrumento(InstrumentoMusical f) {
		System.out.println(f.tipoInstrumento());
		f.afinar();
		f.tocar();
	}

	public static void main(String[] args) {
		InstrumentoMusical guitarra = new InstrumentoCuerda();
		ManejoInstrumento(guitarra);

		System.out.println();
		
		InstrumentoMusical trompeta = new InstrumentoViento();
		ManejoInstrumento(trompeta);

		// InstrumentoMusical im = new InstrumentoMusical();
	}
>>>>>>> cd9c84d5df7ff962d8ba5fa320e6bfc7b852a830
}