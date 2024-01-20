package Conditional.Basic.Perimeter;

import java.util.Scanner;

public class PeriTriangle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the side: ");
        int side=sc.nextInt();
        int peri=3*side;
        System.out.println("Perimeter of the Equalateral triangle: "+peri);
    }
}
