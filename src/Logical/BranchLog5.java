package Logical;
import java.util.Scanner;

public class BranchLog5 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter length of First side of triangle: ");
        float a=s.nextInt();
        System.out.println("Enter length of Second side of triangle: ");
        float b=s.nextInt();
        System.out.println("Enter length of Third side of triangle: ");
        float c=s.nextInt();
        if (a==b&&b==c){
            System.out.println("It is Equivalent Triangle..");
        }else if (a==b||b==c||a==c) {

            System.out.println("It is Isosceles Triangle..");
        }else{
            System.out.println("It is Scalene Triangle..");
        }
    }
}
