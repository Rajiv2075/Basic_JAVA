package Logical;
import java.util.Scanner;

public class BranchLog4 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter First number: ");
        int a=s.nextInt();
        System.out.println("Enter second number: ");
        int b=s.nextInt();
        System.out.println("Enter third number: ");
        int c=s.nextInt();
        System.out.println("Enter fourth number: ");
        int d=s.nextInt();
        if (a>b&&a>c&&a>d){
            System.out.println("First number is greatest..");
        } else if (b>a&&b>c&&b>d) {
            System.out.println("Second number is greatest..");

        }else if (c>a&&c>b&&c>d){
            System.out.println("Third number is greatest..");
        }else if (d>a&&d>b&&d>c){
            System.out.println("Fourth number is greatest..");
        }else{
            System.out.println("All number is equal..");
        }
    }
}
