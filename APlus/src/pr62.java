import java.util.*;
import java.io.*;

public class pr62
	{
	public static void main(String [] args) throws IOException
		{
		Scanner file = new Scanner(new File("pr62.txt"));
		int times = file.nextInt();
		file.nextLine();
		for(int i = 0; i < times*2; i+=2)
			{
			int width = file.nextInt();
			int length = file.nextInt();
			int square = width*length;
			int time = square/90;
			int hours = time/60;
			int mins = time%60;
			System.out.println(hours + ":" + mins);
			}
		}
	}
