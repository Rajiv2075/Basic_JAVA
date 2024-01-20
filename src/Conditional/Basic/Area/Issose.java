package Conditional.Basic.Area;

import java.util.Scanner;

public class Issose {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Base: ");
        int base= sc.nextInt();
        System.out.println("Enter the height: ");
        int height= sc.nextInt();
        int area=base*height;
        System.out.println("Area of Isoseles Triangle: "+area);
    }
}
