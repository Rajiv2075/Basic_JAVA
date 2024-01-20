package IfWala;

import java.util.Scanner;


public class Condition {
    public static void main(String[] args) {

        System.out.println("....:For checking odd or even number:...");
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the number you want to check: ");
        int a=s.nextInt();
        if (a%2==0)
            System.out.println("Even number");
        else
            System.out.println("Odd number");



    }
}
