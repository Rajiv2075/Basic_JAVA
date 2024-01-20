package Conditional.Basic.Volume;

import java.util.Scanner;

public class Pyramid {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the length of the pyramid: ");
        int len=sc.nextInt();
        System.out.println("Enter the breadth of the pyramid: ");
        int bre=sc.nextInt();
        System.out.println("Enter the height of the pyramid: ");
        int hei=sc.nextInt();
        int vol=len*bre*hei/3;
        System.out.println("Volume of the pyramid: "+vol);

    }
}
