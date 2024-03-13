package musica;
// Un tipo de Guitarra 
public class Ukelele extends Guitarra {
    public void tocar() {
    	System.out.println("Ukelele.tocar()");
    }
    public String tipo() { return "Ukelele"; }
    
    // En Ukelele no reescribimos afinar
}
