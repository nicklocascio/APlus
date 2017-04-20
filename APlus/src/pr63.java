//Done

import java.util.*;
import java.io.*;

public class pr63
	{
	public static void main(String [] args) throws IOException
		{
		Scanner file = new Scanner(new File("pr63.txt"));
		int times = file.nextInt();
		int time1 = 0;
		int time2 = 0;
		int totalMins = 0;
		file.nextLine();
		for(int i = 0; i < times; i++)
			{
			String line = file.nextLine();
			String [] parts = line.split(" ");
			for(int j = 0; j < parts.length; j++)
				{
				String [] smaller = parts[j].split(":");
				for(int k = 0; k < smaller.length; k++)
					{
					if(j == 0)
						time1 = Integer.parseInt(smaller[0])*60 + Integer.parseInt(smaller[1]);
					else
						time2 = Integer.parseInt(smaller[0])*60 + Integer.parseInt(smaller[1]);
					}
				}
			totalMins += (time2 - time1);
			}
		System.out.println("TOTAL MINUTES: " + totalMins);
		}
	}	
