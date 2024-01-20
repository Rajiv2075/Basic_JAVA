package Conditional.Basic.Perimeter;

import java.util.Scanner;

public class PeriCircle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the radius: ");
        float radius=sc.nextFloat();
        float peri=2*3.14f*radius;
        System.out.println("Perimeter of the Circle: "+peri);
    }
}
