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
      ArrayList <Integer> one = new ArrayList <Integer>();
      ArrayList <Integer> two = new ArrayList <Integer>();
      ArrayList <Integer> three = new ArrayList <Integer>();
      String line = file.nextLine();
      System.out.println(line);
      String [] position = line.split(" ");
      int row = Integer.parseInt(position[0]);
      int col = Integer.parseInt(position[1]);
//      System.out.println(row);
//      System.out.println(col);
      if(((row-1) >= 0) && ((row+1) <= 4) && ((col-1) >=0) && ((col+1 <= 4)))
    	  {
	      for(int r = (row-1); r < (row+2); r++)
	    	  {
	    	  for(int c = (col-1); c < col; c++)
	    		  {
	    		  one.add(array[r][c]);
	    		  }
	    	  }
	      for(int r = (row-1); r < (row+2); r++)
	    	  {
	    	  for(int c = col; c < col+1; c++)
	    		  {
	    		  two.add(array[r][c]);
	    		  }
	    	  }
	      for(int r = (row-1); r < (row+2); r++)
	    	  {
	    	  for(int c = col+1; c < col+2; c++)
	    		  {
	    		  three.add(array[r][c]);
	    		  }
	    	  }
    	  }
      for(Integer hi : one)
    	  {
    	  System.out.println(hi);
    	  }
      for(Integer hi : two)
    	  {
    	  System.out.println(hi);
    	  }   
      for(Integer hi : three)
    	  {
    	  System.out.println(hi);
    	  }
      }
    }
  }