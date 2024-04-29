package Instituto01;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JLabel;
import com.jgoodies.forms.factories.DefaultComponentFactory;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.sql.Connection;
import java.awt.event.ActionEvent;
import javax.swing.DropMode;
import java.awt.List;

public class VentanaPrinc extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField matriMod;
	private JTextField matriBorrar;
	private JTextArea listaAlumno;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Connection conexion = Conexion.conexion(ConstantesBD.URL, ConstantesBD.USUARIO, ConstantesBD.PWD);
					VentanaPrinc frame = new VentanaPrinc(conexion);
					frame.setVisible(true);
					frame.addWindowListener(new WindowAdapter() {
						public void windowClosing(WindowEvent e) {
							// TODO Auto-generated method stub
							Conexion.desConexion(conexion);
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
	public VentanaPrinc(Connection conexion) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 765, 445);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		JButton borrarAlumno = new JButton("Borrar alumno");
		borrarAlumno.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		borrarAlumno.setBounds(15, 25, 130, 25);
		contentPane.add(borrarAlumno);

		JButton mostrarAlumnos = new JButton("Mostrar alumnos");
		mostrarAlumnos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				listaAlumno.setText(AccesoDatos.stringInstituto(conexion));
			}
		});
		mostrarAlumnos.setBounds(15, 75, 130, 25);
		contentPane.add(mostrarAlumnos);

		JButton insertarAlumno = new JButton("Insertar alumno");
		insertarAlumno.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

			}
		});
		insertarAlumno.setBounds(15, 305, 130, 25);
		contentPane.add(insertarAlumno);

		JButton modificarAlumno = new JButton("Modificar alumno");
		modificarAlumno.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		modificarAlumno.setBounds(15, 355, 130, 25);
		contentPane.add(modificarAlumno);

		JLabel introBorrar = DefaultComponentFactory.getInstance().createLabel("Introducir matricula ->");
		introBorrar.setBounds(155, 30, 136, 14);
		contentPane.add(introBorrar);

		JLabel introMod = DefaultComponentFactory.getInstance().createLabel("Introducir matricula ->");
		introMod.setBounds(160, 360, 131, 14);
		contentPane.add(introMod);

		listaAlumno = new JTextArea();
		listaAlumno.setColumns(5);
		listaAlumno.setBounds(155, 75, 576, 215);
		contentPane.add(listaAlumno);

		matriBorrar = new JTextField();
		matriBorrar.setBounds(301, 27, 130, 20);
		contentPane.add(matriBorrar);
		matriBorrar.setColumns(10);

		matriMod = new JTextField();
		matriMod.setColumns(10);
		matriMod.setBounds(301, 357, 130, 20);
		contentPane.add(matriMod);
	}
}
