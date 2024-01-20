package Conditional.immediate;

import java.util.Scanner;

public class Vowel {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the character: ");
        char ch=sc.next().trim().charAt(0);
        if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
            System.out.println("Vowel character.");
        else if(ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U')
            System.out.println("Vowel character.");
        else
            System.out.println("Consonant character.");
    }
}
