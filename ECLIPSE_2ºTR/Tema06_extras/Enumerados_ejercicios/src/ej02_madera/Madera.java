package ej02_madera;

public enum Madera {
	ROBLE("castaño verdoso", 800), CAOBA("marron oscuro", 770), NOGAL("marron rojizo", 820), 
	CEREZO("marron cereza", 790), BOJ("marron negruzco", 675);
	
	private String color;
	private double peso;
	
	private Madera(String color, double peso) {
		this.color = color;
		this.peso = peso;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}
	
	
	
	

}
