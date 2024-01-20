package Conditional.Basic.Area;

import java.util.Scanner;

public class AreaTriangle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the base: ");
        int base=sc.nextInt();
        System.out.println("Enter the height: ");
        int height= sc.nextInt();
        int area=base*height/2;
        System.out.println("Area of Triangle: "+area);
    }
}
