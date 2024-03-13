package solucion2;

public class Disco {
	private String titulo;
	private int vendidos;

	public Disco(String tit, int v) {
		titulo = tit;
		vendidos = v;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(int v) {
		vendidos = v;
	}
	
	public int getDVendidos() {
		return vendidos;
	}

	public void setDvendidos(int v) {
		vendidos = v;
	}
	
	public String toString() {
		return "Disco: " + titulo + "Vendidos: " + vendidos + "\n";
	}
}