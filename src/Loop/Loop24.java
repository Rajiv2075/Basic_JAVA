package Loop;

import java.util.Scanner;

public class Loop24 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the first digit: ");
        int n=s.nextInt();
        for (int i=n;i>0;i--){
            System.out.println(i);
        }
    }
}
