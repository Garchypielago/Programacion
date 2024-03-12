<<<<<<< HEAD
package musica;
public class Piano extends Instrumento {
    public void tocar() {
		System.out.println("Piano.tocar()");
    }
    public String tipo() { return "Piano"; }
    public void afinar() {System.out.println("Piano.afinar()");}
    // Si hago Piano abstracta puedo quitar afinar pero no la puedo instanciar
=======
package musica;
public class Piano extends Instrumento {
    public void tocar() {
		System.out.println("Piano.tocar()");
    }
    public String tipo() { return "Piano"; }
    public void afinar() {System.out.println("Piano.afinar()");}
    // Si hago Piano abstracta puedo quitar afinar pero no la puedo instanciar
>>>>>>> cd9c84d5df7ff962d8ba5fa320e6bfc7b852a830
}