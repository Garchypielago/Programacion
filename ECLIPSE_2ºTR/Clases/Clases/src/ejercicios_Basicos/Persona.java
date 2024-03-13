package ejercicios_Basicos;

public class Persona {
	private String nombre, apellido1, apellido2, numeroDocIdentidad;
	private int edad;
	private boolean casado;

	public Persona() {
		
	}
	
	public Persona(String nom, String ape1, String ape2, String DNI, int nedad, boolean ncasado) {
		nombre=nom;
		apellido1=ape1;
		apellido2=ape2;
		numeroDocIdentidad=DNI;
		edad=nedad;
		casado=ncasado;
	}
	
	public String getNombreCompleto() {
		String nombreCompleto;
		nombreCompleto=nombre+" "+apellido1+" "+apellido2;
		
		return nombreCompleto;
	}
	
	public void DatosPersonales() {
		System.out.println("Su DNI es "+numeroDocIdentidad+".");
		
		System.out.println("Su edad es "+edad+" años.");
		
		String cas=(casado) ? "Está casado." : "No está casado.";
		System.out.println(cas);
		
	}
	
	public void setDNI(String DNI) {
		numeroDocIdentidad=DNI;
	}
	
	public void setNombre(String nombre) {
		this.nombre=nombre;
	}
	
	public void setPrimerApellido(String apellido1) {
		this.apellido1=apellido1;
	}
	
	public void setSegundoApellido(String apellido2) {
		this.apellido2=apellido2;
	}
	
	public void setEdad(int n) {
		edad=n;
	}
	
	public void setCasado(boolean casa) {
		casado=casa;
	}
	
	public void mostrarPersona() {
		System.out.println(nombre);
		System.out.println(apellido1);
		System.out.println(apellido2);
		System.out.println(edad);
		System.out.println(casado);
	}
	
	public String toString() {
		return nombre + " " + apellido1 + " " + apellido2 + " " + edad + " " + casado;
	}

}
