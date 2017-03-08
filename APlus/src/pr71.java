import java.util.*;
import java.io.*;

public class pr71
	{
	public static void main(String [] args) throws IOException
		{
		Scanner file = new Scanner(new File("pr71.txt"));
		int times = file.nextInt();
		file.nextLine();
		for(int i = 0; i < times; i++)
			{
			int sum = 0;
			String line = file.nextLine();
	        line = line.replaceAll("[^\\p{L}\\p{Nd}]+", "");
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
	        boolean pal = true;
	        for(int m = 0; m < original.length; m++)
	        	{
	        	if(!original[m].equals(reverse[m]))
	        		{
	        		pal = false;
	        		break;
	        		}
	        	}
	        if(pal == true)
	        	{
	        	System.out.println("PALINDROME");
	        	}
	        else if(pal == false)
	        	{
	        	System.out.println("NOT PALINDROME");
	        	}
			}
		}
	}
