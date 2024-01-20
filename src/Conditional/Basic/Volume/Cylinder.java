package Conditional.Basic.Volume;

import java.util.Scanner;

public class Cylinder {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the radius of the cylinder: ");
        float radius=sc.nextFloat();
        System.out.println("Enter the height of the cylinder: ");
        int height=sc.nextInt();
        float vol=3.14f*radius*radius*height;
        System.out.println("Volume of the cylinder: "+vol);
    }
}
