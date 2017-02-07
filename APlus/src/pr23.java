import java.util.*;
import java.io.*;

public class pr23
	{
	public static void main(String[] args) throws IOException
		{
		Scanner file = new Scanner(new File("pr23.txt"));
		int times = file.nextInt();
		file.nextLine();
		for(int i = 0; i < times; i++)
			{
			double age = file.nextDouble();
			double dose = file.nextDouble();
			double childDose = (age/(age+12))*dose;
			System.out.printf("%.3f", childDose);
			System.out.println();
			}
		}
	}
