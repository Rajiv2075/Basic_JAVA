package Conditional.immediate;

import java.util.Scanner;

public class Marks {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Total Marks: ");
        int total=sc.nextInt();
        System.out.println("Enter no of the subject: ");
        int sub=sc.nextInt();
        System.out.println("Average Marks is: "+(total/sub)+"%");
    }
}
