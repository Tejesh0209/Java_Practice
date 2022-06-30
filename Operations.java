import java.util.Scanner;

public class Operations {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first number: ");
        int a=sc.nextInt();
        System.out.println("Enter Second number: ");
        int b=sc.nextInt();
        //calculate difference,product,division,increment and remainder
        int sub = a-b;
        int inc = a++;
        int dec = a--;
        //print appropriate result for all operations
        System.out.println("Difference of 2 numbers : "+ sub);
        System.out.println("Product of 2 numbers: "+ a*b);
        System.out.println("Increment and Decrement the number: "+inc+" "+dec);
        System.out.println("Division of 2 numbers: "+ a/b);
        System.out.println("Remainder of 2 numbers: "+ a%b);


    }
}
//Good Job!
