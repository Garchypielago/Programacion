package dgt;
import java.time.LocalDate;
import java.time.LocalTime;

import excepciones.CodigoIncorrectoException;
import excepciones.PorcentajeIncorrectoException;

public class Muestra {
	private String codigo, matricula;
	private LocalDate fecha;
	private LocalTime hora;
	private float porcentaje;
	
	public Muestra() {}

	/*Hacerlo así obliga a pedir todos los datos de la muestra de nuevo */
	public Muestra(LocalDate _fecha, LocalTime _time, String _codigo, String _matricula, float _porcentaje)
			throws CodigoIncorrectoException, PorcentajeIncorrectoException {
		fecha = _fecha;
		hora = _time;		
		validaCodigo(_codigo);
		codigo =_codigo;
		matricula = _matricula;
		validaPorcentaje(_porcentaje);
		porcentaje = _porcentaje;
	}

	
	
	public void setFecha(LocalDate _fecha) {
		fecha = _fecha;
	}

	public void setHora(LocalTime _hora) {
		hora = _hora;
	}

	public void setCodigo(String _codigo) throws CodigoIncorrectoException {
		if (!_codigo.matches("[A-Za-z][A-Za-z][0-9][0-9]"))
			throw new CodigoIncorrectoException("Código inválido.");
		codigo = _codigo;
	}

	public void setMatricula(String _matricula) {
		matricula = _matricula;
	}

	public void setPorcentaje(float _porcentaje) throws PorcentajeIncorrectoException {
		if (_porcentaje < 0 || _porcentaje > 2.5) 
			throw new PorcentajeIncorrectoException("Porcentaje inválido.");
		porcentaje = _porcentaje;
	}
	
	public LocalDate getDate() {
		return fecha;
	}

	public LocalTime getTime() {
		return hora;
	}

	public String getCodigo() {
		return codigo;
	}

	public String getMatricula() {
		return matricula;
	}

	public float getPorcentaje() {
		return porcentaje;
	}
	
	public static void validaCodigo(String _codigo) throws CodigoIncorrectoException {
		if (!_codigo.matches("[A-Za-z][A-Za-z][0-9][0-9]"))
			throw new CodigoIncorrectoException("Código inválido.");		
	}
	
	public static void validaPorcentaje(float _porcentaje) throws PorcentajeIncorrectoException {
		if (_porcentaje < 0 || _porcentaje > 2.5) 
			throw new PorcentajeIncorrectoException("Porcentaje inválido.");
	}
	
	public String toString() {
		return "Muestra: día "+ fecha + " a las "+ hora + ", el codigo del puesto de control es "+
	codigo + ",\n, la matricula del vehiculo es "+ matricula + " y la tasa de alcoholemia es "+ porcentaje + "\n";
	}
}
