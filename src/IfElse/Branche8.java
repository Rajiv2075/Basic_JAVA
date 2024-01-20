package IfElse;
import java.util.Scanner;

public class Branche8{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the First number: ");
        int a=s.nextInt();
        System.out.println("Enter the Second number: ");
        int b=s.nextInt();
        if (a==b){
            System.out.println("First number is equal to  Second number.");

        }else{
            System.out.println("First number is not equal to Second number.");
        }

    }
}

