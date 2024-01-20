package Conditional.immediate;

import java.util.Scanner;

public class FutureValue {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the present value: ");
        int present=sc.nextInt();
        System.out.println("Enter the rate: ");
        float rate=(sc.nextFloat())/100;
        System.out.println("Enter the time: ");
        float time=sc.nextFloat();
        float result=(float)( present*Math.pow((1+rate),time));
        System.out.println("Future value is: "+result);

    }
}
