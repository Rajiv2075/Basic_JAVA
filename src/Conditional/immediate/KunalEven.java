package Conditional.immediate;

import java.util.Scanner;

public class KunalEven {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no of the days on the month: ");
        int day=sc.nextByte();
        int count=day/2;
        System.out.println("No of days that kunal can go out: "+count);
    }
}
