package musica;
//final class Guitarra extends Instrumento {
public class Guitarra extends Instrumento {
    public void tocar() {
		System.out.println("Guitarra.tocar()");
    }
    public String tipo() {return "Guitarra";}
    public void afinar() {System.out.println("Guitarra.afinar()");}
 // Si hago Guitarra abstracta puedo quitar afinar pero no la puedo instanciar
}
