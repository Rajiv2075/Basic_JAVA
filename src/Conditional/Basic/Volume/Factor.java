package Conditional.Basic.Volume;

import java.util.ArrayList;
import java.util.Scanner;

public class Factor {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n=sc.nextInt();
        ArrayList<Integer> ar=new ArrayList<>();
        for(int i=1;i<=n/2;i++){
            if(n%i==0) {
                System.out.print(i + " ");
                ar.add(i);
            }
        }
        System.out.println(n);
        ar.add(n);
        System.out.println(ar);
    }
}
