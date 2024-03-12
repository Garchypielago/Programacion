package formateo;
//package ejemplos;

import java.text.DecimalFormat;

public class DecimalFormat1 {
	public static void main(String args[]) {

		double z = 25.324178787878787878645454;

		DecimalFormat df = new DecimalFormat("####.###");
		System.out.println(df.format(z));
		
		df = new DecimalFormat("0000.0000");
		System.out.println(df.format(z));
	}
}
