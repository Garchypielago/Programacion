package ejercicios;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.BoxLayout;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ejBebida extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtEuros;
	private JTextField txtCents;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private JLabel vueltas;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ejBebida frame = new ejBebida();
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
	public ejBebida() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		JRadioButton mahou = new JRadioButton("Mahou     2,30€");
		double mahoupr = 2.30;
		mahou.setSelected(true);
		buttonGroup.add(mahou);
		mahou.setBounds(25, 25, 130, 23);
		contentPane.add(mahou);

		JRadioButton estrella = new JRadioButton("Estrella    2,50€");
		double estrepr = 2.50;
		buttonGroup.add(estrella);
		estrella.setBounds(25, 50, 130, 23);
		contentPane.add(estrella);

		JRadioButton aguila = new JRadioButton("Aguila      1,90€");
		double aguilapr = 1.90;
		buttonGroup.add(aguila);
		aguila.setBounds(25, 75, 130, 23);
		contentPane.add(aguila);

		txtEuros = new JTextField();
		txtEuros.setText("Euros");
		txtEuros.setBounds(338, 26, 86, 20);
		contentPane.add(txtEuros);
		txtEuros.setColumns(10);

		txtCents = new JTextField();
		txtCents.setText("Cents");
		txtCents.setBounds(338, 51, 86, 20);
		contentPane.add(txtCents);
		txtCents.setColumns(10);

		JComboBox euros = new JComboBox();
		euros.setModel(new DefaultComboBoxModel(new String[] { "0", "1", "2", "3", "4", "5" }));
		euros.setToolTipText("2");
		euros.setBounds(275, 25, 53, 22);
		contentPane.add(euros);

		JComboBox cents = new JComboBox();
		cents.setModel(new DefaultComboBoxModel(new String[] { "0", "5", "10", "15", "20", "25", "30", "35", "40", "45",
				"50", "55", "60", "65", "70", "75", "80", "85", "90", "95" }));
		cents.setToolTipText("50");
		cents.setBounds(275, 50, 53, 22);
		contentPane.add(cents);

		JButton pedir = new JButton("Pedir");
		pedir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (mahou.isSelected()) {
					if ((Double.parseDouble((String) euros.getSelectedItem()))
							+ (Double.parseDouble((String) cents.getSelectedItem())/100) < mahoupr) {
						vueltas.setText("Dinero insuficiente te faltan: "
								+ (mahoupr - (Double.parseDouble((String) euros.getSelectedItem()))
										- (Double.parseDouble((String) cents.getSelectedItem())/100))
								+ "€");
					} else if ((Double.parseDouble((String) euros.getSelectedItem()))
							+ (Double.parseDouble((String) cents.getSelectedItem())/100) > mahoupr) {
						vueltas.setText(
								"Se te devuelve: "
										+ ((Double.parseDouble((String) euros.getSelectedItem()))
												- (Double.parseDouble((String) cents.getSelectedItem())/100) - mahoupr)
										+ "€");
					} else {
						vueltas.setText("Disfrutala.");
					}
				}
				if (estrella.isSelected()) {
					if ((Double.parseDouble((String) euros.getSelectedItem()))
							+ (Double.parseDouble((String) cents.getSelectedItem())/100) < estrepr) {
						vueltas.setText("Dinero insuficiente te faltan: "
								+ (estrepr - (Double.parseDouble((String) euros.getSelectedItem()))
										- (Double.parseDouble((String) cents.getSelectedItem())/100))
								+ "€");
					} else if ((Double.parseDouble((String) euros.getSelectedItem()))
							+ (Double.parseDouble((String) cents.getSelectedItem())/100) > estrepr) {
						vueltas.setText(
								"Se te devuelve: "
										+ ((Double.parseDouble((String) euros.getSelectedItem()))
												- (Double.parseDouble((String) cents.getSelectedItem())/100) - mahoupr)
										+ "€");
					} else {
						vueltas.setText("Disfrutala.");
					}
				}
				if (aguila.isSelected()) {
					if ((Double.parseDouble((String) euros.getSelectedItem()))
							+ (Double.parseDouble((String) cents.getSelectedItem())/100) < aguilapr) {
						vueltas.setText("Dinero insuficiente te faltan: "
								+ (aguilapr - (Double.parseDouble((String) euros.getSelectedItem()))
										- (Double.parseDouble((String) cents.getSelectedItem())/100))
								+ "€");
					} else if ((Double.parseDouble((String) euros.getSelectedItem()))
							+ (Double.parseDouble((String) cents.getSelectedItem())/100) > aguilapr) {
						vueltas.setText(
								"Se te devuelve: "
										+ ((Double.parseDouble((String) euros.getSelectedItem()))
												- (Double.parseDouble((String) cents.getSelectedItem())/100) - aguilapr)
										+ "€");
					} else {
						vueltas.setText("Disfrutala.");
					}
				}
			}
		});
		pedir.setBounds(25, 200, 89, 23);
		contentPane.add(pedir);

		vueltas = new JLabel("-");
		vueltas.setBounds(124, 200, 300, 27);
		contentPane.add(vueltas);
	}
}
