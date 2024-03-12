<<<<<<< HEAD
package ejercicios_Basicos;

public class Profesor {
	private String nombre, apellido1, apellido2;
	private int edad;
	private boolean casado, especialista;

	public Profesor() {
		
	}

	public Profesor(String nom, String ape1, String ape2, int edad, boolean casado, boolean especialista) {
		nombre=nom;
		apellido1=ape1;
		apellido2=ape2;
		this.edad=edad;
		this.casado=casado;
		this.especialista=especialista;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setPrimerApellido(String apellido1) {
		this.apellido1 = apellido1;
	}

	public void setSegundoApellido(String apellido2) {
		this.apellido2 = apellido2;
	}

	public void setEdad(int n) {
		edad = n;
	}

	public void setCasado(boolean casa) {
		casado = casa;
	}
	
	public void setEspecialista(boolean especialista) {
		this.especialista=especialista;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public String getPrimerApellido() {
		return apellido1;
	}
	
	public String getSegundorApellido() {
		return apellido2;
	}
	
	public int getEdad() {
		return edad;
	}
	
	public boolean getCasado() {
		return casado;
	}
	
	public boolean getEspecialista() {
		return especialista;
	}

	@Override
	public String toString() {
		return "Profesor [nombre=" + nombre + ", apellido1=" + apellido1 + ", apellido2=" + apellido2 + ", edad=" + edad
				+ ", casado=" + casado + ", especialista=" + especialista + "]";
	}
	
	
}
=======
package ejercicios_Basicos;

public class Profesor {
	private String nombre, apellido1, apellido2;
	private int edad;
	private boolean casado, especialista;

	public Profesor() {
		
	}

	public Profesor(String nom, String ape1, String ape2, int edad, boolean casado, boolean especialista) {
		nombre=nom;
		apellido1=ape1;
		apellido2=ape2;
		this.edad=edad;
		this.casado=casado;
		this.especialista=especialista;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void setPrimerApellido(String apellido1) {
		this.apellido1 = apellido1;
	}

	public void setSegundoApellido(String apellido2) {
		this.apellido2 = apellido2;
	}

	public void setEdad(int n) {
		edad = n;
	}

	public void setCasado(boolean casa) {
		casado = casa;
	}
	
	public void setEspecialista(boolean especialista) {
		this.especialista=especialista;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public String getPrimerApellido() {
		return apellido1;
	}
	
	public String getSegundorApellido() {
		return apellido2;
	}
	
	public int getEdad() {
		return edad;
	}
	
	public boolean getCasado() {
		return casado;
	}
	
	public boolean getEspecialista() {
		return especialista;
	}

	@Override
	public String toString() {
		return "Profesor [nombre=" + nombre + ", apellido1=" + apellido1 + ", apellido2=" + apellido2 + ", edad=" + edad
				+ ", casado=" + casado + ", especialista=" + especialista + "]";
	}
	
	
}
>>>>>>> cd9c84d5df7ff962d8ba5fa320e6bfc7b852a830
