/* JFM1T5_Assignment3:

   Write a program to store the temperature of your city for last 7 days and print the lowest temperature of the week.
   Prompt the user input from the terminal.
   
   Sample Input:
   Enter number of days 
   3
   Enter the temperature of Day :1
   88
   Enter the temperature of Day :2
   34
   Enter the temperature of Day :3
   0 
   
   Expected Output:
   The lowest temperature of the week 3 is 0.0 celsius

*/


import java.util.Scanner;

public class Temperature{
  //Define the main method
  public static void main(String[] args){
    //Declare the variables and initializ
     int n; 
    int count=1;
    
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter the number of days: "); 
    //Take input from user
    n=sc.nextInt();
    //creates an array in the memory of length 
    float arr[] = new float[n];
    
    
    for(int i=0; i<n; i++)
    {
      //reading array elements from the user
      System.out.println("Enter the temperature of Day : "+i);
      arr[i]=sc.nextFloat();
    }
    float min =arr[0];
    //Calculate the highest price in all expenses and check if the expenses is more 
    for (int i=0;i<arr.length;i++) {  

            	//Compare elements of array with min  
           	if(min>arr[i]){
              min=arr[i];
              count++;
            }  
               	//Write code to store in min if array element is less than it.   
        }  
        System.out.println("The lowest temperature of the week "+count+" is  " + min + 
 " celsius");

    }
}