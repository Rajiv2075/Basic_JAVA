package Matrix;

import java.util.Scanner;

public class Matrix5{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int i, j;
        int x=0;

        System.out.println("Enter the row of Matrix: ");
        int r=s.nextInt();
        System.out.println("Enter the column of Matrix: ");
        int c=s.nextInt();


        int [][]a;
        a = new int[r][c];

        for(i=0;i<r;i++){
            a[i] = new int[c];
        }



        for (i = 0; i <r; i++) {
            for (j = 0; j < c; j++) {
                System.out.println("Enter the data: ");
                a[i][j] = s.nextInt();
            }
        }


        System.out.println("Matrix is as : ");
        for (i=0;i<r;i++){
            for (j=0;j<c;j++){
                if (a[i][j]%2==0){
                    x=x+a[i][j];

                }
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }

        System.out.println("Sum of the even elements of Matrix is : "+x);


    }
}