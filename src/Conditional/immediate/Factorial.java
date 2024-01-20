package Conditional.immediate;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num=sc.nextInt();
        if(num==0)
            System.out.println("Factorial: "+1);
        else if ( num>0 ){
            int fact=1;
            for (int i=num;i>=1;i--){
                fact=fact*i;
            }
            System.out.println("Factorial: "+fact);
        }
        else
            System.out.println("Enter only positive number..");
    }
}
