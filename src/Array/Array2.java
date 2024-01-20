package Array;

import java.util.Scanner;

public class Array2 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int i;

        int a [] =new int [5];

        for(i=0;i<5;i++){
            System.out.println("Enter the data: ");
            a[i]=s.nextInt();
        }
        System.out.println("Elements of Array: ");
        for (i=0;i<9;i++){
            System.out.print(a[i]+" ");
        }
    }
}
