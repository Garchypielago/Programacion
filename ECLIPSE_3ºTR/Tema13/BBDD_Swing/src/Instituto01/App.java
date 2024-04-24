package Instituto01;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JLabel;
import com.jgoodies.forms.factories.DefaultComponentFactory;

public class App extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					App frame = new App();
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
	public App() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 540, 345);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton BorrarAlumno = new JButton("Borrar alumno");
		BorrarAlumno.setBounds(15, 25, 130, 25);
		contentPane.add(BorrarAlumno);
		
		JButton MostrarAlumnos = new JButton("Mostrar alumnos");
		MostrarAlumnos.setBounds(15, 75, 130, 25);
		contentPane.add(MostrarAlumnos);
		
		JButton InsertarAlumno = new JButton("Insertar alumno");
		InsertarAlumno.setBounds(15, 205, 130, 25);
		contentPane.add(InsertarAlumno);
		
		JButton ModificarAlumno = new JButton("Modificar alumno");
		ModificarAlumno.setBounds(15, 260, 130, 25);
		contentPane.add(ModificarAlumno);
		
		JLabel lblNewJgoodiesLabel = DefaultComponentFactory.getInstance().createLabel("New JGoodies label");
		lblNewJgoodiesLabel.setBounds(160, 35, 92, 14);
		contentPane.add(lblNewJgoodiesLabel);
	}
}
