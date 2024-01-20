package Loop;

import java.util.Scanner;

public class Loop64 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n=s.nextInt();
        int y;
        for (int i=n;n!=0;  n=n/10){
            y=n%10;
            if(y%2==1)
                System.out.println(y);

        }

    }
}
