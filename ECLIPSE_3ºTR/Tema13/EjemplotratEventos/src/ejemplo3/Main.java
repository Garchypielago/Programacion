package ejemplo3;

import java.awt.EventQueue;

import javax.swing.JOptionPane;

public class Main {	
	public static void main(String[] args) {
		// De esta forma el programa y el GUI con manejo de eventos se realizan en hilos diferentes
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					new ImageViewer();					
				} catch (Exception e) {
					e.printStackTrace();
					JOptionPane.showMessageDialog(null, e.getMessage());
				}
			}
		});
	}
}
