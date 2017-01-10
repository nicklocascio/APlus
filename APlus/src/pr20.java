import java.io.*;
import java.util.*;
 
class pr20
  {
  public static void main(String[] args) throws IOException
    {
    int [][] array = new int [][]{
    {1, 2, 3, 4, 5},
    {6, 7, 8, 9, 0},
    {6, 7, 1, 2, 5},
    {6, 7, 8, 9, 0},
    {5, 4, 3, 2, 1}
    };
    Scanner file = new Scanner(new File("pr20.txt"));
    int times = file.nextInt();
    file.nextLine();
    for(int i = 0; i < times; i++)
      {
      String line = file.nextLine();
      String [] position = line.split(" ");
      int row = Integer.parseInt(position[0]);
      int col = Integer.parseInt(position[1]);
      for(int r = row-1; r < row; r++)
    	  {
    	  for(int c =)
    	  }
      }
    }
  }