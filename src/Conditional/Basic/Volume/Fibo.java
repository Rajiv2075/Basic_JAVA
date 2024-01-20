package Conditional.Basic.Volume;

import java.util.Scanner;

public class Fibo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no of the term: ");
        int term=sc.nextInt();
        if(term==1)
            System.out.println(0);
        else if(term==2)
            System.out.println(1);
        else{
            int a=0,b=1;
            System.out.print(a+" "+b+" ");
            int c=3;
            while (c<=term){
                int temp=b;
                b=b+a;
                a=temp;
                System.out.print(b+" ");
                c++;
            }
        }
    }
}
