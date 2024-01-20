package Conditional.immediate;

import java.util.Scanner;

public class CgpaCalculator {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter total points: ");
        int point=sc.nextInt();
        System.out.println("Enter no of the subjects: ");
        Float sub=sc.nextFloat();
        float cg=point/sub;
        System.out.println("Your CGPA is: "+cg);
    }
}
