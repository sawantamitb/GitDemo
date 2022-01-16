package javaprogramspart3;

/* Draw An Equilateral Triangle Using Stars Of Given Row 
 * 
 * An Equilateral Triangle of 5 rows:
 *  * 
   * * 
  * * * 
 * * * * 
* * * * * 
* 
* 
Solution:

Number of stars in a row is equal to row number. For example: First row has one star, Second row has two stars and so on.
We must need to decide number of spaces to be printed before printing first star in first row. It will help in drawing proper Equilateral Triangle.
Notice first row, first star is printed at column number which is equal to total number of rows. So we need to fill remaining indexes of columns with spaces.
Notice second row, two stars occupy columns indexes (total no of rows)   and  (total no of rows-1) . So for second row, you need to put spaces for remaining columns.
You must have got idea of pattern now. You need to keep reducing number of space by one for each new row.
If you are still confuse with how many number of spaces you need to provide, just pass (2*Total no of rows). Disadvantage of this is that your triangle will not be left aligned.
We will have an outer for loop, which will take care of number of rows in triangle.
We need to use two inner for loop. First inner loop will help us in printing spaces before printing star. Second inner for loop will help in printing stars equal to number of current row.
 * */

import java.util.Scanner;

public class DrawStarTriangleOfGivenRows
{
    // Reusable method to print triangle
    public static void drawtraingle(int row)
    {
        // determining number of spaces to create a Equilateral Triangle.
    	// First star should be printed at nth column of first row
        int NoOfSpaces = row-1;
  
        // outer loop to handle number of rows
  
        for (int rowCounter=0; rowCounter<row; rowCounter++)
        {
        	// We need to print first star at (row)th place and then decrease position by one for next row 
			
			  for (int spaceCounter=0; spaceCounter<NoOfSpaces; spaceCounter++) 
			  { 
				  //printing spaces 
			  System.out.print(" "); 
			  }
			  
			  NoOfSpaces = NoOfSpaces - 1;
			 
            // No of star is equal to number of row. FOr first row one star, for 2nd row, 2 stars and so on.
            for (int starCounter=0; starCounter<=rowCounter; starCounter++ )
            {
                // printing stars
                System.out.print("* ");
            }
  
            // Moving cursor to next line 
            System.out.println();
        }
    }
     
    // Program execution starts from main method
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of rows for triangle: ");
        int row= sc.nextInt();
        System.out.println("Here you go: ");
        drawtraingle(row);
    }
}