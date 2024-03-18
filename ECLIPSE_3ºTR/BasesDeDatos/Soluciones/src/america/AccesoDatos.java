package america;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class AccesoDatos {
	/*
	 * borrarPersonasPaises
	 */
	public static void borrarPersonasPaises(Connection con) {
		if (con == null)
			con = Conexion.conexion(ConstantesBD.URL, ConstantesBD.USUARIO, ConstantesBD.PWD);

		try (Statement st = con.createStatement()) {
			st.execute("drop table if exists PersonasPaises");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}


	/*
	 * crearPersonasPaises: con prepareStatement
	 * 
	 * Con preparedStatement y realizando la creación de la tabla junto con la
	 * insercion de los datos de la tabla
	 */
	public static void crearPersonasPaises(Connection con) {
		if (con == null)
			Conexion.conexion(ConstantesBD.URL, ConstantesBD.USUARIO, ConstantesBD.PWD);

		try (PreparedStatement pstm = con.prepareStatement(
				"create table PersonasPaises(Id int primary key, nPersona varchar(15), Apellido varchar(15), "
						+ "				Edad int, nombrePais varchar(15),tamanio varchar(15)) "
						+ "				select personas.id as Id, personas.nombre as nPersona, personas.apellido, edad, paises.nombre as nombrePais, "
						+ "				tamanio from personas inner join paises on paises.id=personas.pais")) {
			// No se pueden parametrizar ni campos ni nombre de la tabla
			pstm.execute();
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	/*
	 * Con preparedStatement, creamos la tabla e insertamos los datos en dos
	 * procesos separados
	 */
	public static void crearTablaPersonasPaises(Connection con) {
		if (con == null)
			Conexion.conexion(ConstantesBD.URL, ConstantesBD.USUARIO, ConstantesBD.PWD);

		try (PreparedStatement pstm = con.prepareStatement(
				"create table PersonasPaises(IdPersona int primary key, nombrePersona varchar(15), apellidoPersona varchar(15),"
						+ " edad int, nombrePais varchar(15), tamPais varchar(15),"
						+ " foreign key(IdPersona) references Personas(id))")) {
			// No se pueden parametrizar ni campos ni nombre de la tabla
			pstm.execute();
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	public static void insertarPersonasPaises(Connection con) {
		if (con == null)
			Conexion.conexion(ConstantesBD.URL, ConstantesBD.USUARIO, ConstantesBD.PWD);

		try (PreparedStatement pstmt = con.prepareStatement(
				"insert into PersonasPaises select personas.id, personas.nombre, personas.apellido, edad,"
						+ " paises.nombre, tamanio from personas inner join paises on paises.id=personas.pais");) {
			pstmt.executeUpdate();

		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	/*
	 * actualizarPersonasPaises con preparedStament
	 */
	public static void actualizarPersonasPaises(Connection con, String pais) {
		if (con == null)
			con = Conexion.conexion(ConstantesBD.URL, ConstantesBD.USUARIO, ConstantesBD.PWD);

		try (PreparedStatement pstmt1 = con
				.prepareStatement("update personaspaises set edad=edad+1 where nombrePais = ?")) {
			pstmt1.setString(1, pais);
			pstmt1.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	/*
	 * imprimirNotasFinales
	 */
	public static void imprimirPersonasPaises(Connection con) {
		if (con == null)
			con = Conexion.conexion(ConstantesBD.URL, ConstantesBD.USUARIO, ConstantesBD.PWD);

		try (PreparedStatement pstmt = con.prepareStatement("select * from personaspaises");) {
			ResultSet rs = pstmt.executeQuery();
			while (rs.next()) {
				System.out.println(rs.getInt(1) + " " + rs.getString(2) + " " + rs.getString(3) + " " + rs.getInt(4)
						+ " " + rs.getString(5) + " " + rs.getString(6));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

}
