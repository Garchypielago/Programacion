package registrado;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;

public class AccesoDatos {
/* Tiene un metodo para probar la lectura de la tabla con el metodo absolute 
 * boolean absolute(int row)   throws SQLException
 * */
	/*
	 * crea BD
	 */
	public static void crearBD(Connection con) {
		if (con == null)
			con = Conexion.conexion(ConstantesBD.URL, ConstantesBD.USUARIO, ConstantesBD.PWD);

		try (Statement st = con.createStatement()) {
			st.execute("drop database if exists Registrados");
			st.execute("create database Registrados");
			st.execute("use Registrados");
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/*
	 * borrarTablaRegistro
	 */
	public static void borrarTablaRegistro(Connection con) {
		if (con == null)
			con = Conexion.conexion(ConstantesBD.URL, ConstantesBD.USUARIO, ConstantesBD.PWD);

		try (Statement st = con.createStatement()) {
			st.execute("drop table if exists registro");
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/*
	 * crearTablaRegistro
	 */
	public static void crearTablaRegistro(Connection con) {
		if (con == null)
			Conexion.conexion(ConstantesBD.URL, ConstantesBD.USUARIO, ConstantesBD.PWD);

		try (Statement st = con.createStatement()) {
			st.execute("CREATE TABLE registro(usuario VARCHAR(30) PRIMARY KEY, email VARCHAR(30), fechaNac DATE)");
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}

		// Podriamos desconectarnos cada vez, depende de las circunstancias de la
		// aplicacion

	}

	/*
	 * rellenarTablaRegistro, en esta versionn se a�aden registros sueltos en el propio metodo
	 */
	public static void rellenarTablaRegistro(Connection con) {
		if (con == null)
			con = Conexion.conexion(ConstantesBD.URL, ConstantesBD.USUARIO, ConstantesBD.PWD);

		String insercion = "INSERT INTO registro(usuario , email , fechaNac) values ( ? , ? , ? )";

		try (PreparedStatement pstmt = con.prepareStatement(insercion);) {
			String user = "Lola";
			String email = "lola@email.es";
			pstmt.setString(1, user);
			pstmt.setString(2, email);

			Date date = Date.valueOf(LocalDate.of(1990, 02, 20));
			pstmt.setDate(3, date);

			pstmt.executeUpdate();
			
			user = "Pepe";
			email = "pepe@email.es";
			pstmt.setString(1, user);
			pstmt.setString(2, email);

			date = Date.valueOf("1990-3-12");// convertimos string en sql date
			pstmt.setDate(3, date);

			pstmt.executeUpdate();			

		} catch (SQLException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	/*
	 * leerRegistrados
	 */
// TYPE_SCROLL_SENSITIVE, si algo cambia en la BD mientras la aplicacion esta recogiendo los datos, se recoge lo modificado
// TYPE_SCROLL_INSENSITIVE, no se recogen las modificaciones hechas mientras se esta recorriendo el ResulSet
	public static void leerRegistrados(Connection con) {
		if (con == null)
			con = Conexion.conexion(ConstantesBD.URL, ConstantesBD.USUARIO, ConstantesBD.PWD);

		try (Statement st1 = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);
				ResultSet rs = st1.executeQuery("select * from registro")) {
			System.out.println("    Usuario\t\tCorreo\t\tFecha de nacimiento\n");
			while (rs.next()) {
				System.out.println(rs.getString(1) + "\t\t" + rs.getString(2) + "\t\t" + rs.getDate(3));
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	/*
	 * leerRegistradosPreparedConVuelta
	 */
	public static void leerRegistradosPreparedConVuelta(Connection con) {
		if (con == null)
			con = Conexion.conexion(ConstantesBD.URL, ConstantesBD.USUARIO, ConstantesBD.PWD);

		try (PreparedStatement pstmt = con.prepareStatement("select * from registro", ResultSet.TYPE_SCROLL_INSENSITIVE,
				ResultSet.CONCUR_UPDATABLE)) {

			ResultSet rs = pstmt.executeQuery();

			System.out.println("    Usuario\t\tCorreo\t\tFecha de nacimiento\n");
			while (rs.next()) {
				System.out.println(rs.getString(1) + "\t\t" + rs.getString(2) + "\t\t" + rs.getDate(3));
			}

			rs.beforeFirst();
			// Ahora quiero empezar desde el ppio de nuevo
			System.out.println("    Usuario\t\tCorreo\t\tFecha de nacimiento\n");
			while (rs.next()) {
				System.out.println(rs.getString(1) + "\t\t" + rs.getString(2) + "\t\t" + rs.getDate(3));
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	/*
	 * leerRegistradosPrepared
	 */
	public static void leerRegistradosPrepared(Connection con, String usuario) {
		if (con == null)
			con = Conexion.conexion(ConstantesBD.URL, ConstantesBD.USUARIO, ConstantesBD.PWD);

		try (PreparedStatement pstmt = con.prepareStatement("select * from registro where usuario = ?")) {

			pstmt.setString(1, usuario); // El 1 se refiere a la primera interrogacion

			ResultSet rs = pstmt.executeQuery();

			System.out.println("    Usuario\t\tCorreo\t\tFecha de nacimiento\n");
			while (rs.next()) {
				System.out.println(rs.getString(1) + "\t\t" + rs.getString(2) + "\t\t" + rs.getDate(3));
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	/*
	 * modificarRegistrados
	 */
	public static void modificarRegistrados(Connection con, String usuario, String nuevoCorreo) {
		if (con == null)
			con = Conexion.conexion(ConstantesBD.URL, ConstantesBD.USUARIO, ConstantesBD.PWD);

		try (PreparedStatement pstmt = con.prepareStatement("update registro set email = ? where usuario = ?")) {

			pstmt.setString(1, nuevoCorreo);
			pstmt.setString(2, usuario);
			int cambiados = pstmt.executeUpdate();

			System.out.println("Cambiado " + cambiados + " registros\n");

		} catch (SQLException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	/*
	 * borrarRegistro
	 */
	public static void borrarRegistro(Connection con, String usuario) {
		if (con == null)
			con = Conexion.conexion(ConstantesBD.URL, ConstantesBD.USUARIO, ConstantesBD.PWD);

		try (PreparedStatement pstmt = con.prepareStatement("delete from registro where usuario = ?")) {
			pstmt.setString(1, usuario);

			int cambiados = pstmt.executeUpdate();
			System.out.println("Borrado " + cambiados + " registros\n");

		} catch (SQLException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
