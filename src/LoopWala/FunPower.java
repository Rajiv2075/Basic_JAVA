package LoopWala;

import java.util.Scanner;

public class FunPower {
    public static void power(int x,int y){
        int p=1;
        for (int i=1;i<=y;i++){
            p=p*x;
        }
        System.out.println("Resultant value: "+p);
    }


    public static void main(String[] args) {
        Scanner x=new Scanner(System.in);
        System.out.println("Enter the base number: ");
        int a= x.nextInt();
        System.out.println("Enter the power value: ");
        int b=x.nextInt();
        power(a,b);
    }
}
