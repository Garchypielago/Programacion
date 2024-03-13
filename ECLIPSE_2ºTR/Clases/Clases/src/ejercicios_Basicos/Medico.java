package ejercicios_Basicos;

public class Medico {
	private String DNI, nombre, apellido1, apellido2, especialidad;
	private int edad;
	private boolean casado;
	
	public Medico() {
	}
	
	public Medico(String nombre, String ape1, String ape2, int edad,boolean casado, String DNI, String especialidad) {
	this.nombre=nombre;
	apellido1=ape1;
	apellido2=ape2;
	this.edad=edad;
	this.casado=casado;
	this.DNI=DNI;
	this.especialidad=especialidad;
	}
	
	public void setNombre(String nombre) {
		this.nombre=nombre;
		System.out.println("Ha cambiado el nombre del médico de DNI: " + DNI + ". El nuevo nombre es: " + nombre);
	}
	
	public void setPrimerApellido(String ape1) {
		apellido1=ape1;
		System.out.println("Ha cambiado el primer apellido del médico de DNI: " + DNI + ". El nuevo apellido es: " + apellido1);
	}
	
	public void setSegundoApellido(String ape2) {
		apellido2=ape2;
		System.out.println("Ha cambiado el segundo apellido del médico de DNI: " + DNI + ". El nuevo apellido es: " + apellido2);
	}
	
	public void setEdad(int edad) {
		this.edad=edad;
		System.out.println("Ha cambiado la edad del médico de nombre: " + nombre + ". La nueva edad es: " + edad);
	}
	
	public void setCasado(boolean casado) {
		this.casado=casado;
		String cas=(casado) ? "Ahora está casado." : "Ahora no está casado.";
		System.out.println(cas);
		System.out.println("Ha cambiado el estado civil del médico de nombre: " + nombre + ". " + cas);
	}
	
	public void setDNI(String DNI) {
		this.DNI=DNI;
		System.out.println("Ha cambiado el DNI del médico de nombre: " + nombre + ". El nuevo DNI es: " + DNI);
	}
	
	public void setEspecialidad(String especialidad) {
		this.especialidad=especialidad;
		System.out.println("Ha cambiado la especialidad del médico de nombre: " + nombre + ". la nueva especialidad es: " + especialidad);

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
	
	public String getDNI() {
		return DNI;
	}
	
	public int getEdad() {
		return edad;
	}
	
	public boolean getCasado() {
		return casado;
	}
	
	public String getEspecialidad() {
		return especialidad;
	}
	
	public void calculoParaMultiploEdad() {
		int multiplo;
		multiplo= 5-(edad%5);
		System.out.println("El médico de nombre " + nombre + ", con especialidad: " + especialidad + ", tendrá una edad múltiplo de 5 dentro de " + multiplo + " años.");
	}

	@Override
	public String toString() {
		return "Medico [DNI=" + DNI + ", nombre=" + nombre + ", apellido1=" + apellido1 + ", apellido2=" + apellido2
				+ ", especialidad=" + especialidad + ", edad=" + edad + ", casado=" + casado + "]";
	}
	
	
	
}
