package Conditional.Basic.Area;

import java.util.Scanner;

public class Rhombus {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the diagonal_1: ");
        int dia1=sc.nextInt();
        System.out.println("Enter the diagonal_2: ");
        int dia2=sc.nextInt();
        int area=dia2*dia1/2;
        System.out.println("Area of Rhombus: "+area);
    }
}
