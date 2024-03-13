package operaciones;

public class Restar {
	private float x, y;

	public Restar(float x, float y) {
		super();
		this.x = x;
		this.y = y;
	}

	public void resta() {
		float r;
		r=x-y;
		System.out.println(r);
	}
}
