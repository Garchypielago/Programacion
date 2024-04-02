package resulSetActualizable;

import java.sql.*;
import java.util.Scanner;

/**
 * Programa que demuestra el uso de Result Set actualizables.
 * 
 * @author Esther
 */
public class EjemploActualizable {

	public static void main(String[] args) {
		String url = "jdbc:mysql://localhost/instituto";
		String username = "root";
		String password = "";

		Scanner sc = new Scanner(System.in);

		try (Connection con = DriverManager.getConnection(url, username, password)) {
			// Para actualizar tenemos que elegir una clave primaria ?? y solo se puede si se
			// hace el select de una sola tabla
			String sql = "SELECT * FROM alumnos";

			Statement statement = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);

			ResultSet resultado = statement.executeQuery(sql);

			System.out.println("Introduce un número de fila: ");
			int fila = Integer.parseInt(sc.nextLine());

			if (resultado.absolute(fila)) {
				leerInfoAlumno("Alumno en la fila " + fila + ": ", resultado);

				System.out.println("Quieres actualizar este alumno (S/N): ");
				String respuesta = sc.nextLine();

				if (respuesta.equalsIgnoreCase("S")) {

					System.out.println("Nueva matricula: ");
					String matricula = sc.nextLine();

					System.out.println("Nuevo nombre: ");
					String nombreApel = sc.nextLine();

					resultado.updateString("mat", matricula);
					resultado.updateString("apel_nom", nombreApel);

					resultado.updateRow();

					System.out.println("El alumno en la " + fila + " ha sido actualizado.");
				}

				System.out.println("Quieres borrar este alumno (S/N): ");
				respuesta = sc.nextLine();

				if (respuesta.equalsIgnoreCase("S")) {
					resultado.deleteRow();
					System.out.println("El alumno en la " + fila + " ha sido borrado.");
				}

				System.out.println("Quieres insertar un nuevo alumno (S/N): ");
				respuesta = sc.nextLine();

				if (respuesta.equalsIgnoreCase("S")) {
					resultado.moveToInsertRow();

					System.out.println("Nueva matricula: ");
					String matricula = sc.nextLine();

					System.out.println("Nuevo nombre: ");
					String nombreApel = sc.nextLine();
					// Hay que meter todos los datos que sean obligatorios

					resultado.updateString("mat", matricula);
					resultado.updateString("apel_nom", nombreApel);

					resultado.insertRow();

					resultado.moveToCurrentRow();

					System.out.println("Se ha insertado un alumno nuevo.");
				}
			} else {
				System.out.println("No hay alumnos en la fila " + fila);
			}

			Statement stmt = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
			
			// Podemos comprobar a movernos sin permiso por el Resul Set:
			//Statement stmt = con.createStatement(ResultSet.TYPE_FORWARD_ONLY, ResultSet.CONCUR_READ_ONLY);
			
			ResultSet rs = stmt.executeQuery("SELECT * FROM alumnos;");

			rs.last();
			while (rs.previous())
				System.out.println(rs.getString(1));

		} catch (SQLException ex) {
			ex.printStackTrace();
		}

		sc.close();

	}

	private static void leerInfoAlumno(String posicion, ResultSet resultado) throws SQLException {
		String matricula = resultado.getString("mat");
		String apeNombre = resultado.getString("apel_nom");

		String infoAlumno = "%s: %s - %s\n";
		System.out.format(infoAlumno, posicion, matricula, apeNombre);
	}
}
