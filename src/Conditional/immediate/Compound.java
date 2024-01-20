package Conditional.immediate;

import java.util.Scanner;

public class Compound {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the principle amount: ");
        int principle=sc.nextInt();
        System.out.println("Enter the rate of the Interest: ");
        float rate=sc.nextFloat();
        System.out.println("Enter the time: ");
        float time=sc.nextFloat();
        float ci=(float) (principle*Math.pow((1+rate/100),time));
        System.out.println("Compound Interest is: "+ci);
    }
}
