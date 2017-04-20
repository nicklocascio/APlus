import java.util.*;
import java.io.*;
import java.math.*;
import java.text.*;

public class pr66
	{
	public static void main(String [] args) throws IOException
		{
		Scanner file = new Scanner(new File("pr66.txt"));
		int times = file.nextInt();
		file.nextLine();
		for(int i = 0; i < times; i++)
			{
			double price = file.nextDouble();
			int paid = (int)(price+1);
			double change = paid-price;
			System.out.println(change);
			double rounded = Math.round(change*100.0)/100.0;
			System.out.println(rounded);
			int quarterNum = (int)(rounded/.25);
			rounded = Math.round((rounded-(quarterNum * .25))*100.0)/100.0;
			int dimeNum = (int)(rounded/.1);
			rounded = Math.round((rounded-(dimeNum * .1))*100.0)/100.0;
			int nickelNum = (int)(rounded/.05);
			rounded = Math.round((rounded-(nickelNum * .05))*100.0)/100.0;
			int pennyNum = (int)(rounded/.01);
			System.out.println("Q: " + quarterNum + " D: " + dimeNum + " N: " + nickelNum + " P: " + pennyNum);
			}
		}
	}
