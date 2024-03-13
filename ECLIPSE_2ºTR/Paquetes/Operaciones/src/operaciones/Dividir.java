package operaciones;

public class Dividir {
	private float x, y;

	public Dividir(float x, float y) {
		super();
		this.x = x;
		this.y = y;
	}

	public void divide() {
		float r;
		r=x/y;
		System.out.println(r);
	}
}
