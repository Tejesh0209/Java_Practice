/* Write a program to calculate the circumference of a circle and print the result in whole number. 
  Allow user to input the cirlce radius from terminal. 
  Sample Input:
    radius of the circle=6
  Expected Output:
   Circumference of the circle=38
   
*/ 
import java.util.Scanner;

public class Circle {
    public static void main(String args[]){

    Scanner s = new Scanner(System.in);
    System.out.println("Enter radius of circle");
    int radius = s.nextInt();
    float circum;
    circum = (float) (2*3.16*radius);
    int newCircum = (int)circum;
    System.out.println("Circumference of circle is:" + newCircum );
    }
}

// Please use the same skeleton and do not delete the question.
// Actual question is below. Please check your program output and expected output.
// Print statement missing for radius




