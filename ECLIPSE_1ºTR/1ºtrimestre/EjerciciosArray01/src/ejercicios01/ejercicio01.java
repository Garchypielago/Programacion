<<<<<<< HEAD
package ejercicios01;

public class ejercicio01 {

	public static void main(String[] args) {
		
		double[] A= new double[3];
		double x;
		for (int i=0; i<A.length; i++) 
		A[i] = i*3;
		x = A[0]+A[1]+A[2];
		
		System.out.println(x);
		System.out.println( A[0]);
		System.out.println( A[1]);
		System.out.println( A[2]);
		
		
		int[] B = new int[5];
		B[4]=1;
		B[B[4]]=2;
		B[B[B[4]]]=0;
		B[B[B[B[4]]]]=3;
		B[B[B[B[B[4]]]]]=4;

		System.out.println( B[0]);
		System.out.println( B[1]);
		System.out.println( B[2]);
		System.out.println( B[3]);
		System.out.println( B[4]);
		
		int[] C= new int[4];
		 int y;
		for (int i=C.length-1; i>=0; i--) 
		 C[i] = i/2; 
		y = C[0]+C[1]+C[2]+C[3];

		System.out.println(y);
		System.out.println(C[0]);
		System.out.println(C[1]);
		System.out.println(C[2]);
		System.out.println(C[3]);
		
		
	}

}
=======
package ejercicios01;

public class ejercicio01 {

	public static void main(String[] args) {
		
		double[] A= new double[3];
		double x;
		for (int i=0; i<A.length; i++) 
		A[i] = i*3;
		x = A[0]+A[1]+A[2];
		
		System.out.println(x);
		System.out.println( A[0]);
		System.out.println( A[1]);
		System.out.println( A[2]);
		
		
		int[] B = new int[5];
		B[4]=1;
		B[B[4]]=2;
		B[B[B[4]]]=0;
		B[B[B[B[4]]]]=3;
		B[B[B[B[B[4]]]]]=4;

		System.out.println( B[0]);
		System.out.println( B[1]);
		System.out.println( B[2]);
		System.out.println( B[3]);
		System.out.println( B[4]);
		
		int[] C= new int[4];
		 int y;
		for (int i=C.length-1; i>=0; i--) 
		 C[i] = i/2; 
		y = C[0]+C[1]+C[2]+C[3];

		System.out.println(y);
		System.out.println(C[0]);
		System.out.println(C[1]);
		System.out.println(C[2]);
		System.out.println(C[3]);
		
		
	}

}
>>>>>>> cd9c84d5df7ff962d8ba5fa320e6bfc7b852a830
