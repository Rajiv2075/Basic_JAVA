package LoopWala;

import java.util.Scanner;

public class FunHcf {
    public static void hcf(int m,int n){
        int p=1;
       if(m>=n){
           for (int i=1;i<=n;i++){
               if(m%i==0&&n%i==0){
                   p=i;
               }
           }
       }else {
           for (int i=1;i<=n;i++){
               if(m%i==0&&n%i==0){
                   p=i;
               }
           }
       }
        System.out.println("The common divisor of two number "+m+","+n+" is : "+p);
    }


    public static void main(String[] args) {
        Scanner x=new Scanner(System.in);
        System.out.println("Enter First number: ");
        int a=x.nextInt();
        System.out.println("Enter second number: ");
        int b=x.nextInt();
        hcf(a,b);
    }
}
