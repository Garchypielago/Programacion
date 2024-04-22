package ejemplo1;

import javax.swing.*;

/**
 * ImageViewer is the main class of the image viewer application. It builds
 * and displays the application GUI and initializes all other components.
 * 
 * To start the application, create an object of this class.
 * 
 * @author Michael Kolling and David J Barnes 
 * @version 0.1
 */
public class ImageViewer {
    private JFrame frame;
    
    /**
     * Create an ImageViewer show it on screen.
     */
    public ImageViewer()
    {
        makeFrame();
    }
    
    // ---- usa Swing para crear el JFrame y aniadir sus componentes ----
    
    /**
     * Create the Swing frame and its content.
     */
    private void makeFrame()
    {
        frame = new JFrame("ImageViewer");        
        //Container contentPane = frame.getContentPane();
        
        JLabel label = new JLabel("I am a label. I can display some text.");
        
        frame.add(label); // Aniade al JPanel contenido en el JFrame
        
        //contentPane.add(label);

        frame.pack();// Adapta el tamanio del frame al contenido que le vayamos aniadiendo
        frame.setVisible(true);//Hace que la ventana sea visible
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//Indica que hace la ventana cuando se cierra
        // Con JFrame.EXIT_ON_CLOSE el programa termina cuando se cierra la ventana
    }
}


