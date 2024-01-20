package Array;

import java.util.Scanner;

public class Array16 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int i;
        int c=0;
        System.out.println("Enter the size of array: ");
        int n=s.nextInt();
        int  []a =new int [n];
        System.out.println("size of array: "+a.length);
        for(i=0;i<a.length;i++){
            System.out.println("Enter the data: ");
            a[i]=s.nextInt();
        }
        System.out.println("Elements of First Array: ");
        for (i=0;i<a.length;i++){
            System.out.print(" "+a[i]);
        }
        System.out.println();
        System.out.println("Enter the particular element that you want to find: ");
        int m=s.nextInt();


        for(i=0;i<a.length;i++){
           if (m==a[i]){
               c++;
               break;
           }
        }
        if (c>0){
            System.out.println("Element found..");

        }else {
            System.out.println("Element not found..");

        }


    }


}

