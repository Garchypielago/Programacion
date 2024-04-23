package ejercicios;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.Button;
import javax.swing.JTextArea;
import javax.swing.SwingConstants;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ejAscensor extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JLabel lblNewLabel_2_1;
	private JLabel lblNewLabel_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ejAscensor frame = new ejAscensor();
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
	public ejAscensor() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("4");
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 11));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (Integer.parseInt(lblNewLabel_2.getText()) < 4) {
					lblNewLabel_2_1.setText("Sube");
				}else {
					lblNewLabel_2_1.setText("Piso actual");
				}
				lblNewLabel_2.setText("4");
			}
		});
		btnNewButton.setBounds(40, 10, 40, 40);
		btnNewButton.setHorizontalAlignment(SwingConstants.LEFT);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("3");
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 11));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (Integer.parseInt(lblNewLabel_2.getText()) < 3) {
					lblNewLabel_2_1.setText("Sube");
				}else if (Integer.parseInt(lblNewLabel_2.getText()) > 3){
					lblNewLabel_2_1.setText("Baja");
				} else {
					lblNewLabel_2_1.setText("Piso actual");
				}
				lblNewLabel_2.setText("3");
			}
		});
		btnNewButton_1.setBounds(40, 60, 40, 40);
		btnNewButton_1.setHorizontalAlignment(SwingConstants.LEFT);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("2");
		btnNewButton_2.setFont(new Font("Tahoma", Font.PLAIN, 11));
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (Integer.parseInt(lblNewLabel_2.getText()) < 2) {
					lblNewLabel_2_1.setText("Sube");
				}else if (Integer.parseInt(lblNewLabel_2.getText()) > 2){
					lblNewLabel_2_1.setText("Baja");
				} else {
					lblNewLabel_2_1.setText("Piso actual");
				}
				lblNewLabel_2.setText("2");
			}
		});
		btnNewButton_2.setBounds(40, 110, 40, 40);
		btnNewButton_2.setHorizontalAlignment(SwingConstants.LEFT);
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_1_1 = new JButton("1");
		btnNewButton_1_1.setFont(new Font("Tahoma", Font.PLAIN, 11));
		btnNewButton_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (Integer.parseInt(lblNewLabel_2.getText()) > 1) {
					lblNewLabel_2_1.setText("Baja");
				}else {
					lblNewLabel_2_1.setText("Piso actual");
				}
				lblNewLabel_2.setText("1");
			}
		});
		btnNewButton_1_1.setBounds(40, 160, 40, 40);
		contentPane.add(btnNewButton_1_1);
		
		JLabel lblNewLabel = new JLabel("Piso actual: ");
		lblNewLabel.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel.setBounds(217, 25, 77, 27);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Sentido: ");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1.setBounds(217, 128, 77, 22);
		contentPane.add(lblNewLabel_1);
		
		lblNewLabel_2 = new JLabel("1");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_2.setBounds(336, 32, 72, 14);
		contentPane.add(lblNewLabel_2);
		
		lblNewLabel_2_1 = new JLabel("Asciende");
		lblNewLabel_2_1.setHorizontalAlignment(SwingConstants.RIGHT);
		lblNewLabel_2_1.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblNewLabel_2_1.setBounds(336, 133, 72, 14);
		contentPane.add(lblNewLabel_2_1);
	}
}
