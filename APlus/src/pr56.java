import java.io.*;
import java.util.*;

class pr56
	{
	public static void main(String[] args) throws IOException
		{
		Scanner file = new Scanner(new File("pr56.dat.txt"));
		int times = file.nextInt();
		ArrayList <Integer> numbers = new ArrayList <Integer>();
		ArrayList <Integer> numbers2 = new ArrayList <Integer>();
		file.nextLine();
		for(int i = 0; i < times; i++)
			{
			numbers.clear();
			numbers2.clear();
			String line = file.nextLine();
			String [] letters = line.split(" ");
			for(int j = 0; j < letters.length; j++)
				{
				int number = Integer.parseInt(letters[j]);
				numbers.add(number);
				}
			Collections.sort(numbers);
			for(int k = 0; k <numbers.size(); k=k+1)
				{
				numbers2.add(numbers.get(k));
				numbers.remove(k);
				}
			for(int l = numbers.size()-1; l > 0; l--)
				{
				numbers2.add(numbers.get(l));
				}
			if(numbers.size() > 0)
				numbers2.add(numbers.get(0));
			for(Integer hi : numbers2)
				{
				System.out.print(hi + " ");	
				}
			System.out.println();
			}
		}
	}
