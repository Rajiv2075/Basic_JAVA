package Conditional.immediate;

import java.util.Scanner;

public class Discrimination {
    public static void main(String[] args) {
       // Using Straight-line Method =  Cost of Asset- Salvage Value/ Useful Life of Asset
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the cost of asset: ");
        int asset=sc.nextInt();
        System.out.println("Enter the salvage value: ");
        int value=sc.nextInt();
        System.out.println("useful life of asset: ");
        float use=sc.nextFloat();
        float dis=(asset-value)/use;
        System.out.println("Discrimination of asset is: "+dis);
    }
}
