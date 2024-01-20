package Method;

import java.util.Scanner;

public class Vote {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Age: ");
        int year=sc.nextInt();
        vote(year);
    }
    public static void vote(int year){
        if(year>17)
            System.out.println("You can vote");
        else
            System.out.println("You can't vote");
    }
}
