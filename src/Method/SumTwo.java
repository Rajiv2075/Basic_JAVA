package Method;

import java.util.Scanner;

public class SumTwo {
    public static void main(String[] args) {
        sum();
    }
    public static void  sum(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the First number: ");
        int a=sc.nextInt();
        System.out.println("Enter the second number: ");
        int b=sc.nextInt();
        System.out.println("Sum of the numbers: "+(a+b));
    }
}
