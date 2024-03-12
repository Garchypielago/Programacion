<<<<<<< HEAD
package fincas;
import java.util.*;

import datos.Finca;

public class Fincas {
	
	private ArrayList<Finca> v;

	public Fincas (){
		v = new ArrayList<Finca>();
	}
	
	public void introducirFinca (Finca unaFinca) {
		v.add(unaFinca);
	}
	
	public String toString () {
		int i = 0;
		String fincas="";
		
		Iterator<Finca> it = v.iterator();
		while (it.hasNext())
		{
					fincas += "\n\n************************* FINCA "+((i++) + 1)+" *************************\n";
					fincas += it.next();	
		}
		
		return fincas;
	}
	
	public void mostrarFincaNombre (String nomb) {
		Iterator<Finca> it = v.iterator();
		boolean encontrada = false;
		
		while (it.hasNext() && !encontrada) {
			Finca f = it.next();
			if (f.getNombre().equalsIgnoreCase(nomb))	{			
					System.out.println(f + "\t");
					encontrada = true;
			}
		}
		if (!encontrada)
			System.out.println ("No hay ninguna finca con ese nombre.");
			
	}

=======
package fincas;
import java.util.*;

import datos.Finca;

public class Fincas {
	
	private ArrayList<Finca> v;

	public Fincas (){
		v = new ArrayList<Finca>();
	}
	
	public void introducirFinca (Finca unaFinca) {
		v.add(unaFinca);
	}
	
	public String toString () {
		int i = 0;
		String fincas="";
		
		Iterator<Finca> it = v.iterator();
		while (it.hasNext())
		{
					fincas += "\n\n************************* FINCA "+((i++) + 1)+" *************************\n";
					fincas += it.next();	
		}
		
		return fincas;
	}
	
	public void mostrarFincaNombre (String nomb) {
		Iterator<Finca> it = v.iterator();
		boolean encontrada = false;
		
		while (it.hasNext() && !encontrada) {
			Finca f = it.next();
			if (f.getNombre().equalsIgnoreCase(nomb))	{			
					System.out.println(f + "\t");
					encontrada = true;
			}
		}
		if (!encontrada)
			System.out.println ("No hay ninguna finca con ese nombre.");
			
	}

>>>>>>> cd9c84d5df7ff962d8ba5fa320e6bfc7b852a830
}