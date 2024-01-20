package Loop;

import java.util.Scanner;

public class Loop62 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n=s.nextInt();
        int y;
        System.out.println("Digits of the number: ");
        for (;n!=0;  n=n/10){
            y=n%10;
            System.out.println(y);

        }

    }
}
