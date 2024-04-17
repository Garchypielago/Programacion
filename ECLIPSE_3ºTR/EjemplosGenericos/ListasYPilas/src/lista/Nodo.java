package lista;

public class Nodo {
     private int num;
     private Nodo sig;
     
     public Nodo (int num){
    	 this.num = num;
    	 this.sig = null;
     }
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public Nodo getSig() {
		return sig;
	}
	public void setSig(Nodo sig) {
		this.sig = sig;
	}
        
     
}
