package Conditional.Basic.Area;

import java.util.Scanner;

public class AreaCircle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the radius of circle: ");
        float radius=sc.nextFloat();
        float area=radius*radius*3.14f;
        System.out.println("Area of the circle: "+area);
    }
}
