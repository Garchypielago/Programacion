package main;
// Ejemplo de implementacion de herencia

import musica.Guitarra;
import musica.Guzla;
import musica.Instrumento;
import musica.Piano;
import musica.Saxofon;
import musica.Ukelele;

public class Musica {
	public static final int NUM_INST = 5;
	
    // No importa el tipo de Instrumento,
    // seguirá funcionando debido a Polimorfismo:
    public static void afinar(Instrumento i) {	
		i.tocar(); //Saldran todas, pues tocar lo tienen todas implementado
		i.afinar();
    }
    
	public static void devolverTipo(Instrumento i) {	
		System.out.println("tipo devuelto " + i.tipo()); 	
    }
    
    public static void afinarTodo(Instrumento[] inst) {	
		for (int i = 0; i < inst.length; i++)
	    	afinar(inst[i]);	    	
    }
    
    public static void obtTipos(Instrumento[] inst) {
		for (int i = 0; i < inst.length; i++)
	    	devolverTipo(inst[i]);	    	
    }

    public static void main(String[] args) {
		Instrumento[] orquesta = new Instrumento[NUM_INST];
		int i = 0;
		
		orquesta[i++] = new Guitarra();
		orquesta[i++] = new Piano();
		orquesta[i++] = new Saxofon();
		orquesta[i++] = new Guzla();
		orquesta[i++] = new Ukelele();
		// orquesta[i++] = new Instrumento();
		// Si Instrumento lo hago abstract no se puede instanciar
		afinarTodo(orquesta);
		obtTipos(orquesta);
    }
}
