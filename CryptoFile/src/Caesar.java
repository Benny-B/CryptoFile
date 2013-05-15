
public class Caesar {

	private static int key;
	
	public Caesar(int k)
	{
		key = k;
	}
	
	public static String encrypt(String str2)
	{
		String cipher = "";
		String z = "z";
		String a = "a";
		int min = a.charAt(0);
		int max = z.charAt(0);
		String str = str2.toLowerCase();
		
		for(int i = 0; i < str.length(); i++)
		{
			Character t = str.charAt(i);
			int tmp = (int) t;
			if(Character.isLetter(t))
			{
			tmp += key;
			if(tmp > max)
			{
				int diff = tmp - max;
				tmp = min + diff;
			}
			}
			char c = (char) tmp;
			cipher += c;
			
			
		}
	//	System.out.print(cipher);
		return cipher;
	}
	
	public static String decrypt(String str)
	{
		String plaintext = "";
		String z = "z";
		String a = "a";
		int min = a.charAt(0);
		int max = z.charAt(0);
		
		for(int i = 0; i < str.length(); i++)
		{
			Character t = str.charAt(i);
			int tmp = (int) t;
			if(Character.isLetter(t)){
			tmp -= key;
			if(tmp < min)
			{
				int diff = min - tmp;
				tmp = max - diff;
			}
			}
			char c = (char) tmp;
			plaintext += c;
		//	System.out.print(c);
		}
		return plaintext;
	}
	
	
	
}
