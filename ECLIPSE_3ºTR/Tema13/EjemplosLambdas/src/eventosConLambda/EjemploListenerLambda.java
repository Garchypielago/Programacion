package eventosConLambda;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 * Ejemplo de uso de las expresiones Lambda en los action listener.
 * 
 */
public class EjemploListenerLambda extends JFrame {
	private static final long serialVersionUID = 1L;
	private JButton button = new JButton("Pulsame!");

	public EjemploListenerLambda() {
		super("Ejemplo de Listener Lambda");

//		getContentPane().setLayout(new FlowLayout());
//		getContentPane().add(button);

		setLayout(new FlowLayout());
		add(button);

//		
//		Interface ActionListener
//		
//		All Superinterfaces:
//			EventListener
//		All Known Subinterfaces:
//			Action
//		Solo tiene un metodo abstracto:
//			void actionPerformed(ActionEvent e)
//		
//		Se invoca por Java cuando ocurre una accion sobre un evento que tiene ese listener
//		
//		ActionEvent e, es el parametro:
//		Clase ActionEvent, que tiene los siguientes metodos:
//		
//		String getActionCommand()
//		Returns the command string associated with this action.
//		
//		int getModifiers()
//		Returns the modifier keys held down during this action event.
//		
//		long getWhen()
//		Returns the timestamp of when this event occurred.
//		
//		String paramString()
//		Returns a parameter string identifying this action event.
		
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("Manejado por listener de clase anonima " + e.getActionCommand());
			}
		});

		
		button.addActionListener(e -> {
			System.out.println("Manejado con listener Lambda forma 1 " + e.getModifiers());
		});
		
		button.addActionListener(e -> System.out.println("Manejado con listener Lambda forma 2  " +e.getSource() +  e.paramString()));
		// No es necesario poner la llaves, ya que hay solo una sentencia

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300, 100);
		setLocationRelativeTo(null);
	}

	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				new EjemploListenerLambda().setVisible(true);
			}
		});
	}
	
	public static void main2(String[] args) {
		SwingUtilities.invokeLater( () -> {
			new EjemploListenerLambda().setVisible(true);
		} );
	}
}