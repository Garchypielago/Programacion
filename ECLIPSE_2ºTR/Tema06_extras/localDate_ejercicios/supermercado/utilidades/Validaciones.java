package utilidades;

import java.time.LocalDate;

import excepciones.*;

public class Validaciones {

	public static void codigoFormato(String codigo) throws CodigoIncorrectoException {
		if (!codigo.matches("[A-Z][0-9][0-9][0-9][A-Z]") || codigo.length() != 5)
			throw new CodigoIncorrectoException("Codigo con formato incorrecto");
		
	}
	
	public static void fechaValida(LocalDate caducidad) throws FechaNoValidaException {
		LocalDate hoy = LocalDate.now();
		if(caducidad.isBefore(hoy.plusDays(2)))
			throw new FechaNoValidaException("Caduca en menos de 2 dias");
			
	}
	
	

}
