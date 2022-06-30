import java.util.Scanner;

class CheckingEquality{
    //main method
    public static void main(String[] args) {
       /*Use the scanner class to provide input at execution time using scanner object
         Scanner sc=new Scanner(System.in);
       */
        Scanner sc = new Scanner(System.in);
        /*Take input from user
          System.out.println("Enter first number: ");
          int a=sc.nextInt();
        */
        System.out.println("Enter first number: ");
        int a = sc.nextInt();
        System.out.println("Enter second number: ");
        int b = sc.nextInt();
        //check if the two numbers are equal or not
        if (a == b) {
          
        //If the two numbers are equal then print both are equal else print both are not equal
            System.out.println(" both are equal");
        } else {
            System.out.println(" both are not equal");
        }

    }
}

//Good Job!