import java.io.*;
import java.util.*;

class pr22
	{
	public static void main(String [] args) throws IOException
		{
		Scanner file = new Scanner(new File("pr22.txt"));
		int times = file.nextInt();
		int position = 0;
		int position2 = 0;
		int counter = 0;
		file.nextLine();
		for(int i = 0; i < times; i++)
			{
			String line = file.nextLine();	
			if(line.contains("T"))
				{
				position = line.indexOf("T");
				position2 = line.lastIndexOf("T");
				counter++;
				}
			}
		int sum = (position2 - position + 1)*counter;
		System.out.println(sum);
		}
	}
