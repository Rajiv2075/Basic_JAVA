package Method;

import java.util.Scanner;

public class Grade {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the marks: ");
        int marks=sc.nextInt();
        grade(marks);
    }
    public static void grade(int mark){
        if(mark<=40)
            System.out.println("Fail");
        else if(mark>=51&&mark<=60)
            System.out.println("CD");
        else if(mark>=61&&mark<=70)
            System.out.println("BC");
        else if(mark>=71&&mark<=80)
            System.out.println("BB");
        else if(mark>=81&&mark<=90)
            System.out.println("AB");
        else if(mark>=91&&mark<=100)
            System.out.println("AA");
        else
            System.out.println("Invalid Marks");
    }
}
