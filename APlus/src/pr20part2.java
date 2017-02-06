import java.util.*;
import java.io.*;

public class pr20part2
	{
	public static void main(String[] args) throws IOException
		{
		Scanner file = new Scanner(new File("pr20part2.txt"));
		int times = file.nextInt();
		file.nextLine();
		for(int i = 0; i < times; i++)
			{
			int num = file.nextInt();
			double root = Math.sqrt(num);
			int root2 = (int)root;
			if(root-root2 == 0)
				{
				System.out.println("PERFECT SQUARE");
				}
			else
				System.out.println("NOT PERFECT SQUARE");
			}
		}
	}
