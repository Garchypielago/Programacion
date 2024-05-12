package Instituto;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JLabel;

import javax.swing.JTextArea;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.ActionEvent;

public class App extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField matriculaModificar;
	private JTextField matriculaBorrar;
	private JTextArea listaAlumno;
	private JLabel matricula_1;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					App frame = new App();
					frame.setVisible(true);
					frame.addWindowListener(new WindowAdapter() {
						public void windowClosing(WindowEvent e) {
							System.exit(0);
						}
					});
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
		setBounds(100, 100, 765, 445);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		JButton borrarAlumno = new JButton("Borrar alumno");
		borrarAlumno.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String matricula=matriculaBorrar.getText();
				AccesoDatos.borrarAlumno(matricula);
			}
		});
		borrarAlumno.setBounds(15, 25, 130, 25);
		contentPane.add(borrarAlumno);

		JButton mostrarAlumnos = new JButton("Mostrar alumnos");
		mostrarAlumnos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				listaAlumno.setText(AccesoDatos.stringInstituto());
			}
		});
		mostrarAlumnos.setBounds(15, 75, 130, 25);
		contentPane.add(mostrarAlumnos);

		JButton insertarAlumno = new JButton("Insertar alumno");
		insertarAlumno.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				EventQueue.invokeLater(new Runnable() {
					public void run() {
						try {
							IntroducirAlumno frame = new IntroducirAlumno();
							frame.setVisible(true);
						} catch (Exception e) {
							e.printStackTrace();
						}
					}
				});
			}
		});
		insertarAlumno.setBounds(15, 305, 130, 25);
		contentPane.add(insertarAlumno);

		JButton modificarAlumno = new JButton("Modificar alumno");
		modificarAlumno.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				EventQueue.invokeLater(new Runnable() {
					public void run() {
						try {
							OpcionesCambio frame = new OpcionesCambio(matriculaModificar.getText());
							frame.setVisible(true);
						} catch (Exception e) {
							e.printStackTrace();
						}
					}
				});
			}
		});
		modificarAlumno.setBounds(15, 355, 130, 25);
		contentPane.add(modificarAlumno);

		JLabel matricula = new JLabel("Introducir matricula ->");
		matricula.setBounds(161, 30, 130, 14);
		contentPane.add(matricula);

		listaAlumno = new JTextArea();
		listaAlumno.setColumns(5);
		listaAlumno.setBounds(155, 75, 576, 215);
		contentPane.add(listaAlumno);

		matriculaBorrar = new JTextField();
		matriculaBorrar.setColumns(10);
		matriculaBorrar.setBounds(301, 27, 130, 20);
		contentPane.add(matriculaBorrar);

		matriculaModificar = new JTextField();
		matriculaModificar.setColumns(10);
		matriculaModificar.setBounds(301, 357, 130, 20);
		contentPane.add(matriculaModificar);
		
		matricula_1 = new JLabel("Introducir matricula ->");
		matricula_1.setBounds(161, 360, 130, 14);
		contentPane.add(matricula_1);
		
		
	}
}
