import java.io.File;

import javax.swing.JFileChooser;
import javax.swing.JOptionPane;


public class Main{

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	/*	int key = 150;
		
		File file = new File("file.txt");
		FileRead fr = new FileRead(file, key);
		fr.encryptFile();
		fr.decryptFile();*/
		
		// File chooser
		FileRead fr;
		JFileChooser fileChooser = new JFileChooser();
		fileChooser.setFileSelectionMode(JFileChooser.FILES_ONLY);
		int res = fileChooser.showOpenDialog(fileChooser);
		
		File file = fileChooser.getSelectedFile();
		
		if(file.exists())
		{
			Object options[] = {"Encrypt", "Decrypt", "Cancel" };
			int n = JOptionPane.showOptionDialog(null,"Would you like to encrypt or decrypt "+file.getName(), "Encrypt/Decrypt", JOptionPane.YES_NO_CANCEL_OPTION,
					JOptionPane.QUESTION_MESSAGE, null, options, options[1]);
			if( n == JOptionPane.YES_OPTION)
			{
				String key = JOptionPane.showInputDialog("Enter the key to encrypt (key < 100): ");
				int k = Integer.parseInt(key);
				while(k > 100)
				{
					key = JOptionPane.showInputDialog("Enter the key to encrypt (key < 100): ");
					k = Integer.parseInt(key);
				}
				fr = new FileRead(file,k);
				FileRead.encryptFile();
			}
			else if ( n == JOptionPane.NO_OPTION)
			{
				String key = JOptionPane.showInputDialog("Enter the key to decrypt: ");
				int k = Integer.parseInt(key);
				fr = new FileRead(file,k);
				FileRead.decryptFile();	
			}
		}
		
		
		
	}

}
