package Instituto;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.SystemColor;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class IntroducirAlumno extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField TMatricula;
	private JTextField TNombre;
	private JTextField TPoblacion;
	private JTextField TTelefono;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
	}

	/**
	 * Create the frame.
	 */
	public IntroducirAlumno() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel matricula = new JLabel("Num Matricula");
		matricula.setBounds(10, 35, 81, 14);
		contentPane.add(matricula);
		
		JLabel nombre = new JLabel("Nombre");
		nombre.setBounds(10, 88, 46, 14);
		contentPane.add(nombre);
		
		JLabel poblacion = new JLabel("Poblacion");
		poblacion.setBounds(10, 148, 46, 14);
		contentPane.add(poblacion);
		
		JLabel telefono = new JLabel("Telefono");
		telefono.setBounds(10, 213, 46, 14);
		contentPane.add(telefono);
		
		TMatricula = new JTextField();
		TMatricula.setBounds(125, 32, 86, 20);
		contentPane.add(TMatricula);
		TMatricula.setColumns(10);
		
		TNombre = new JTextField();
		TNombre.setColumns(10);
		TNombre.setBounds(125, 85, 86, 20);
		contentPane.add(TNombre);
		
		TPoblacion = new JTextField();
		TPoblacion.setColumns(10);
		TPoblacion.setBounds(125, 145, 86, 20);
		contentPane.add(TPoblacion);
		
		TTelefono = new JTextField();
		TTelefono.setColumns(10);
		TTelefono.setBounds(125, 210, 86, 20);
		contentPane.add(TTelefono);
		
		JButton insertar = new JButton("Insertar alumno");
		insertar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String matricula=TMatricula.getText();
				String nombre=TNombre.getText();
				String poblacion=TPoblacion.getText();
				String telefono=TTelefono.getText();
				AccesoDatos.insertarAlumno(matricula, nombre, poblacion, telefono);
				dispose();
			}
		});
		insertar.setBackground(SystemColor.activeCaption);
		insertar.setBounds(248, 110, 139, 23);
		contentPane.add(insertar);
	}
}
