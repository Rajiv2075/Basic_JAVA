package Conditional.Basic.Perimeter;

import java.util.Scanner;

public class PeriParalleogram {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the base: ");
        int base=sc.nextInt();
        System.out.println("Enter the height: ");
        int height=sc.nextInt();
        int peri=2*(base+height);
        System.out.println("Perimeter of the Parallelogram: "+peri);
    }
}
