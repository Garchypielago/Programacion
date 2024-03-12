package ordenArrayLPersonas;

public class Persona implements Comparable<Persona> {
	public int dni, edad;

	public Persona(int d, int e) {
		this.dni = d;
		this.edad = e;
	}

	// Para poder sobreescribir compareTo hay que implementar Comparable en esta
	// clase
	@Override
	public int compareTo(Persona o) {
		return (Integer.valueOf(this.dni).compareTo(Integer.valueOf(o.dni)));
	}

// De esta forma es igual que el anterior:
//	@Override
//	public int compareTo(Persona o) {
//		if (this.dni > o.dni)
//			return 1;
//		else if (this.dni < o.dni)
//			return -1;
//		else
//			return 0;
//	}
	

//	Observamos que si lo hacemos i, nos dice el compilador que es una forma obsoleta
//	@Override
//	public int compareTo(Persona o) {
//		return (new Integer(o.dni).compareTo(new Integer(this.dni)));
//	}
	
	// Ahora ordenamos ascendentemente por edad y ascendentemente por dni
//	@Override
//	public int compareTo(Persona o) {
//		if (this.edad > o.edad)
//			return 1;
//		else if (this.edad < o.edad)
//			return -1;
//		else if (this.dni > o.dni) 
//			return 1;
//		else if (this.dni< o.dni)
//			return -1;
//		else
//			return 0;
//	}
	
// lo mismo, de otra forma:
//	@Override
//	public int compareTo(Persona o) {
//		if (this.edad > o.edad)
//			return 1;
//		else if (this.edad < o.edad)
//			return -1;
//		else 
//			return (new Integer(this.dni).compareTo(new Integer(o.dni)));
//	}
	
// Ahora ordenamos descendentemente por edad y ascendentemente por dni
	
//	@Override
//	public int compareTo(Persona o) {
//		if (this.edad < o.edad)
//			return 1;
//		else if (this.edad > o.edad)
//			return -1;
//		else 
//			return ((Integer.valueOf(this.dni)).compareTo(Integer.valueOf(o.dni)));
//	}	
	
	public int getDni() {
		return dni;
	}

	public void setDni(int dni) {
		this.dni = dni;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	@Override
	public String toString() {
		return "Persona [dni=" + dni + ", edad=" + edad + "]";
	}

}
