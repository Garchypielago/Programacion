package america01;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JFormattedTextField;
import javax.swing.SwingConstants;
import javax.accessibility.AccessibleAttributeSequence;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JTextPane;
import javax.swing.ListSelectionModel;
import javax.swing.JLabel;
import com.jgoodies.forms.factories.DefaultComponentFactory;
import javax.swing.JTextArea;
import java.awt.Color;
import java.awt.SystemColor;
import java.sql.Connection;
import java.util.ArrayList;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.ActionEvent;
import javax.swing.JList;
import java.awt.TextArea;
import java.awt.List;

public class App extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private TextArea lista;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {

		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					// aqui la conex para pasarla mas adelnate como parametro y ya que abro el hilo
					Connection conexion = Conexion.conexion(ConstantesBD.URL, ConstantesBD.USUARIO, ConstantesBD.PWD);
					App frame = new App(conexion);
					frame.setVisible(true);
					// para cerrar la conex al cerrar la ventana
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
	public App(Connection conexion) {

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		JFormattedTextField buscador = new JFormattedTextField();
		buscador.setHorizontalAlignment(SwingConstants.CENTER);
		buscador.setText("-");
		buscador.setBounds(185, 45, 135, 30);
		contentPane.add(buscador);

		JButton boton = new JButton("Buscar");
		boton.addActionListener(new ActionListener() {
			// la impreseion de los resultados
			public void actionPerformed(ActionEvent e) {
				ArrayList<String> paises = new ArrayList<String>();
				paises = AccesoDatos.verDatos(conexion, buscador.getText());
				String imprimir = "";
				for (String p : paises) {
					imprimir = imprimir + p + "\n";
				}
				lista.setText(imprimir);
			}
		});
		boton.setBounds(335, 45, 90, 30);
		contentPane.add(boton);

		JLabel textoGeneral = DefaultComponentFactory.getInstance().createLabel("Paises que contengan:");
		textoGeneral.setHorizontalAlignment(SwingConstants.LEFT);
		textoGeneral.setBounds(30, 50, 190, 20);
		contentPane.add(textoGeneral);

		lista = new TextArea();
		lista.setBounds(30, 90, 380, 160);
		contentPane.add(lista);

	}
}
