package Matrix;

import java.util.Scanner;

public class Matrix2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int [][]a;
        a = new int[3][];
        a[0] = new int[4];
        a[1] = new int[4];
        a[2] = new int[4];

        int i, j;


        for (i = 0; i < 3; i++) {
            for (j = 0; j < 4; j++) {
                System.out.println("Enter the data: ");
                a[i][j] = s.nextInt();
            }
        }


        System.out.println("Matrix is as : ");
        for (i=0;i<3;i++){
            for (j=0;j<4;j++){
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }


        System.out.println("Even Elements of Matrix is as : ");
        for (i = 0; i < 3; i++) {
            for (j = 0; j < 4; j++) {

                if (a[i][j]%2==0){
                    System.out.print(a[i][j] + " ");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }


    }
}