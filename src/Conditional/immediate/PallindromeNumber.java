package Conditional.immediate;

import java.util.Scanner;

public class PallindromeNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n=sc.nextInt();
        if(n<0)
            System.out.println("Enter only positive number.");
        else{
            int n1=n;
            int palin=0;
            while (n>0){
                int rem=n%10;
                palin=palin*10+rem;
                n /=10;
            }
            if(n1==palin)
                System.out.println("Palindrone Number.");
            else
                System.out.println("Not a palindrone number.");
        }
    }
}
