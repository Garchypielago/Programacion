package ejercicios_Basicos;

public class Motor {
	private int tipoBomba;
	private String tipoFluido, tipoCombustible;

	public Motor() {
	}

	public Motor(int tipoBomba, String tipoFluido, String tipoCombustible) {
		super(); // es un constructor del padre, por si heredara de otra clase
		this.tipoBomba = tipoBomba;
		this.tipoFluido = tipoFluido;
		this.tipoCombustible = tipoCombustible;
	}

	public int getTipoBomba() {
		return tipoBomba;
	}

	public void setTipoBomba(int tipoBomba) {
		this.tipoBomba = tipoBomba;
	}

	public String getTipoFluido() {
		return tipoFluido;
	}

	public void setTipoFluido(String tipoFluido) {
		this.tipoFluido = tipoFluido;
	}

	public String getCombustible() {
		return tipoCombustible;
	}

	public void setCombustible(String tipoCombustible) {
		this.tipoCombustible = tipoCombustible;
	}

	@Override
	public String toString() {
		return "Motor [tipoBomba=" + tipoBomba + ", tipoFluido=" + tipoFluido + ", combustible=" + tipoCombustible + "]";
	}

	public void dimeTipoMotor() {
		switch (tipoBomba) {
		case 0:
			tipoFluido = "Sin definir";
			System.out.println("No hay establecido un valor definido para el tipo de motor.");
			break;
		case 1:
			tipoFluido = "Agua";
			System.out.println("El motor es un motor para agua.");
			break;
		case 2:
			tipoFluido = "Gasolina";
			System.out.println(" El motor es un motor para gasolina.");
			break;
		case 3:
			tipoFluido = "Hormigon";
			System.out.println("El motor es un motor para hormigon.");
			break;
		case 4:
			tipoFluido = "Pasta alimentaria";
			System.out.println(" El motor es un motor para pasta alimentari.");
			break;
		default:
			System.out.println("No se puede clasificar el motor.");
			break;
		}
	}

	public boolean dimeSiMotorEsparaAgua() {
		boolean motorEsParaAgua = false;

		if (tipoBomba == 1)
			motorEsParaAgua = true;

		return motorEsParaAgua;
	}

}
