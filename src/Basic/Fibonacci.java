package Basic;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of n: ");
        int n=sc.nextInt();
        int a=0;
        int b=1;
        if ( n==1 )
            System.out.println(a);
        else if ( n==2 )
            System.out.println(b);
      else {
          long x=0;
          int c=3;
          while (c<=n){
              int temp=b;
              b=b+a;
              a=temp;
               x=b;
              c++;
          }
            System.out.println(x);
        }
    }
}
