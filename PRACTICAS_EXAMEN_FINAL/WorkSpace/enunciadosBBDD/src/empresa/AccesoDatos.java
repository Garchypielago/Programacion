package empresa;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Scanner;

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

	public static void resetearDeptno(Connection con) {
		if (con == null)
			con = Conexion.conexion(ConstantesBD.URL, ConstantesBD.USUARIO, ConstantesBD.PWD);
		try {
			PreparedStatement pstmt = con
					.prepareStatement("delete from departamentos where dept_no not in (10, 20, 30, 40);");

			pstmt.executeUpdate(); // update no query
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void insertarDeptno(Connection con, int num, String nombre, String locate) {
		if (con == null)
			con = Conexion.conexion(ConstantesBD.URL, ConstantesBD.USUARIO, ConstantesBD.PWD);
		try {
			PreparedStatement pstmt = con.prepareStatement(
					"insert into departamentos values (" + num + ", '" + nombre + "', '" + locate + "');");

			pstmt.executeUpdate(); // update no query
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public static void insertarDeptno(Connection con, Departamento dept) {
		if (con == null)
			con = Conexion.conexion(ConstantesBD.URL, ConstantesBD.USUARIO, ConstantesBD.PWD);
		try {
			PreparedStatement pstmt = con.prepareStatement("insert into departamentos values (?, ?, ?);");
			pstmt.setInt(1, dept.getCod());
			pstmt.setString(2, dept.getNombre());
			pstmt.setString(3, dept.getLocate());

			pstmt.executeUpdate(); // update no query
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	public static ArrayList<Departamento> listarDeptno(Connection con) {
		ArrayList<Departamento> deptnos = new ArrayList<Departamento>();

		try {
			PreparedStatement pstmt = con
					.prepareStatement("select de.dept_no, de.dnombre, de.loc from departamentos de");
			String nombre, locate;
			int num;

			ResultSet rs;
			rs = pstmt.executeQuery();

			while (rs.next()) {
				num = rs.getInt(1);
				nombre = rs.getString(2);
				locate = rs.getString(3);

				deptnos.add(new Departamento(nombre, locate, num));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}

		return deptnos;
	}

	public static void borrarDeptno(Connection con, int num) {
		boolean eliminado = false;
		try (PreparedStatement pstmt = con.prepareStatement("delete from departamentos" + " where dept_no = ? ;");) {
			pstmt.setInt(1, num);
			pstmt.executeUpdate();
			eliminado = true;
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void actualizarDeptno(Connection con, int num, String locate) {
		try (PreparedStatement pstmt = con.prepareStatement("update departamentos set loc = ? where dept_no = ? ;");) {
			pstmt.setString(1, locate);
			pstmt.setInt(2, num);
			pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static void actualizarDeptno(Connection con, Departamento dep) {
		try (PreparedStatement pstmt = con
				.prepareStatement("update departamentos set loc = ?, dnombre = ? where dept_no = ? ;");) {
			pstmt.setString(1, dep.getLocate());
			pstmt.setString(2, dep.getNombre());
			pstmt.setInt(3, dep.getCod());
			pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static Departamento devolverDeptno(Connection con, int num) {
		Departamento dep = null;

		try (PreparedStatement pstmt = con.prepareStatement(
				"select de.dept_no, de.dnombre, de.loc from departamentos de where de.dept_no = ? ;")) {

			pstmt.setInt(1, num);
			ResultSet rs;
			rs = pstmt.executeQuery();

			dep = new Departamento(rs.getString(1), rs.getString(2), rs.getInt(3));

		} catch (SQLException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return dep;
	}

	public static void subirSalario(Connection con, int num, double sal) {
		try (PreparedStatement pstmt = con.prepareStatement(
				"update empleados set salario = (salario + " + sal + ") where dept_no = " + num + ";")) {

			pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
