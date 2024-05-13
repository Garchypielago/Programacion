package bbddfichero;

import almacen.AccesoDatos;
import constantes.ConstantesFicheros;

public class MostrarProductos {

	public static void main(String[] args) {
		AccesoDatos.mostrarProductosDeBBDD();
		AccesoDatos.mostrarProductosDeFichero(ConstantesFicheros.NOMFICHPROD);

	}

}
