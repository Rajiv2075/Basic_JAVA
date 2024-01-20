package AreaWala;

import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        System.out.print("Enter the radius: ");
        int r=s.nextInt();
        float area= (22/7)* r*r;
        System.out.println("Radius: "+r);
        System.out.println("Area: "+area);
    }
}
