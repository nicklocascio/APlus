import java.io.*;
import java.util.*;
 
class pr20
  {
  public static void main(String[] args) throws IOException
    {
    int [][] array = new int [][]{
    {1, 2, 3, 4, 5},
    {15, 7, 8, 9, 71},
    {6, 7, 11, 2, 5},
    {6, 7, 8, 9, 14},
    {5, 4, 3, 2, 33}
    };
    Scanner file = new Scanner(new File("pr20.txt"));
    int times = file.nextInt();
    file.nextLine();
    for(int i = 0; i < times; i++)
      {
      ArrayList <Integer> one = new ArrayList <Integer>();
      String line = file.nextLine();
      String [] position = line.split(" ");
      int row = Integer.parseInt(position[0]);
      int col = Integer.parseInt(position[1]);
      if(((row-1) >= 0) && ((row+1) <= 4) && ((col-1) >=0) && ((col+1 <= 4)))
    	  {
	      for(int r = (row-1); r < (row+2); r++)
	    	  {
	    	  for(int c = (col-1); c < col+2; c++)
	    		  {
	    		  one.add(array[r][c]);
	    		  }
	    	  }	      
    	  }
      else if(row == 0)
	      {
    	  if(col > 0)
	    	  {
	    	  for(int r = row; r < (row+2); r++)
		    	  {
		    	  for(int c = (col-1); c < col+2; c++)
		    		  {
		    		  one.add(array[r][c]);
		    		  }
		    	  }	
	    	  }
    	  else
	    	  {
    		  for(int r = row; r < (row+2); r++)
		    	  {
		    	  for(int c = col; c < col+2; c++)
		    		  {
		    		  one.add(array[r][c]);
		    		  }
		    	  }	  
	    	  }
	      }
      else if(row == 4)
	      {
	      if(col == 4)
	      	  {
	    	  for(int r = (row-1); r < row+1; r++)
		    	  {
		    	  for(int c = (col-1); c < col+1; c++)
		    		  {
		    		  one.add(array[r][c]);
		    		  }
		    	  }	
	      	  }
	      else
		      {
	    	  for(int r = (row-1); r < row+1; r++)
		    	  {
		    	  for(int c = (col-1); c < col+2; c++)
		    		  {
		    		  one.add(array[r][c]);
		    		  }
		    	  }	  
		      }
	      }
      else if(col == 4 && row != 4)
      	  {
    	  for(int r = (row-1); r < row+2; r++)
	    	  {
	    	  for(int c = (col-1); c < col+1; c++)
	    		  {
	    		  one.add(array[r][c]);
	    		  }
	    	  }	  
      	  } 
      int sum = 0;
      double average = 0;
      for(int p = 0; p < one.size(); p++)
	      {
    	  sum += one.get(p); 
	      }
      average = sum/one.size();
      System.out.printf("%.2f", average);
      System.out.println();
      }
    }
  }
  