package ejercicios;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JSpinner;
import javax.swing.JTextPane;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class ejCompuertas extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ejCompuertas frame = new ejCompuertas();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public ejCompuertas() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JSpinner spinner = new JSpinner();
		spinner.setToolTipText("");
		spinner.setBounds(10, 30, 100, 20);
		contentPane.add(spinner);
		
		JSpinner spinner_1 = new JSpinner();
		spinner_1.setBounds(10, 70, 100, 20);
		contentPane.add(spinner_1);
		
		JSpinner spinner_2 = new JSpinner();
		spinner_2.setBounds(10, 110, 100, 20);
		contentPane.add(spinner_2);
		
		JTextPane txtpnCompuertaNorte = new JTextPane();
		txtpnCompuertaNorte.setText("Compuerta norte");
		txtpnCompuertaNorte.setToolTipText("");
		txtpnCompuertaNorte.setBounds(135, 30, 141, 20);
		contentPane.add(txtpnCompuertaNorte);
		
		JTextPane txtpnCompuertaOeste = new JTextPane();
		txtpnCompuertaOeste.setToolTipText("");
		txtpnCompuertaOeste.setText("Compuerta oeste");
		txtpnCompuertaOeste.setBounds(135, 70, 141, 20);
		contentPane.add(txtpnCompuertaOeste);
		
		JTextPane txtpnCompuertaSur = new JTextPane();
		txtpnCompuertaSur.setToolTipText("");
		txtpnCompuertaSur.setText("Compuerta sur");
		txtpnCompuertaSur.setBounds(135, 110, 141, 20);
		contentPane.add(txtpnCompuertaSur);
		
		JSpinner spinner_2_1 = new JSpinner();
		spinner_2_1.setBounds(10, 150, 100, 20);
		contentPane.add(spinner_2_1);
		
		JTextPane txtpnCompuertaSur_1 = new JTextPane();
		txtpnCompuertaSur_1.setToolTipText("");
		txtpnCompuertaSur_1.setText("Compuerta sur");
		txtpnCompuertaSur_1.setBounds(135, 150, 141, 20);
		contentPane.add(txtpnCompuertaSur_1);
		
		JButton btnNewButton = new JButton("Actualizar caudal");
		btnNewButton.setBounds(10, 210, 170, 23);
		contentPane.add(btnNewButton);
		
		JLabel lblNewLabel = new JLabel("-");
		lblNewLabel.setVerticalAlignment(SwingConstants.TOP);
		lblNewLabel.setHorizontalAlignment(SwingConstants.LEFT);
		lblNewLabel.setBounds(230, 210, 194, 40);
		contentPane.add(lblNewLabel);
	}
}
