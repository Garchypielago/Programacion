<<<<<<< HEAD
package utilidades;

import excepciones.*;

public class validaciones {
	
	public static void DNIvalido(String DNI) throws FormatoInvalido {
		if(!DNI.matches("[0-9][0-9][0-9][0-9][0-9][0-9][0-9][0-9][a-z A-Z]"))
			throw new FormatoInvalido("Formato de DNI incorrecto");
	}
}
=======
package utilidades;

import excepciones.*;

public class validaciones {
	
	public static void DNIvalido(String DNI) throws FormatoInvalido {
		if(!DNI.matches("[0-9][0-9][0-9][0-9][0-9][0-9][0-9][0-9][a-z A-Z]"))
			throw new FormatoInvalido("Formato de DNI incorrecto");
	}
}
>>>>>>> cd9c84d5df7ff962d8ba5fa320e6bfc7b852a830
