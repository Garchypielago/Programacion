package utilidades;

import excepciones.*;

public class validaciones {
	
	public static void DNIvalido(String DNI) throws FormatoInvalido {
		if(!DNI.matches("[0-9][0-9][0-9][0-9][0-9][0-9][0-9][0-9][a-z A-Z]"))
			throw new FormatoInvalido("Formato de DNI incorrecto");
	}
}
