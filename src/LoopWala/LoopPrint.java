package LoopWala;

import java.util.Scanner;


public class LoopPrint {
    public static void check(int marks) {
        if (marks>=90){
            System.out.println("This is good");
        }
        else if (marks>=60&&89>=marks){
            System.out.println("This is also good");
        }
        else{
            System.out.println("This is Good as well.");
        }

    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int choice;
        do {
            System.out.println("press 1 for input marks: ");
            System.out.println("press 2 for exit: ");
            System.out.println("Enter your choice: ");
            choice=s.nextInt();

            if (choice==1){
                System.out.println("Enter the marks: ");
                int marks =s.nextInt();
                check(marks);
            }
            else if (choice==2){
                System.out.println("Closing program. ");
            }

            else {
                System.out.println("Invalid choice..");
            }

        } while ( choice != 2);


    }
}

