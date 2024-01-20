package Conditional.immediate;

import java.util.Scanner;

public class Nsum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the N number: ");
        int n=sc.nextInt();
        if(n<1)
            System.out.println("Enter valid no for average..");
        else {
            float sum=0.0f;
            for (int i = 1; i <=n; i++) {
                System.out.println("Enter the number: ");
                int num= sc.nextInt();;
                sum=sum+num;
            }
            System.out.println("Sum: "+sum);
        }
    }
}
