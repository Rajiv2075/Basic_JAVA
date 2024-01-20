package Conditional.Basic.Volume;

import java.util.Scanner;

public class TotalCube {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the side of the cube: ");
        int side=sc.nextInt();
        int total=6*side*side;
        System.out.println("Total surface of the cube: "+total);
    }
}
