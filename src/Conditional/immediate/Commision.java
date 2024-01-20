package Conditional.immediate;

import java.util.Scanner;

public class Commision {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the total sales: ");
        int sale=sc.nextInt();
        System.out.println("Enter revenue from each sales: ");
        float revenue=sc.nextFloat();
        System.out.println("Enter Commission rate: ");
        float rate=(sc.nextFloat())/100;
        float commision=sale*revenue*rate;
        System.out.println("Commision on sales: "+commision);
    }
}
