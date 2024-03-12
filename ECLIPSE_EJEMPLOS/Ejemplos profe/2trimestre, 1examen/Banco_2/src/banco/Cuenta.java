package banco;
import excepcionNoHayDinero.ExcepcionNohayDinero;

public class Cuenta{
	static int numCuentas=0;
	private double saldo=0.0;
	private int nCC;
    
	public Cuenta(double _saldo, int _nCC){
		saldo=_saldo;
		nCC=_nCC;
		numCuentas++;
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
	
	public static int numeroDeCuentas(){
		return numCuentas;
	}
	
	public String toString(){
		return("Numero de cuenta " + nCC + " Saldo " + saldo );
	}
	
}


