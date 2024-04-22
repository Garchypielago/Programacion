package dialogos;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class ShowMessageDialogExample4
{
  public static void main(String[] args)
  {
    // create our jframe
    JFrame frame = new JFrame("JOptionPane showMessageDialog example");
    frame.setVisible(true);

    // show a joptionpane dialog using showMessageDialog
    JOptionPane.showMessageDialog(frame, 
        "Your RSS feed has been published", 
        "RSS Feed Published", 
        JOptionPane.INFORMATION_MESSAGE,
        new ImageIcon("resources/greenRSS.jpg"));

    System.exit(0);
  }
}
