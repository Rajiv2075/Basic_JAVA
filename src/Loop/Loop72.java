package Loop;

import java.util.Scanner;

public class Loop72 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n=s.nextInt();
        int y;
        int p=0;
        System.out.println("Digits of the number: ");
        int n1=n;
        for (;n!=0;  n=n/10){
            y=n%10;
            p=p*10+y;
           // System.out.println(y);

        }
        System.out.println(p);

        if (n1==p){
            System.out.println("It is a Palindrome number.");
        }
        else{
            System.out.println("It is not a Palindrome number.");
        }

    }
}
