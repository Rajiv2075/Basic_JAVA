package LoopWala;

import java.util.Scanner;

public class FunPrime {
    public static  void prime(int s){
        int c=0;
        for (int i=1;i<=s;i++){
            if(s%i==0){
                c++;
            }
        }
        if (c>2){
            System.out.println(s+" It is not a prime number.");
        }else {
            System.out.println(s+" It is a prime number.");
        }
    }

    public static void main(String[] args) {
        Scanner x=new Scanner(System.in);
        System.out.println("Enter the number who want to check prime or not: ");
        int y=x.nextInt();
         prime(y);
    }
}
