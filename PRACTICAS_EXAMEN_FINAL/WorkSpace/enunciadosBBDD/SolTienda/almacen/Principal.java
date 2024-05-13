package almacen;

import java.util.*;

import constantes.ConstantesFicheros;

public class Principal {

	// Los metodos que necesitan acceso a la base de datos, se conectan y
	// desconectan
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		ArrayList<Producto> productos = null;

		// Crear fichero con los registros extraidos de la base de datos
		boolean creado = AccesoDatos.crearFichProductosDeBBDD(ConstantesFicheros.NOMFICHPROD);

		if (creado) {
			// Crear la lista a partir de los objetos del fichero
			productos = AccesoDatos.crearListaProductos(ConstantesFicheros.NOMFICHPROD);
			if (productos != null) {
				AccesoDatos.venderProductos(productos, ConstantesFicheros.NOMFICHVEND, teclado);

				AccesoDatos.leerVendidos(ConstantesFicheros.NOMFICHVEND);

				AccesoDatos.actualizarBaseDatosConLista(productos);
			}

		} else
			System.out.println("No se ha creado el fichero");

		creado = AccesoDatos.crearFichProductosDeBBDD(ConstantesFicheros.NOMFICHPROD);
		if (creado) {
			System.out.println("Se ha actualizado el fichero de productos con el ultimo contenido de la base de datos");
		} else
			System.out.println(
					"No se ha actualizado el fichero de productos con el ultimo contenido de la base de datos");
		teclado.close();
	}

}