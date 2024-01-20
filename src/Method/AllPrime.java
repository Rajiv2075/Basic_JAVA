package Method;

import java.util.Scanner;

public class AllPrime {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the start number: ");
        int start=sc.nextInt();
        System.out.println("Enter the end number: ");
        int end=sc.nextInt();
       for(int i=start;i<=end;i++){
           isPrime(i);
       }
    }
    public static void isPrime(int x){
        if(x==1){
//            System.out.println("Nor defined: "+1);
            return;
        }
        if(x<1){
//            System.out.println("Invalid no: "+x);
            return;
        }
        int c=0;
        for(int i=2;i<=x/2;i++){
            if(x%i==0)
                c++;
        }
        if(c==0)
            System.out.println("Prime Number: "+x);
    }
}
