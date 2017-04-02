/*
Read a CSV containing: name, phone number, provider (t-mobile, at&t, sprint, verizon, etc)
Read a CSV containing inspirational quotes and messages.
Send out personalized texts to the users containing a random inspirational message.
After this, send one every 30 seconds.
*/
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class csvfilereader
{

	private static final String fileName = "test.csv";

	public static void main(String[] args) 
	{
		BufferedReader br = null;
		FileReader fr = null;
		try 
		{
			fr = new FileReader(fileName);
			br = new BufferedReader(fr);
			String sCurrentLine;
			br = new BufferedReader(new FileReader(fileName));
			while ((sCurrentLine = br.readLine()) != null) 
			{
				System.out.println(sCurrentLine);
			}
		} 
		catch (IOException e) 
		{
			e.printStackTrace();
		} 
		finally 
		{
			try 
			{
				if (br != null)
					br.close();

				if (fr != null)
					fr.close();
			}
			catch (IOException ex) 
			{
				ex.printStackTrace();
			}
		}
	}
}