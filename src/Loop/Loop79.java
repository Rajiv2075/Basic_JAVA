package Loop;

import java.util.Scanner;

public class Loop79{
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the Specified value for Lucas series: ");
        long n=s.nextInt();
        long a=1;
        long b=1;
        long c;

        System.out.println("Lucas Series is: ");

        if (n==0)
            System.out.println(a);
        else if (n<0) {
            System.out.println("Invalid Lucas Series.");

        } else if (n==1) {
            System.out.print(a+" "+b);

        }else{
            System.out.print(a+" "+b);
            do {
                c=a+b;
                System.out.print(" "+c);
                a=b;
                b=c;
            }while(a+b<=n);

        }
    }
}
