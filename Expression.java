import java.util.Scanner;

public class Expression {

    //main method
    public static void main(String[] args) {
         /*Use the scanner class to provide input at execution time using scanner object
           Scanner sc=new Scanner(System.in);
         */
        Scanner sc = new Scanner(System.in);
        /*Take input from user
          System.out.println("Enter a value: ");
          int a=sc.nextInt();
        */
        System.out.println("Enter a value: ");
        int a = sc.nextInt();
        System.out.println("Enter a value: ");
        int f = sc.nextInt();
        int b = a-- - --a;
        int c = a--;
        int d = a >> 2;
        int e = a & f;
        //print appropriate result for Expression operators
        System.out.println("  a-- - --a is : " + b);
        System.out.println(" a-- is : " + c);
        System.out.println("a>>2 : " + d);
        System.out.println("a&b : " + e);


    }
}

//Good Job!