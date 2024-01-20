package IfElse;
import java.util.Scanner;


public class Branche2 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the number you want to check: ");
        int n=s.nextInt();
        if (n%2!=0){
            System.out.println(n+" is Odd number..");

        }else {
            System.out.println(n+" is Even number..");

        }
    }

}
