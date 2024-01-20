package Conditional.Basic.Volume;

import java.awt.*;
import java.util.Scanner;

public class UserSum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while (true){
            System.out.println("Press any key to continue or press x for exit");
            char ch=sc.next().trim().charAt(0);
            if(ch=='x'||ch=='X'){
                break;
            }else {
                System.out.println("Enter the first number: ");
                int num1=sc.nextInt();
                System.out.println("Enter the second number: ");
                int num2=sc.nextInt();
                System.out.println("Sum= "+(num1+num2));
            }
        }
    }
}
