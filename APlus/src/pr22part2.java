import java.util.*;
import java.io.*;

public class pr22part2
	{
	public static void main(String [] args) throws IOException
		{
		Scanner file = new Scanner(new File("pr22part2.txt"));
		int times = file.nextInt();
		file.nextLine();
		for(int i = 0; i < times; i++)
			{
			String line = file.nextLine();
			String [] hello = line.split("/");
			double num = Integer.parseInt(hello[0]);
			double denom = Integer.parseInt(hello[1]);
			double fraction = num/denom;
			System.out.println(fraction);
			}
		}
	}
