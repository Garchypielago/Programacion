package america01;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import Instituto01.Conexion;
import Instituto01.ConstantesBD;


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

	/*
	 * borrarTablaRegistro
	 */
	public static void borrarTablaRegistro(Connection con) {
		if (con == null)
			con = Conexion.conexion(ConstantesBD.URL, ConstantesBD.USUARIO, ConstantesBD.PWD);

		try (Statement st = con.createStatement()) {
			st.execute("drop table if exists personaspaises");
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
			st.execute("CREATE TABLE PersonasPaises ("
					+ " ID_per int(11) not null PRIMARY KEY,"
					+ " NOMBRE VARCHAR(15),"
					+ " APELLIDO VARCHAR(15),"
					+ " EDAD INT(4),"
					+ " PAIS VARCHAR(15),"
					+ " TAMANIO VARCHAR(15),"
					+ " FOREIGN KEY (ID_per)  REFERENCES PERSONAS (ID) ON DELETE CASCADE)");
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	/*
	 * rellenarTablaRegistro, en esta versionse aniaden registros sueltos en el
	 * propio metodo
	 */
	public static void rellenarTablaRegistro(Connection con) {
		if (con == null)
			con = Conexion.conexion(ConstantesBD.URL, ConstantesBD.USUARIO, ConstantesBD.PWD);

		String insercion = "INSERT INTO personaspaises values ( ? , ? , ?, ? , ? , ? );";

		try (PreparedStatement pstmt = con.prepareStatement(insercion);) {
			String  nom, ape, nompais, tamanio;
			int id, edad;
			int cambiados = 0;
			
			PreparedStatement pstmt2= con.prepareStatement("select pe.id, pe.nombre, pe.apellido, pe.edad, pa.nombre, pa.tamanio "
					+ " from personas pe"
					+ " join paises pa on pa.id=pe.pais;");
			
			ResultSet rs;
			rs = pstmt2.executeQuery();

			while(rs.next()) {
				id=rs.getInt(1);
				nom=rs.getString(2);
				ape=rs.getString(3);
				edad=rs.getInt(4);
				nompais=rs.getString(5);
				tamanio=rs.getString(6);

				pstmt.setInt(1, id);
				pstmt.setString(2, nom);
				pstmt.setString(3, ape);
				pstmt.setInt(4, edad);
				pstmt.setString(5, nompais);
				pstmt.setString(6, tamanio);
				
				cambiados += pstmt.executeUpdate();
			}	

			System.out.println("Actualizadas " + cambiados + " personas\n");

		} catch (SQLException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/*
	 * leerRegistrados
	 */
	public static void leerRegistrados(Connection con) {

	}

	/*
	 * leerRegistradosPrepared
	 */
	public static void leerRegistradosPrepared(Connection con, String usuario) {

	}

	/*
	 * modificarRegistrado
	 */
	public static void modificarRegistrado(Connection con, String usuario, String nuevoCorreo) {

	}

	/*
	 * borrarRegistro
	 */
	public static void borrarRegistros(Connection con) {
		if (con == null)
			con = Conexion.conexion(ConstantesBD.URL, ConstantesBD.USUARIO, ConstantesBD.PWD);

		try (Statement stmt = con.createStatement()) {
			stmt.execute("delete from PersonasPaises;");
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	/*
	 * sumar 1 a la edad de personas de Costa Rica
	 */
	public static void sumarCostaRica(Connection con) {
		if (con == null)
			con = Conexion.conexion(ConstantesBD.URL, ConstantesBD.USUARIO, ConstantesBD.PWD);

		String insercion = "update personaspaises pp set pp.edad= (pp.edad + 1) where pp.pais='Costa Rica' ;";

		try (PreparedStatement pstmt = con.prepareStatement(insercion);) {
			int cambiados = 0;
				cambiados += pstmt.executeUpdate();
			System.out.println("Actualizadas " + cambiados + " personas de Costa Rica\n");

		} catch (SQLException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
