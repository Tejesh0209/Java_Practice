import java.util.Scanner;

public class ShortHandOperators{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first value: ");
        int a=sc.nextInt();
        System.out.println("Enter second value: ");
        int b=sc.nextInt();
        System.out.println(a*=b);
        System.out.println(a-=b);
        System.out.println( a/=b);
        System.out.println(a%=b );


    }



}

// Please add comments for each line in the program.
