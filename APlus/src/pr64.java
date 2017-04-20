//Done

import java.util.*;
import java.io.*;

public class pr64
	{
	public static void main(String [] args) throws IOException
		{
		Scanner file = new Scanner(new File("pr64.txt"));
		int times = file.nextInt();
		file.nextLine();
		for(int i = 0; i < times; i++)
			{
			int length = file.nextInt();
			int numRolls = length/100;
			if(length%100 != 0)
				numRolls = numRolls+1;
			double price = 0;
			if(numRolls >= 1 && numRolls < 6)
				price = 4.95;
			else if(numRolls >= 6 && numRolls < 12)
				price = 4.65;
			else if(numRolls >= 12 && numRolls < 24)
				price = 4.15;
			else
				price = 4.00;
			double totalPrice = price*numRolls;
			System.out.print("$");
			System.out.printf("%.2f", totalPrice); 
			System.out.print(" FOR " + numRolls + " ROLLS");
			System.out.println();
			}
		}
	}
