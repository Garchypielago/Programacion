<<<<<<< HEAD
package objetoPadre;

public class Vivienda {
	private double m2;
	private String calle;
	private int num;

	public Vivienda(double m2, String calle, int num) {
		super();
		this.m2 = m2;
		this.calle = calle;
		this.num = num;
	}

	public Vivienda() {
		super();
	}

	public double getM2() {
		return m2;
	}

	public void setM2(double m2) {
		this.m2 = m2;
	}

	public String getCalle() {
		return calle;
	}

	public void setCalle(String calle) {
		this.calle = calle;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	@Override
	public String toString() {
		return "m2=" + m2 + ", calle=" + calle + ", numero=" + num;
	}

	public boolean equals(String calle, int num) {
		if (this.calle == calle && this.num == num)
			return true;
		else
			return false;
	}

}
=======
package objetoPadre;

public class Vivienda {
	private double m2;
	private String calle;
	private int num;

	public Vivienda(double m2, String calle, int num) {
		super();
		this.m2 = m2;
		this.calle = calle;
		this.num = num;
	}

	public Vivienda() {
		super();
	}

	public double getM2() {
		return m2;
	}

	public void setM2(double m2) {
		this.m2 = m2;
	}

	public String getCalle() {
		return calle;
	}

	public void setCalle(String calle) {
		this.calle = calle;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	@Override
	public String toString() {
		return "m2=" + m2 + ", calle=" + calle + ", numero=" + num;
	}

	public boolean equals(String calle, int num) {
		if (this.calle == calle && this.num == num)
			return true;
		else
			return false;
	}

}
>>>>>>> cd9c84d5df7ff962d8ba5fa320e6bfc7b852a830
