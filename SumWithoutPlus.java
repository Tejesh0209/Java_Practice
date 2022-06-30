/*  JFM1T2_Assignment5:

    Write a program to print the sum of two numbers without using + operator.
    Prompt the user input from the terminal.
    
    Sample Input:
    Enter first number: 
    22
    Enter second number: 
    50
    
    Expected Output:
    The sum of two numbers is: 72
*/

//import statements for java program to read inputs using Scanner class
import java.util.Scanner;

class ADDITON {
 
    public static void main(String[] args)
    {
        int a = 10, b = 5;
        if (b > 0) {
            while (b > 0) {
                a++;
                b--;
            }
        }
        if (b < 0) { // when 'b' is negative
            while (b < 0) {
                a--;
                b++;
            }
        }
        System.out.println("Sum is: " + a);
    }
}
 



// Please add comments for each line in the program
