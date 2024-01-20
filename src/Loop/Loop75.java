package Loop;

import java.util.Scanner;

public class Loop75 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter number for table: ");
        int n=s.nextInt();
        System.out.println("Talble of "+n+" is: ");
        System.out.println();
        for (int i=1;i<=10;i++){
            System.out.println(n+" * "+i+" = "+(n*i));
        }
    }
}
