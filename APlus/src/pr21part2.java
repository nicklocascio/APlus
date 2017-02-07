import java.util.*;
import java.io.*;

public class pr21part2
	{
	public static void main(String [] args) throws IOException
		{
		Scanner file = new Scanner(new File("pr21part2.txt"));
		int times = file.nextInt();
		file.nextLine();
		for(int i = 0; i < times; i++)
			{
			int sum = 0;
			String line = file.nextLine();
			String [] nums = line.split(" ");
			for(int j = 0; j < nums.length; j++)
				{
				int num = Integer.parseInt(nums[j]);
				sum += num;
				}
			if(sum <= 25)
				{
				System.out.println("FULL HOUSE");		
				}
			else
				System.out.println("3 OF A KIND");
			}
		}
	}
