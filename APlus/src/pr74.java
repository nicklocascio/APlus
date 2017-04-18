import java.util.*;
import java.io.*;

public class pr74
	{
	public static void main(String [] args) throws IOException
		{
		Scanner file = new Scanner(new File("pr74.txt"));
		int times = file.nextInt();
		file.nextLine();
		for(int i = 0; i < times; i++)
			{
			String line = file.nextLine();
			String [] words = line.split(" ");
			for(int j = 0; j < words.length; j++)
				{
				if(j%2 == 0)
					{
					String word = "";
					for(int k = words[j].length()-1; k >= 0; k--)
						{
						word += words[j].substring(k, k+1);	
						}
					words[j] = word;
					}
				else if(words[j].length() < j)
	                {
	                words[j] = words[j];
	                }
				else
					{
					String [] letters = words[j].split("");
				    for(int k = 0; k < j+1; k++)
				    	{
			    		String last = letters[letters.length - 1];
			    		for(int n = letters.length - 1; n > 0; n--) 
			    			{
			    		    letters[n] = letters[n - 1];
			    			}
			    		letters[0] = last;
				    	}
				    String word = "";
				    for(int p = 0; p < letters.length; p++)
				    	{
				    	word += letters[p];
				    	}
				    words[j] = word;
					}
				}
			for(String hi : words)
				{
				System.out.print(hi + " ");
				}
			System.out.println();
			}
		}
	}

//  http://www.geeksforgeeks.org/array-rotation/ 