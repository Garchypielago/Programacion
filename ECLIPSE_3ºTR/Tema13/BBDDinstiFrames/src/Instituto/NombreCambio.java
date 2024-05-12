package Instituto;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class NombreCambio extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JLabel nom_apell;
	private JTextField nombre_nuevo;
	private JButton aceptar;
	private JButton cancelar;

	public NombreCambio(String matricula) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		nom_apell = new JLabel("Indique el nuevo nombre y apellido");
		nom_apell.setBounds(119, 65, 209, 30);
		contentPane.add(nom_apell);
		
		nombre_nuevo = new JTextField();
		nombre_nuevo.setBounds(47, 108, 331, 40);
		contentPane.add(nombre_nuevo);
		nombre_nuevo.setColumns(10);
		
		aceptar = new JButton("Aceptar");
		aceptar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String nombre=nombre_nuevo.getText();
				AccesoDatos.modificarNombre(matricula, nombre);
				dispose();
			}
		});
		aceptar.setBounds(65, 179, 89, 23);
		contentPane.add(aceptar);
		
		cancelar = new JButton("Cancelar");
		cancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		cancelar.setBounds(270, 179, 89, 23);
		contentPane.add(cancelar);
	}
}
