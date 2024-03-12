package operaciones;

public class Sumar {
	private float x, y;

	public Sumar(float x, float y) {
		super();
		this.x = x;
		this.y = y;
	}
	
	public void suma() {
		float r;
		r=x+y;
		System.out.println(r);
	}
	
}
