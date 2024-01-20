package Method;

import java.util.Scanner;

public class SumNatural {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the nth number: ");
        int n=sc.nextInt();
        sum(n);
    }
    public static void sum(int n){
        int res=(n*(n+1))/2;
        System.out.println("Sum of nth number: "+res);
    }
}
