import java.io.*;
import java.util.*;

class pr54real
	{
	public static void main(String [] args) throws IOException
		{
		Scanner file = new Scanner(new File("pr54.dat.txt"));
		int times = file.nextInt();
		ArrayList <String> ann = new ArrayList <String>();
		ArrayList <String> bob = new ArrayList <String>();
		ArrayList <String> joe = new ArrayList <String>();
		ArrayList <String> mary = new ArrayList <String>();
		ArrayList <String> tom = new ArrayList <String>();
		file.nextLine();
		for(int i = 0; i < times; i++)
			{
			String line = file.nextLine();
			String [] stuff = line.split(" ");
			String combo = stuff[0] + stuff[1];
			if(combo.contains("ANN"))
				{
				ann.add(combo);	
				}
			}
		for(String hi : ann)
			{
			System.out.println(hi);
			}
		}
	}