package musica;
public abstract class Instrumento {
    public void tocar() {
		System.out.println("Instrumento.tocar()");
    }
    
    public abstract String tipo();
    public abstract void afinar();
}