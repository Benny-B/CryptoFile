import java.io.*;
import java.io.FileReader;


public class FileRead {
	
	private static File file;
	private static int key;
	private static Caesar caesar;
	
	public FileRead(File f, int key)
	{
		file = f;
		this.key = key;
		caesar = new Caesar(key);
	}
	
	public static void encryptFile()
	{
		StringBuilder builder = new StringBuilder();
		
		try{
			
			 BufferedReader rd = new BufferedReader( new FileReader(file));
			 
			 String line = null;
			 while((line = rd.readLine()) != null)
			 {
				 
				 builder.append(caesar.encrypt(line));
				 builder.append("\n");
				 
			 }
			 System.out.println(builder.toString());
			 rd.close();
			 
			PrintWriter wt = new PrintWriter(new FileWriter(file),true);
			wt.println(builder);
			 
		}
		catch(IOException ex)
		{
			ex.printStackTrace();
		}
	}
	
	public static void decryptFile()
	{
		StringBuilder builder = new StringBuilder();
		
		try{
			
			 BufferedReader rd = new BufferedReader( new FileReader(file));
			 
			 String line = null;
			 while((line = rd.readLine()) != null)
			 {
				 
				 builder.append(caesar.decrypt(line));
				 builder.append("\n");
				 
			 }
			 System.out.println(builder);
			 rd.close();
			 
			PrintWriter wt = new PrintWriter(new FileWriter(file),true);
			wt.println(builder);
			 
		}
		catch(IOException ex)
		{
			ex.printStackTrace();
		}
	}

}
