package Basic;

import java.util.Scanner;

public class LargestTwo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter two number: ");
        int num1=sc.nextInt();
        int num2=sc.nextInt();
        if(num1>num2)
            System.out.println("Largest: "+num1);
        else
            System.out.println("Largest: "+num2);
    }
}
