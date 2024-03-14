package empresa;

import java.sql.Connection;
import java.util.ArrayList;
import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Connection conexion = Conexion.conexion(ConstantesBD.URL, ConstantesBD.USUARIO, ConstantesBD.PWD);

		AccesoDatos.resetearDeptno(conexion);

		ArrayList<Departamento> D = AccesoDatos.listarDeptno(conexion);

		System.out.println(D);

		AccesoDatos.insertarDeptno(conexion, 50, "TIC", "Loeches");

		Departamento dept = new Departamento("EMP", "Tj", 60);

		AccesoDatos.insertarDeptno(conexion, dept);

		D = AccesoDatos.listarDeptno(conexion);

		System.out.println(D);

		AccesoDatos.borrarDeptno(conexion, 60);

		AccesoDatos.actualizarDeptno(conexion, 50, "LOECHES");

		Departamento dept2 = new Departamento("EMP", "Alcala", 60);

		AccesoDatos.insertarDeptno(conexion, dept);

		AccesoDatos.actualizarDeptno(conexion, dept2);
		
		AccesoDatos.subirSalario(conexion, 20, 0.5);

		Conexion.desConexion(conexion);
	}

}
