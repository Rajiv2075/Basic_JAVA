package Array;

import java.util.Scanner;

public class Array3 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int i;

        int a [] =new int [5];
        System.out.println("size of array: "+a.length);

        for(i=0;i<a.length;i++){
            System.out.println("Enter the data: ");
            a[i]=s.nextInt();
        }
        System.out.println("Elements of Array: ");
        for (i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
    }
}
