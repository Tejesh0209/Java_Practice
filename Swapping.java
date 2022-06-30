import java.util.Scanner;

public class Swapping {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first number: ");
        int a=sc.nextInt();
        System.out.println("Enter second number: ");
        int b=sc.nextInt();
        int Temp=0;
        System.out.println("Before swapping: "+a+" "+b);
        Temp=a;
        a=b;
        b=Temp;
        System.out.println("After swapping : "+a+" "+b);


    }
    

}

// Please add comments for each line in the program
