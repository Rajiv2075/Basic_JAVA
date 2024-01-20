package Array;

import java.util.Scanner;

public class Array19 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);

        int i,val,j;

        System.out.println("Enter the size of array: ");
        int n=s.nextInt();

        int  [] a =new int [n];
        System.out.println("size of array: "+a.length);


        for(i=0;i<a.length;i++){
            System.out.println("Enter the data: ");
            a[i]=s.nextInt();
        }


        System.out.println("Elements of Array: ");
        for (i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }

        for(i=1;i<a.length;i++){
             j=i-1;
             val=a[i];
            System.out.println("A");

            while(a[j]>val&&j>0){
                a[j+1]=a[j];
                j --;
            }
            System.out.println(j);

            a[j+1]=val;
        }



        System.out.println();
        System.out.println("After  sorting Elements: ");
        for (i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
    }
}
