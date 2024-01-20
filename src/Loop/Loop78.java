package Loop;

import java.util.Scanner;

public class Loop78 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the no of terms for Lucas series: ");
        long n=s.nextInt();
        long a=1;
        long b=1;
        long c;

        if (n==1)
            System.out.println(a);
        else if (n<0) {
            System.out.println("Invalid Lucas Series.");

        } else if (n==2) {
            System.out.print(a+" "+b);

        }else{
            System.out.print(a+" "+b);
            for(int i=3;i<=n;i++){
                c=a+b;
                System.out.print(" "+c);
                a=b;
                b=c;
            }
        }
    }
}
