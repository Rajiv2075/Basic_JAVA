package Conditional.immediate;

import java.util.Scanner;

public class Discount {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Original Price: ");
        float oPrice= sc.nextFloat();;
        System.out.println("Enter the Given Price: ");
        float gPrice= sc.nextFloat();
        int  discount=(int) (gPrice*100/oPrice);
        System.out.println("Discount on that product: "+discount+"%");
    }
}
