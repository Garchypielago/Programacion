package tienda2;

import java.io.BufferedReader;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.*;

public class AccesoDatos {

	/*
	 * crea BD
	 */
	public static void crearBD(Connection con) {
		// Nota: hacemos esto para tener presente que podemos perder la conexion, pero
		// esta comprobacion
		// no es suficiente, puede no haber conexión y ser distinto de null
		if (con == null)
			con = Conexion.conexion(ConstantesBD.URL, ConstantesBD.USUARIO, ConstantesBD.PWD);
	}

	// BBDD : Array
	public static Tienda bbddArray(Connection con) {
		Tienda tienda = new Tienda();

		try {
			PreparedStatement pstmt = con
					.prepareStatement("select pr.codprod, pr.nombre, pr.cantidad, pr.precio from productos pr");
			String nombre;
			int codprod, cantidad, precio;

			ResultSet rs;
			rs = pstmt.executeQuery();

			while (rs.next()) {
				codprod = rs.getInt(1);
				nombre = rs.getString(2);
				cantidad = rs.getInt(3);
				precio = rs.getInt(4);

				tienda.add(new Producto(codprod, nombre, precio, cantidad));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}

		return tienda;
	}

	// Array : Fichero
	public static void arrayFICH(Connection con, Tienda tienda, String FICH) {
		try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(FICH))) {
			File f1 = new File(FICH);
			f1.delete();

			for (int i = 0; i < tienda.tam(); i++) {
				oos.writeObject(tienda.getProducto(i));
			}

			oos.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	// Fichero : BBDD
	public static void FICHbbdd(Connection con, String FICH) {
		Producto pro;

		try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(FICH))) {
			PreparedStatement pstmt = con
					.prepareStatement("update productos pr set pr.cantidad= ? where pr.codprod = ?");

			try {
				while (true) {
					pro = (Producto) ois.readObject();
					pstmt.setInt(1, pro.getCantidad());
					pstmt.setInt(2, pro.getCodigo());
					pstmt.executeUpdate();
				}
			} catch (EOFException ex) {
			}
			ois.close();

		} catch (SQLException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	// BBDD : Fichero
	public static void bbddFICH(Connection con, String FICH) {
		Producto pro;

		try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(FICH))) {
			File f1 = new File(FICH);
			f1.delete();

			PreparedStatement pstmt = con
					.prepareStatement("select pr.codprod, pr.nombre, pr.cantidad, pr.precio from productos pr");
			String nombre;
			int codprod, cantidad, precio;

			ResultSet rs;
			rs = pstmt.executeQuery();

			while (rs.next()) {
				codprod = rs.getInt(1);
				nombre = rs.getString(2);
				cantidad = rs.getInt(3);
				precio = rs.getInt(4);

				pro = new Producto(codprod, nombre, precio, cantidad);

				oos.writeObject(pro);
			}

			oos.close();
		} catch (EOFException ex) {
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	// Fichero : Array
	public static Tienda FICHarray(Connection con, String FICH) {
		Tienda tienda = new Tienda();
		Producto pro;

		try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(FICH))) {
			try {
				while (true) {
					pro = (Producto) ois.readObject();
					tienda.add(pro);
				}
			} catch (EOFException ex) {
			}

			ois.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return tienda;
	}

	// Array : BBDD
	public static void arrayBBDD(Connection con, Tienda tienda) {

		try {
			PreparedStatement pstmt = con
					.prepareStatement("update productos pr set pr.cantidad= ? where pr.codprod = ?");

			for (int i = 0; i < tienda.tam(); i++) {
				pstmt.setInt(1, tienda.getProducto(i).getCantidad());
				pstmt.setInt(2, tienda.getProducto(i).getCodigo());
				pstmt.executeUpdate();
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void compararBBDDFICH(Connection con, String FICH) {
		Producto pro;
		try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(FICH))) {
			PreparedStatement pstmt = con
					.prepareStatement("select pr.codprod, pr.nombre, pr.cantidad, pr.precio from productos pr");
			String nombre;
			int codprod, cantidad, precio;

			ResultSet rs;
			rs = pstmt.executeQuery();

			while (rs.next()) {
				codprod = rs.getInt(1);
				nombre = rs.getString(2);
				cantidad = rs.getInt(3);
				precio = rs.getInt(4);

				pro = new Producto(codprod, nombre, precio, cantidad);

				if (!pro.comprobar((Producto)ois.readObject())) {
					throw new Excepciones("ERROR: BBDD no actualizada.");
				}
			}

			System.out.println("BBDD sincronizadas");
			ois.close();
		} catch (EOFException ex) {
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (Excepciones e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void resetearTienda(Connection con, String FICH_RESET) {
		if (con == null)
			con = Conexion.conexion(ConstantesBD.URL, ConstantesBD.USUARIO, ConstantesBD.PWD);

		try (PreparedStatement pst = con.prepareStatement("delete from productos;");
				BufferedReader br = new BufferedReader(new FileReader(FICH_RESET))) {
			pst.executeUpdate();

			String frase;
			while ((frase = br.readLine()) != null) {
				pst.executeUpdate(frase);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
