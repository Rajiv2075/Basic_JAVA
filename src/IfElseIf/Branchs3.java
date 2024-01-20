package IfElseIf;
import java.util.Scanner;

public class Branchs3 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the Alphabet: ");
        int n =s.nextInt();
        char x=(char)n;
        if(x=='a'||x=='A'){
            System.out.println("It is a vowel alphabet..");
        }else if(x=='e'||x=='E'){
            System.out.println("It is a vowel alphabet..");

        }else if(x=='i'||x=='I'){
            System.out.println("It is a vowel alphabet..");

        }else if(x=='o'||x=='O'){
            System.out.println("It is a vowel alphabet..");

        }else if(x=='u'||x=='U'){
            System.out.println("It is a vowel alphabet..");

        }else{
            System.out.println("It is a consonant..");


        }
    }
}