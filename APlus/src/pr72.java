import java.util.*;
import java.io.*;

public class pr72
	{
	public static void main(String [] args) throws IOException
		{
		Scanner file = new Scanner(new File("pr74.txt"));
		int times = file.nextInt();
		file.nextLine();
		for(int i = 0; i < times; i++)
			{
			String line = file.nextLine();
			String palindrome = "";
			String [] original = new String [line.length()];
	        String [] reverse = new String [line.length()];
	        for(int j = 0; j < line.length(); j++)
	        	{
	        	original[j] = line.substring(j, j+1);
	        	}
	        int n = 0;
	        for(int k = line.length()-1; k >= 0; k--)
	        	{
	        	reverse[n] = line.substring(k, k+1);
	        	n++;
	        	}
	        int m = 0;
	        while(!original[m].equals(reverse[m]))
	        	{
	        	
	        	}
			}
		}
	}
