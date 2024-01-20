package Loop;

import java.util.Scanner;

public class Loop71 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n=s.nextInt();
        int y;
        int p=0;
        System.out.println("Digits of the number: ");
        for (;n!=0;  n=n/10){
            y=n%10;
            p=p*10+y;
            System.out.println(y);

        }
        System.out.println(p);
    }
}
