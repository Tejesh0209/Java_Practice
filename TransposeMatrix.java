/* JFM1T5_Assignment 4:

   Write a program to create a square matrix and print its transpose.
   Prompt the user input from the terminal.
   
  Sample Input:
  Enter number of rows and columns: 
  3
  3
  enter matrix:
   2
   3
   4
   1
   2
   3
   4
   5
   6
   
  Expected Output:
    
  After Transpose Matrix  
  2       1       4
  3       2       5
  4       3       6
   
*/
import java.util.Scanner;

public class TransposeMatrix {
  //Define the main method
  public static void main(String args[])  
    {
      //Declare the variables
      int i, j;
      System.out.println("Enter total rows and columns: ");
      Scanner s = new Scanner(System.in);
      //Take input from user to enter rows and column values
      int row = s.nextInt();
      int column = s.nextInt();
      //Convert the square matrix into transpose
      int array[][] = new int[row][column];
      System.out.println("Enter matrix:");
      for(i = 0; i < row; i++)
      {
        for(j = 0; j < column; j++) 
        {
          array[i][j] = s.nextInt();
        	System.out.print(" ");
            
        }
  	  }
      
      //printing j and i instead of i and j
      System.out.println("The above matrix after Transpose is ");
      for(i = 0; i < column; i++)
    	{
      	    for(j = 0; j < row; j++)
            {
                System.out.print(array[j][i]+" ");
            }
            System.out.println(" ");
        }
    }
  

}

//Good Job!