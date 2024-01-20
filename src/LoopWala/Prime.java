package LoopWala;

import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter number want to find prime number: ");
        int n=s.nextInt();
        int c=0;
        for(int i=2;i<=n;i++)
        {
            for (int j = 1; j <= i; j++)
            {
                if (i % j == 0) {
                    c++;
                }
            }
            if (c==2)
            {
                System.out.println("It is a prime number: "+i);
            } else
            {
                System.out.println("Not a prime number: "+i);
            }
            c=0;
        }
    }
}
