package main;

import java.sql.Connection;
import java.util.Scanner;

import bbdd.*;
import ficheros.Fichero;

public class pruebas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		Connection con = Conexion.conexion(ConstantesBD.URL, ConstantesBD.USUARIO, ConstantesBD.PWD);
		
		AccesoDatos.volcarFich(con);
		
		Fichero.mostrarCoches();
		
		AccesoDatos.mostrarCoches(con);
		
		//falta los borraods pero es lo mas facil con java nio
		
		Conexion.desConexion(con);	
	}

}
