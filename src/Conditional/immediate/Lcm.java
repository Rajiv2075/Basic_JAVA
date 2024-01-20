package Conditional.immediate;

import java.util.Scanner;

public class Lcm {
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
        for(int i=a;i<=a*b;i++){
            if(i%a==0&&i%b==0){
                System.out.println("LCM: "+i);
                break;
            }
        }
    }
}
