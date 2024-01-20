package LoopWala;

import  java.util.*;


public class Pallindrome {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String p = s.nextLine();
        String reverse="";

       // System.out.println( p.length());
        int length=p.length();
        for (int i=length-1;i>=0;i--){
            reverse=reverse+p.charAt(i);
        }

        if (reverse.equals(p)){

            System.out.println("pallindrome number:");
        }
        else {
            System.out.println("Not a pallindrome number.");
        }
        System.out.print("p: "+p+"\nreverse: "+reverse);



    }
}
