package Method;

import java.util.Scanner;

public class Pallindrome {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num=sc.nextInt();
        palin(num);
    }
    public static void palin(int num){
        int n1=num;
        int reverse=0;
        while(n1>0){
            int rem=n1%10;
            reverse=reverse*10+rem;
            n1 /=10;
        }
        if(num==reverse)
            System.out.println("Pallindrome Number.");
        else
            System.out.println("Not a Pallindrome number.");
    }
}
