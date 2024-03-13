package musica;
public class Saxofon extends Instrumento {
    public void tocar() {
		System.out.println("Saxofon.tocar()");
    }
    
    public String tipo() { return "Saxofon"; }
    
    // En Saxofon no reescribimos afinar
    
}