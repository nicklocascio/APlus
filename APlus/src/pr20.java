import java.io.*;
import java.util.*;
 
class pr20
  {
  public static void main(String[] args) throws IOException
    {
    	hi();
//    int [][] array = new int [][]{
//    {1, 2, 3, 4, 5},
//    {15, 7, 8, 9, 71},
//    {6, 7, 11, 2, 5},
//    {6, 7, 8, 9, 14},
//    {5, 4, 3, 2, 33}
//    };
//    Scanner file = new Scanner(new File("pr20.txt"));
//    int times = file.nextInt();
//    file.nextLine();
//    for(int i = 0; i < times; i++)
//      {
//      String line = file.nextLine();
//      String [] position = line.split(" ");
//      int row = Integer.parseInt(position[0]);
//      int col = Integer.parseInt(position[1]);
//      int sum = 0;
//	  for(int r = 0; r < array.length; r++)
//    	  {
//    	  for(int c = 0; c < array[0].length; c++)
//    		  {
//    		  if((r == (row-1) || r == row || r == (row+1)) && (c == (col-1) || c == col || c == (col+1)))
//    			  {
//    			  sum += array[r][c];
//    			  }
//    		  }
//    	  }	       
//      System.out.println(sum);
////      average = sum/one.size();
////      System.out.printf("%.2f", average);
////      System.out.println();
//      }
    }
  public static void hi()
	  {
	  String a = "mullen";
	  String b = a;
	  b = a.substring(3, 4);
	  System.out.println(a);
	  System.out.println(b);
	  }
  }
  