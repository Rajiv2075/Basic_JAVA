package Method;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num=sc.nextInt();
        fact(num);
    }
    public static void fact(int num){
        long pro=1;
        for(long i=num;i>=1;i--){
            pro=pro*i;
        }
        System.out.println("Factorial = "+pro);
    }
}
