<<<<<<< HEAD
package banco;
import excepcionNoHayDinero.ExcepcionNohayDinero;

public class Cuenta implements Comparable<Cuenta>{
//	static int numCuentas=0;
	private double saldo=0.0;
	private int nCC;
    
	public Cuenta(double _saldo, int _nCC){
		saldo=_saldo;
		nCC=_nCC;
		//numCuentas++;
	}
	
	public int  devnCC(){
		return nCC;
	}
	
	public double  devSaldo(){
		return saldo;
	}
	
	public void  ponnCC(int nCC){
		this.nCC = nCC;
	}
	
	public void ponSaldo(double saldo){
		this.saldo = saldo;
	}
	
	public void ingresar(double cant){
		saldo = saldo + cant;
	}
	
	public void sacar(double cant) throws ExcepcionNohayDinero{
		if(saldo>=cant){
			saldo=saldo-cant;
		}
		else
			throw new ExcepcionNohayDinero();
	}
	
//	public static int numeroDeCuentas(){
//		return numCuentas;
//	}
	
	public int compareTo(Cuenta c) {
		
		int compara = Double.valueOf(c.saldo).compareTo(Double.valueOf(this.saldo));
		if (compara == 0)
			return Integer.valueOf(this.nCC).compareTo(Integer.valueOf(c.nCC));
		else
			return compara;
	}
	
	public String toString(){
		return("Numero de cuenta " + nCC + " Saldo " + saldo );
	}
	
}


=======
package banco;
import excepcionNoHayDinero.ExcepcionNohayDinero;

public class Cuenta implements Comparable<Cuenta>{
//	static int numCuentas=0;
	private double saldo=0.0;
	private int nCC;
    
	public Cuenta(double _saldo, int _nCC){
		saldo=_saldo;
		nCC=_nCC;
		//numCuentas++;
	}
	
	public int  devnCC(){
		return nCC;
	}
	
	public double  devSaldo(){
		return saldo;
	}
	
	public void  ponnCC(int nCC){
		this.nCC = nCC;
	}
	
	public void ponSaldo(double saldo){
		this.saldo = saldo;
	}
	
	public void ingresar(double cant){
		saldo = saldo + cant;
	}
	
	public void sacar(double cant) throws ExcepcionNohayDinero{
		if(saldo>=cant){
			saldo=saldo-cant;
		}
		else
			throw new ExcepcionNohayDinero();
	}
	
//	public static int numeroDeCuentas(){
//		return numCuentas;
//	}
	
	public int compareTo(Cuenta c) {
		
		int compara = Double.valueOf(c.saldo).compareTo(Double.valueOf(this.saldo));
		if (compara == 0)
			return Integer.valueOf(this.nCC).compareTo(Integer.valueOf(c.nCC));
		else
			return compara;
	}
	
	public String toString(){
		return("Numero de cuenta " + nCC + " Saldo " + saldo );
	}
	
}


>>>>>>> cd9c84d5df7ff962d8ba5fa320e6bfc7b852a830
