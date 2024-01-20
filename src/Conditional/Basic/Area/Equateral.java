package Conditional.Basic.Area;

import java.util.Scanner;

public class Equateral {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Emter the side: ");
        int side= sc.nextInt();
        float area=1.73f*side*side/4;
        System.out.println("Area of Equateral triangle: "+area);
    }
}
