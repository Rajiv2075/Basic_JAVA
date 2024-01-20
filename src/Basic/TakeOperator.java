package Basic;

import java.util.Scanner;

public class TakeOperator {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter two number: ");
        int num1=sc.nextInt();
        int num2=sc.nextInt();
        System.out.println("Enter an Operator: ");
        char op=sc.next().trim().charAt(0);
        if(op=='+')
            System.out.println("Sum= "+(num1+num2));
        else if ( op =='-' )
            System.out.println("Difference = "+(num1-num2));
        else if(op=='*')
            System.out.println("Multiply= "+(num1*num2));
        else if(op=='/')
            System.out.println("Divide= "+(num1/num2));
        else
            System.out.println("Invalid Operator.");
    }
}
