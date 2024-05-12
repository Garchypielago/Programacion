package institutoPrepared;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

// En algunos metodos he parametrizado los nombres de las tablas, pero no lo veo muy necesario
// En el ultimo metodo implica demasiada complejidad para usar en la query que hay que hacer
public class AccesoDatos {
	/*
	 * borrarNotasFinales
	 */
	public static void borrarNotasFinales(Connection con, String nombreTabla) {
		if (con == null)
			con = Conexion.conexion(ConstantesBD.URL, ConstantesBD.USUARIO, ConstantesBD.PWD);

		try (Statement st = con.createStatement()) {
			st.execute("drop table if exists " + nombreTabla);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	/*
	 * crearNotasFinales
	 */
	public static void crearNotasFinales(Connection con, String nombreTabla) {
		if (con == null)
			Conexion.conexion(ConstantesBD.URL, ConstantesBD.USUARIO, ConstantesBD.PWD);

		// no podemos crear y rellenar la tabla con un select porque hay un campo
		// calculado: notamedia
		try (Statement st = con.createStatement()) {
			st.execute("create table " + nombreTabla
					+ " (MAT varchar(10),  COD tinyint(2) NOT NULL DEFAULT '0', NOTAMEDIA float(2,1), primary key(MAT,COD), "
					+ "FOREIGN KEY (MAT)  REFERENCES ALUMNOS (MAT) ON DELETE CASCADE, "
					+ "FOREIGN KEY (COD) REFERENCES  ASIGNATURAS (COD))");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		// Podriamos desconectarnos cada vez, depende de las circunstancias de la
		// aplicacion

	}

	/*
	 * rellenarNotasFinales1 con preparedStatement y dos consultas
	 */
	public static void rellenarNotasFinales1(Connection con, String nombreTabla1, String nombreTabla2) {
		if (con == null)
			con = Conexion.conexion(ConstantesBD.URL, ConstantesBD.USUARIO, ConstantesBD.PWD);

		try (PreparedStatement pstmt1 = con.prepareStatement("select MAT, COD, (NOTA1 + NOTA2 + NOTA3 )/3 from " + nombreTabla1);

				PreparedStatement pstmt2 = con.prepareStatement("insert into " + nombreTabla2 + " values(?, ?, ?)")) {

			ResultSet rs1 = pstmt1.executeQuery();
			while (rs1.next()) {
				
				pstmt2.setString(1, rs1.getString(1));
				pstmt2.setInt(2, rs1.getInt(2));
				pstmt2.setDouble(3, rs1.getDouble(3)); // La media calculada

				pstmt2.executeUpdate();
				// Ojo, en las preparadas no hay que escribir parametros en los execute
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

//	rellenarNotasFinales1 con preparedStatement y una sola consulta
	public static void rellenarNotasFinales2(Connection con, String nombreTabla1, String nombreTabla2) {
		if (con == null)
			con = Conexion.conexion(ConstantesBD.URL, ConstantesBD.USUARIO, ConstantesBD.PWD);
      
		String sentencia = "insert into " + nombreTabla2 + "(select MAT, COD, (NOTA1 + NOTA2 + NOTA3 )/3 from " + nombreTabla1 + ")";

		try (PreparedStatement pstmt = con.prepareStatement(sentencia)) {
				pstmt.executeUpdate();
				// Ojo, en las preparadas no hay que escribir parametros en los execute
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	/*
	 * imprimirNotasFinales podria parametrizar los nombres de las tablas, pero son
	 * muchas ya...
	 */
	public static void imprimirNotasFinales(Connection con) {
		if (con == null)
			con = Conexion.conexion(ConstantesBD.URL, ConstantesBD.USUARIO, ConstantesBD.PWD);

		
		try (PreparedStatement pstmt = con.prepareStatement(
				"select rpad(apel_nom, 25, ' '), rpad(nombre, 25, ' '),"
				+ "		nota1, nota2, nota3, notamedia from alumnos"
				+ "		INNER JOIN notas ON alumnos.mat=notas.mat"
				+ "		INNER JOIN asignaturas ON asignaturas.cod=notas.cod"
				+ "		INNER JOIN notasfinales ON asignaturas.cod=notasfinales.cod"
				+ "		AND alumnos.mat=notasfinales.mat",
				ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE)) {

			ResultSet rs = pstmt.executeQuery();

			System.out.println("Nombre Alumno\t\tNombre Asignatura\tNota 1\tNota 2\tNota 3\tNotaMedia \n");
			while (rs.next()) {
				System.out.println(rs.getString(1) + rs.getString(2) + rs.getInt(3) + "\t " + rs.getInt(4) + "\t "
						+ rs.getInt(5) + "\t " + rs.getDouble(6));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}


}
