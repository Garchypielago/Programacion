<<<<<<< HEAD
package EjerciciosClases01;

public class CuentaBancaria {
	private int cantidad;
	static int cuentas;

	public CuentaBancaria() {
		cuentas++;
	}
	
	public CuentaBancaria(int cantidad) {
		super();
		this.cantidad = cantidad;
		cuentas++;
	}

	public int consultaSaldo() {
		return cantidad;
	}

	public void ingresar(int ingreso) {
		cantidad= ingreso + cantidad;
		System.out.println("Su saldo tras el ingreso es de " + cantidad + ".");
	}
	
	public void retirar(int retirar) {
		if (cantidad>=retirar) {
		cantidad= cantidad - retirar;
		System.out.println("Su saldo tras la retirada es de " + cantidad + ".");
		}else if (cantidad<retirar) {
			System.out.println("Su saldo actual es menor a la cantidad a retirar, vuelva a introducir la cantidad a retirar");
		}
	}
	
	public static int numeroCuentas() {
		return cuentas;
	}
	
	
	

}
=======
package EjerciciosClases01;

public class CuentaBancaria {
	private int cantidad;
	static int cuentas;

	public CuentaBancaria() {
		cuentas++;
	}
	
	public CuentaBancaria(int cantidad) {
		super();
		this.cantidad = cantidad;
		cuentas++;
	}

	public int consultaSaldo() {
		return cantidad;
	}

	public void ingresar(int ingreso) {
		cantidad= ingreso + cantidad;
		System.out.println("Su saldo tras el ingreso es de " + cantidad + ".");
	}
	
	public void retirar(int retirar) {
		if (cantidad>=retirar) {
		cantidad= cantidad - retirar;
		System.out.println("Su saldo tras la retirada es de " + cantidad + ".");
		}else if (cantidad<retirar) {
			System.out.println("Su saldo actual es menor a la cantidad a retirar, vuelva a introducir la cantidad a retirar");
		}
	}
	
	public static int numeroCuentas() {
		return cuentas;
	}
	
	
	

}
>>>>>>> cd9c84d5df7ff962d8ba5fa320e6bfc7b852a830
