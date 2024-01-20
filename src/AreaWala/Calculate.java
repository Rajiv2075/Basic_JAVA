package AreaWala;

import java.util.Scanner;

public class Calculate {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        System.out.println("Enter the value of a: ");
        int a=s.nextInt();
        System.out.println("Enter the value of b: ");
        int b=s.nextInt();
        System.out.println("press 1 for Addition");
        System.out.println("press 2 for Subtraction");
        System.out.println("press 3 for Multiply");
        System.out.println("press 4 for Quotient");
        System.out.println("press 5 for Remainder");
        int n=s.nextInt();
        switch (n)
        {
            case 1:
                     int c=a+b;
                System.out.println("Result: "+c);
                break;

            case 2:
                 c=a-b;
                System.out.println("Result: "+c);
                break;

            case 3:
                 c=a*b;
                System.out.println("Result: "+c);
                break;

            case 4:
                 c=a/b;
                System.out.println("Result: "+c);
                break;

            case 5:
                 c=a%b;
                System.out.println("Result: "+c);
                break;

            default:
                System.out.println("Invalid choice");

        }

    }
}
