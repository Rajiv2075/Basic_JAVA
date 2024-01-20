package Conditional.immediate;

import java.util.Scanner;

public class Batting {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the score: ");
        int score=sc.nextInt();
        System.out.println("Enter the no you out in those inning: ");
        int out=sc.nextInt();
        float aver=score/out;
        System.out.println("The Batting Score is: "+aver);
    }
}
