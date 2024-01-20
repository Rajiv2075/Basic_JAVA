package LoopWala;

import java.util.Scanner;

public class FunTable {
    public static void tabl(int table){
        for (int i = 1; i <= 10; ++i) {
            System.out.println(table+"*"+i+"="+table * i);
        }
    }

    public static void main(String[] args) {
        Scanner x=new Scanner(System.in);
        System.out.println("Enter the number you want to print table: ");
        int n=x.nextInt();
        tabl(n);
    }
}
