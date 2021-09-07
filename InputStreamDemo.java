// How to read the file character by character using FileInputStream

import java.io.*;

class InputStreamDemo
{
	public static void main(String args[]) throws IOException
	{
		FileInputStream fis = null;  
		int ch;		
		try
		{
			fis = new FileInputStream("punjab.txt");
			do
			{
				ch = fis.read();										if(ch!=-1)
					System.out.print((char)ch);
			}while(ch!=-1);
		}
		catch(FileNotFoundException ex)
		{
			System.out.println("File not found");
		}
		finally
		{
			fis.close();
		}

		
	}	

}