import java.io.*;
import java.util.*;

class pr54
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
			if(stuff[0].equals("ANN"))
				{
				ann.add(stuff[1]);
				}
			if(stuff[0].equals("BOB"))
				{
				bob.add(stuff[1]);
				}	
			if(stuff[0].equals("JOE"))
				{
				joe.add(stuff[1]);
				}	
			if(stuff[0].equals("MARY"))
				{
				mary.add(stuff[1]);
				}	
			if(stuff[0].equals("TOM"))
				{
				tom.add(stuff[1]);
				}
			Collections.sort(ann);
			}
		System.out.println("ANN");
		for(String hi : ann)
			{
			System.out.println("   " + hi);
			}
		System.out.println("BOB");
		for(String hi : bob)
			{
			System.out.println("   " + hi);
			}
		System.out.println("JOE");
		for(String hi : joe)
			{
			System.out.println("   " + hi);
			}
		System.out.println("MARY");
		for(String hi : mary)
			{
			System.out.println("   " + hi);
			}
		System.out.println("TOM");
		for(String hi : tom)
			{
			System.out.println("   " + hi);
			}
		}
	}
