import java.util.*;
import java.io.*;

public class pr65
	{
	public static void main(String [] args) throws IOException
		{
		Scanner file = new Scanner(new File("pr65.txt"));
		int times = file.nextInt();
		file.nextLine();
		for(int i = 0; i < times; i++)
			{
			String line = file.nextLine();
			String [] parts = line.split(" ");
			double principle = Double.parseDouble(parts[0]);
			double rate = Double.parseDouble(parts[1])/100;
			double months = Integer.parseInt(parts[2]);
			double balance = principle;
			System.out.println(principle);
			System.out.println(rate/12);
			System.out.println(months);
			for(double j = 0; j < months; j++)
				{
				balance = balance*Math.pow((1+(rate/12)), (12*(j/12)));
				System.out.printf("%.2f", balance);
				System.out.println();
				}
			}
		}
	}
