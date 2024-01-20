package Array;

import java.util.Scanner;

public class Array15 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int i;
        System.out.println("Enter the size of array: ");
        int n=s.nextInt();

        int  []a =new int [n];
        int [] b=new int [a.length];
        System.out.println("size of array: "+a.length);

        for(i=0;i<a.length;i++){
            System.out.println("Enter the data: ");
            a[i]=s.nextInt();

        }
        System.out.println("Elements of First Array: ");
        for (i=0;i<a.length;i++){
            System.out.print(" "+a[i]);
        }
        for(i=0;i<a.length;i++){

                b[i]=a[i];
            }
        System.out.println("\nElements of Second Array: ");
        for (i=0;i<a.length;i++){
            System.out.print(" "+b[i]);
        }

        }


    }

