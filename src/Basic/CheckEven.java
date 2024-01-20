package Basic;

import java.util.Scanner;

public class CheckEven {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num=(int)(sc.nextLong()%1000000000);
        if ( num%2==0 )
            System.out.println("Even number.");
        else
            System.out.println("Odd number.");
        System.out.println(num);

    }
}
