package IfElseIf;
import java.util.Scanner;

public class Branchs2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the  number: ");
        int a=s.nextInt();

        if (a>0){
            System.out.println("It is a positive number.");

        }else if (a<0){
            System.out.println("It is a negative number..");
        }else{
            System.out.println("It is not positive nor negative number or It is a Neutral number..");
        }

    }
}

