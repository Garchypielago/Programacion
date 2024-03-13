package musica;
public class Instrumento {
	
    public void tocar() {
		System.out.println("Instrumento.tocar()");
    }
    
    public String tipo() { return "Instrumento"; }
    
    public void afinar() { System.out.println("Instrumento.afinar()");}
}