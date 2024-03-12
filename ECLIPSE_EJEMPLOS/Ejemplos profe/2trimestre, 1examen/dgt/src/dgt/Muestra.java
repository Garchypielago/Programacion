<<<<<<< HEAD
package dgt;

public class Muestra {
	private String fecha, hora, codigo, matricula;
	private float porcentaje;

	public Muestra() {
	}

	public Muestra(String _fecha, String _time, String _codigo, String _matricula, float _porcentaje) {
		fecha = _fecha;
		hora = _time;
		setCodigo(_codigo);
		matricula = _matricula;
		setPorcentaje(_porcentaje);
	}

	public void setFecha(String _fecha) {
		fecha = _fecha;
	}

	public void setHora(String _hora) {
		hora = _hora;
	}

	public void setCodigo(String _codigo) {
		if (_codigo.matches("[A-Z][A-Z][0-9][0-9]"))
//		if (Character.isLetter(_codigo.charAt(0)) && Character.isLetter(_codigo.charAt(1))
//				&& Character.isDigit(_codigo.charAt(2)) && Character.isDigit(_codigo.charAt(3)))
		{
			codigo = _codigo;
		} else {
			System.out.println("Valor no valido.");
			codigo = null;
		}
	}

	public void setMatricula(String _matricula) {
		matricula = _matricula;
	}

	public void setPorcentaje(float _porcentaje) {
		if (_porcentaje >= 0 && _porcentaje <= 2.5) {
			porcentaje = _porcentaje;
		} else {
			System.out.println("Valor no valido.");
			porcentaje = -1;
		}
	}

	public String getDate() {
		return fecha;
	}

	public String getTime() {
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

	public String toString() {
		return "La muestra es del día " + fecha + " a las " + hora + ", el codigo del puesto de control es " + codigo
				+ ", la matricula del vehiculo es " + matricula + " y la tasa de alcoholemia es " + porcentaje;
	}
}
=======
package dgt;

public class Muestra {
	private String fecha, hora, codigo, matricula;
	private float porcentaje;

	public Muestra() {
	}

	public Muestra(String _fecha, String _time, String _codigo, String _matricula, float _porcentaje) {
		fecha = _fecha;
		hora = _time;
		setCodigo(_codigo);
		matricula = _matricula;
		setPorcentaje(_porcentaje);
	}

	public void setFecha(String _fecha) {
		fecha = _fecha;
	}

	public void setHora(String _hora) {
		hora = _hora;
	}

	public void setCodigo(String _codigo) {
		if (_codigo.matches("[A-Z][A-Z][0-9][0-9]"))
//		if (Character.isLetter(_codigo.charAt(0)) && Character.isLetter(_codigo.charAt(1))
//				&& Character.isDigit(_codigo.charAt(2)) && Character.isDigit(_codigo.charAt(3)))
		{
			codigo = _codigo;
		} else {
			System.out.println("Valor no valido.");
			codigo = null;
		}
	}

	public void setMatricula(String _matricula) {
		matricula = _matricula;
	}

	public void setPorcentaje(float _porcentaje) {
		if (_porcentaje >= 0 && _porcentaje <= 2.5) {
			porcentaje = _porcentaje;
		} else {
			System.out.println("Valor no valido.");
			porcentaje = -1;
		}
	}

	public String getDate() {
		return fecha;
	}

	public String getTime() {
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

	public String toString() {
		return "La muestra es del día " + fecha + " a las " + hora + ", el codigo del puesto de control es " + codigo
				+ ", la matricula del vehiculo es " + matricula + " y la tasa de alcoholemia es " + porcentaje;
	}
}
>>>>>>> cd9c84d5df7ff962d8ba5fa320e6bfc7b852a830
