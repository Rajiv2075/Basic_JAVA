package Conditional.Basic.Volume;

import java.util.Scanner;

public class Vcone {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the radius of the cone: ");
        float radius=sc.nextFloat();
        System.out.println("Enter the height of the cone: ");
        float height=sc.nextFloat();
        float vol=3.14f*radius*radius*height/3;
        System.out.println("Volume of the cube: "+vol);
    }
}
