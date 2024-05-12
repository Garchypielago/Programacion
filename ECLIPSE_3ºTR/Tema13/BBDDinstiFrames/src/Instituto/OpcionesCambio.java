package Instituto;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;

public class OpcionesCambio extends JFrame implements ItemListener{

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JComboBox<String> opciones;
	private JButton aceptar;
	private JButton cancelar;
	private JLabel campos;

	/**
	 * Launch the application.
	 */

	/**
	 * Create the frame.
	 */
	public OpcionesCambio(String matricula) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		opciones = new JComboBox<String>();
		opciones.setBounds(20, 95, 404, 40);
		contentPane.add(opciones);
		opciones.addItem("Nombre-Apellido");
		opciones.addItem("Poblacion");
		opciones.addItem("Telefono");
		opciones.addItemListener(this);
		
		campos = new JLabel("Elige campo a cambiar");
		campos.setBounds(20, 70, 183, 14);
		contentPane.add(campos);
		
		aceptar = new JButton("Aceptar");
		aceptar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String opcion= (String) opciones.getSelectedItem();
				if (opcion.compareToIgnoreCase("nombre-apellido")==0) {
					EventQueue.invokeLater(new Runnable() {
						public void run() {
							try {
								NombreCambio frame = new NombreCambio(matricula);
								frame.setVisible(true);
							} catch (Exception e) {
								e.printStackTrace();
							}
						}
					});
				}
				else if (opcion.compareToIgnoreCase("poblacion")==0) {
					EventQueue.invokeLater(new Runnable() {
						public void run() {
							try {
								PoblacionCambio frame = new PoblacionCambio(matricula);
								frame.setVisible(true);
							} catch (Exception e) {
								e.printStackTrace();
							}
						}
					});
				}
				else {
					EventQueue.invokeLater(new Runnable() {
						public void run() {
							try {
								TelefonoCambio frame = new TelefonoCambio(matricula);
								frame.setVisible(true);
							} catch (Exception e) {
								e.printStackTrace();
							}
						}
					});
				}
				dispose();
			}
		});
		aceptar.setBounds(106, 182, 89, 23);
		contentPane.add(aceptar);
		
		cancelar = new JButton("Cancelar");
		cancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		cancelar.setBounds(234, 182, 89, 23);
		contentPane.add(cancelar);
	}
	public void itemStateChanged(ItemEvent e) {
        if (e.getSource()==opciones) {
            String seleccionado=(String)opciones.getSelectedItem();
            setTitle(seleccionado);
        }
    }

}
