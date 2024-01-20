package Conditional.Basic.Perimeter;

import java.util.Scanner;

public class Rhombus {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the side: ");
        int side=sc.nextInt();
        int peri=4*side;
        System.out.println("Perimeter of square: "+peri);

    }
}
