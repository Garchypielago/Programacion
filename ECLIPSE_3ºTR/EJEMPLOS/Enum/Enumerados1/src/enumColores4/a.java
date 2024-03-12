package enumColores4;

public class a {
	
	private int g;
	private String sd;
	
	

	public a() {
		super();
		System.out.println(this);
	}

	public a(int a, String b) {
		super();
		g =a;
		sd=b;
		System.out.println(this);
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		a nuevo = new a();
		a nuevo2 = new a(1,"hola");
		
	}

}
