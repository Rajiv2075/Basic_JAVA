package IfElse;
import java.util.Scanner;

public class Branche9 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the First number: ");
        int a=s.nextInt();
        System.out.println("Enter the Second number: ");
        int b=s.nextInt();
        if (b>a){
            System.out.println("Second number is greater than First number.");

        }else{
            System.out.println("Second number is not greater than  First number.");
        }

    }
}

