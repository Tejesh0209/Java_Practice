/*
1.Write a program to store your best friend's mobile number in a variable and print the last 4 digits. Consider the following sample for reference.
  Mobile number should accept only 10 digits. Not less than 10 digits or greater than 10 digits. 
  Allow user to input the phone number from the terminal
  Sample Input:
        mobileNum=9393927890
  Expected Output:
        Your friend's mobile number ends with ******7890
*/
import java.util.Scanner;

public class MobileNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter phone number (10 digits)");
        String mobileNum = scanner.nextLine();
        String last4 = "";
        if (mobileNum.length() == 10) {
            if (mobileNum.length() > 4) {
                last4 = mobileNum.substring(mobileNum.length() - 4);

            } else {
                last4 = mobileNum;
            }
            System.out.println("Mobile number ends with ******" + last4);

        } else {
            System.out.println("please check the mobile no and try again");
        }


    }
}
// Please use the same skeleton and do not delete the question.
// Actual question is below. Please check your program output and expected output.


