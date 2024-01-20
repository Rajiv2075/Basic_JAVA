package Method;

import java.util.Scanner;

public class Smallest {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter First number: ");
        int a=sc.nextInt();
        System.out.println("Enter Second number: ");
        int b=sc.nextInt();
        System.out.println("Enter Third number: ");
        int c=sc.nextInt();
        max(a,b,c);
        min(a,b,c);
    }
    public static void max(int a,int b,int c){
        int max=a;
        if(max<b)
            max=b;
        if(max<c)
            max=c;
        System.out.println("Largest element is: "+max);
    }
    public static void min(int a,int b,int c){
        int min=a;
        if(min>b)
            min=b;
        if(min>c)
            min=c;
        System.out.println("Largest element is: "+min);
    }

}
