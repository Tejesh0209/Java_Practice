/*
1.Write a program to declare a character variable and initialize it with any alphabet
 between A-Z. Print the ASCII value/unicode of the respective character.
  Sample Input:
       character=M
  Expected Output:
      ASCII value of M is:77
*/

import java.util.Scanner;

public class Unicode {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
       System.out.println("Enter any character from A to Z");
        char character = scanner.next().charAt(0);
        int asciiValue = character;
        int ascii = (int)character;
        System.out.println("ASCII value of"+character+"is :"+ascii);
    }
}



