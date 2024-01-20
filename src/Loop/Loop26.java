package Loop;

import java.util.Scanner;

public class Loop26 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the first digit: ");
        int n=s.nextInt();
        for (int i=n;i>-6;i--){
            System.out.print(" "+i);
        }
    }
}
