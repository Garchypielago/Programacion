package tienda2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.*;
import java.nio.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Tienda {

	ArrayList<Producto> tienda;
	final static String FICH = "vendidos.txt";

	public Tienda() {
		super();
		tienda = new ArrayList<Producto>();

		try (BufferedWriter bw = new BufferedWriter(new FileWriter(FICH, true))) {

			bw.write("Cod." + " - " + "Nombre" + " - " + "Cant." + " - " + "Total€");
			bw.newLine();
			System.out.println("Producto comprado y registrado.");

		} catch (Exception e) {
			System.out.println("ERROR DE ESCRITURA " + e);
		}

	}

	public void add(Producto pr) {
		tienda.add(pr);
	}

	public void leer() {
		System.out.println();
		for (int i = 0; i < tienda.size(); i++) {
			if (tienda.get(i).getCantidad() > 0)
				System.out.println(tienda.get(i));
		}
		System.out.println();
	}

	public int tam() {
		return tienda.size();
	}

	public Producto getProducto(int i) {
		return tienda.get(i);
	}

	public void comprar(int cod, int cant) {
		try {
			boolean existe = false;
			for (int i = 0; i < tienda.size(); i++) {
				if (tienda.get(i).getCodigo() == cod) {
					existe = true;
					tienda.get(i).vender(cant);

					try (BufferedWriter bw = new BufferedWriter(new FileWriter(FICH, true))) {

						bw.write(cod + " - " + tienda.get(i).getNombre() + " - " + cant + " - "
								+ cant * tienda.get(i).getPrecio());
						bw.newLine();
						System.out.println("Producto comprado y registrado.");

					} catch (Exception e) {
						System.out.println("ERROR DE ESCRITURA " + e);
					}
				}
			}
			if (!existe)
				throw new Excepciones("Error: Ese prodcuto no existe");
		} catch (Excepciones e) {
			System.out.println();
			System.out.println(e.getMessage());
			System.out.println();
		}
	}

	public void leerTXT() {
		try (BufferedReader br = new BufferedReader(new FileReader(FICH))) {
			while (br.ready()) {
				System.out.println(br.readLine());
			}
		} catch (Exception e) {
			System.out.println("ERROR DE LECTURA");
		}
	}

	public static void borrarTXT() {
		Path path = Paths.get(FICH);
		try {
			Files.deleteIfExists(path);
		} catch (IOException e) {
			System.err.println(e);
			System.exit(1);
		}
	}
}
