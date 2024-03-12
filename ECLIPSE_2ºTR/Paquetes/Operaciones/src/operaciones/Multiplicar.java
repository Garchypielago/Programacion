package operaciones;

public class Multiplicar {
	private float x, y;

	public Multiplicar(float x, float y) {
		super();
		this.x = x;
		this.y = y;
	}
	
	public void multiplica() {
		float r;
		r=x*y;
		System.out.println(r);
	}

}
