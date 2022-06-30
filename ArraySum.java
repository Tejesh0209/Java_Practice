/*  
    JFM1T5_Assignment 1:
    Write a program to store 10 numbers in an array and display the sum of all the elements.
    Prompt the user for the 10 numbers to be input from the terminal.
    Sample Input:
    Enter the 10  elements:
    1
    2
    3
    4
    5
    6
    7
    8
    9
    10
    Expected Output:
    Sum of array elements is : 55

*/
import java.util.Scanner;  
public class ArraySum {
  //Define the main method
  public static void main(String[] args){
    //Declare the variables and initialize
    int n,sum=0;
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter the number of elements you want to store: "); 
    //Take input from user
    n=sc.nextInt();
    //creates an array in the memory of length 10  
    int arr[] = new int[10];  
    System.out.println("Enter the elements of the array: ");
    for(int i=0; i<n; i++)
    {
      //reading array elements from the user
      arr[i]=sc.nextInt();
    }
    //Check user input values using for loop and add all values
    for(int k=0;k<arr.length;k++){
      sum=sum+arr[k];
    }
    System.out.println(sum);
    }
}
//Good Job!