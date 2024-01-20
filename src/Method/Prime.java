package Method;

import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num=sc.nextInt();
        prime(num);
    }
    public static void  prime(int num){
        int c=0;
        for(int i=2;i<=num/2;i++){
            if(num%i==0){
                System.out.println("Not a prime number.");
                c++;
                break;
            }
        }
     if(c==0)
         System.out.println("Prime number.");
    }
}
