package Conditional.Basic.Perimeter;

import java.util.Scanner;

public class PeriRectangle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the length: ");
        int len=sc.nextInt();
        System.out.println("Enter the base: ");
        int bre=sc.nextInt();
        int peri=2*(len+bre);
        System.out.println("Perimeter of the Rectangle: "+peri);
    }
}
