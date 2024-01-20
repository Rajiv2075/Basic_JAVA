package Loop;

import java.util.Scanner;

public class Loop74 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the number that you want to find facrtorial: ");
        int n=s.nextInt();
        long c=1;
        if(n<0){
            System.out.println("Factorial can't find for negative number..");
        } else if (n==0) {
            System.out.println("Factorial of "+n+" is: "+1);

        }else {
            for(int i=n;i>=1;i--){
            c=c*i;
            }
            System.out.println("Factorial of "+n+"is: "+c);

        }
    }
}
