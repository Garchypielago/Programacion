package musica;
public class Piano extends Instrumento {
    public void tocar() {
		System.out.println("Piano.tocar()");
    }
    
    public String tipo() { return "Piano"; }
   
    // En Piano no reescribimos afinar
}