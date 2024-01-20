package Conditional.immediate;

import java.util.Scanner;

public class SumNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int negative=0,even=0,odd=0;
        while (true){
            System.out.println("Enter the number: ");
            int num=sc.nextInt();
            if(num<0)
                negative=negative+num;
            else if(num%2==0&&num>0)
                even=even+num;
            else if(num%2==1&&num>0)
                odd=odd+num;
            else
                break;
        }
        System.out.println("Sum of even positive: "+even);
        System.out.println("Sum of odd positive: "+odd);
        System.out.println("Sum of negative: "+negative);

    }
}
