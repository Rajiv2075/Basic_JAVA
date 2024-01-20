package Conditional.immediate;

import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num=sc.nextInt();
        int num1=num;
        int arm=-0;
        while (num>0){
            int rem=num%10;
            arm=arm+rem*rem*rem;
            num /= 10;
        }
        if(num1==arm)
            System.out.println("Armstrong Number.");
        else
            System.out.println("Not a Armstrong number.");
    }
}
