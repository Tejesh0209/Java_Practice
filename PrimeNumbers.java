/* JFM1T4_Assignment3:
   Write a program to print all the prime numbers between 2 numbers.
   Prompt the user to enter the 2 numbers.
   
   Sample Input:
   Enter starting Number: 20
   Enter ending Number: 30

   Expected Output:
   Prime numbers between 20 and 30 are : 
   23
   29

*/

//import statements for java program to read inputs using Scanner class 
import java.util.Scanner;

public class PrimeNumbers {
  public static void main(String[] args) {
        int min,max;
        Scanner s= new Scanner(System.in);
        System.out.println("Enter starting number");
        min  = s.nextInt();
        System.out.println("Enter ending number");
        max  = s.nextInt();
        System.out.println("Prime numbers between "+min+" and "+max+" are :");
        for(int n=min;n<=max;n++) {
            if(isPrime(n)) {
                
                System.out.println(n);
            }
        }
    }
     
    public static boolean isPrime(int num) {    
        for(int i = 2; i <= num/i; ++i) {
            if(num % i == 0) {
                return false;
            }
        }
        return true;
    }
}

//Good Job!