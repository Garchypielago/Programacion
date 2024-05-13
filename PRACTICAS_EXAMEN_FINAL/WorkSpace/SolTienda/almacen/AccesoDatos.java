package almacen;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Scanner;

import constantes.ConstantesBD;
import excepciones.ExcepcionNohayStock;

public class AccesoDatos {
	/*************************************************************/
	/* crearFichProductosDeBBDD:     							 */
	/* A partir de la base de datos, creo un fichero de objetos  */
	/*************************************************************/
	public static boolean crearFichProductosDeBBDD(String nomFich) {
		Producto p;
		boolean creado = true;

		try (Connection conn = Conexion.conexion(ConstantesBD.URL, ConstantesBD.USUARIO, ConstantesBD.PWD)) {

			try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(nomFich));
					Statement instruccion = conn.createStatement()) {
				ResultSet tabla = instruccion.executeQuery("Select * from Productos");
				while (tabla.next()) {
					p = new Producto(tabla.getInt(1), tabla.getString(2), tabla.getInt(3), tabla.getInt(4));
					oos.writeObject(p);
				}
			} catch (IOException e) {
				System.out.println(e);
				creado = false;
			} catch (Exception e) {
				System.out.println(e);
				creado = false;
			}
		} catch (Exception e) {
			System.out.println("ERROR al conectarnos a la base de datos " + e.getMessage());
		}

		return creado;
	}

	/*************************************************************/
	/* crearListaProductos */
	/*************************************************************/
	public static ArrayList<Producto> crearListaProductos(String nomFich) {
		ArrayList<Producto> prod = new ArrayList<Producto>();

		try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(nomFich))) {
			Producto p;
			while (true) {
				p = (Producto) ois.readObject();
				prod.add(p);
			}
		} catch (EOFException e) {
		} catch (Exception e) {
			System.out.println(e);
		}
		return prod;

	}

	/*************************************************************/
	/* venderProductos */
	/*************************************************************/
	public static void venderProductos(ArrayList<Producto> prod, String nomFich, Scanner teclado) {

		try (BufferedWriter bw = new BufferedWriter(new FileWriter(nomFich, true))) {
			int resp = 1;
			int cant = 0;
			int num;

			System.out.println("Elija los productos a comprar \n");

			while (resp == 1) {
				for (int i = 0; i < prod.size(); i++) // Numero de elementos del ArrayList
					if (prod.get(i).getCantidad() > 0) // Si hay stock, muestra el producto
						System.out.println(prod.get(i));

				System.out.println("\nIntroducir codigo de producto ");
				num = Integer.parseInt(teclado.nextLine());

				int j = 0;
				int total, codigo;

				// Avanzamos por la lista hasta que encontramos el codigo del producto
				while (j < prod.size() && num != prod.get(j).getCodigo())
					j++;

				// Controlar si el producto no esta o no hay stock suficiente para la cantidad
				// pedida
				if (j == prod.size())
					System.out.println("Producto no encontrado");
				else {
					System.out.println("Introducir cantidad a comprar ");
					cant = Integer.parseInt(teclado.nextLine());

					// Trabajamos con excepciones
					// En la posicion j tenemos el producto que se va a vender
					try {
						prod.get(j).restarCantidad(cant);
						// hay cantidad suficiente de este producto
						total = prod.get(j).getPrecio() * cant;
						codigo = prod.get(j).getCodigo();

						String cadena = codigo + "-" + prod.get(j).getNombre() + "-" + cant + "-" + total + "\n";

						bw.write(cadena);
					} catch (ExcepcionNohayStock e) {
						System.out.println(e.getMessage() + "Disponibles " + prod.get(j).getCantidad() + " unidades.");
					} // Tengo que capturar la excepcion, para permitir que el usuario siga pidiendo
						// articulos

				}

				// Puedo seguir porque no esta el producto y hay cantidad suficiente

				System.out.println("Desea comprar mas?(1.Si/0.No) ");
				resp = Integer.parseInt(teclado.nextLine());
			}

		} catch (Exception e) {
			System.out.println("ERROR CON EL FICHERO DE TEXTO en venderProductos " + e.getMessage());
		}
	}

	/*************************************************************/
	/* leerVendidos */
	/*************************************************************/
	public static void leerVendidos(String nomFich) {

		try (BufferedReader bw = new BufferedReader(new FileReader(nomFich))) {
			String linea;
			int cod, cant, precioTotal;
			String nombre;

			System.out.println("Productos vendidos \n");

			while ((linea = bw.readLine()) != null) {
				// System.out.println("linea " + linea);
				String datos[] = linea.split("-");
				// System.out.println("datos " + datos);

				cod = Integer.parseInt(datos[0]);
				System.out.println("Codigo de producto " + cod);

				nombre = datos[1];
				System.out.println("Nombre de producto " + nombre);

				cant = Integer.parseInt(datos[2]);
				System.out.println("Cantidad de producto vendida " + cant);

				precioTotal = Integer.parseInt(datos[3]);
				System.out.println("Precio pagado " + precioTotal);
			}
		} catch (EOFException e) {
		} catch (Exception e) {
			System.out.println("ERROR CON EL FICHERO DE TEXTO leerVendidos " + e.getMessage());
		}
	}

	/*************************************************************/
	/* actualizarBaseDatosConLista */
	/*************************************************************/
	public static void actualizarBaseDatosConLista(ArrayList<Producto> prod) {
		int cod;
		try (Connection conn = Conexion.conexion(ConstantesBD.URL, ConstantesBD.USUARIO, ConstantesBD.PWD)) {
			try (PreparedStatement ps = conn.prepareStatement("UPDATE  Productos SET cantidad = ? WHERE CODPROD = ?")) {

				System.out.println("Actualizamos la base de datos \n");

				for (int i = 0; i < prod.size(); i++) {
					ps.setInt(1, prod.get(i).getCantidad());
					cod = prod.get(i).getCodigo();
					ps.setInt(2, cod);
					if (ps.executeUpdate() > 0)
						System.out.println("Actualizado en la bd el producto " + cod);
					else
						System.out.println("No se ha actualizado el producto " + cod);
				}
			} catch (Exception e) {
				System.out.println("ERROR al actualizar la base de datos " + e.getMessage());
			}
		} catch (Exception e) {
			System.out.println("ERROR al conectarnos a la base de datos " + e.getMessage());
		}
	}

	/****************************************************************************************/
	/*
	 * Metodos para mostrar el contenido de la base de datos y el fichero
	 * serializado para
	 */
	/* comprobar que tienen el mismo contenido */
	/****************************************************************************************/

	/*************************************************************/
	/* mostrarProductosDeBBDD */
	/*************************************************************/
	public static boolean mostrarProductosDeBBDD() {
		boolean creado = true;

		try (Connection conn = Conexion.conexion(ConstantesBD.URL, ConstantesBD.USUARIO, ConstantesBD.PWD)) {

			try (Statement instruccion = conn.createStatement()) {
				 System.out.println(" ...Leyendo la base de datos...");
				ResultSet tabla = instruccion.executeQuery("Select * from Productos");
				while (tabla.next()) {
					System.out.println("Codigo " + tabla.getInt(1) + " Nombre " + tabla.getString(2) + " Precio unitario "
							+ tabla.getInt(3) + " Stock " + tabla.getInt(4));

				}
			} catch (Exception e) {
				System.out.println(e);
				creado = false;
			}
		} catch (Exception e) {
			System.out.println("ERROR al conectarnos a la base de datos " + e.getMessage());
		}

		return creado;
	}
	
	public static void mostrarProductosDeFichero(String nomFich) {
  	  
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(nomFich))){
            mostrarFichero(ois); 
        }catch (EOFException e) {       	
        }
        catch (Exception e) {
        	System.out.println(e.getMessage());
        }                  
    }
    
    
    public static void mostrarFichero(ObjectInputStream ois) throws Exception {
        Producto producto;
        System.out.println("...Leyendo el fichero...");
        while (true) {
        	producto = (Producto) ois.readObject();
            System.out.println(producto);        
        } 
    }
}
