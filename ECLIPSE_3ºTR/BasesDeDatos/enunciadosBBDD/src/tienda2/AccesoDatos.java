package tienda2;

import java.io.BufferedReader;
import java.io.FileReader;
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
		// Nota: hacemos esto para tener presente que podemos perder la conexion, pero esta comprobacion
		// no es suficiente, puede no haber conexión y ser distinto de null
		if (con == null)
			con = Conexion.conexion(ConstantesBD.URL, ConstantesBD.USUARIO, ConstantesBD.PWD);
	}

	
	//repasa de base de ddatos a .dat, y de .dat a array
	public static Tienda guardarTienda(Connection con) {
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

				tienda.add(new Producto(codprod,nombre,precio,cantidad));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}

		return tienda;
	}
	
	public static void actualizarTienda(Connection con, Tienda tienda) {
		
		try {
			PreparedStatement pstmt = con
					.prepareStatement("update productos pr set pr.cantidad= ? where pr.codprod = ?");
			
			for (int i=0;i<tienda.tam();i++) {
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
