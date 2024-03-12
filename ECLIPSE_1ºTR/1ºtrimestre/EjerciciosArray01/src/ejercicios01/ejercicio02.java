package ejercicios01;


import javax.swing.JOptionPane;

public class ejercicio02 {

	public static void main(String[] args) {
		int n;
		String texto;
		
		texto = JOptionPane.showInputDialog("De cuanto sera el array");
		n = Math.abs(Integer.parseInt(texto));
		
		double[] A= new double [n];
		
		
		//apartado a
		for (int i=0; i<A.length; i++) {
			A[i] = i*3;
			System.out.println(A[i]);
		}
		
		//apartado b
		for (int i=A.length-1; i>=0; i--) {
			A[i] = i;
			System.out.println(A[i]);
		}
		
		for (int i=0; i<A.length; i++) {
			A[i] = A.length-i-1;
			System.out.println(A[i]);
		}
		
		//apartado c
		boolean[] B = new boolean[n];
		
		for (int i=0; i<B.length; i++) {
			if(i%2==0) {
				B[i]=true;
			}else {
				B[i]=false;
			}
			System.out.println(B[i]);
		}

	}

}
