package Instituto;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

public class TelefonoCambio extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JLabel telefono;
	private JTextField telefono_nuevo;
	private JButton aceptar;
	private JButton cancelar;

	public TelefonoCambio(String matricula) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		telefono = new JLabel("Indique la nueva poblacion");
		telefono.setBounds(139, 67, 209, 30);
		contentPane.add(telefono);
		
		telefono_nuevo = new JTextField();
		telefono_nuevo.setBounds(47, 108, 331, 40);
		contentPane.add(telefono_nuevo);
		telefono_nuevo.setColumns(10);
		
		aceptar = new JButton("Aceptar");
		aceptar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String telefono=telefono_nuevo.getText();
				AccesoDatos.modificarTelefono(matricula, telefono);
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
