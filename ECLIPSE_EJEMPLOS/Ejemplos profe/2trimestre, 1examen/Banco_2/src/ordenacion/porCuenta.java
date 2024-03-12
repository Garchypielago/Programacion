<<<<<<< HEAD
package ordenacion;
import java.util.*;

import banco.Cuenta;

public class porCuenta implements Comparator<Cuenta>{
	
	public int compare(Cuenta c1, Cuenta c2){
		return c1.devnCC() - c2.devnCC();	
	}

}
=======
package ordenacion;
import java.util.*;

import banco.Cuenta;

public class porCuenta implements Comparator<Cuenta>{
	
	public int compare(Cuenta c1, Cuenta c2){
		return c1.devnCC() - c2.devnCC();	
	}

}
>>>>>>> cd9c84d5df7ff962d8ba5fa320e6bfc7b852a830
