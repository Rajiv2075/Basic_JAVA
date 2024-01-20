package Conditional.Basic.Volume;

import java.util.Scanner;

public class Prism {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the base of the base of the prism: ");
        int Tbase=sc.nextInt();
        System.out.println("Enter the height of the prism: ");
        int height=sc.nextInt();
        System.out.println("Enter the height of the base of the prism: ");
        int Theight=sc.nextInt();
        int vol=(Tbase*Theight/2)*height;
        System.out.println("Volume of the prism: "+vol);
    }
}
