package Logical;
import java.util.Scanner;

public class BranchLog1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter First number: ");
        int a=s.nextInt();
        System.out.println("Enter second number: ");
        int b=s.nextInt();
        System.out.println("Enter third number: ");
        int c=s.nextInt();
        if (a>b&&a>c){
            System.out.println("First number is greatest..");
        } else if (b>a&&b>c) {
            System.out.println("Second number is greatest..");

        }else if (c>a&&c>b){
            System.out.println("Third number is greatest..");
        }else{
            System.out.println("All number is equal..");
        }
    }
}
