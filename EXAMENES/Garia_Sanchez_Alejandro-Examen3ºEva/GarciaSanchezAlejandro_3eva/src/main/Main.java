package main;

import bbdd.AccesoDatos;
import ficheros.Citas_obj;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Creamos bbdd si no esta");
		AccesoDatos.crearBBDD();
		System.out.println("Creamos tabla si no esta");
		AccesoDatos.crearTabla();
		System.out.println("rellenamos tabla si no esta");
		AccesoDatos.rellenarDesdeTXT();
		System.out.println("Mostramos tabla");
		AccesoDatos.mostrarBBDD();

		System.out.println("Escribimos Fichero .obj");
		Citas_obj.escribirFichero();
		System.out.println("Mostramos Fichero .obj");
		Citas_obj.mostrarFichero();
		
		//este metodo lo tengo copleto pero me falta el borrado y sobreescribirlo con el nuevo ordenado y limpio
//		System.out.println("Ordenamos y limpiamos Fichero .obj");
//		Citas_obj.OrdenarObj(Citas_obj.limpiarObj());
		System.out.println("Mostramos Fichero .obj");
		Citas_obj.mostrarFichero();
		

//		System.out.println("Borramos tabla");
//		AccesoDatos.borrarTabla();
	}

}
