package Conditional.immediate;

import java.util.Scanner;

public class Hcf {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first number: ");
        int a= sc.nextInt();
        System.out.println("Enter second number: ");
        int b=sc.nextInt();
        if(a<b){
            int temp=a;
            a=b;
            b=temp;
        }
            for (int i=b;i>=1;i--){
                if(a%i==0&&b%i==0){
                    System.out.println("HCF: "+i);
                    break;
                }
            }
        }
}
