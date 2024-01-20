package Basic;

import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter principle amount: ");
        int principle=sc.nextInt();
        System.out.println("Enter rate: ");
        float rate=sc.nextFloat();
        System.out.println("Enter time: ");
        float time=sc.nextFloat();
        float simple=principle*rate*time/100;
        System.out.println("Simple Interest= "+simple);
    }
}
