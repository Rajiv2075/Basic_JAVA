package Loop;

import java.util.Scanner;

public class Loop66 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n=s.nextInt();
        int y;
        int p=0;
        for (;n!=0;  n=n/10){
            y=n%10;
            if(y%2==0){
                System.out.println(y);
                p=p+y;
            }

        }
        System.out.println("Sum of the Even digits of a number: "+p);
    }
}