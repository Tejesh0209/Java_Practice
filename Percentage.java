/*
1.Write a program to calculate your percentage assuming total marks given. Print the percentage after rounding it off. 
  Allow user to input the marks from the terminal. 
  Sample Input:
        maximum_marks=500
        total_marks=348
  Expected Output:
        percentage= 70%
       
*/
import java.util.Scanner;

public class Percentage {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the total marks");
        float total_marks= scanner.nextInt();
        System.out.println("Enter maximum marks possible ");
        float maximum_marks=scanner.nextInt();
        float percentage;
        percentage = total_marks/maximum_marks*100;
        System.out.println("percentage = " + percentage);
    }



}





