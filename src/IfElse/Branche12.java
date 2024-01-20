package IfElse;
import java.util.Scanner;

public class Branche12{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter angle A : ");
        int a=s.nextInt();
        System.out.println("Enter angle B: ");
        int b=s.nextInt();
        System.out.println("Enter angle C: ");
        int c=s.nextInt();
        if ((a+b+c)==180){
            System.out.println("Triangle is Valid for these angles.");

        }else{
            System.out.println("Triangle is not Valid for these angles.");

        }

    }
}



