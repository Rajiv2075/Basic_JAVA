package Conditional.Basic.Volume;

import java.util.Scanner;

public class Sphere {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the radius of the sphere: ");
        float radius=sc.nextFloat();
        float vol=3.14f*radius*radius*radius*4/3;
        System.out.println("Volume of the Sphere: "+vol);
    }
}
