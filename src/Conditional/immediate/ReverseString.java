package Conditional.immediate;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a String: ");
        String str=sc.next();
        String reverse="";
        for(int i=str.length()-1;i>=0;i--){
            reverse=reverse+str.trim().charAt(i);
        }
        System.out.println("Original String: "+str);
        System.out.println("Reverse String: "+reverse);
    }
}
