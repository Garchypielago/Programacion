package dialogos;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class ShowMessageDialogExample1
{
  public static void main(String[] args)
  {
    String backupDir = "/Users/alumno/backups";
    
    // create a JFrame
    JFrame frame = new JFrame("JOptionPane showMessageDialog example");
    
    // show a joptionpane dialog using showMessageDialog
    JOptionPane.showMessageDialog(frame,
        "Problem writing to backup directory: '" + backupDir + "'.");
    System.exit(0);
  }
}