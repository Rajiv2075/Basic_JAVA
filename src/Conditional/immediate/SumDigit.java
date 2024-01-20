package Conditional.immediate;

import java.util.Scanner;

public class SumDigit {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num=sc.nextInt();
        int num1=num;
        int sum=0;
        while (num1>0){
            int rem=num1%10;
            sum=sum+rem;
            num1= num1/10;
        }
        System.out.println("Sum of the digit: "+sum);
    }
}
