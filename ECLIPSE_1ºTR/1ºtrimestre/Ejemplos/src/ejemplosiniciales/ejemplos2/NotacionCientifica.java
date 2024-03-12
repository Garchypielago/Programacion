package ejemplos2;

import java.math.BigDecimal;

public class NotacionCientifica {

	public static void main(String[] args) {
		double var = 286578432.33;
		System.out.println(BigDecimal.valueOf(var));
		System.out.println(var);
		
		BigDecimal valorGrande = BigDecimal.valueOf(var);
		System.out.println(valorGrande);
	}
}