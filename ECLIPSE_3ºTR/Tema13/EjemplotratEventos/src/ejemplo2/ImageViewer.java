package ejemplo2;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 * ImageViewer is the main class of the image viewer application. It builds 
 * and displays the application GUI.
 * 
 * To start the application, create an object of this class.
 * 
 * @author Michael Kolling and David J Barnes 
 * @version 0.2
 */
public class ImageViewer implements ActionListener
{
    private JFrame frame;
    
    /**
     * Create an ImageViewer show it on screen.
     */
    public ImageViewer()
    {
        makeFrame();
    }

    /**
     * Recibe la notificacion de una accion
     * Obligatorio desarrollar actionPerformed por implementar ActionListener en la clase
     * @param event Detalles de la accion.
     */
    public void actionPerformed(ActionEvent event) 
    { 
        System.out.println("Item: " + event.getActionCommand());
        // Solo imprimimos la cadena que devuelve
    }
   
    // ---- usa Swing para crear el JFrame y aniadir sus componentes ----
    
    /**
     * Create the Swing frame and its content.
     */
    private void makeFrame()
    {
        frame = new JFrame("ImageViewer");
        
        makeMenuBar(frame);// Se aniade un menu
        
        Container contentPane = frame.getContentPane();
        
        JLabel label = new JLabel("I am a label. I can display some text.");
        contentPane.add(label);

        // building is done - arrange the components and show        
        frame.pack();
        frame.setVisible(true);
        // Observamos que falta el cerrar la aplicacion cuando se cierra la ventana y la 
        // aplicacion se sigue ejecutando
        
    }
    
    /**
     * Create the main frame's menu bar.
     * @param frame   The frame that the menu bar should be added to.
     */
    private void makeMenuBar(JFrame frame)
    {
        JMenuBar menubar = new JMenuBar();
        frame.setJMenuBar(menubar);
        
        // creamos el menu de File
        JMenu fileMenu = new JMenu("File");
        menubar.add(fileMenu);
        
        // Creamos y aniadimos las opciones del menu File: Open y Quit
        JMenuItem openItem = new JMenuItem("Open");   
        fileMenu.add(openItem);

        JMenuItem quitItem = new JMenuItem("Quit");
        fileMenu.add(quitItem);
        
        openItem.addActionListener(this);//Aniadimos una respuesta a la accion
        quitItem.addActionListener(this);//Aniadimos una respuesta a la accion

    }
}
