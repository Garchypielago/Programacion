<<<<<<< HEAD
package ordenacion;
import java.util.*;

import banco.Cuenta;
public class porSaldo implements Comparator<Cuenta>{

	public int compare(Cuenta c1, Cuenta c2){
		if (c2.devSaldo() - c1.devSaldo() > 0)
			return 1;
		else if (c2.devSaldo() - c1.devSaldo() < 0)
			return -1;
		else
			return 0;			
	}
}
=======
package ordenacion;
import java.util.*;

import banco.Cuenta;
public class porSaldo implements Comparator<Cuenta>{

	public int compare(Cuenta c1, Cuenta c2){
		if (c2.devSaldo() - c1.devSaldo() > 0)
			return 1;
		else if (c2.devSaldo() - c1.devSaldo() < 0)
			return -1;
		else
			return 0;			
	}
}
>>>>>>> cd9c84d5df7ff962d8ba5fa320e6bfc7b852a830
