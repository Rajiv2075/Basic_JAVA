package Conditional.immediate;

import java.util.Scanner;

public class Distance {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of x1 and Y1: ");
        int x1= sc.nextInt();
        int y1= sc.nextInt();
        System.out.println("Enter the value of x2 and y2: ");
        int x2= sc.nextInt();
        int y2= sc.nextInt();

        int xPart=(x2-x1)*(x2-x1);
        int yPart=(y2-y1)*(y2-y1);

        float distance=(float) Math.sqrt((xPart+yPart));
        System.out.println("Distance between two points is: "+distance);

    }
}
