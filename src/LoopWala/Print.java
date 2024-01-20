package LoopWala;
import java.util.Scanner;

public class Print {
    public static void PrintName(String name){
        System.out.println(name);
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name=sc.nextLine();
        PrintName(name);
        System.out.println();
    }
}



