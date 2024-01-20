package Basic;

import java.util.Scanner;

public class Pallindrome {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String:  ");
        String input=sc.next();
        String reverse="";
        for(int i=input.length()-1;i>=0;i--){
            reverse=reverse+input.charAt(i);
        }
        System.out.println(reverse.equals(input));
    }
}
