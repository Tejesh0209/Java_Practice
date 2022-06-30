import java.util.Scanner;

public class BooleanOperation {
    //main method
    public static void main(String[] args) {
        /*Use the scanner class to provide input at execution time using scanner object
          Scanner sc=new Scanner(System.in);
        */
        Scanner sc = new Scanner(System.in);//taking inputs

         /*Take input from user
          System.out.println("Enter x as boolean value(true/false): ");
          boolean x=sc.nextBoolean();
         */
        System.out.println("Enter x as boolean value(true/false): ");//printing statement
        boolean x = sc.nextBoolean();//assigning boolean value to x
        System.out.println("Enter y as boolean value(true/false): ");
        boolean y = sc.nextBoolean();//assigning boolean value to y

        //print apppropriate result for boolean operations
        System.out.println(x && y);//printing output
        System.out.println( x || y);//printing output
        System.out.println("!x :" + !x);//printing output
        System.out.println("!y :" + !y);//printing output
    }
}
//Good Job!