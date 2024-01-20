package Conditional.Basic.Volume;

import java.util.Scanner;

public class TotalCylinder {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the radius of the cylinder: ");
        int radius=sc.nextInt();
        System.out.println("Enter the height: ");
        int height=sc.nextInt();
        float total=2*3.14f*radius*height;
        System.out.println("Curved area of the cylinder: "+total);
    }
}
