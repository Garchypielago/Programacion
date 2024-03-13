package musica;

public class Guitarra extends Instrumento {
	
    public void tocar() {
		System.out.println("Guitarra.tocar()");
    }
    
    public String tipo() { return "Guitarra"; }
    
    // En Guitarra no reescribimos afinar()
    
}
