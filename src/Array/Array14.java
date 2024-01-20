package Array;

import java.util.Scanner;

public class Array14 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int i,p=98977;
        System.out.println("Enter the size of array: ");
        int n=s.nextInt();

        int  []a =new int [n];
        System.out.println("size of array: "+a.length);

        for(i=0;i<a.length;i++){
            System.out.println("Enter the data: ");
            a[i]=s.nextInt();

        }
        System.out.println("Elements of Array: ");
        for (i=0;i<a.length;i++){
            System.out.print(" "+a[i]);
        }
        for(i=0;i<a.length;i++){
            if(p>a[i]){
                p=a[i];
            }

        }
        System.out.println("\nSmallest elements of array is : "+p);

    }
}
