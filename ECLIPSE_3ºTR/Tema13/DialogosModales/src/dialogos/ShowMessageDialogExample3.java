package dialogos;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class ShowMessageDialogExample3
{
	public static void main(String[] args)
	  {
	    String backupDir = "/Users/al/backups";
	    
	    // create a jframe
	    JFrame frame = new JFrame("JOptionPane showMessageDialog example");

	    // show a joptionpane dialog using showMessageDialog
	    JOptionPane.showMessageDialog(frame,
	        "Problem writing to backup directory: '" + backupDir + "'.",
	        "Backup problem",
	        JOptionPane.ERROR_MESSAGE);
	    System.exit(0);
	  }
}