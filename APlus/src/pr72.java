import java.util.*;
import java.io.*;

public class pr72
	{
	public static void main(String [] args) throws IOException
		{
		Scanner file = new Scanner(new File("pr72.txt"));
		int times = file.nextInt();
		file.nextLine();
		for(int i = 0; i < times; i++)
			{
			String line = file.nextLine();
			String hello = line;
			String reverse = new StringBuilder(line).reverse().toString();
			if(line.equals(reverse))
				{
				System.out.println(line);
				}
			else
				{
				for(int j = 0; j < line.length(); j++)
					{
					hello = line;
					hello += reverse.substring(reverse.length()-1-j, reverse.length());
					String helloR = new StringBuilder(hello).reverse().toString();
					if(hello.equals(helloR))
						{
						System.out.println(hello);
						break;
						}
					}
				}
			}
		}
	}
