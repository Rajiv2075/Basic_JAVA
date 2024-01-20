package Array;

import java.util.Scanner;

public class Array17 {
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


        System.out.println("Elements of Array: ");
        for (i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }

        for(i=0;i<a.length;i++){
            int pos=i;
            int val=a[i];
            for (int j=0;j<a.length;j++) {
                if (val<a[j]) {
                    val=a[j];
                    pos=j;
                }
            }
            int x=a[i];
            a[i]=val;
            a[pos]=x;
          }



            System.out.println();
            System.out.println("After  sorting Elements: ");
            for (i=0;i<a.length;i++){
                System.out.print(a[i]+" ");
            }
    }
}
