package Instituto01;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;

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

	}

	/*
	 * rellenarTablaRegistro, en esta versionse aniaden registros sueltos en el
	 * propio metodo
	 */
	public static void rellenarTablaRegistro(Connection con) {

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
	 * borrarNotasFinales
	 */
	public static void borrarNotasFinales(Connection con) {
		if (con == null)
			con = Conexion.conexion(ConstantesBD.URL, ConstantesBD.USUARIO, ConstantesBD.PWD);

		try (Statement stmt = con.createStatement()) {
			stmt.execute("delete from NotasFinales;");
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
	
	/*
	 * NotasFinales
	 */
	public static void crearTbalaNotasFinales(Connection con) {
		if (con == null)
			Conexion.conexion(ConstantesBD.URL, ConstantesBD.USUARIO, ConstantesBD.PWD);

		try (Statement st = con.createStatement()) {
			st.execute("CREATE TABLE NotasFinales ("
					+ " COD tinyint(2) not null default '0',"
					+ " MAT VARCHAR(10) not null,"
					+ " NotaMedia tinyint(2),"
					+ " FOREIGN KEY (COD) REFERENCES  ASIGNATURAS (COD),"
					+ " FOREIGN KEY (MAT)  REFERENCES ALUMNOS (MAT) ON DELETE CASCADE,"
					+ " primary key (COD, MAT))");
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void rellenarTablaNotasFinales(Connection con) {
		if (con == null)
			con = Conexion.conexion(ConstantesBD.URL, ConstantesBD.USUARIO, ConstantesBD.PWD);

		String insercion = "INSERT INTO NotasFinales(COD, MAT, NotaMedia) values ( ? , ? , ? );";

		try (PreparedStatement pstmt = con.prepareStatement(insercion);) {
			String COD;
			String MAT;
			int notaFinal;
			int cambiados = 0;
			
			PreparedStatement pstmt2= con.prepareStatement("select * from notas;");
			
			ResultSet rs;
			rs = pstmt2.executeQuery();

			while(rs.next()) {
				COD=rs.getString("COD");
				MAT=rs.getString("MAT");
				
				notaFinal= (rs.getInt("NOTA1")+rs.getInt("NOTA2")+rs.getInt("NOTA3") )/3;
				
				pstmt.setNString(1, COD);
				pstmt.setNString(2, MAT);
				pstmt.setInt(3, notaFinal);
				

				cambiados += pstmt.executeUpdate();
			}	

			System.out.println("Actualizadas " + cambiados + " notas\n");

		} catch (SQLException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
	
}
