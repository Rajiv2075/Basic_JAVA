package Loop;

import java.util.Scanner;

public class Loop73 {
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
            p=p+y*y*y;
            System.out.println(y);

        }
        System.out.println(p);

        if (n1==p){
            System.out.println("It is a Armstrong number.");
        }
        else{
            System.out.println("It is not a Armstrong number.");
        }

    }
}
