package Array;

import java.util.Scanner;

public class Array6 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int i;
        System.out.println("Enter the size of array: ");
        int n=s.nextInt();

        int a [] =new int [n];
        System.out.println("size of array: "+a.length);

        for(i=0;i<a.length;i++){
            System.out.println("Enter the data: ");
            a[i]=s.nextInt();
        }
        System.out.println("All Even elements of Array: ");
        for (i=0;i<a.length;i++){
            if (a[i]%2!=0) {


                System.out.print(a[i] + " ");
            }
        }
    }
}
