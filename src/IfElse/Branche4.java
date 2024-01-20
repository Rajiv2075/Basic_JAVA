package IfElse;
import java.util.Scanner;


public class Branche4{
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the year you want to check: ");
        int n=s.nextInt();
        if (n%400==0){
            System.out.println(n+" is Leap year..");
        }else {
            System.out.println(n+" is not a Leap year..");
        }
    }

}
