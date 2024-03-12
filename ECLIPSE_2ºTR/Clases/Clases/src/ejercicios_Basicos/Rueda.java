<<<<<<< HEAD
package ejercicios_Basicos;

public class Rueda {
	private String tipo, marca;
	private double grosor, diametro;
	
	
	public Rueda() {
	}
	
	public Rueda(String tipo, String marca, double grosor, double diametro) {
		this.tipo=tipo;
		this.marca=marca;
		this.grosor=grosor;
		this.diametro=diametro;
	}
	
	public void setTipo(String tipo) {
		this.tipo=tipo;
	}
	
	public void setMarca(String marca) {
		this.marca=marca;
	}
	
	public void setGrosor(double grosor) {
		this.grosor=grosor;
	}
	
	public void setDiametro(double grosor) {
		this.grosor=grosor;
	}
	
	public String getTipo() {
		return tipo;
	}
	
	public String getMarca() {
		return marca;
	}
	
	public double getGrosor() {
		return grosor;
	}
	
	public double getDiametro() {
		return grosor;
	}
	
	public void comprobarDimensiones() {
		if (diametro>1.4) {
			System.out.println("La rueda es para un vehiculo grande.");
			if (grosor<0.4) {
				System.out.println("El grosor para es inferior al recomendado.");
			}
		} else if (diametro<=1.4 && diametro>0.8) {
			System.out.println("La rueda es para un vehiculo mediano.");
			if (grosor<0.25) {
				System.out.println("El grosor para es inferior al recomendado.");
			}
		} else {
			System.out.println("La rueda es para un vehiculo pequeño.");
		}
		
	}

	@Override
	public String toString() {
		return "Rueda [tipo=" + tipo + ", marca=" + marca + ", grosor=" + grosor + ", diametro=" + diametro + "]";
	}
	
	
=======
package ejercicios_Basicos;

public class Rueda {
	private String tipo, marca;
	private double grosor, diametro;
	
	
	public Rueda() {
	}
	
	public Rueda(String tipo, String marca, double grosor, double diametro) {
		this.tipo=tipo;
		this.marca=marca;
		this.grosor=grosor;
		this.diametro=diametro;
	}
	
	public void setTipo(String tipo) {
		this.tipo=tipo;
	}
	
	public void setMarca(String marca) {
		this.marca=marca;
	}
	
	public void setGrosor(double grosor) {
		this.grosor=grosor;
	}
	
	public void setDiametro(double grosor) {
		this.grosor=grosor;
	}
	
	public String getTipo() {
		return tipo;
	}
	
	public String getMarca() {
		return marca;
	}
	
	public double getGrosor() {
		return grosor;
	}
	
	public double getDiametro() {
		return grosor;
	}
	
	public void comprobarDimensiones() {
		if (diametro>1.4) {
			System.out.println("La rueda es para un vehiculo grande.");
			if (grosor<0.4) {
				System.out.println("El grosor para es inferior al recomendado.");
			}
		} else if (diametro<=1.4 && diametro>0.8) {
			System.out.println("La rueda es para un vehiculo mediano.");
			if (grosor<0.25) {
				System.out.println("El grosor para es inferior al recomendado.");
			}
		} else {
			System.out.println("La rueda es para un vehiculo pequeño.");
		}
		
	}

	@Override
	public String toString() {
		return "Rueda [tipo=" + tipo + ", marca=" + marca + ", grosor=" + grosor + ", diametro=" + diametro + "]";
	}
	
	
>>>>>>> cd9c84d5df7ff962d8ba5fa320e6bfc7b852a830
}